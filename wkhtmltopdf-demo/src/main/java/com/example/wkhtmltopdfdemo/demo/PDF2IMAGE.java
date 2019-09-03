package com.example.wkhtmltopdfdemo.demo;

import com.example.wkhtmltopdfdemo.util.FilePathUtil;
import com.lowagie.text.pdf.PdfReader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author xulia
 * @create 2019-07-27 14:01
 */
public class PDF2IMAGE {
    //项目根路径/files/contract_pdf/2019-09-02/2019-09-02-17-53-41-5d6ce6a5e4113.png
    public static void main(String[] args) {
        pdf2Image("src/files/contract_pdf/2019-9-3/2019-9-3-13-53-19-01e0cf7442e31.pdf",
                FilePathUtil.getFilePath(), 300);
    }

    /***
     * PDF文件转PNG图片，全部页数
     *
     * @param PdfFilePath pdf完整路径
     * @param dstImgFolder 图片存放的文件夹
     * @param dpi dpi越大转换后越清晰，相对转换速度越慢
     * @return
     */
    public static String pdf2Image(String PdfFilePath, String dstImgFolder, int dpi) {
        StringBuilder imagePath = new StringBuilder();

        File file = new File(PdfFilePath);
        PDDocument pdDocument;
        try {
            String imgPDFPath = file.getParent();
            int dot = file.getName().lastIndexOf('.');
            // 获取图片文件名
            String imagePDFName = file.getName().substring(0, dot);
            String imgFolderPath = null;
            if (dstImgFolder.equals("")) {
                // 获取图片存放的文件夹路径
                imgFolderPath = imgPDFPath;
            } else {
                imgFolderPath = dstImgFolder;
            }
            imagePath.append(dstImgFolder);
            imagePath.append(imagePDFName);

            if (createDirectory(imgFolderPath)) {
                pdDocument = PDDocument.load(file);
                PDFRenderer renderer = new PDFRenderer(pdDocument);
                /* dpi越大转换后越清晰，相对转换速度越慢 */
                PdfReader reader = new PdfReader(PdfFilePath);
                int pages = reader.getNumberOfPages();
                StringBuffer imgFilePath = null;
                for (int i = 0; i < pages; i++) {
                    String imgFilePathPrefix = imgFolderPath + File.separator + imagePDFName;
                    imgFilePath = new StringBuffer();
                    imgFilePath.append(imgFilePathPrefix);
                    imgFilePath.append(".png");
                    File dstFile = new File(imgFilePath.toString());
                    BufferedImage image = renderer.renderImageWithDPI(i, dpi);
                    ImageIO.write(image, "png", dstFile);
                }
                System.out.println("PDF文档转PNG图片成功！");

                imagePath.append(".png");
            } else {
                System.out.println("PDF文档转PNG图片失败：" + "创建" + imgFolderPath + "失败");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return imagePath.toString();
    }

    private static boolean createDirectory(String folder) {
        File dir = new File(folder);
        if (dir.exists()) {
            return true;
        } else {
            return dir.mkdirs();
        }
    }


}

