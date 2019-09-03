package com.example.wkhtmltopdfdemo.pdftemplateenum;

import lombok.Getter;

@Getter
public enum PdfTemplateEnum {

    TEMPLATE_ENUM1("<div style=\"font-size: 24px; font-weight: 700;text-align: center\">合同</div>\n" +
            "<div><span style=\"font-size: 24px;\">合同编号：#contract_number#                  合同签订地：#sign_address#              签订时间：#sign_time#<br></span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">甲方：#customers_name#      </span></div>\n" +
            "<div><span style=\"font-weight: bold; font-size: 24px;\">电话：#buyer_phone#                    联系人：#buyer_contract_name#                        <br></span></div>\n" +
            "<div><span style=\"font-weight: bold; font-size: 24px;\">乙方：上海甜头菜电子商务有限公司         </span></div>\n" +
            "<div><span style=\"font-size: 24px;\"><span style=\"font-weight: bold;\">电话：18721619442                   联系人：马艳花                 传真：</span><span style=\"color: inherit; font-weight: bold;\">021-50495203</span></span>\n" +
            "</div>\n" +
            "<div><span style=\"font-size: 24px;\"><span style=\"font-weight: bold;\">乙方开户行：中国农业银行上海浦江支行                   </span><span style=\"color: inherit; font-weight: bold;\">乙方银行账号：03408800040020640 </span><span style=\"color: inherit; font-weight: bold;\"></span></span>\n" +
            "</div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">根据双方需求，甲乙双方经过友好协商，按照《中华人民共和国合同法》，就甲方委托乙方采购产品达成一致，特 签订本合同以共同遵守、履行。 </span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">第一条：委托采购产品的名称、数量、单价、金额等，具体内容见下表。 </span></div>\n" +
            "<div>\n" +
            "<table class=\"MsoTableGrid\" style=\"width: 883pt;\">\n" +
            "<tbody>\n" +
            "<tr style=\"height: 15.95pt;\">\n" +
            "<td width=\"294\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 220.7pt; border-width: 1pt; border-style: solid; border-color: windowtext;\"><span style=\"font-size: 18px;\">          <span style=\"font-weight: bold;\">产品名称</span></span>\n" +
            "<p class=\"MsoNormal\"><span style=\"font-family: Calibri; font-size: 18px;\"><o:p></o:p></span></p>\n" +
            "</td>\n" +
            "<td width=\"294\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 220.7pt; border-left: none; border-right: 1pt solid windowtext; border-top: 1pt solid windowtext; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-family: Calibri; font-size: 18px;\"><o:p>             <span style=\"font-weight: bold;\">数量(#good_tons#)</span></o:p>\n" +
            "</span>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td width=\"294\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 220.8pt; border-left: none; border-right: 1pt solid windowtext; border-top: 1pt solid windowtext; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-size: 18px;\"><span style=\"font-family: Calibri;\"><o:p>            </o:p></span><span style=\"background-color: transparent; color: inherit; font-weight: bold;\">产品单价（元）</span></span>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td width=\"294\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 220.8pt; border-left: none; border-right: 1pt solid windowtext; border-top: 1pt solid windowtext; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-size: 18px;\"><span style=\"font-family: Calibri;\"><o:p>        </o:p></span><span style=\"background-color: transparent; color: inherit; font-weight: bold;\">合同总金额（元）</span></span>\n" +
            "</p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 15.95pt;\">\n" +
            "<td width=\"294\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 220.7pt; border-left: 1pt solid windowtext; border-right: 1pt solid windowtext; border-top: none; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-family: Calibri; font-size: 18px;\"><o:p>        <span style=\"font-weight: bold;\">#good_name#</span></o:p>\n" +
            "</span>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td width=\"294\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 220.7pt; border-left: none; border-right: 1pt solid windowtext; border-top: none; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-family: Calibri; font-size: 18px;\"><o:p>             <span style=\"font-weight: bold;\">#good_num#</span></o:p>\n" +
            "</span>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td width=\"294\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 220.8pt; border-left: none; border-right: 1pt solid windowtext; border-top: none; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-family: Calibri; font-size: 18px;\">            <span style=\"font-weight: bold;\">#good_price#</span></span>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td width=\"294\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 220.8pt; border-left: none; border-right: 1pt solid windowtext; border-top: none; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-family: Calibri; font-size: 18px;\"><o:p>        <span style=\"font-weight: bold;\">#contract_total_price#</span></o:p>\n" +
            "</span>\n" +
            "</p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 15.95pt;\">\n" +
            "<td width=\"1177\" valign=\"top\" colspan=\"4\" style=\"padding: 0pt 5.4pt; width: 883pt; border-left: 1pt solid windowtext; border-right: 1pt solid windowtext; border-top: none; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-size: 18px;\"><span style=\"font-family: Calibri;\"><o:p> </o:p></span><span style=\"background-color: transparent; color: inherit; font-weight: bold;\">备注：#contract_remark#</span></span>\n" +
            "</p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 16.45pt;\">\n" +
            "<td width=\"1177\" valign=\"top\" colspan=\"4\" style=\"padding: 0pt 5.4pt; width: 883pt; border-left: 1pt solid windowtext; border-right: 1pt solid windowtext; border-top: none; border-bottom: 1pt solid windowtext;\"><span style=\"font-size: 18px; font-weight: bold;\">合计金额（大写）：#rmb#</span>\n" +
            "<p class=\"MsoNormal\"><span style=\"font-family: Calibri; font-size: 10.5pt;\"><o:p></o:p></span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "</div>\n" +
            "<div></div>\n" +
            "<div><span style=\"font-size: 18px; font-weight: bold;\">第二条：验收标准及处理方法 </span></div>\n" +
            "<div><span style=\"font-size: 18px;\"><span style=\"font-weight: bold;\">1、产品质量验收标准： </span></span>\n" +
            "</div>\n" +
            "<div>\n" +
            "<table class=\"MsoTableGrid\" style=\"width: 882pt;\">\n" +
            "<tbody>\n" +
            "<tr style=\"height: 17.9pt;\">\n" +
            "<td width=\"588\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 441pt; border-width: 1pt; border-style: solid; border-color: windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-size: 18px;\"><span style=\"font-family: Calibri;\"><o:p>                             </o:p></span><span style=\"background-color: transparent; color: inherit; font-weight: bold;\">物理感官指标</span></span>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td width=\"588\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 441pt; border-left: none; border-right: 1pt solid windowtext; border-top: 1pt solid windowtext; border-bottom: 1pt solid windowtext;\">\n" +
            "<p class=\"MsoNormal\"><span style=\"font-size: 18px;\"><span style=\"font-family: Calibri;\"><o:p>                                </o:p></span><span style=\"background-color: transparent; color: inherit; font-weight: bold;\">其他标准</span></span>\n" +
            "</p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 18.5pt;\">\n" +
            "<td width=\"588\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 441pt; border-left: 1pt solid windowtext; border-right: 1pt solid windowtext; border-top: none; border-bottom: 1pt solid windowtext;\">\n" +
            "<span style=\"font-weight: bold;font-size: 18px\">无虫蛀，无霉变</span>\n" +
            "</td>\n" +
            "<td width=\"588\" valign=\"top\" style=\"padding: 0pt 5.4pt; width: 441pt; border-left: none; border-right: 1pt solid windowtext; border-top: none; border-bottom: 1pt solid windowtext;\"><span style=\"font-size: 18px;\"><span style=\"font-weight: bold;\">粗蛋白：#egg_attr#（±0.5%），水份≤13％，脲酶活性0.02-0.3PH</span> </span><span style=\"font-size: 18px;\"></span>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "</div>\n" +
            "<div></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">2、产品数量验收标准：</span><span style=\"font-size: 24px; font-weight: bold; color: inherit;\">按实际装车重量结算，装车重量以油厂出库磅单净重为准。</span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">3、若甲方对产品质量有异议，自货到之日起，两个工作日内以书面形式向乙方提出，逾期视为产品合格；提出质 量异议时，甲方应封存相关货物，</span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">留待双方共同取样检验，如复验结果仍有异议，则共同送交合法的，<span style=\"color: inherit;\">双方认可的 检测机构检验一次，其结论为终局的，相关费用（包括滞期费、差旅费、</span><span style=\"color: inherit;\">检验费），如检验合格则由甲方负担，如 检验不合格则由乙方负担；在双方认可的最终结果未确定前或在任何情况下，甲方一旦</span><span style=\"color: inherit;\">动用处置争议货物的，则视 为争议货物合格，甲方不得就已经使用、外置的货物提出任何异议及索赔。 </span></span>\n" +
            "</div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">第三条：合同确认、结算方式及提货期限 </span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">1、本合同以甲方在乙方的富农商贸通电子商务平台的订单信息或双方电话确认为准，并据此拟定本《合同》。</span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">2、甲方须在签订合同当日预付#cash_money#元作为定金，或者甲方在乙方富农商贸通电子商务平台开设的甲方相应账户余 额不少于#cash_money#<span style=\"color: inherit;\">元</span></span><span style=\"font-size: 24px; font-weight: bold; color: inherit;\">作</span><span style=\"font-size: 24px; font-weight: bold; color: inherit;\">为定金。</span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">3、当市场销售价格跌幅超过本合同单价5%时，甲方需即日追 加5%定金。如果甲方未按时追加定<span style=\"color: inherit;\">金的，视为甲方违约。 </span></span>\n" +
            "</div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">4、如果甲方自行安排物流，甲方须在拿单提货前付清货款。</span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">5、合同开单提货日期：#delivery_start_time#至<span style=\"color: inherit;\">#delivery_end_time#</span><span style=\"color: inherit;\">【包含起止两日】间均匀提货。因油厂停机、自然灾害、战乱等不 可抗拒原因造成无法按时提货的，不</span><span style=\"color: inherit;\">视为乙方违约，且乙方不承担任何责任。</span></span>\n" +
            "</div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">第四条：交提货方式及费用承担 </span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">交货地点：#delivery_address#，运输安排由双方协商确认，甲方承担运费。自乙方在装货地交付甲方后，一切货物风险 由甲方承担。 </span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">第五条：违约责任 </span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\">违约方应向守约方支付合同总金额的 15%作为违约金，若违约金不足以弥补守约方的损失，违约方还应承担相应的 赔偿责任。甲方违约时，乙方有权处理<span style=\"color: inherit;\">甲方委托乙方采购的货物及保证金。</span></span>\n" +
            "</div>\n" +
            "<div><span style=\"color: inherit; font-size: 24px; font-weight: bold;\">第六条：其他事项 </span></div>\n" +
            "<div><span style=\"color: inherit; font-size: 24px; font-weight: bold;\">1、合同任何一方均无权在未经另一方同意的情况下，单方面将本合同项下的权利或义务转让给第三方。 </span></div>\n" +
            "<div><span style=\"color: inherit; font-size: 24px; font-weight: bold;\">2、乙方在溢短装范围内有权决定对本合同项下的履行数量予以结算，甲方在收到合同履行完毕的通知后，须确认 合同履行完毕。 </span></div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\"><span style=\"color: inherit;\">3、本合同未尽事宜，买卖双方协商签订补充协议，作为本合同不可分割的一部分，具有同等法律效力。如果一方 确有困难无法签字确认，可通过电话、</span><span style=\"color: inherit;\">微信、富农商贸通订单等方式确认本合同。本合同在双方签字或盖章，并且 乙方收到甲方足额定金后触发生效。 </span></span>\n" +
            "</div>\n" +
            "<div><span style=\"font-size: 24px; font-weight: bold;\"><span style=\"color: inherit;\">4、因本合同引起的争议纠纷，双方应友好协商解决，协商不成的，可向乙方公司注册所在地人民法院起诉。本合 同一式两份，甲乙双方各持一份，具有</span><span style=\"color: inherit;\">同等法律效力。本合同可传真签订，传真件与原件具有同等法律效力。 </span></span>\n" +
            "</div>\n" +
            "<div><span style=\"color: inherit; font-size: 18px;\"></span></div>\n" +
            "\n" +
            "<div style=\"float: left;font-size: 24px;font-weight: bold;\">\n" +
            "<span id=\"\">\n" +
            "甲方:\n" +
            "</span>\n" +
            "<span id=\"\">\n" +
            "#customers_name#\n" +
            "</span>\n" +
            "<div>甲方付款人：#customer_payments_name#</div>\n" +
            "<div>付款人身份证：#customer_payments_china_id#</div>\n" +
            "</div>\n" +
            "<div style=\"float: right;font-size: 24px;font-weight: bold;\">\n" +
            "<span id=\"\" style=\"position: relative;\">\n" +
            "乙方：上海甜头菜电子商务有限公司\n" +
            "<img src=\"http://121.43.50.178:82/zhang.png\" style=\"position: absolute; top: -150px; right: 0px; width: 250px; height: 250px;\">\n" +
            "</span>\n" +
            "<div>乙方开户行：中国农业银行上海浦江支行</div>\n" +
            "<div>乙方银行账号：03408800040020640 </div>\n" +
            "</div>\n" +
            "<div><span style=\"font-size: 18px;\"></span></div>");

    String memo;

    PdfTemplateEnum(String memo){
        this.memo=memo;
    }



}
