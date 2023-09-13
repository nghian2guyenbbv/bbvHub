package com.bbvhub.job;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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
    List<String> orgName = Arrays.asList("Auto Strasser Rupert ",
        "Holzmeister Auto+Motorrad GmbH & Co KG",
        "Rosenbauer International AG ",
        "Werner Hoffelner ",
        "Neimcke GmbH & Co. KG ",
        "Siems & Klein Autowerkstatt-Technik",
        "Hella Gutmann Solutions GmbH ",
        "A.T.U. Auto-Teile-Unger GmbH & CoKG Bergerbräuhofstr. 45, A-5020 Salzbu",
        "Költringer & Buchwinkler GmbH Kfz-Meisterbetrieb",
        "Gerhard Eder jun. ",
        "Auto Mangelberger GmbH ",
        "WM SE Zentrale Rechnungsprüfung",
        "ÖAMTC - Wien ",
        "ÖAMTC - Oberösterreich ",
        "A.T.U. Filiale Nr. 237",
        "A.T.U. Filiale Nr. 235",
        "A.T.U. Filiale Nr. 236",
        "A.T.U. Filiale Nr. 234",
        "A.T.U. Filiale Nr. 233",
        "A.T.U. Filiale Nr. 231",
        "A.T.U. Filiale Nr. 232",
        "Steiermärkischer Automobil- und Motorsportclub (STAMK)",
        "Matthias Mair ",
        "Hermann Teufel ",
        "Witex Handelsgesellschaft mbH ",
        "TW Manak Inh. Martin Manak",
        "Friedrich Nigl ",
        "Ing. Markus Weidenauer Kfz-Werkstätte e.U.",
        "Steinmetz GmbH Kfz-Werkstätte",
        "Auto Crew Grünstäudl ",
        "Christian Erlach ",
        "Pichler.ebbs GmbH ",
        "Hansbauer Maximilian Kfz-Handel u. Reparatur",
        "ÖAMTC Sachmittelverwaltung",
        "Andreas Wimmer Kfz-Landmaschinen Wimmer",
        "Walserwerkstatt Düringer GmbH",
        "Waldmann Werkstatt Technik ",
        "Avtosteklo d.o.o. ",
        "Gottfried Koch GmbH & Co KG Kfz - Werkstätte",
        "Ing. Manfred Preiser ",
        "Schlosser GmbH ",
        "Fastbox Autoservice GmbH & Co KG ",
        "Ing. Andreas Kronthaler KFZ-Techniker Meister",
        "Magna Powertrain GmbH & Co. KG ",
        "Spilker KFZ Betrieb",
        "Alfred Löschenbrand GmbH ",
        "TGA für KFZ / & Maschinenbau BFI Wien",
        "Peter Schöffauer ",
        "INOWA GmbH & Co. KG ",
        "LEGAT Automobil GmbH ",
        "Raiffeisen-Lagerhaus St. Pölten reg. Genossenschaft m.b.H.",
        "Resch & Frisch Service GmbH ",
        "Altran Deutschland S.A.S. & Co. KG Kreditorenabteilung",
        "Autolackier GmbH ",
        "Auto Engleder GmbH Kfz-Werkstätte",
        "Auto Reiter GmbH KFZ Handel mit Werkstatt",
        "Trost Auto Service Technik SE ",
        "Walserwerkstatt Düringer GmbH ",
        "Karl Wintersperger ",
        "CTC Car Technology Center Lackner Stark OG",
        "A.T.U. Filiale Nr. 243",
        "Helmut Straberger ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "Autohaus Toni Heiß GmbH ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "Lacktechnikzentrum Süd GmbH ",
        "ÖAMTC ",
        "ÖAMTC - Melk ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Stützpunkt St.Valentin ",
        "ÖAMTC - Amstetten ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien Sachmittelverwaltung",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien ",
        "ÖAMTC - Wien "
        );
    List<String> email = Arrays.asList("",
        "info@autobike.eu",
        "creditors.rbi@rosenbauer.com",
        "",
        "",
        "ebilling@siems-klein.at",
        "invoice@hella-gutmann.com",
        "rechnungseingang@at.atu.eu",
        "office@koeltringer-buchwinkler.at",
        "eder.fill@dialog-online.at",
        "",
        "",
        "poststelle@oeamtc.at",
        "",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "",
        "office@kfz-mair.tech",
        "",
        "",
        "",
        "",
        "",
        "office@kfz-steinmetz.at",
        "",
        "office@kfz-erlach.at",
        "",
        "",
        "poststelle@oeamtc.at",
        "office@wimmer-kfz.at",
        "",
        "m.waldmann@waldmann-werkstattechnik.de",
        "",
        "",
        "m.preiser@preiser.co.at",
        "office@autoschlosser.at",
        "rechnungseingang@fastbox.at",
        "kfz-kronthaler@a1.net",
        "martin.postl@magna.com",
        "",
        "office@loeschenbrand.at",
        "office@tga-wien.at",
        "peter@schoeffauer.info",
        "office@inowa.at",
        "werkstatt@auto-legat.at",
        "",
        "",
        "",
        "",
        "lager@auto-engleder.at",
        "office@auto-reiter.at",
        "info@trost.com",
        "inbox1a8c0536@mg.meinbusiness.biz",
        "office@kfzwintersperger.at",
        "",
        "rechnungseingang@at.atu.eu",
        "austria@hella-gutmann.com",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "office@autohaus-heiss.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "office@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at",
        "poststelle@oeamtc.at"
        );
    List<String> phone = Arrays.asList("",
        "0658273891-0",
        "",
        "",
        "+49 8631 618 ...",
        "",
        "+4976689900-0",
        "",
        "+43627420208",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "0676/5307446",
        "",
        "",
        "07414 / 73100",
        "",
        "07243/51579",
        "",
        "",
        "",
        "077482289",
        "",
        "004908191 - 8739",
        "",
        "",
        "02828 8214",
        "07762/3480",
        "",
        "05373 76061",
        "050444-3008",
        "",
        "01749 62 63",
        "01505 3550-13002",
        "",
        "07243 / 514 1...",
        "076626200",
        "",
        "",
        "",
        "",
        "07286 71 74",
        "0357334035-0",
        "00490541 9989-0",
        "",
        "02254 72 568",
        "",
        "",
        "0724620268",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "05472 28000",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "07472 62527",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
        );
    List<String> line1 = Arrays.asList("Salzburger Str. 46",
        "Almerstraße 36",
        "Paschinger Straße 90",
        "Wassergasse 4",
        "Am Industriepark 21",
        "Grossmarktstr. 10-12",
        "Am Krebsbach 2",
        "Dr.-Kilian-Straße 11",
        "Niederarnsdorf 3a",
        "Fillmannsbach 18",
        "Alte Landesstraße 6",
        "Kesselstraße 23",
        "Schanzstraße 44",
        "Leitenstraße 24",
        "Simmeringer Hauptstraße 178",
        "Kärntner Straße 87",
        "Franz Jonas Straße 4",
        "Gewerbezeile / Maria-Gailer 2b",
        "Linzer Straße 228",
        "Völkermarkter Straße 148",
        "Puntigamer Straße 123",
        "Alte Poststraße 161",
        "Wartfeldgasse 6 u. 10",
        "Paß-Thurn-Bundesstraße 66",
        "Matznerstraße 28",
        "Großhofen 25",
        "Kremstalstraße 105",
        "Gneixendorfer Hauptstraße 65",
        "Mitterndorf 3",
        "Wurmbrand 48",
        "Westbahnstraße 26",
        "Wildbichler Straße 49",
        "Lambrechten 130",
        "Baumgasse 129",
        "Ottenhausen 18",
        "Mühleweg 8",
        "Richolfusstr. 6",
        "Ceplje 50",
        "Reichsstraße 62",
        "Grünbach 16",
        "Hauptstrasse 138a",
        "Friesacher Straße 19",
        "Dorf 26a",
        "Industriestraße 35",
        "Rubensstraße 4",
        "Hallergasse 8-12",
        "Plösslgasse 13",
        "Salurner Strasse 32",
        "Tonstraße 5",
        "Gewerbegebiet Ager 1",
        "Linzer Straße 76-78",
        "Schloßstraße 15",
        "Heinrich-Heine-Straße 5",
        "Keisslergasse 30",
        "Winkelweg 2",
        "Ankerweg 7",
        "Albert Einstein Straße 2",
        "Mühlweg 8",
        "Wr. Neustädterstraße 45",
        "Ziehrerstraße 68a",
        "Zwerchäckerweg 10",
        "Ligusterstrasse 12",
        "Aspersdorfer Straße 17",
        "Industrieparkstraße 11",
        "Haidlisse 8",
        "Eco - Plus - Park 1",
        "Zubringerstraße 99",
        "Hainfelder Bundesstraße 50",
        "Obere Weißenbachstraße 15",
        "Gießenstraße 2",
        "Pasettistraße 96-98",
        "Grenzackerstraße 16",
        "Wiener Straße 200-208",
        "Mannswörtherstraße 26",
        "Schüttausstraße 9",
        "Johann Steinböckstraße 9",
        "Mariazeller Straße 220",
        "Mariazellerstraße 3a",
        "Josef-Reither Straße / Messegelände",
        "Südring 310",
        "Oiden 111",
        "Umfahrungsstraße 17",
        "Autobahnstation Richtung Wien",
        "Rathausstraße 1",
        "Gewerbestraße 6",
        "Ybbsitzer Straße 130a",
        "Bertschingerstraße 1",
        "Prager Straße 46a",
        "Andre Freyskorn Straße 14",
        "Prof. Krejci-Graf Straße 1",
        "ÖAMTC-Straße 1",
        "Neunkirchner Allee 200",
        "Feistritz-Grottendorf 1",
        "Mattersburger Straße West 34",
        "Felixstraße 18",
        "Industriestraße 2",
        "Eisenstädter Straße 26",
        "Wiener Straße 29",
        "Rot Kreuz Gasse 29"
        );
    List<String> city = Arrays.asList("Mattsee",
        "Saalfelden",
        "Leonding",
        "Leopoldschlag",
        "Mühldorf am Inn",
        "Wien",
        "Ihringen",
        "Weiden",
        "Lamprechtshausen",
        "St. Georgen",
        "Berndorf",
        "Stuttgart",
        "Wien",
        "Pinsdorf",
        "Wien",
        "Leoben",
        "St. Pölten",
        "Villach",
        "Wels",
        "Klagenfurt",
        "Graz",
        "Graz",
        "Ranggen",
        "Aurach bei Kitzbühel",
        "Prottes",
        "Großhofen",
        "Krems",
        "Krems",
        "Nöchling",
        "Groß Gerungs",
        "Marchtrenk",
        "Ebbs",
        "Lambrechten",
        "Wien",
        "Feldkirchen bei Mattighofen",
        "Hirschegg",
        "Penzing",
        "Vransko",
        "Feldkirch",
        "Rapottenstein",
        "Raab",
        "St. Veit an der Glan",
        "Erl",
        "Lannach",
        "Herzogenrath",
        "Wien",
        "Wien",
        "Kufstein",
        "Marchtrenk",
        "Seewalchen",
        "St. Pölten",
        "Wels",
        "Flöha",
        "Wien",
        "Putzleinsdorf",
        "Fohnsdorf",
        "Landau",
        "Hirschegg",
        "Ebreichsdorf",
        "Graz-Liebenau",
        "Wien",
        "Gunskirchen",
        "Hollabrunn",
        "Mistelbach",
        "Gänserndorf",
        "Bruck/Leitha",
        "Tribuswinkel - Baden",
        "Berndorf",
        "Gloggnitz",
        "Prutz",
        "Wien",
        "Wien",
        "Langenzersdorf",
        "Schwechat",
        "Klosterneuburg",
        "Brunn am Gebirge",
        "St. Pölten",
        "Lilienfeld",
        "Tulln",
        "Klagenfurt",
        "Amstetten",
        "Melk",
        "Kemmelbach",
        "St. Valentin",
        "Scheibbs",
        "Waidhofen",
        "Krems",
        "Horn",
        "Zwettl",
        "Gmünd",
        "Waidhofen/Thaya",
        "Wr. Neustadt",
        "Aspang",
        "Eisenstadt",
        "Mattersburg",
        "Oberwart",
        "Oberpullendorf",
        "Güssing",
        "Neusiedl am See"
        );
    List<String> zipcode = Arrays.asList("5163",
        "5760",
        "4060",
        "4262",
        "84453",
        "1230",
        "79241",
        "92637",
        "5112",
        "5144",
        "5165",
        "70327",
        "1150",
        "4812",
        "1110",
        "8700",
        "3100",
        "9500",
        "4600",
        "9020",
        "8055",
        "8020",
        "6179",
        "6370",
        "2242",
        "2282",
        "3500",
        "3500",
        "3691",
        "3920",
        "4614",
        "6341",
        "4772",
        "1030",
        "5143",
        "87568",
        "86929",
        "3305",
        "6804",
        "3911",
        "4760",
        "9300",
        "6343",
        "8502",
        "52134",
        "1110",
        "1041",
        "6330",
        "4614",
        "4863",
        "3100",
        "4600",
        "09557",
        "1140",
        "4134",
        "8753",
        "76829",
        "6992",
        "2486",
        "8041",
        "1220",
        "4623",
        "2020",
        "2130",
        "2230",
        "2460",
        "2512",
        "2560",
        "2640",
        "6522",
        "1200",
        "1100",
        "2103",
        "2320",
        "3400",
        "2345",
        "3100",
        "3180",
        "3430",
        "9020",
        "3300",
        "3390",
        "3373",
        "4300",
        "3270",
        "3340",
        "3500",
        "3580",
        "3910",
        "3950",
        "3830",
        "2700",
        "2870",
        "7000",
        "7210",
        "7400",
        "7350",
        "7540",
        "7100"
        );
    AtomicInteger index = new AtomicInteger();
    custs.forEach(s-> {

      String s1 = "IF (SELECT COUNT(ID)  from ORGANISATION WHERE ORG_CODE = '";
      String s2 = "') = 0 \n" + "BEGIN\n"
          + "    INSERT INTO CUSTOMER_SETTINGS(ALLOCATION_ID, PAYMENT_METHOD, DELIVERY_ID, COLLECTIVE_DELIVERY_ID, NET_PRICE_VIEW, NET_PRICE_CONFIRM, VIEW_BILLING, ADDRESS_ID, USE_DEFAULT_SETTING, EMAIL_NOTIFICATION_ORDER, BILLING_ADDRESS_ID, DELIVERY_ADDRESS_ID, ALLOW_NET_PRICE_CHANGED, INVOICE_TYPE, SHOW_DISCOUNT, SESSION_TIMEOUT_SECONDS, SHOW_OCI_VAT, HOME_BRANCH, DEMO_CUSTOMER, PRICE_DISPLAY_ID, NORMAUTO_DISPLAY, HAS_PARTNER_PROGRAM_VIEW, WSS_SHOW_NET_PRICE, WSS_MARGIN_GROUP, WSS_DELIVERY_PROFILE_ID, WSS_DELIVERY_ID)VALUES(1, 2, 2, 1, 1, 1, 0, 0, 0, 0, N'1', N'1', 1, 2, 0, 14400, 0, NULL, 0, 1, 0, 0, 0, NULL, NULL, 1);SET @cust_setting = @@IDENTITY;\n"
          + "INSERT INTO ORGANISATION\n"
          + "(NAME, ORG_CODE, ORGTYPE_ID, PARENT_ID, DESCRIPTION, SHORTNAME, ORDER_SETTINGS_ID)\n" + "VALUES(N'', N'";
      String s3 = "', @org_type, @hella_gutmann_org, N'', N'customer-";
      String s4 = "', @cust_setting);\n" + "SET @org_id = @@IDENTITY;\n" + "INSERT INTO COLLECTION_RELATION\n"
          + "(COLLECTION_ID, ORGANISATION_ID, IS_ACTIVE)\n" + "VALUES(@hella_gutmann_collection, @org_id, 1);";
      StringBuilder sb = new StringBuilder();
      sb.append(s1).append(s).append(s2).append(s).append(s3).append(s).append(s4);
      System.out.println("-------" + "customer " + s + "---------");
      System.out.println(sb.toString());
      String address1 =
          "INSERT INTO ADDRESS\n" + "(LINE1, LINE2, LINE3, COUNTRYISO, STATE, CITY, ZIPCODE, ADDRESS_TYPE_ID)\n"
              + "VALUES(N'";
      String address2 = "', NULL, NULL, N'', NULL, N'";
      String address3 = "', N'";
      String address4 = "', 1);";
      StringBuilder address = new StringBuilder();
      address.append(address1).append(line1.get(index.get())).append(address2).append(city.get(index.get()))
          .append(address3).append(zipcode.get(index.get())).append(address4);
      System.out.println(address.toString());

      String o1 =
          "INSERT INTO ORGANISATION_ADDRESS\n" + "(ORGANISATION_ID, ADDRESS_ID)\n" + "VALUES(@org_id, @address_id);\n"
              + "INSERT INTO ESHOP_GROUP\n" + "(NAME, DESCRIPTION)\n" + "VALUES(N'CUSTOMER_";
      String o2 = "_USER_ADMIN', N'User admin group of ');\n" + "SET @admin_group_id = @@IDENTITY;";

      StringBuilder org = new StringBuilder();
      org.append(o1).append(s).append(o2);
      System.out.println(org.toString());

      String groupRole =
          "INSERT INTO GROUP_ROLE\n" + "(GROUP_ID, ROLE_ID)\n" + "VALUES(@admin_group_id, @admin_role);\n" + "\n"
              + "INSERT INTO ORGANISATION_GROUP\n" + "(GROUP_ID, ORGANISATION_ID)\n"
              + "VALUES(@admin_group_id, @org_id);";
      System.out.println(groupRole);

      String userEs1 = "IF (SELECT COUNT(ID)  from ESHOP_USER WHERE USERNAME = N'Agent-";
      String userEs2 = "') = 0  \n" + "BEGIN\n" + "    INSERT INTO USER_SETTINGS\n"
          + "(ALLOCATION_ID, PAYMENT_METHOD, DELIVERY_ID, COLLECTIVE_DELIVERY_ID, NET_PRICE_VIEW, NET_PRICE_CONFIRM, VIEW_BILLING, ADDRESS_ID, USE_DEFAULT_SETTING, EMAIL_NOTIFICATION_ORDER, BILLING_ADDRESS_ID, DELIVERY_ADDRESS_ID, INVOICE_TYPE, SHOW_DISCOUNT, SHOW_HAPPY_POINTS, ACCEPT_HAPPY_POINT_TERM, SALE_ON_BEHALF_OF, SHOW_RECOMMENDED_RETAIL_PRICE, CURRENT_STATE_NET_PRICE_VIEW, CLASSIC_CATEGORY_VIEW, SINGLE_SELECT_MODE)VALUES(1, 2, 2, 1, 1, 1, 0, 0, 1, 0, N'1', N'1', 2, 0, 0, 0, 1, 0, 1, 0, 0);\n"
          + "SET @user_setting = @@IDENTITY;\n" + "INSERT INTO ESHOP_USER\n"
          + "(SALUTATION, FIRST_NAME, LAST_NAME, EMAIL, USERNAME, PHONE, [LANGUAGE], [TYPE], HOURLY_RATE, EMAIL_CONFIRMATION, NEWSLETTER, SETTING, VAT_CONFIRM, SIGN_IN_DATE, FAX, ORIGINAL_USER_ID)\n"
          + "VALUES(9, N'";
      String userEs3 = "', N'Agent', N'noReply@sag-austria.at', N'Agent-";
      String userEs4 = "', N' ', 1, N'ON_BEHALF_ADMIN', NULL, 0, 0, @user_setting, 1, NULL, NULL, NULL);\n"
          + "SET @user_id = @@IDENTITY;";
      StringBuilder eshopUser = new StringBuilder();
      eshopUser.append(userEs1).append(s).append(userEs2).append(s).append(userEs3).append(s).append(userEs4);
      System.out.println(eshopUser.toString());

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

      String eshop1 = "INSERT INTO ESHOP_USER\n"
          + "(SALUTATION, FIRST_NAME, LAST_NAME, EMAIL, USERNAME, PHONE, [LANGUAGE], [TYPE], HOURLY_RATE, EMAIL_CONFIRMATION, NEWSLETTER, SETTING, VAT_CONFIRM, SIGN_IN_DATE, FAX, ORIGINAL_USER_ID)\n"
          + "VALUES(9, N'";
      String eshopSpace = "', N'";
      String eshop2 = "', null, 1, NULL, 0, 0, 0, @user_setting, 1, NULL, NULL, NULL);";
      StringBuilder eshopUserAdmin = new StringBuilder();
      eshopUserAdmin.append(eshop1).append(s).append(eshopSpace).append(orgName.get(index.get())).append(eshopSpace).append(email.get(index.get()))
          .append(eshopSpace).append("cust-" + s).append(eshop2);
      System.out.println(eshopUserAdmin.toString());

      String groupUser1 = "SET @admin_group_id = (SELECT ID FROM ESHOP_GROUP\n" + "WHERE NAME='CUSTOMER_";
      String groupUser2 = "_USER_ADMIN');\n" + "\n" + "INSERT INTO GROUP_USER\n" + "(GROUP_ID, USER_ID)\n"
          + "VALUES(@admin_group_id, @user_id);\n" + "END;";
      StringBuilder grUser = new StringBuilder();
      grUser.append(groupUser1).append(s).append(groupUser2);
      System.out.println(grUser.toString());
      index.getAndIncrement();
    });
  }
}
