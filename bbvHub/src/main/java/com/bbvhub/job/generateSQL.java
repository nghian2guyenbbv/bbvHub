package com.bbvhub.job;

import java.util.Arrays;
import java.util.List;

public class generateSQL {

  public static void main(String[] args) {
    List<String> custs = Arrays.asList("99000118"
        ,"99000162"
        ,"99000250"
        ,"99001263"
        ,"99003822"
        ,"99005587"
        ,"99006447"
        ,"99007748"
        ,"99009978"
        ,"99010297"
        ,"99010391"
        ,"99012529"
        ,"99013315"
        ,"99013674"
        ,"99013921"
        ,"99013922"
        ,"99013923"
        ,"99013924"
        ,"99013925"
        ,"99013926"
        ,"99013927"
        ,"99013950"
        ,"99017147"
        ,"99017148"
        ,"99017298"
        ,"99017299"
        ,"99017301"
        ,"99017302"
        ,"99017303"
        ,"99017304"
        ,"99017309"
        ,"99017312"
        ,"99017426"
        ,"99017434"
        ,"99018373"
        ,"99019848"
        ,"99020090"
        ,"99022690"
        ,"99023260"
        ,"99023973"
        ,"99023990"
        ,"99024700"
        ,"99024701"
        ,"99025180"
        ,"99025370"
        ,"99025590"
        ,"99026082"
        ,"99026345"
        ,"99026579"
        ,"99026936"
        ,"99027200"
        ,"99027230"
        ,"99027410"
        ,"99027610"
        ,"99027622"
        ,"99028045"
        ,"99028262"
        ,"99028900"
        ,"99030212"
        ,"99030645"
        ,"99031730"
        ,"99032800"
        ,"99033249"
        ,"99033250"
        ,"99033251"
        ,"99033252"
        ,"99033254"
        ,"99033255"
        ,"99033256"
        ,"99033443"
        ,"99033741"
        ,"99033742"
        ,"99033743"
        ,"99033744"
        ,"99033745"
        ,"99033746"
        ,"99033758"
        ,"99033759"
        ,"99033760"
        ,"99033823"
        ,"99033830"
        ,"99033831"
        ,"99033832"
        ,"99033833"
        ,"99033834"
        ,"99033835"
        ,"99033836"
        ,"99033837"
        ,"99033838"
        ,"99033839"
        ,"99033840"
        ,"99033841"
        ,"99033842"
        ,"99033843"
        ,"99033844"
        ,"99033845"
        ,"99033846"
        ,"99033847"
        ,"99033848");
    custs.forEach(s->{
      String s1 = "IF (SELECT COUNT(ID)  from ORGANISATION WHERE ORG_CODE = '";
      String s2 = "') = 0 \n" + "BEGIN\n"
          + "    INSERT INTO CUSTOMER_SETTINGS(ALLOCATION_ID, PAYMENT_METHOD, DELIVERY_ID, COLLECTIVE_DELIVERY_ID, NET_PRICE_VIEW, NET_PRICE_CONFIRM, VIEW_BILLING, ADDRESS_ID, USE_DEFAULT_SETTING, EMAIL_NOTIFICATION_ORDER, BILLING_ADDRESS_ID, DELIVERY_ADDRESS_ID, ALLOW_NET_PRICE_CHANGED, INVOICE_TYPE, SHOW_DISCOUNT, SESSION_TIMEOUT_SECONDS, SHOW_OCI_VAT, HOME_BRANCH, DEMO_CUSTOMER, PRICE_DISPLAY_ID, NORMAUTO_DISPLAY, HAS_PARTNER_PROGRAM_VIEW, WSS_SHOW_NET_PRICE, WSS_MARGIN_GROUP, WSS_DELIVERY_PROFILE_ID, WSS_DELIVERY_ID)VALUES(1, 2, 2, 1, 1, 1, 0, 0, 0, 0, N'1', N'1', 1, 2, 0, 14400, 0, NULL, 0, 1, 0, 0, 0, NULL, NULL, 1);SET @cust_setting = @@IDENTITY;\n"
          + "INSERT INTO ORGANISATION\n"
          + "(NAME, ORG_CODE, ORGTYPE_ID, PARENT_ID, DESCRIPTION, SHORTNAME, ORDER_SETTINGS_ID)\n" + "VALUES(N'', N'";
      String s3= "', @org_type, @hella_org, N'', N'customer-";
      String s4 = "', @cust_setting);\n" + "SET @org_id = @@IDENTITY;\n" + "INSERT INTO COLLECTION_RELATION\n"
          + "(COLLECTION_ID, ORGANISATION_ID, IS_ACTIVE)\n" + "VALUES(@hella_collection, @org_id, 1);";
      StringBuilder sb = new StringBuilder();
      sb.append(s1).append(s).append(s2).append(s).append(s3).append(s).append(s4);
      System.out.println("-------" + "customer "+s+"---------");
      System.out.println(sb.toString());

      String o1 = "INSERT INTO ORGANISATION_ADDRESS\n" + "(ORGANISATION_ID, ADDRESS_ID)\n"
          + "VALUES(@org_id, @address_id);\n" + "INSERT INTO ESHOP_GROUP\n" + "(NAME, DESCRIPTION)\n"
          + "VALUES(N'CUSTOMER_";
      String o2 = "_USER_ADMIN', N'User admin group of ');\n" + "SET @admin_group_id = @@IDENTITY;";

      StringBuilder org = new StringBuilder();
      org.append(o1).append(s).append(o2);
      System.out.println(org.toString());

      String groupRole = "INSERT INTO GROUP_ROLE\n" + "(GROUP_ID, ROLE_ID)\n"
          + "VALUES(@admin_group_id, @admin_role);\n" + "\n" + "INSERT INTO ORGANISATION_GROUP\n"
          + "(GROUP_ID, ORGANISATION_ID)\n" + "VALUES(@admin_group_id, @org_id);";
      System.out.println(groupRole);

      String ad1 = "SET @admin_group_id = (SELECT ID FROM ESHOP_GROUP\n" + "WHERE NAME ='CUSTOMER_";
      String ad2 = "_USER_ADMIN');\n" + "INSERT INTO GROUP_USER\n" + "(GROUP_ID, USER_ID)\n"
          + "VALUES(@admin_group_id, @user_id);\n END";
      StringBuilder adminGr = new StringBuilder();
      adminGr.append(ad1).append(s).append(ad2);
      System.out.println(adminGr.toString());

      String user1 = "IF (SELECT COUNT(ID)  from V_ACTIVE_USER WHERE USERNAME = N'";
      String user2 = "' AND AFFILIATE='Hella-Austria') = 0 \n" + "BEGIN\n" + "INSERT INTO USER_SETTINGS\n"
          + "(ALLOCATION_ID, PAYMENT_METHOD, DELIVERY_ID, COLLECTIVE_DELIVERY_ID, NET_PRICE_VIEW, NET_PRICE_CONFIRM, VIEW_BILLING, ADDRESS_ID, USE_DEFAULT_SETTING, EMAIL_NOTIFICATION_ORDER, BILLING_ADDRESS_ID, DELIVERY_ADDRESS_ID,  INVOICE_TYPE, SHOW_DISCOUNT, SHOW_HAPPY_POINTS, ACCEPT_HAPPY_POINT_TERM, SALE_ON_BEHALF_OF, SHOW_RECOMMENDED_RETAIL_PRICE, CURRENT_STATE_NET_PRICE_VIEW, CLASSIC_CATEGORY_VIEW, SINGLE_SELECT_MODE)VALUES(1, 2, 2, 1, 1, 1, 0, 0, 1, 0, N'1', N'1', 2, 0, 0, 0, 1, 0, 1, 0, 0);\n"
          + "SET @user_setting = @@IDENTITY;";
      StringBuilder userSetting = new StringBuilder();
      userSetting.append(user1).append(s).append(user2);
      System.out.println(userSetting.toString());

      String groupUser1 = "SET @admin_group_id = (SELECT ID FROM ESHOP_GROUP\n" + "WHERE NAME='CUSTOMER_";
      String groupUser2 = "_USER_ADMIN');\n" + "\n" + "INSERT INTO GROUP_USER\n" + "(GROUP_ID, USER_ID)\n"
          + "VALUES(@admin_group_id, @user_id);\n" + "END;";
      StringBuilder grUser = new StringBuilder();
      grUser.append(groupUser1).append(s).append(groupUser2);
      System.out.println(grUser.toString());


    });
  }
}
