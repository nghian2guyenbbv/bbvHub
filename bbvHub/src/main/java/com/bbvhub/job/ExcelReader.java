package com.bbvhub.job;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class ExcelReader {

  public static void main(String[] args) {
    String query = "-------customer CUST_NUMBER---------\n"
        + "DELETE FROM USER_VEHICLE_HISTORY WHERE USER_ID IN (select ID FROM ESHOP_USER WHERE FIRST_NAME = 'CUST_NUMBER');\n"
        + "DELETE FROM LOGIN WHERE USER_ID IN (select ID FROM ESHOP_USER WHERE FIRST_NAME = 'CUST_NUMBER');\n"
        + "DELETE FROM GROUP_USER WHERE USER_ID IN (select ID FROM ESHOP_USER WHERE FIRST_NAME = 'CUST_NUMBER');\n"
        + "DELETE FROM GROUP_USER WHERE GROUP_ID IN (SELECT ID FROM ESHOP_GROUP\n"
        + "                                          WHERE NAME ='CUSTOMER_CUST_NUMBER_USER_ADMIN');\n"
        + "DELETE FROM ESHOP_USER WHERE  FIRST_NAME = 'CUST_NUMBER';\n"
        + "DELETE FROM ESHOP_USER WHERE USERNAME = 'Agent-CUST_NUMBER';\n"
        + "DELETE FROM ORGANISATION_ADDRESS WHERE ORGANISATION_ID IN (SELECT ID FROM ORGANISATION WHERE ORG_CODE = 'CUST_NUMBER');\n"
        + "DELETE FROM GROUP_ROLE WHERE GROUP_ID IN (SELECT id from ESHOP_GROUP where name ='CUSTOMER_CUST_NUMBER_USER_ADMIN');\n"
        + "DELETE FROM ORGANISATION_GROUP WHERE GROUP_ID IN (SELECT id from ESHOP_GROUP where name ='CUSTOMER_CUST_NUMBER_USER_ADMIN');\n"
        + "DELETE FROM COLLECTION_RELATION WHERE ORGANISATION_ID IN (SELECT ID FROM ORGANISATION WHERE ORG_CODE = 'CUST_NUMBER');\n"
        + "DELETE FROM ORGANISATION WHERE ORG_CODE = 'CUST_NUMBER';\n"
        + "DELETE FROM ESHOP_GROUP WHERE NAME ='CUSTOMER_CUST_NUMBER_USER_ADMIN';\n"
        + "IF (SELECT COUNT(ID)  from ORGANISATION WHERE ORG_CODE = 'CUST_NUMBER') = 0\n" + "BEGIN\n"
        + "INSERT INTO CUSTOMER_SETTINGS(ALLOCATION_ID, PAYMENT_METHOD, DELIVERY_ID, COLLECTIVE_DELIVERY_ID, NET_PRICE_VIEW, NET_PRICE_CONFIRM, VIEW_BILLING, ADDRESS_ID, USE_DEFAULT_SETTING, EMAIL_NOTIFICATION_ORDER, BILLING_ADDRESS_ID, DELIVERY_ADDRESS_ID, ALLOW_NET_PRICE_CHANGED, INVOICE_TYPE, SHOW_DISCOUNT, SESSION_TIMEOUT_SECONDS, SHOW_OCI_VAT, HOME_BRANCH, DEMO_CUSTOMER, PRICE_DISPLAY_ID, NORMAUTO_DISPLAY, HAS_PARTNER_PROGRAM_VIEW, WSS_SHOW_NET_PRICE, WSS_MARGIN_GROUP, WSS_DELIVERY_PROFILE_ID, WSS_DELIVERY_ID)VALUES(1, 2, 2, 1, 1, 1, 0, 0, 0, 0, N'1', N'1', 1, 2, 0, 14400, 0, NULL, 0, 1, 0, 0, 0, NULL, NULL, 1);\n"
        + "SET @cust_setting = @@IDENTITY;\n" + "INSERT INTO ORGANISATION\n"
        + "(NAME, ORG_CODE, ORGTYPE_ID, PARENT_ID, DESCRIPTION, SHORTNAME, ORDER_SETTINGS_ID)\n"
        + "VALUES(N'CUST_NAME', N'CUST_NUMBER', @org_type, @hella_gutmann_org, N'', N'customer-CUST_NUMBER', @cust_setting);\n"
        + "SET @org_id = @@IDENTITY;\n" + "INSERT INTO COLLECTION_RELATION\n"
        + "(COLLECTION_ID, ORGANISATION_ID, IS_ACTIVE)\n" + "VALUES(@hella_gutmann_collection, @org_id, 1);\n"
        + "INSERT INTO ADDRESS\n" + "(LINE1, LINE2, LINE3, COUNTRYISO, STATE, CITY, ZIPCODE, ADDRESS_TYPE_ID)\n"
        + "VALUES(N'CUST_LINE1', NULL, NULL, N'CUST_COUNTRYISO', NULL, N'CUST_CITY', N'CUST_ZIPCODE', 1);\n"
        + "SET @address_id = @@IDENTITY;\n" + "\n" + "INSERT INTO ORGANISATION_ADDRESS\n"
        + "(ORGANISATION_ID, ADDRESS_ID)\n" + "VALUES(@org_id, @address_id);\n" + "INSERT INTO ESHOP_GROUP\n"
        + "(NAME, DESCRIPTION)\n" + "VALUES(N'CUSTOMER_CUST_NUMBER_USER_ADMIN', N'User admin group of ');\n"
        + "SET @admin_group_id = @@IDENTITY;\n" + "INSERT INTO GROUP_ROLE\n" + "(GROUP_ID, ROLE_ID)\n"
        + "VALUES(@admin_group_id, @admin_role);\n" + "\n" + "INSERT INTO ORGANISATION_GROUP\n"
        + "(GROUP_ID, ORGANISATION_ID)\n" + "VALUES(@admin_group_id, @org_id)\n" + "END;\n" + "\n"
        + "IF (SELECT COUNT(ID)  from ESHOP_USER WHERE USERNAME = N'Agent-CUST_NUMBER') = 0\n" + "BEGIN\n"
        + "INSERT INTO USER_SETTINGS\n"
        + "(ALLOCATION_ID, PAYMENT_METHOD, DELIVERY_ID, COLLECTIVE_DELIVERY_ID, NET_PRICE_VIEW, NET_PRICE_CONFIRM, VIEW_BILLING, ADDRESS_ID, USE_DEFAULT_SETTING, EMAIL_NOTIFICATION_ORDER, BILLING_ADDRESS_ID, DELIVERY_ADDRESS_ID, INVOICE_TYPE, SHOW_DISCOUNT, SHOW_HAPPY_POINTS, ACCEPT_HAPPY_POINT_TERM, SALE_ON_BEHALF_OF, SHOW_RECOMMENDED_RETAIL_PRICE, CURRENT_STATE_NET_PRICE_VIEW, CLASSIC_CATEGORY_VIEW, SINGLE_SELECT_MODE)VALUES(1, 2, 2, 1, 1, 1, 0, 0, 1, 0, N'1', N'1', 2, 0, 0, 0, 1, 0, 1, 0, 0);\n"
        + "SET @user_setting = @@IDENTITY;\n" + "INSERT INTO ESHOP_USER\n"
        + "(SALUTATION, FIRST_NAME, LAST_NAME, EMAIL, USERNAME, PHONE, [LANGUAGE], [TYPE], HOURLY_RATE, EMAIL_CONFIRMATION, NEWSLETTER, SETTING, VAT_CONFIRM, SIGN_IN_DATE, FAX, ORIGINAL_USER_ID)\n"
        + "VALUES(9, N'CUST_NUMBER', N'Agent', N'CUST_EMAIL', N'Agent-CUST_NUMBER', N'CUST_PHONE', 1, N'ON_BEHALF_ADMIN', NULL, 0, 0, @user_setting, 1, NULL, NULL, NULL);\n"
        + "SET @user_id = @@IDENTITY;\n" + "SET @admin_group_id = (SELECT ID FROM ESHOP_GROUP\n"
        + "WHERE NAME ='CUSTOMER_CUST_NUMBER_USER_ADMIN');\n" + "INSERT INTO GROUP_USER\n" + "(GROUP_ID, USER_ID)\n"
        + "VALUES(@admin_group_id, @user_id)\n" + "END;\n" + "\n"
        + "INSERT INTO LOGIN (PASSWORD, USER_ID, IS_USER_ACTIVE, hash_type, LAST_ON_BEHALF_OF_DATE, FIRST_LOGIN_DATE, PASSWORD_HASH, PASSWORD_SALT) SELECT 'FdcFONWLNYYKY', ID , 1, 'BLCK_VAR', '', '', '', '' FROM ESHOP_USER WHERE USERNAME = 'Agent-CUST_NUMBER';";

    try {
      File file = new File("D:\\hella_gutmann_cust.xlsx");
      FileInputStream fis = new FileInputStream(file);

      Workbook workbook = WorkbookFactory.create(fis);
      Sheet sheet = workbook.getSheetAt(0); // Assumes the first sheet
String CUST_NUMBER = " ", CUST_NAME = " ", CUST_EMAIL = " ", CUST_PHONE = " ", CUST_CITY = " ", CUST_ZIPCODE = " ", CUST_LINE1 = " ", CUST_COUNTRYISO=" ";

      for (Row row : sheet) {
        for (Cell cell : row) {
          String valueCell = " ";
          switch (cell.getCellType()) {

          case STRING:
            valueCell = cell.getStringCellValue();
            //System.out.print(cell.getStringCellValue() + "\t");
            break;
          /*case NUMERIC:
            System.out.print(cell.getNumericCellValue() + "\t");
            break;
          case BOOLEAN:
            System.out.print(cell.getBooleanCellValue() + "\t");
            break;*/
          default:
            valueCell = " ";
            //System.out.print(" ");
          }
          int collumIndex = cell.getColumnIndex();
          //System.out.println("collumIndex: "+collumIndex);

          switch (collumIndex){
          case 0: CUST_NUMBER = valueCell;
          break;
          case 1: CUST_CITY = valueCell;
          break;
          case 2: CUST_COUNTRYISO = valueCell;
          break;
          case 4: CUST_NAME = valueCell;
          break;
          case 5: CUST_LINE1 = valueCell;
          break;
          case 6: CUST_ZIPCODE = valueCell;
          break;
          case 7: CUST_EMAIL = valueCell;
          break;
          case 8: CUST_PHONE = valueCell;
          }
        }
        if(row.getRowNum() >3500 && row.getRowNum() <= 4000){
          //System.out.println(CUST_NAME+"|"+CUST_EMAIL+"|"+CUST_CITY+"|"+CUST_LINE1+"|"+CUST_NUMBER+"|"+CUST_PHONE+"|"+CUST_ZIPCODE);
          String insertQuery = query.replace("CUST_NAME", CUST_NAME).replace("CUST_COUNTRYISO",CUST_COUNTRYISO).replace("CUST_EMAIL", CUST_EMAIL).replace("CUST_CITY", CUST_CITY)
              .replace("CUST_LINE1", CUST_LINE1).replace("CUST_NUMBER", CUST_NUMBER).replace("CUST_PHONE",CUST_PHONE).replace("CUST_ZIPCODE",CUST_ZIPCODE);
          System.out.println(insertQuery);
          System.out.println();
        }

      }

      workbook.close();
    } catch (IOException | EncryptedDocumentException ex) {
      ex.printStackTrace();
    }
  }
}