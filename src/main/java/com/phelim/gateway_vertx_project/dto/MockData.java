package com.phelim.gateway_vertx_project.dto;

public class MockData {
    public static final String s10tData = "{\n" +
            "  \"MASOPHIEU\": \"Mã số phiếu\",\n" +
            "  \"TL001\": \"Mã sản phẩm (Tên sản phẩm)\",\n" +
            "  \"TL002\": \"Mã số sản phẩm\",\n" +
            "  \"TL003\": \"Đơn vị tra cứu\",\n" +
            "  \"TL004\": \"Địa chỉ\",\n" +
            "  \"TL005\": \"Người tra cứu (Họ và tên)\",\n" +
            "  \"TL006\": \"Người tra cứu (Username)\",\n" +
            "  \"TL007\": \"Thời gian yêu cầu\",\n" +
            "  \"TL008\": \"Thời gian gửi báo cáo\",\n" +
            "  \"MSTHUE_DKKD\": \"Mã số thuế/Đăng ký kinh doanh/Giấy phép đầu tư\",\n" +
            "  \"TENKH\": \"Tên khách hàng\",\n" +
            "  \"TL099\": \"Các trường hợp trong trả lời báo cáo\",\n" +
            "  \"TL100\": \"Ghi chú khác\",\n" +
            "  \"BC100\": {\n" +
            "    \"BC110\": {\n" +
            "      \"TTC04\": \"Tên khách hàng\",\n" +
            "      \"MACIC\": \"Mã số CIC\",\n" +
            "      \"BC1101\": \"Tên đối ngoại\",\n" +
            "      \"BC1102\": \"Tên viết tắt\",\n" +
            "      \"BC1103\": \"Tên cũ\",\n" +
            "      \"BC1104\": \"Mã Doanh nghiệp (MST/MSDN)\",\n" +
            "      \"BC1105\": \"Giấy phép thành lập/Giấy phép đầu tư\",\n" +
            "      \"BC1106\": \"Loại hình doanh nghiệp\",\n" +
            "      \"BC1107\": \"Ngành nghề kinh doanh\",\n" +
            "      \"BC1108\": \"Quy mô doanh nghiệp\"\n" +
            "    },\n" +
            "    \"BC120\": [\n" +
            "      \"Khối Thông tin địa chỉ\"\n" +
            "    ],\n" +
            "    \"BC130\": {\n" +
            "        \"BC1301\": [\n" +
            "          {\n" +
            "            \"BC13011\": \"Chức danh\",\n" +
            "            \"BC13012\": \"Họ và tên\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC140\": {\n" +
            "        \"BC1401\": [\n" +
            "          {\n" +
            "            \"BC14011\": \"Chức danh\",\n" +
            "            \"BC14012\": \"Họ và tên\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"BC200\": {\n" +
            "      \"BC210\": [\n" +
            "        {\n" +
            "          \"BC2101\": \"Năm\",\n" +
            "          \"BC2102\": \"Hạng\",\n" +
            "          \"BC2103\": \"PD\",\n" +
            "          \"BC2104\": \"Diễn giải\",\n" +
            "          \"BC2105\": \"Ngày phân tích\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "  },\n" +
            "  \"BC300\": {\n" +
            "    \"BC310\": {\n" +
            "      \"BC3101\": {\n" +
            "          \"BC31011\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC310111\": \"Ngày báo cáo gần nhất\",\n" +
            "              \"BC310112\": [\n" +
            "                {\n" +
            "                  \"BC3101121\": \"Mã loại vay\",\n" +
            "                  \"BC3101122\": [\n" +
            "                    {\n" +
            "                      \"BC31011221\": \"Mã nhóm nợ\",\n" +
            "                      \"BC31011222\": \"Dư nợ VND\",\n" +
            "                      \"BC31011223\": \"Dư nợ USD\"\n" +
            "                    }\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3102\": {\n" +
            "          \"BC31021\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC310211\": [\n" +
            "                {\n" +
            "                  \"BC3102111\": \"Tình trạng\",\n" +
            "                  \"BC3102112\": \"Số lượng thẻ\",\n" +
            "                  \"BC3102113\": \"Tổng hạn mức\",\n" +
            "                  \"BC3102114\": \"Dư nợ thẻ tín dụng\",\n" +
            "                  \"BC3102115\": \"Nhóm nợ (Cao nhất)\",\n" +
            "                  \"BC3102116\": \"Ngày báo cáo\",\n" +
            "                  \"BC3102117\": \"Số tiền phải thanh toán\",\n" +
            "                  \"BC3102118\": \"Số tiền chậm thanh toán\",\n" +
            "                  \"BC3102119\": \"Số ngày chậm thanh toán cao nhất\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3103\": {\n" +
            "          \"BC31031\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã chi nhánh TCTD/TCTN\",\n" +
            "              \"TTC02\": \"Tên chi nhánh TCTD/TCTN\",\n" +
            "              \"BC310311\": \"Tổng giá trị VND\",\n" +
            "              \"BC310312\": \"Tổng giá trị USD\",\n" +
            "              \"BC310313\": \"Nhóm nợ (Cao nhất)\",\n" +
            "              \"BC310314\": \"Ngày báo cáo\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3104\": {\n" +
            "          \"BC31041\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã chi nhánh TCTD/TCTN\",\n" +
            "              \"TTC02\": \"Tên chi nhánh TCTD/TCTN\",\n" +
            "              \"BC310411\": \"Dư nợ VND\",\n" +
            "              \"BC310412\": \"Dư nợ USD\",\n" +
            "              \"BC310413\": \"Nhóm nợ (Cao nhất)\",\n" +
            "              \"BC310414\": \"Ngày báo cáo\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3105\": {\n" +
            "          \"BC31051\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã chi nhánh TCTD/TCTN\",\n" +
            "              \"TTC02\": \"Tên chi nhánh TCTD/TCTN\",\n" +
            "              \"BC310511\": \"Dư nợ VND\",\n" +
            "              \"BC310512\": \"Dư nợ USD\",\n" +
            "              \"BC310513\": \"Số ngày chậm thanh toán (Cao nhất)\",\n" +
            "              \"BC310514\": \"Ngày báo cáo\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3106\": {\n" +
            "          \"BC31061\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã Đơn vị bán nợ\",\n" +
            "              \"TTC02\": \"Tên Đơn vị bán nợ\",\n" +
            "              \"BC310611\": \"Dư nợ VND\",\n" +
            "              \"BC310612\": \"Dư nợ USD\",\n" +
            "              \"BC310613\": \"Ngày báo cáo\",\n" +
            "              \"BC310614\": \"Số ngày chậm thanh toán (cao nhất)\",\n" +
            "              \"BC310615\": \"Mã đơn vị mua nợ\",\n" +
            "              \"BC310616\": \"Tên đơn vị mua nợ\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3107\": {\n" +
            "          \"BC31071\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã chi nhánh VDB\",\n" +
            "              \"TTC02\": \"Tên chi nhánh VDB\",\n" +
            "              \"BC310711\": [\n" +
            "                {\n" +
            "                  \"BC3107111\": \"Nhóm nợ\",\n" +
            "                  \"BC3107112\": \"Loại vay\",\n" +
            "                  \"BC3107113\": \"Số tiền VND\",\n" +
            "                  \"BC3107114\": \"Số tiền USD\",\n" +
            "                  \"BC3107115\": \"Ngày báo cáo gần nhất\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"BC320\": {\n" +
            "      \"BC3201\": {\n" +
            "          \"BC32011\": [\n" +
            "            {\n" +
            "              \"BC320111\": \"Tháng năm\",\n" +
            "              \"BC320112\": \"Nợ vay và cấp tín dụng khác\",\n" +
            "              \"BC320113\": \"Dư nợ thẻ tín dụng\",\n" +
            "              \"BC320114\": \"Hạn mức thẻ tín dụng\",\n" +
            "              \"BC320115\": \"Trái phiếu\",\n" +
            "              \"BC320116\": \"Cam kết ngoại bảng\",\n" +
            "              \"BC320117\": \"Nợ khác\",\n" +
            "              \"BC320118\": \"Tổng dư nợ\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3202\": {\n" +
            "          \"BC32021\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC320211\": \"Tháng năm\",\n" +
            "              \"BC320212\": \"Tổng nợ cần chú ý\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3203\": {\n" +
            "          \"BC32031\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC320311\": [\n" +
            "                {\n" +
            "                  \"BC3203111\": \"Ngày phát sinh cuối cùng\",\n" +
            "                  \"BC3203112\": \"Nhóm nợ\",\n" +
            "                  \"BC3203113\": \"Dư nợ VND\",\n" +
            "                  \"BC3203114\": \"Dư nợ USD\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3204\": {\n" +
            "          \"BC32041\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC320411\": [\n" +
            "                {\n" +
            "                  \"BC3204111\": \"Ngày phát sinh cuối cùng\",\n" +
            "                  \"BC3204112\": \"Nhóm nợ\",\n" +
            "                  \"BC3204113\": \"Số tiền chậm thanh toán\",\n" +
            "                  \"BC3204114\": \"Số ngày chậm thanh toán\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      }\n" +
            "    }\n" +
            "  },\n" +
            "  \"BC400\": {\n" +
            "    \"BC410\": {\n" +
            "        \"BC4101\": [\n" +
            "          {\n" +
            "            \"BC41011\": \"Loại hợp đồng\",\n" +
            "            \"BC41012\": \"Còn hiệu lực\",\n" +
            "            \"BC41013\": \"Hết hiệu lực\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC420\": {\n" +
            "        \"BC4201\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC42011\": [\n" +
            "              {\n" +
            "                \"BC420111\": \"Số Hợp đồng\",\n" +
            "                \"BC420112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC420113\": \"Ngày hiệu lực\",\n" +
            "                \"BC420114\": \"Ngày kết thúc\",\n" +
            "                \"BC420115\": \"Hạn mức\",\n" +
            "                \"BC420116\": \"Dư nợ\",\n" +
            "                \"BC420117\": \"Loại tiền vay\",\n" +
            "                \"BC420118\": \"Nhóm nợ (cao nhất)\",\n" +
            "                \"BC420119\": \"Mục đích vay theo ngành kinh tế\",\n" +
            "                \"BC420120\": \"Mục đích vay theo lĩnh vực trọng yếu\",\n" +
            "                \"BC420121\": \"Thời hạn cấp tín dụng\",\n" +
            "                \"BC420122\": \"Hình thức cấp tín dụng\",\n" +
            "                \"BC420123\": \"Phương thức cho vay\",\n" +
            "                \"BC420124\": \"Thời điểm truy đòi\",\n" +
            "                \"BC420125\": \"Số lần cơ cấu lại thời hạn trả nợ\",\n" +
            "                \"BC420126\": \"Tình trạng cơ cấu hiện tại\",\n" +
            "                \"BC420127\": \"Dư nợ gốc chậm trả thực tế\",\n" +
            "                \"BC420128\": \"Số ngày chậm trả nợ gốc\",\n" +
            "                \"BC420129\": \"Số tiền lãi chậm trả thực tế\",\n" +
            "                \"BC420130\": \"Số ngày chậm trả nợ lãi\",\n" +
            "                \"BC420131\": \"Nhóm nợ quá hạn cao nhất\",\n" +
            "                \"BC420132\": \"Ngày cuối cùng có nhóm nợ quá hạn cao nhất\",\n" +
            "                \"BC420133\": \"Dư nợ tại ngày cuối cùng có nhóm nợ cao nhất\",\n" +
            "                \"BC420134\": [\n" +
            "                  {\n" +
            "                    \"BC4201341\": \"Tên người đồng vay\",\n" +
            "                    \"BC4201342\": \"CCCD/Giấy tờ khác\",\n" +
            "                    \"BC4201343\": \"Quan hệ với khách hàng vay chính\"\n" +
            "                  }\n" +
            "                ]\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC430\": {\n" +
            "        \"BC4301\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC43011\": [\n" +
            "              {\n" +
            "                \"BC430111\": \"Số Hợp đồng thẻ\",\n" +
            "                \"BC430112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC430113\": \"Hạn mức\",\n" +
            "                \"BC430114\": \"Loại hạn mức\",\n" +
            "                \"BC430115\": \"Số lượng thẻ\",\n" +
            "                \"BC430116\": \"Số tiền phải thanh toán theo sao kê\",\n" +
            "                \"BC430117\": \"Số tiền quá hạn theo sao kê\",\n" +
            "                \"BC430118\": \"Số ngày quá hạn theo sao kê\",\n" +
            "                \"BC430119\": \"Dư nợ thẻ hiện thời\",\n" +
            "                \"BC430120\": \"Nhóm nợ (cao nhất)\",\n" +
            "                \"BC430121\": \"Số kỳ quá hạn theo sao kê\",\n" +
            "                \"BC430122\": \"Số tiền quá hạn cao nhất\",\n" +
            "                \"BC430123\": \"Số ngày quá hạn cao nhất\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC440\": {\n" +
            "        \"BC4401\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC44011\": [\n" +
            "              {\n" +
            "                \"BC440111\": \"Số Hợp đồng\",\n" +
            "                \"BC440112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC440113\": \"Ngày mua, đầu tư trái phiếu\",\n" +
            "                \"BC440114\": \"Ngày phát hành\",\n" +
            "                \"BC440115\": \"Ngày đáo hạn\",\n" +
            "                \"BC440116\": \"Giá gốc/giá trị thuần\",\n" +
            "                \"BC440117\": \"Giá trị trái phiếu xanh\",\n" +
            "                \"BC440118\": \"Nhóm nợ\",\n" +
            "                \"BC440119\": \"Loại tiền vay\",\n" +
            "                \"BC440120\": \"Mục đích sử dụng tiền thu từ phát hành trái phiếu phân theo ngành kinh tế\",\n" +
            "                \"BC440121\": \"Mục đích phát hành trái phiếu\",\n" +
            "                \"BC440122\": \"Kỳ hạn trái phiếu\",\n" +
            "                \"BC440123\": \"Nhóm nợ quá hạn cao nhất\",\n" +
            "                \"BC440124\": \"Giá trị gốc trái phiếu tại thời điểm nhóm nợ cao nhất\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC450\": {\n" +
            "        \"BC4501\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC45011\": [\n" +
            "              {\n" +
            "                \"BC450111\": \"Số Hợp đồng\",\n" +
            "                \"BC450112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC450113\": \"Ngày hiệu lực\",\n" +
            "                \"BC450114\": \"Ngày kết thúc\",\n" +
            "                \"BC450115\": \"Số dư cam kết (VND)\",\n" +
            "                \"BC450116\": \"Loại tiền vay\",\n" +
            "                \"BC450117\": \"Nhóm nợ\",\n" +
            "                \"BC450118\": \"Loại nghiệp vụ\",\n" +
            "                \"BC450119\": \"Mục đích cam kết\",\n" +
            "                \"BC450120\": \"Nhóm nợ quá hạn cao nhất\",\n" +
            "                \"BC450121\": \"Số dư cam kết tại thời điểm nhóm nợ quá hạn cao nhất\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC460\": {\n" +
            "        \"BC4601\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC46011\": [\n" +
            "              {\n" +
            "                \"BC460111\": \"Số Hợp đồng\",\n" +
            "                \"BC460112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC460113\": \"Ngày hiệu lực\",\n" +
            "                \"BC460114\": \"Ngày kết thúc\",\n" +
            "                \"BC460115\": \"Hạn mức\",\n" +
            "                \"BC460116\": \"Tên đơn vị/cá nhân ủy thác\",\n" +
            "                \"BC460117\": \"CCCD/MST\",\n" +
            "                \"BC460118\": \"Dư nợ\",\n" +
            "                \"BC460119\": \"Loại tiền vay\",\n" +
            "                \"BC460120\": \"Mục đích vay theo ngành kinh tế\",\n" +
            "                \"BC460121\": \"Mục đích vay theo lĩnh vực trọng yếu\",\n" +
            "                \"BC460122\": \"Thời hạn cấp tín dụng\",\n" +
            "                \"BC460123\": \"Hình thức cấp tín dụng\",\n" +
            "                \"BC460124\": \"Phương thức cho vay\",\n" +
            "                \"BC460125\": \"Dư nợ gốc chậm trả thực tế\",\n" +
            "                \"BC460126\": \"Số ngày chậm trả nợ gốc\",\n" +
            "                \"BC460127\": \"Số tiền lãi chậm trả thực tế\",\n" +
            "                \"BC460128\": \"Số ngày chậm trả nợ lãi\",\n" +
            "                \"BC460129\": \"Dư nợ gốc chậm trả thực tế cao nhất\",\n" +
            "                \"BC460130\": \"Số ngày chậm trả nợ gốc cao nhất\",\n" +
            "                \"BC460131\": \"Dư nợ lãi chậm trả thực tế cao nhất\",\n" +
            "                \"BC460132\": \"Số ngày chậm trả nợ lãi cao nhất\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"BC500\": {\n" +
            "      \"BC510\": [\n" +
            "        {\n" +
            "          \"TTC01\": \"Mã TCTD\",\n" +
            "          \"TTC02\": \"Tên TCTD\",\n" +
            "          \"BC5101\": \"Ngày báo cáo dư nợ gần nhất\",\n" +
            "          \"BC5102\": [\n" +
            "            {\n" +
            "              \"BC51021\": \"Mã số bảo đảm tại TCTD\",\n" +
            "              \"BC51022\": \"Loại bảo lãnh\",\n" +
            "              \"BC51023\": \"Mô tả biện pháp bảo đảm\",\n" +
            "              \"BC51024\": \"Số Hợp đồng tín dụng được bảo đảm (Bảo lãnh)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"BC5103\": [\n" +
            "            {\n" +
            "              \"BC51031\": \"Số Hợp đồng tín dụng được bảo đảm (Tín chấp)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"BC5104\": [\n" +
            "            {\n" +
            "              \"BC51041\": \"Số Hợp đồng tín dụng được bảo đảm (Bảo đảm không sử dụng tài sản khác)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"BC5105\": [\n" +
            "            {\n" +
            "              \"BC51051\": \"Mã số bảo đảm tại TCTD\",\n" +
            "              \"BC51052\": \"Loại tài sản\",\n" +
            "              \"BC51053\": \"Ngày hiệu lực hợp đồng thế chấp\",\n" +
            "              \"BC51054\": \"Ngày hết hiệu lực hợp đồng thế chấp\",\n" +
            "              \"BC51055\": \"Tổng giá trị tài sản\",\n" +
            "              \"BC51056\": \"Giá trị tài sản bảo đảm cho khách hàng (Triệu đồng)\",\n" +
            "              \"BC51057\": \"Mô tả tài sản\",\n" +
            "              \"BC51058\": \"Số Hợp đồng tín dụng được bảo đảm (Bằng tài sản)\",\n" +
            "              \"BC51059\": \"Thế chấp chung tại các TCTD khác\",\n" +
            "              \"BC51060\": \"Thế chấp chung với khách hàng vay khác\",\n" +
            "              \"BC51061\": \"Thông tin chi tiết tài sản bảo đảm là dự án\",\n" +
            "              \"BC51062\": [\n" +
            "                {\n" +
            "                  \"BC510621\": \"Tên chủ sở hữu\",\n" +
            "                  \"BC510622\": \"CCCD/MSDN/Giấy tờ khác\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "  },\n" +
            "  \"BC600\": [\n" +
            "    {\n" +
            "      \"TTC01\": \"Mã TCTD\",\n" +
            "      \"TTC02\": \"Tên tổ chức/CN tổ chức tín dụng\",\n" +
            "      \"BC610\": \"Mục đích tra cứu\",\n" +
            "      \"BC620\": \"Thời gian tra cứu\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"BC700\": {\n" +
            "    \"BC710\": \"Thông tin khác về khách hàng vay\"\n" +
            "  }\n" +
            "}";

    public static final String s11tData = "{\n" +
            "  \"MASOPHIEU\": \"Mã số phiếu\",\n" +
            "  \"TL001\": \"Mã sản phẩm (Tên sản phẩm)\",\n" +
            "  \"TL002\": \"Mã số sản phẩm\",\n" +
            "  \"TL003\": \"Đơn vị tra cứu\",\n" +
            "  \"TL004\": \"Địa chỉ\",\n" +
            "  \"TL005\": \"Người tra cứu (Họ và tên)\",\n" +
            "  \"TL006\": \"Người tra cứu (Username)\",\n" +
            "  \"TL007\": \"Thời gian yêu cầu\",\n" +
            "  \"TL008\": \"Thời gian gửi báo cáo\",\n" +
            "  \"CCCD_HOCHIEU\": \"Số CCCD/ Hộ chiếu\",\n" +
            "  \"TENKH\": \"Tên khách hàng\",\n" +
            "  \"TL099\": \"Các trường hợp trong trả lời báo cáo\",\n" +
            "  \"TL100\": \"Ghi chú khác\",\n" +
            "  \"BC100\": {\n" +
            "    \"BC110\": {\n" +
            "      \"TTC04\": \"Tên khách hàng\",\n" +
            "      \"MACIC\": \"Mã số CIC\",\n" +
            "      \"BC1109\": \"Giới tính\",\n" +
            "      \"BC1110\": \"Ngày sinh\",\n" +
            "      \"BC1111\": \"Số điện thoại\",\n" +
            "      \"BC1112\": \"Tình trạng cư trú\",\n" +
            "      \"BC1113\": \"Quốc tịch\",\n" +
            "      \"BC1114\": \"CCCD\",\n" +
            "      \"BC1115\": \"Tình trạng xác thực\",\n" +
            "      \"BC1116\": \"Giấy tờ khác\",\n" +
            "      \"BC1117\": \"Họ tên vợ chồng\",\n" +
            "      \"BC1118\": \"Số CCCD vợ chồng\"\n" +
            "    },\n" +
            "    \"BC120\": [\n" +
            "      \"Khối Thông tin địa chỉ\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"BC200\": {\n" +
            "      \"BC220\": {\n" +
            "          \"BC2201\": \"Điểm tín dụng\",\n" +
            "          \"BC2202\": \"Hạng\",\n" +
            "          \"BC2203\": \"Ngày chấm điểm\",\n" +
            "          \"BC2204\": \"Xếp hạng khách hàng\"\n" +
            "      },\n" +
            "      \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "  },\n" +
            "  \"BC300\": {\n" +
            "    \"BC310\": {\n" +
            "      \"BC3101\": {\n" +
            "          \"BC31011\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC310111\": \"Ngày báo cáo gần nhất\",\n" +
            "              \"BC310112\": [\n" +
            "                {\n" +
            "                  \"BC3101121\": \"Mã loại vay\",\n" +
            "                  \"BC3101122\": [\n" +
            "                    {\n" +
            "                      \"BC31011221\": \"Mã nhóm nợ\",\n" +
            "                      \"BC31011222\": \"Dư nợ VND\",\n" +
            "                      \"BC31011223\": \"Dư nợ USD\"\n" +
            "                    }\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3102\": {\n" +
            "          \"BC31021\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC310211\": [\n" +
            "                {\n" +
            "                  \"BC3102111\": \"Tình trạng\",\n" +
            "                  \"BC3102112\": \"Số lượng thẻ\",\n" +
            "                  \"BC3102113\": \"Tổng hạn mức\",\n" +
            "                  \"BC3102114\": \"Dư nợ thẻ tín dụng\",\n" +
            "                  \"BC3102115\": \"Nhóm nợ (Cao nhất)\",\n" +
            "                  \"BC3102116\": \"Ngày báo cáo\",\n" +
            "                  \"BC3102117\": \"Số tiền phải thanh toán\",\n" +
            "                  \"BC3102118\": \"Số tiền chậm thanh toán\",\n" +
            "                  \"BC3102119\": \"Số ngày chậm thanh toán cao nhất\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3104\": {\n" +
            "          \"BC31041\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã chi nhánh TCTD/TCTN\",\n" +
            "              \"TTC02\": \"Tên chi nhánh TCTD/TCTN\",\n" +
            "              \"BC310411\": \"Dư nợ VND\",\n" +
            "              \"BC310412\": \"Dư nợ USD\",\n" +
            "              \"BC310413\": \"Nhóm nợ (Cao nhất)\",\n" +
            "              \"BC310414\": \"Ngày báo cáo\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3105\": {\n" +
            "          \"BC31051\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã chi nhánh TCTD/TCTN\",\n" +
            "              \"TTC02\": \"Tên chi nhánh TCTD/TCTN\",\n" +
            "              \"BC310511\": \"Dư nợ VND\",\n" +
            "              \"BC310512\": \"Dư nợ USD\",\n" +
            "              \"BC310513\": \"Số ngày chậm thanh toán (Cao nhất)\",\n" +
            "              \"BC310514\": \"Ngày báo cáo\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3106\": {\n" +
            "          \"BC31061\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã Đơn vị bán nợ\",\n" +
            "              \"TTC02\": \"Tên Đơn vị bán nợ\",\n" +
            "              \"BC310611\": \"Dư nợ VND\",\n" +
            "              \"BC310612\": \"Dư nợ USD\",\n" +
            "              \"BC310613\": \"Ngày báo cáo\",\n" +
            "              \"BC310614\": \"Số ngày chậm thanh toán (cao nhất)\",\n" +
            "              \"BC310615\": \"Mã đơn vị mua nợ\",\n" +
            "              \"BC310616\": \"Tên đơn vị mua nợ\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3107\": {\n" +
            "          \"BC31071\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã chi nhánh VDB\",\n" +
            "              \"TTC02\": \"Tên chi nhánh VDB\",\n" +
            "              \"BC310711\": [\n" +
            "                {\n" +
            "                  \"BC3107111\": \"Nhóm nợ\",\n" +
            "                  \"BC3107112\": \"Loại vay\",\n" +
            "                  \"BC3107113\": \"Số tiền VND\",\n" +
            "                  \"BC3107114\": \"Số tiền USD\",\n" +
            "                  \"BC3107115\": \"Ngày báo cáo gần nhất\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"BC320\": {\n" +
            "      \"BC3201\": {\n" +
            "          \"BC32011\": [\n" +
            "            {\n" +
            "              \"BC320111\": \"Tháng năm\",\n" +
            "              \"BC320112\": \"Nợ vay và cấp tín dụng khác\",\n" +
            "              \"BC320113\": \"Dư nợ thẻ tín dụng\",\n" +
            "              \"BC320114\": \"Hạn mức thẻ tín dụng\",\n" +
            "              \"BC320116\": \"Cam kết ngoại bảng\",\n" +
            "              \"BC320117\": \"Nợ khác\",\n" +
            "              \"BC320118\": \"Tổng dư nợ\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3202\": {\n" +
            "          \"BC32021\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC320211\": \"Tháng năm\",\n" +
            "              \"BC320212\": \"Tổng nợ cần chú ý\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3203\": {\n" +
            "          \"BC32031\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC320311\": [\n" +
            "                {\n" +
            "                  \"BC3203111\": \"Ngày phát sinh cuối cùng\",\n" +
            "                  \"BC3203112\": \"Nhóm nợ\",\n" +
            "                  \"BC3203113\": \"Dư nợ VND\",\n" +
            "                  \"BC3203114\": \"Dư nợ USD\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      },\n" +
            "      \"BC3204\": {\n" +
            "          \"BC32041\": [\n" +
            "            {\n" +
            "              \"TTC01\": \"Mã TCTD\",\n" +
            "              \"TTC02\": \"Tên TCTD\",\n" +
            "              \"BC320411\": [\n" +
            "                {\n" +
            "                  \"BC3204111\": \"Ngày phát sinh cuối cùng\",\n" +
            "                  \"BC3204112\": \"Nhóm nợ\",\n" +
            "                  \"BC3204113\": \"Số tiền chậm thanh toán\",\n" +
            "                  \"BC3204114\": \"Số ngày chậm thanh toán\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ],\n" +
            "          \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "      }\n" +
            "    }\n" +
            "  },\n" +
            "  \"BC400\": {\n" +
            "    \"BC410\": {\n" +
            "        \"BC4101\": [\n" +
            "          {\n" +
            "            \"BC41011\": \"Loại hợp đồng\",\n" +
            "            \"BC41012\": \"Còn hiệu lực\",\n" +
            "            \"BC41013\": \"Hết hiệu lực\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC420\": {\n" +
            "        \"BC4201\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC42011\": [\n" +
            "              {\n" +
            "                \"BC420111\": \"Số Hợp đồng\",\n" +
            "                \"BC420112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC420113\": \"Ngày hiệu lực\",\n" +
            "                \"BC420114\": \"Ngày kết thúc\",\n" +
            "                \"BC420115\": \"Hạn mức\",\n" +
            "                \"BC420116\": \"Dư nợ\",\n" +
            "                \"BC420117\": \"Loại tiền vay\",\n" +
            "                \"BC420118\": \"Nhóm nợ (cao nhất)\",\n" +
            "                \"BC420119\": \"Mục đích vay theo ngành kinh tế\",\n" +
            "                \"BC420120\": \"Mục đích vay theo lĩnh vực trọng yếu\",\n" +
            "                \"BC420121\": \"Thời hạn cấp tín dụng\",\n" +
            "                \"BC420122\": \"Hình thức cấp tín dụng\",\n" +
            "                \"BC420123\": \"Phương thức cho vay\",\n" +
            "                \"BC420124\": \"Thời điểm truy đòi\",\n" +
            "                \"BC420125\": \"Số lần cơ cấu lại thời hạn trả nợ\",\n" +
            "                \"BC420126\": \"Tình trạng cơ cấu hiện tại\",\n" +
            "                \"BC420127\": \"Dư nợ gốc chậm trả thực tế\",\n" +
            "                \"BC420128\": \"Số ngày chậm trả nợ gốc\",\n" +
            "                \"BC420129\": \"Số tiền lãi chậm trả thực tế\",\n" +
            "                \"BC420130\": \"Số ngày chậm trả nợ lãi\",\n" +
            "                \"BC420131\": \"Nhóm nợ quá hạn cao nhất\",\n" +
            "                \"BC420132\": \"Ngày cuối cùng có nhóm nợ quá hạn cao nhất\",\n" +
            "                \"BC420133\": \"Dư nợ tại ngày cuối cùng có nhóm nợ cao nhất\",\n" +
            "                \"BC420134\": [\n" +
            "                  {\n" +
            "                    \"BC4201341\": \"Tên người đồng vay\",\n" +
            "                    \"BC4201342\": \"CCCD/Giấy tờ khác\",\n" +
            "                    \"BC4201343\": \"Quan hệ với khách hàng vay chính\"\n" +
            "                  }\n" +
            "                ]\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC430\": {\n" +
            "        \"BC4301\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC43011\": [\n" +
            "              {\n" +
            "                \"BC430111\": \"Số Hợp đồng thẻ\",\n" +
            "                \"BC430112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC430113\": \"Hạn mức\",\n" +
            "                \"BC430114\": \"Loại hạn mức\",\n" +
            "                \"BC430115\": \"Số lượng thẻ\",\n" +
            "                \"BC430116\": \"Số tiền phải thanh toán theo sao kê\",\n" +
            "                \"BC430117\": \"Số tiền quá hạn theo sao kê\",\n" +
            "                \"BC430118\": \"Số ngày quá hạn theo sao kê\",\n" +
            "                \"BC430119\": \"Dư nợ thẻ hiện thời\",\n" +
            "                \"BC430120\": \"Nhóm nợ (cao nhất)\",\n" +
            "                \"BC430121\": \"Số kỳ quá hạn theo sao kê\",\n" +
            "                \"BC430122\": \"Số tiền quá hạn cao nhất\",\n" +
            "                \"BC430123\": \"Số ngày quá hạn cao nhất\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC450\": {\n" +
            "        \"BC4501\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC45011\": [\n" +
            "              {\n" +
            "                \"BC450111\": \"Số Hợp đồng\",\n" +
            "                \"BC450112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC450113\": \"Ngày hiệu lực\",\n" +
            "                \"BC450114\": \"Ngày kết thúc\",\n" +
            "                \"BC450115\": \"Số dư cam kết (VND)\",\n" +
            "                \"BC450116\": \"Loại tiền vay\",\n" +
            "                \"BC450117\": \"Nhóm nợ\",\n" +
            "                \"BC450118\": \"Loại nghiệp vụ\",\n" +
            "                \"BC450119\": \"Mục đích cam kết\",\n" +
            "                \"BC450120\": \"Nhóm nợ quá hạn cao nhất\",\n" +
            "                \"BC450121\": \"Số dư cam kết tại thời điểm nhóm nợ quá hạn cao nhất\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    },\n" +
            "    \"BC460\": {\n" +
            "        \"BC4601\": [\n" +
            "          {\n" +
            "            \"TTC01\": \"Mã TCTD\",\n" +
            "            \"TTC02\": \"Tên TCTD\",\n" +
            "            \"BC46011\": [\n" +
            "              {\n" +
            "                \"BC460111\": \"Số Hợp đồng\",\n" +
            "                \"BC460112\": \"Ngày báo cáo gần nhất\",\n" +
            "                \"BC460113\": \"Ngày hiệu lực\",\n" +
            "                \"BC460114\": \"Ngày kết thúc\",\n" +
            "                \"BC460115\": \"Hạn mức\",\n" +
            "                \"BC460116\": \"Tên đơn vị/cá nhân ủy thác\",\n" +
            "                \"BC460117\": \"CCCD/MST\",\n" +
            "                \"BC460118\": \"Dư nợ\",\n" +
            "                \"BC460119\": \"Loại tiền vay\",\n" +
            "                \"BC460120\": \"Mục đích vay theo ngành kinh tế\",\n" +
            "                \"BC460121\": \"Mục đích vay theo lĩnh vực trọng yếu\",\n" +
            "                \"BC460122\": \"Thời hạn cấp tín dụng\",\n" +
            "                \"BC460123\": \"Hình thức cấp tín dụng\",\n" +
            "                \"BC460124\": \"Phương thức cho vay\",\n" +
            "                \"BC460125\": \"Dư nợ gốc chậm trả thực tế\",\n" +
            "                \"BC460126\": \"Số ngày chậm trả nợ gốc\",\n" +
            "                \"BC460127\": \"Số tiền lãi chậm trả thực tế\",\n" +
            "                \"BC460128\": \"Số ngày chậm trả nợ lãi\",\n" +
            "                \"BC460129\": \"Dư nợ gốc chậm trả thực tế cao nhất\",\n" +
            "                \"BC460130\": \"Số ngày chậm trả nợ gốc cao nhất\",\n" +
            "                \"BC460131\": \"Dư nợ lãi chậm trả thực tế cao nhất\",\n" +
            "                \"BC460132\": \"Số ngày chậm trả nợ lãi cao nhất\"\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        ],\n" +
            "        \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"BC500\": {\n" +
            "      \"BC510\": [\n" +
            "        {\n" +
            "          \"TTC01\": \"Mã TCTD\",\n" +
            "          \"TTC02\": \"Tên TCTD\",\n" +
            "          \"BC5101\": \"Ngày báo cáo dư nợ gần nhất\",\n" +
            "          \"BC5102\": [\n" +
            "            {\n" +
            "              \"BC51021\": \"Mã số bảo đảm tại TCTD\",\n" +
            "              \"BC51022\": \"Loại bảo lãnh\",\n" +
            "              \"BC51023\": \"Mô tả biện pháp bảo đảm\",\n" +
            "              \"BC51024\": \"Số Hợp đồng tín dụng được bảo đảm (Bảo lãnh)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"BC5103\": [\n" +
            "            {\n" +
            "              \"BC51031\": \"Số Hợp đồng tín dụng được bảo đảm (Tín chấp)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"BC5104\": [\n" +
            "            {\n" +
            "              \"BC51041\": \"Số Hợp đồng tín dụng được bảo đảm (Bảo đảm không sử dụng tài sản khác)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"BC5105\": [\n" +
            "            {\n" +
            "              \"BC51051\": \"Mã số bảo đảm tại TCTD\",\n" +
            "              \"BC51052\": \"Loại tài sản\",\n" +
            "              \"BC51053\": \"Ngày hiệu lực hợp đồng thế chấp\",\n" +
            "              \"BC51054\": \"Ngày hết hiệu lực hợp đồng thế chấp\",\n" +
            "              \"BC51055\": \"Tổng giá trị tài sản\",\n" +
            "              \"BC51056\": \"Giá trị tài sản bảo đảm cho khách hàng (Triệu đồng)\",\n" +
            "              \"BC51057\": \"Mô tả tài sản\",\n" +
            "              \"BC51058\": \"Số Hợp đồng tín dụng được bảo đảm (Bằng tài sản)\",\n" +
            "              \"BC51059\": \"Thế chấp chung tại các TCTD khác\",\n" +
            "              \"BC51060\": \"Thế chấp chung với khách hàng vay khác\",\n" +
            "              \"BC51061\": \"Thông tin chi tiết tài sản bảo đảm là dự án\",\n" +
            "              \"BC51062\": [\n" +
            "                {\n" +
            "                  \"BC510621\": \"Tên chủ sở hữu\",\n" +
            "                  \"BC510622\": \"CCCD/MSDN/Giấy tờ khác\"\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"TL000\": \"Ghi chú trong trường hợp không có thông tin\"\n" +
            "  },\n" +
            "  \"BC600\": [\n" +
            "    {\n" +
            "      \"TTC01\": \"Mã TCTD\",\n" +
            "      \"TTC02\": \"Tên tổ chức/CN tổ chức tín dụng\",\n" +
            "      \"BC610\": \"Mục đích tra cứu\",\n" +
            "      \"BC620\": \"Thời gian tra cứu\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"BC700\": {\n" +
            "    \"BC710\": \"Thông tin khác về khách hàng vay\"\n" +
            "  }\n" +
            "}";


    public static final String r10tData =
            "{\n" +
                    "  \"MASOPHIEU\": \"Mã số phiếu\",\n" +
                    "  \"TL001\": \"Tên sản phẩm\",\n" +
                    "  \"TL002\": \"Mã số sản phẩm\",\n" +
                    "  \"TL003\": \"Đơn vị tra cứu thông tin\",\n" +
                    "  \"TL004\": \"Địa chỉ đơn vị tra cứu thông tin\",\n" +
                    "  \"TL005\": \"Họ và tên người tra cứu\",\n" +
                    "  \"TL006\": \"User tra cứu\",\n" +
                    "  \"TL007\": \"Thời gian yêu cầu\",\n" +
                    "  \"TL008\": \"Thời gian gửi báo cáo\",\n" +
                    "  \"TL099\": \"Các trường hợp kết quả trả báo cáo\",\n" +
                    "  \"TENKH\": \"Tên khách hàng\",\n" +
                    "  \"MSTHUE_DKKD\": \"Mã số thuế/Đăng ký kinh doanh/Giấy phép đầu tư\",\n" +
                    "  \"BC100\": {\n" +
                    "   \"BC110\": {\n" +
                    "      \"TTC04\": \"Tên khách hàng\",\n" +
                    "      \"MACIC\": \"Mã số CIC\",\n" +
                    "      \"BC1101\": \"Địa chỉ khách hàng\",\n" +
                    "      \"BC1102\": \" Mã số thuế\",\n" +
                    "      \"BC1103\": \"Đăng ký kinh doanh/Giấy phép đầu tư\",\n" +
                    "      \"BC1104\": \"Tổng giám đốc/Giám đốc\",\n" +
                    "      \"BC1105\": \"Người đại diện theo pháp luật\"\n" +
                    "    },\n" +
                    "    \"BC120\": [\n" +
                    "      \"Thông tin địa chỉ khách hàng\"\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"BC200\": {\n" +
                    "    \"BC210\": [\n" +
                    "      {\n" +
                    "        \"BC2101\": \"Năm\",\n" +
                    "        \"BC2102\": \"Hạng\",\n" +
                    "        \"BC2103\": \"PD (%)\",\n" +
                    "        \"BC2104\": \"Diễn giải\",\n" +
                    "\t    \"BC2105\": \"Ngày phân tích\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"TL000\": \"Ghi chú cho trường hợp không có thông tin\"\n" +
                    "  },\n" +
                    "  \"BC300\": {\n" +
                    "    \"BC310\": {\n" +
                    "     \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
                    "      \"BC3100\": [\n" +
                    "        {\n" +
                    "          \"BC31001\": \"Loại vay\",\n" +
                    "          \"BC31002\": \"Dư nợ đủ tiêu chuẩn VND\",\n" +
                    "          \"BC31003\": \"Dư nợ đủ tiêu chuẩn USD\",\n" +
                    "          \"BC31004\": \"Dư nợ cần chú ý VND\",\n" +
                    "          \"BC31005\": \"Dư nợ cần chú ý USD\",\n" +
                    "          \"BC31006\": \"Dư nợ dưới chuẩn VND\",\n" +
                    "          \"BC31007\": \"Dư nợ dưới chuẩn USD\",\n" +
                    "          \"BC31008\": \"Dư nợ nghi ngờ VND\",\n" +
                    "          \"BC31009\": \"Dư nợ nghi ngờ USD\",\n" +
                    "          \"BC31010\": \"Dư nợ có khả năng mất vốn VND\",\n" +
                    "          \"BC31011\": \"Dư nợ có khả năng mất vốn USD\",\n" +
                    "          \"BC31012\": \"Dư nợ xấu khác VND\",\n" +
                    "          \"BC31013\": \"Dư nợ xấu khác USD\",\n" +
                    "          \"BC31014\": \"Dư nợ không phân loại nợ VND\",\n" +
                    "          \"BC31015\": \"Dư nợ không phân loại nợ USD\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"BC320\": {\n" +
                    "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
                    "      \"BC3200\": [\n" +
                    "        {\n" +
                    "          \"TTC01\": \"Mã TCTD\",\n" +
                    "          \"TTC02\": \"Tên TCTD\",\n" +
                    "          \"BC32001\": \"Ngày báo cáo gần nhất\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"BC330\": {\n" +
                    "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
                    "      \"BC3300\": [\n" +
                    "        {\n" +
                    "          \"TTC01\": \"Mã TCTD\",\n" +
                    "          \"TTC02\": \"Tên TCTD\",\n" +
                    "          \"BC33001\": \"Dư nợ VND\",\n" +
                    "          \"BC33002\": \"Dư nợ USD\",\n" +
                    "          \"BC33003\": \"Ngày báo cáo\",\n" +
                    "          \"BC33004\": \"Số ngày chậm thanh toán (cao nhất)\",\n" +
                    "          \"BC33005\": \"Mã Đơn vị mua nợ\",\n" +
                    "          \"BC33006\": \"Tên Đơn vị mua nợ\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"BC340\": {\n" +
                    "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
                    "      \"BC3400\": [\n" +
                    "        {\n" +
                    "          \"TTC01\": \"Mã TCTD\",\n" +
                    "          \"TTC02\": \"Tên TCTD\",\n" +
                    "          \"BC34001\": \"Tổng giá trị VND\",\n" +
                    "          \"BC34002\": \"Tổng giá trị USD\",\n" +
                    "          \"BC34003\": \"Nhóm nợ (Cao nhất)\",\n" +
                    "          \"BC34004\": \"Ngày báo cáo\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"BC350\": {\n" +
                    "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
                    "      \"BC3500\": [\n" +
                    "        {\n" +
                    "          \"TTC01\": \"Mã TCTD\",\n" +
                    "          \"TTC02\": \"Tên TCTD\",\n" +
                    "          \"BC35001\": \"Dư nợ VND\",\n" +
                    "          \"BC35002\": \"Dư nợ USD\",\n" +
                    "          \"BC35003\": \"Nhóm nợ (Cao nhất)\",\n" +
                    "          \"BC35004\": \"Ngày báo cáo\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"BC360\": {\n" +
                    "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
                    "      \"BC3600\": [\n" +
                    "        {\n" +
                    "          \"BC36001\": \"Tháng năm\",\n" +
                    "          \"BC36002\": \"Nợ vay và cấp tín dụng khác\",\n" +
                    "          \"BC36003\": \"Dư nợ thẻ tín dụng\",\n" +
                    "          \"BC36004\": \"Trái phiếu\",\n" +
                    "          \"BC36005\": \"Cam kết ngoại bảng\",\n" +
                    "          \"BC36006\": \"Nợ khác\",\n" +
                    "          \"BC36007\": \"Tổng dư nợ\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"BC370\": {\n" +
                    "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
                    "      \"BC3700\": [\n" +
                    "        {\n" +
                    "          \"TTC01\": \"Mã TCTD\",\n" +
                    "          \"TTC02\": \"Tên TCTD\",\n" +
                    "          \"BC37001\": \"Tháng năm\",\n" +
                    "          \"BC37002\": \"Tổng nợ cần chú ý\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"BC380\": {\n" +
                    "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
                    "      \"BC3800\": [\n" +
                    "        {\n" +
                    "          \"TTC01\": \"Mã TCTD\",\n" +
                    "          \"TTC02\": \"Tên TCTD\",\n" +
                    "          \"BC38001\": [\n" +
                    "            {\n" +
                    "              \"BC380011\": \"Ngày phát sinh cuối cùng\",\n" +
                    "              \"BC380012\": \"Nhóm nợ\",\n" +
                    "              \"BC380013\": \"Dư nợ VND\",\n" +
                    "              \"BC380014\": \"Dư nợ USD\"\n" +
                    "            }\n" +
                    "          ]\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"BC390\": {\n" +
                    "      \"BC3901\": \"Khách hàng có chậm thanh toán thẻ\",\n" +
                    "      \"BC3902\": \"Số ngày chậm thanh toán thẻ lớn nhất\",\n" +
                    "      \"BC3903\": \"Số lần chậm thanh toán thẻ\",\n" +
                    "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\"\n" +
                    "    }\n" +
                    "  },\n" +
                    "  \"BC400\": {\n" +
                    "    \"BC401\": \"Bảo đảm tiền vay bằng tài sản\",\n" +
                    "    \"BC402\": \"Số lượng tài sản bảo đảm\",\n" +
                    "    \"BC403\": \"Số TCTD có tài sản bảo đảm\",\n" +
                    "    \"TL000\": \"Ghi chú cho trường hợp không có thông tin\"\n" +
                    "  },\n" +
                    "  \"BC500\": {\n" +
                    "    \"BC510\": \"Thông tin khác về khách hàng vay\"\n" +
                    "  }\n" +
                    "}";

    public static final String r11tData = "{\n" +
            "  \"MASOPHIEU\": \"Mã số phiếu\",\n" +
            "  \"TL001\": \"Tên sản phẩm\",\n" +
            "  \"TL002\": \"Mã số sản phẩm\",\n" +
            "  \"TL003\": \"Đơn vị tra cứu thông tin\",\n" +
            "  \"TL004\": \"Địa chỉ đơn vị tra cứu thông tin\",\n" +
            "  \"TL005\": \"Họ và tên người tra cứu\",\n" +
            "  \"TL006\": \"User tra cứu\",\n" +
            "  \"TL007\": \"Thời gian yêu cầu\",\n" +
            "  \"TL008\": \"Thời gian gửi báo cáo\",\n" +
            "  \"TL099\": \"Các trường hợp kết quả trả báo cáo\",\n" +
            "  \"TENKH\": \"Tên khách hàng\",\n" +
            "  \"CCCD_HOCHIEU\": \"Căn cước công dân, Hộ chiếu\",\n" +
            "  \"BC100\": {\n" +
            "    \"BC110\": {\n" +
            "      \"TTC04\": \"Tên khách hàng\",\n" +
            "      \"MACIC\": \" Mã số CIC\",\n" +
            "      \"BC1101\": \"Căn cước công dân\",\n" +
            "      \"BC1102\": \"Thông tin xác thực của khách hàng\",\n" +
            "      \"BC1103\": \"Giấy tờ khác\"\n" +
            "    },\n" +
            "    \"BC120\": [\n" +
            "      \"Thông tin địa chỉ khách hàng\"\n" +
            "    ]\n" +
            "  },\n" +
            "  \"BC200\": {\n" +
            "    \"BC220\": {\n" +
            "        \"BC2201\": \"Điểm tín dụng\",\n" +
            "        \"BC2202\": \"Hạng\",\n" +
            "        \"BC2203\": \"Ngày chấm điểm\",\n" +
            "        \"BC2204\": \"Xếp hạng khách hàng\"\n" +
            "      }\n" +
            "    ,\n" +
            "    \"TL000\": \"Ghi chú cho trường hợp không có thông tin\"\n" +
            "  },\n" +
            "  \"BC300\": {\n" +
            "    \"BC310\": {\n" +
            "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
            "      \"BC3100\": [\n" +
            "        {\n" +
            "          \"BC31001\": \"Loại vay\",\n" +
            "          \"BC31002\": \"Dư nợ đủ tiêu chuẩn VND\",\n" +
            "          \"BC31003\": \"Dư nợ đủ tiêu chuẩn USD\",\n" +
            "          \"BC31004\": \"Dư nợ cần chú ý VND\",\n" +
            "          \"BC31005\": \"Dư nợ cần chú ý USD\",\n" +
            "          \"BC31006\": \"Dư nợ dưới chuẩn VND\",\n" +
            "          \"BC31007\": \"Dư nợ dưới chuẩn USD\",\n" +
            "          \"BC31008\": \"Dư nợ nghi ngờ VND\",\n" +
            "          \"BC31009\": \"Dư nợ nghi ngờ USD\",\n" +
            "          \"BC31010\": \"Dư nợ có khả năng mất vốn VND\",\n" +
            "          \"BC31011\": \"Dư nợ có khả năng mất vốn USD\",\n" +
            "          \"BC31012\": \"Dư nợ xấu khác VND\",\n" +
            "          \"BC31013\": \"Dư nợ xấu khác USD\",\n" +
            "          \"BC31014\": \"Dư nợ không phân loại nợ VND\",\n" +
            "          \"BC31015\": \"Dư nợ không phân loại nợ USD\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"BC320\": {\n" +
            "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
            "      \"BC3200\": [\n" +
            "        {\n" +
            "          \"TTC01\": \"Mã TCTD\",\n" +
            "          \"TTC02\": \"Tên TCTD\",\n" +
            "          \"BC32001\": \"Ngày báo cáo gần nhất\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"BC330\": {\n" +
            "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
            "      \"BC3300\": [\n" +
            "        {\n" +
            "          \"TTC01\": \"Mã TCTD\",\n" +
            "          \"TTC02\": \"Tên TCTD\",\n" +
            "          \"BC33001\": \"Dư nợ VND\",\n" +
            "          \"BC33002\": \"Dư nợ USD\",\n" +
            "          \"BC33003\": \"Ngày báo cáo\",\n" +
            "          \"BC33004\": \"Số ngày chậm thanh toán (cao nhất)\",\n" +
            "          \"BC33005\": \"Mã Đơn vị mua nợ\",\n" +
            "          \"BC33006\": \"Tên Đơn vị mua nợ\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"BC340\": {\n" +
            "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
            "      \"BC3400\": [\n" +
            "        {\n" +
            "          \"TTC01\": \"Mã TCTD\",\n" +
            "          \"TTC02\": \"Tên TCTD\",\n" +
            "          \"BC34001\": \"Dư nợ VND\",\n" +
            "          \"BC34002\": \"Dư nợ USD\",\n" +
            "          \"BC34003\": \"Nhóm nợ (Cao nhất)\",\n" +
            "          \"BC34004\": \"Ngày báo cáo\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"BC350\": {\n" +
            "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
            "      \"BC3500\": [\n" +
            "        {\n" +
            "          \"BC35001\": \"Thời gian\",\n" +
            "          \"BC35002\": \"Nợ vay và cấp tín dụng khác\",\n" +
            "          \"BC35003\": \"Dư nợ thẻ tín dụng\",\n" +
            "          \"BC35004\": \"Cam kết ngoại bảng\",\n" +
            "          \"BC35005\": \"Nợ khác\",\n" +
            "          \"BC35006\": \"Tổng dư nợ\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"BC360\": {\n" +
            "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
            "      \"BC3600\": [\n" +
            "        {\n" +
            "          \"TTC02\": \"Tên TCTD\",\n" +
            "          \"BC36001\": \"Tháng năm\",\n" +
            "          \"BC36002\": \"Tổng nợ cần chú ý\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"BC370\": {\n" +
            "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\",\n" +
            "      \"BC3700\": [\n" +
            "        {\n" +
            "          \"TTC01\": \"Mã TCTD\",\n" +
            "          \"TTC02\": \"Tên TCTD\",\n" +
            "          \"BC37001\": [\n" +
            "            {\n" +
            "              \"BC370011\": \"Ngày phát sinh cuối cùng\",\n" +
            "              \"BC370012\": \"Nhóm nợ\",\n" +
            "              \"BC370013\": \"Dư nợ VND\",\n" +
            "              \"BC370014\": \"Dư nợ USD\"\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    \"BC380\": {\n" +
            "      \"BC3801\": \"Khách hàng có chậm thanh toán thẻ\",\n" +
            "      \"BC3802\": \"Số ngày chậm thanh toán thẻ lớn nhất\",\n" +
            "      \"BC3803\": \"Số lần chậm thanh toán thẻ\",\n" +
            "      \"TL000\": \"Ghi chú cho trường hợp không có thông tin\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"BC400\": {\n" +
            "    \"BC401\": \"Bảo đảm tiền vay bằng tài sản\",\n" +
            "    \"BC402\": \"Số lượng tài sản bảo đảm\",\n" +
            "    \"BC403\": \"Số TCTD có tài sản bảo đảm\",\n" +
            "    \"TL000\": \"Ghi chú cho trường hợp không có thông tin\"\n" +
            "  },\n" +
            "  \"BC500\": {\n" +
            "    \"BC510\": \"Thông tin khác về khách hàng vay\"\n" +
            "  }\n" +
            "}";

    public static final String b11tData = "{\n" +
            "  \"MASOPHIEU\": \"Mã số phiếu\",\n" +
            "  \"TL001\": \"Tên sản phẩm\",\n" +
            "  \"TL002\": \"Mã số sản phẩm\",\n" +
            "  \"TL003\": \"Đơn vị tra cứu thông tin\",\n" +
            "  \"TL004\": \"Địa chỉ đơn vị tra cứu thông tin\",\n" +
            "  \"TL005\": \"Họ và tên người tra cứu\",\n" +
            "  \"TL006\": \"Thời gian gửi yêu cầu\",\n" +
            "  \"TL007\": \"Thời gian trả báo cáo\",\n" +
            "  \"TL008\": \"User tra cứu\",\n" +
            "  \"CCCD\": \"Số Căn cước công dân\",\n" +
            "  \"TENKH\": \"Tên khách hàng\",\n" +
            "  \"TL099\": \"Các trường hợp kết quả trả báo cáo\",\n" +
            "  \"TL100\": \"Ghi chú khác (nếu có)\",\n" +
            "  \"BC100\": {\n" +
            "    \"TTC04\": \"Tên khách hàng\",\n" +
            "    \"MACIC\": \"Mã CIC\",\n" +
            "    \"CN003\": \"Địa chỉ\",\n" +
            "    \"CN008\": \"Số CCCD\",\n" +
            "    \"CN100\": true,\n" +
            "    \"CN101\": \"Giấy tờ các nhân khác\"\n" +
            "  },\n" +
            "  \"BC200\": {\n" +
            "    \"BC210\": \"Tổng dư nợ\",\n" +
            "    \"BC220\": \"Số lượng TCTD/CNTCTD đang quan hệ\",\n" +
            "    \"BC230\": \"Dư nợ cần chú ý\",\n" +
            "    \"BC240\": \"Số lượng TCTD đang có nợ cần chú ý\",\n" +
            "    \"BC250\": \"Dư nợ xấu\",\n" +
            "    \"BC260\": \"Số lượng TCTD/CNTCTD đang có nợ xấu\",\n" +
            "    \"BC270\": \"Trong đó: nhóm nợ 5, nợ tại VAMC, nợ xấu khác\"\n" +
            "  }\n" +
            "}";

    public static final String b11tData2 =
            "{\n" +
                    "  \"TL002\":\"2024\",\n" +
                    "  \"TL003\":\"Đơn vị tra cứu\",\n" +
                    "  \"TL004\":\"Địa chỉ\",\n" +
                    "  \"TL005\":\"nguyen van A\",\n" +
                    "  \"TL006\":\"14:39 - 20/05/2024\",\n" +
                    "  \"TL099\":\"IN_01: Mã số phiếu null hoặc trống\"\n" +
                    "} \n";

    public static final String s10tSoapResponse =
            "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"> \n" +
                    "   <env:Header/> \n" +
                    "   <env:Body> \n" +
                    "      <ns2:PHHoiTin xmlns:ns2=\"http://www.endpoint.ws.h2h.cic.org.vn/cicqr\"> \n" +
                    "         <ns2:Data>\n" + s10tData +
                    "         </ns2:Data> \n" +
                    "      </ns2:PHHoiTin> \n" +
                    "   </env:Body> \n" +
                    "</env:Envelope> ";
    public static final String s11tSoapResponse =
            "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"> \n" +
                    "   <env:Header/> \n" +
                    "   <env:Body> \n" +
                    "      <ns2:PHHoiTin xmlns:ns2=\"http://www.endpoint.ws.h2h.cic.org.vn/cicqr\"> \n" +
                    "         <ns2:Data>\n" + s11tData +
                    "         </ns2:Data> \n" +
                    "      </ns2:PHHoiTin> \n" +
                    "   </env:Body> \n" +
                    "</env:Envelope> ";


    public static final String r10tSoapResponse =
            "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"> \n" +
                    "   <env:Header/> \n" +
                    "   <env:Body> \n" +
                    "      <ns2:PHHoiTin xmlns:ns2=\"http://www.endpoint.ws.h2h.cic.org.vn/cicqr\">\n" +
                    "         <ns2:Data>\n" + r10tData +
                    "         </ns2:Data> \n" +
                    "      </ns2:PHHoiTin> \n" +
                    "   </env:Body> \n" +
                    "</env:Envelope> ";
    public static final String r11tSoapResponse =
            "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"> \n" +
                    "   <env:Header/> \n" +
                    "   <env:Body> \n" +
                    "      <ns2:PHHoiTin xmlns:ns2=\"http://www.endpoint.ws.h2h.cic.org.vn/cicqr\">\n" +
                    "         <ns2:Data>\n" + r11tData +
                    "         </ns2:Data> \n" +
                    "    </ns2:PHHoiTin> \n" +
                    "  </env:Body> \n" +
                    "</env:Envelope>";

    public static final String b11tSoapResponse =
            "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"> \n" +
                    "  <env:Header/> \n" +
                    "  <env:Body> \n" +
                    "    <ns2:PHHoiTinB11T xmlns:ns2=\" http://www.endpoint.ws.h2h.cic.org.vn/cicqr\">       \n" +
                    "      <ns2:Data>\n" + b11tData +
                    "         </ns2:Data> \n" +
                    "    </ns2:PHHoiTinB11T> \n" +
                    "  </env:Body> \n" +
                    "</env:Envelope>";

    public static final String b11tSoapResponse2 =
            "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"> \n" +
                    "  <env:Header/> \n" +
                    "  <env:Body> \n" +
                    "    <ns2:PHHoiTinB11T xmlns:ns2=\" http://www.endpoint.ws.h2h.cic.org.vn/cicqr\">       \n" +
                    "      <ns2:Data>\n" + b11tData2 +
                    "         </ns2:Data> \n" +
                    "    </ns2:PHHoiTinB11T> \n" +
                    "  </env:Body> \n" +
                    "</env:Envelope>";
}


