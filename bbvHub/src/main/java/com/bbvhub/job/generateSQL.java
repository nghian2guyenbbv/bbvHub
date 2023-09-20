package com.bbvhub.job;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class generateSQL {


  public static void main(String[] args) {
     String DOUBLE_QUOTE = "\"";
     String QUOTE = "\'";
    List<String> custs = Arrays.asList("99464823"
        ,"99464833"
        ,"99464872"
        ,"99464905"
        ,"99465025"
        ,"99465053"
        ,"99465054"
        ,"99465057"
        ,"99465083"
        ,"99465084"
        ,"99465094"
        ,"99465105"
        ,"99465122"
        ,"99465127"
        ,"99465162"
        ,"99465193"
        ,"99465202"
        ,"99465255"
        ,"99465277"
        ,"99465278"
        ,"99465281"
        ,"99465318"
        ,"99465369"
        ,"99465438"
        ,"99465501"
        ,"99465547"
        ,"99465560"
        ,"99465564"
        ,"99465594"
        ,"99465655"
        ,"99465716"
        ,"99465724"
        ,"99465748"
        ,"99465820"
        ,"99465867"
        ,"99465881"
        ,"99465945"
        ,"99465959"
        ,"99465960"
        ,"99465989"
        ,"99466001"
        ,"99466019"
        ,"99466024"
        ,"99466038"
        ,"99466051"
        ,"99466058"
        ,"99466059"
        ,"99466061"
        ,"99466104"
        ,"99466114"
        ,"99466158"
        ,"99466223"
        ,"99466272"
        ,"99466354"
        ,"99466360"
        ,"99466365"
        ,"99466568"
        ,"99466706"
        ,"99466716"
        ,"99466726"
        ,"99466727"
        ,"99466746"
        ,"99466768"
        ,"99466770"
        ,"99466858"
        ,"99466884"
        ,"99466932"
        ,"99466937"
        ,"99466984"
        ,"99466985"
        ,"99466999"
        ,"99467006"
        ,"99467031"
        ,"99467065"
        ,"99467095"
        ,"99467107"
        ,"99467159"
        ,"99467220"
        ,"99467236"
        ,"99467237"
        ,"99467238"
        ,"99467265"
        ,"99467349"
        ,"99467447"
        ,"99467476"
        ,"99467509"
        ,"99467537"
        ,"99467548"
        ,"99467579"
        ,"99467580"
        ,"99467589"
        ,"99467639"
        ,"99467646"
        ,"99467697"
        ,"99467816"
        ,"99467839"
        ,"99467842"
        ,"99467843"
        ,"99467880"
        ,"99467884"
        ,"99467901"
        ,"99467918"
        ,"99467969"
        ,"99467986"
        ,"99468011"
        ,"99468085"
        ,"99468095"
        ,"99468134"
        ,"99468179"
        ,"99468203"
        ,"99468260"
        ,"99468261"
        ,"99468384"
        ,"99468393"
        ,"99468398"
        ,"99468420"
        ,"99468423"
        ,"99468431"
        ,"99468483"
        ,"99468590"
        ,"99468593"
        ,"99468638"
        ,"99468671"
        ,"99468703"
        ,"99468721"
        ,"99468771"
        ,"99468858"
        ,"99468861"
        ,"99468940"
        ,"99468996"
        ,"99469011"
        ,"99469013"
        ,"99469037"
        ,"99469051"
        ,"99469059"
        ,"99469091"
        ,"99469092"
        ,"99469098"
        ,"99469134"
        ,"99469198"
        ,"99469199"
        ,"99469200"
        ,"99469201"
        ,"99469205"
        ,"99469209"
        ,"99469219"
        ,"99469221"
        ,"99469230"
        ,"99469231"
        ,"99469249"
        ,"99469253"
        ,"99469369"
        ,"99469371"
        ,"99469372"
        ,"99469373"
        ,"99469388"
        ,"99469442"
        ,"99469486"
        ,"99469496"
        ,"99469509"
        ,"99469528"
        ,"99469534"
        ,"99469535"
        ,"99469570"
        ,"99469577"
        ,"99469624"
        ,"99469664"
        ,"99469681"
        ,"99469742"
        ,"99469752"
        ,"99469884"
        ,"99469896"
        ,"99469897"
        ,"99469917"
        ,"99470000"
        ,"99470007"
        ,"99470079"
        ,"99470120"
        ,"99470132"
        ,"99470182"
        ,"99470197"
        ,"99470239"
        ,"99470254"
        ,"99470272"
        ,"99470321"
        ,"99470378"
        ,"99470391"
        ,"99470400"
        ,"99470403"
        ,"99470413"
        ,"99470426"
        ,"99470462"
        ,"99470467"
        ,"99470493"
        ,"99470508"
        ,"99470516"
        ,"99470544"
        ,"99470546"
        ,"99470559"
        ,"99470607"
        ,"99470649"
        ,"99470697"
        ,"99470699"
        ,"99470785"
        ,"99470909"
        ,"99470989"
        ,"99471016"
        ,"99471111"
        ,"99471113"
        ,"99471119"
        ,"99471162"
        ,"99471167"
        ,"99471168"
        ,"99471195"
        ,"99471199"
        ,"99471264"
        ,"99471307"
        ,"99471315"
        ,"99471384"
        ,"99471444"
        ,"99471461"
        ,"99471477"
        ,"99471532"
        ,"99471587"
        ,"99471589"
        ,"99471605"
        ,"99471718"
        ,"99471724"
        ,"99471726"
        ,"99471728"
        ,"99471743"
        ,"99471754"
        ,"99471792"
        ,"99471883"
        ,"99471895"
        ,"99471900"
        ,"99471940"
        ,"99471956"
        ,"99472026"
        ,"99472029"
        ,"99472033"
        ,"99472128"
        ,"99472163"
        ,"99472211"
        ,"99472227"
        ,"99472310"
        ,"99472311"
        ,"99472369"
        ,"99472394"
        ,"99472414"
        ,"99472415"
        ,"99472416"
        ,"99472423"
        ,"99472439"
        ,"99472440"
        ,"99472441"
        ,"99472456"
        ,"99472491"
        ,"99472513"
        ,"99472526"
        ,"99472530"
        ,"99472532"
        ,"99472542"
        ,"99472551"
        ,"99472558"
        ,"99472569"
        ,"99472594"
        ,"99472621"
        ,"99472646"
        ,"99472722"
        ,"99472787"
        ,"99472794"
        ,"99472813"
        ,"99472880"
        ,"99472881"
        ,"99472934"
        ,"99472945"
        ,"99472979"
        ,"99472980"
        ,"99472989"
        ,"99473018"
        ,"99473021"
        ,"99473052"
        ,"99473075"
        ,"99473078"
        ,"99473089"
        ,"99473142"
        ,"99473151"
        ,"99473174"
        ,"99473221"
        ,"99473241"
        ,"99473245"
        ,"99473283"
        ,"99473300"
        ,"99473305"
        ,"99473357"
        ,"99473401"
        ,"99473405"
        ,"99473418"
        ,"99473421"
        ,"99473422"
        ,"99473434"
        ,"99473438"
        ,"99473453"
        ,"99473473"
        ,"99473492"
        ,"99473516"
        ,"99473526"
        ,"99473531"
        ,"99473562"
        ,"99473567"
        ,"99473568"
        ,"99473602"
        ,"99473610"
        ,"99473611"
        ,"99473614"
        ,"99473635"
        ,"99473636"
        ,"99473701"
        ,"99473721"
        ,"99473741"
        ,"99473757"
        ,"99473804"
        ,"99473823"
        ,"99473867"
        ,"99473896"
        ,"99473899"
        ,"99473925"
        ,"99473933"
        ,"99473951"
        ,"99474002"
        ,"99474046"
        ,"99474084"
        ,"99474128"
        ,"99474159"
        ,"99474185"
        ,"99474192"
        ,"99474239"
        ,"99474255"
        ,"99474264"
        ,"99474269"
        ,"99474286"
        ,"99474287"
        ,"99474290"
        ,"99474340"
        ,"99474355"
        ,"99474441"
        ,"99474467"
        ,"99474469"
        ,"99474470"
        ,"99474511"
        ,"99474555"
        ,"99474641"
        ,"99474658"
        ,"99474744"
        ,"99474747"
        ,"99474784"
        ,"99474809"
        ,"99474845"
        ,"99474903"
        ,"99474934"
        ,"99474944"
        ,"99474947"
        ,"99474992"
        ,"99475075"
        ,"99475129"
        ,"99475225"
        ,"99475243"
        ,"99475246"
        ,"99475248"
        ,"99475255"
        ,"99475260"
        ,"99475285"
        ,"99475303"
        ,"99475321"
        ,"99475384"
        ,"99475396"
        ,"99475486"
        ,"99475564"
        ,"99475642"
        ,"99475643"
        ,"99475686"
        ,"99475687"
        ,"99475733"
        ,"99475787"
        ,"99475818"
        ,"99475863"
        ,"99475949"
        ,"99475951"
        ,"99475958"
        ,"99475973"
        ,"99475976"
        ,"99476075"
        ,"99476096"
        ,"99476103"
        ,"99476110"
        ,"99476117"
        ,"99476161"
        ,"99476195"
        ,"99476286"
        ,"99476295"
        ,"99476296"
        ,"99476307"
        ,"99476332"
        ,"99476389"
        ,"99476422"
        ,"99476467"
        ,"99476471"
        ,"99476477"
        ,"99476490"
        ,"99476591"
        ,"99476674"
        ,"99476675"
        ,"99476827"
        ,"99476834"
        ,"99476892"
        ,"99476925"
        ,"99476926"
        ,"99476927"
        ,"99476928"
        ,"99476929"
        ,"99476991"
        ,"99477001"
        ,"99477012"
        ,"99477088"
        ,"99477127"
        ,"99477139"
        ,"99477173"
        ,"99477226"
        ,"99477266"
        ,"99477280"
        ,"99477300"
        ,"99477303"
        ,"99477330"
        ,"99477478"
        ,"99477479"
        ,"99477529"
        ,"99477530"
        ,"99477559"
        ,"99477592"
        ,"99477614"
        ,"99477693"
        ,"99477751"
        ,"99477884"
        ,"99477889"
        ,"99477893"
        ,"99477923"
        ,"99477948"
        ,"99477961"
        ,"99478006"
        ,"99478037"
        ,"99478043"
        ,"99478220"
        ,"99478256"
        ,"99478275"
        ,"99478289"
        ,"99478336"
        ,"99478360"
        ,"99478436"
        ,"99478459"
        ,"99478470"
        ,"99478475"
        ,"99478558"
        ,"99478573"
        ,"99478583"
        ,"99478591"
        ,"99478614"
        ,"99478685"
        ,"99478699"
        ,"99478700"
        ,"99478705"
        ,"99478763"
        ,"99478777"
        ,"99478793"
        ,"99478813"
        ,"99478818"
        ,"99478836"
        ,"99478853"
        ,"99478940"
        ,"99478952"
        ,"99478992"
        ,"99479013"
        ,"99479050"
        ,"99479070"
        ,"99479283"
        ,"99479333"
        ,"99479359"
        ,"99479396"
        ,"99479413"
        ,"99479425"
        ,"99479518"
        ,"99479549"
        ,"99479563"
        ,"99479578"
        ,"99479608"
        ,"99479638"
        ,"99479715"
        ,"99479717"
        ,"99479810"
        ,"99479840"
        ,"99479850"
        ,"99479881"
        ,"99479951"
        ,"99480050"
        ,"99480097"
        ,"99480098"
        ,"99480099"
        ,"99480134"
        ,"99480188"
        ,"99480253"
        ,"99480264"
        ,"99480310"
        ,"99480406"
        ,"99480491"
        ,"99480558"
        ,"99480576"
        ,"99480594"
        ,"99480599"
        ,"99480641"
        ,"99480653"
        ,"99480674"
        ,"99480707"
        ,"99480726"
        ,"99480763"
        ,"99480769"
        ,"99480797"
        ,"99480805"
        ,"99480827"
        ,"99480841"
        ,"99480853"
        ,"99480859"
        ,"99480870"
        ,"99480902"
        ,"99480944"
        ,"99480966"
        ,"99481003"
        ,"99481018"
        ,"99481068"
        ,"99481069"
        ,"99481083"
        ,"99481084"
        ,"99481183"
        ,"99481218"
        ,"99481255"
        ,"99481256"
        ,"99481261"
        ,"99481274"
        ,"99481338"
        ,"99481350"
        ,"99481416"
        ,"99481424"
        ,"99481433"
        ,"99481452"
        ,"99481567"
        ,"99481586"
        ,"99481615"
        ,"99481650"
        ,"99481667"
        ,"99481673"
        ,"99481681"
        ,"99481801"
        ,"99481837"
        ,"99481890"
        ,"99481913"
        ,"99481955"
        ,"99482001"
        ,"99482044"
        ,"99482111"
        ,"99482122"
        ,"99482153"
        ,"99482172"
        ,"99482173"
        ,"99482304"
        ,"99482313"
        ,"99482340"
        ,"99482365"
        ,"99482418"
        ,"99482473"
        ,"99482575"
        ,"99482616"
        ,"99482656"
        ,"99482736"
        ,"99482737"
        ,"99482757"
        ,"99482775"
        ,"99482776"
        ,"99482837"
        ,"99482872"
        ,"99482879"
        ,"99482885"
        ,"99482886"
        ,"99482897"
        ,"99482898"
        ,"99482997"
        ,"99483000"
        ,"99483038"
        ,"99483059"
        ,"99483161"
        ,"99483162"
        ,"99483271"
        ,"99483300"
        ,"99483302"
        ,"99483311"
        ,"99483379"
        ,"99483380"
        ,"99483447"
        ,"99483452"
        ,"99483471"
        ,"99483500"
        ,"99483514"
        ,"99483536"
        ,"99483553"
        ,"99483587"
        ,"99483681"
        ,"99483683"
        ,"99483715"
        ,"99483747"
        ,"99483779"
        ,"99483822"
        ,"99483823"
        ,"99483832"
        ,"99483889"
        ,"99483891"
        ,"99483946"
        ,"99483989"
        ,"99484067"
        ,"99484070"
        ,"99484220"
        ,"99484222"
        ,"99484280"
        ,"99484321"
        ,"99484353"
        ,"99484395"
        ,"99484549"
        ,"99484559"
        ,"99484560"
        ,"99484561"
        ,"99484577"
        ,"99484619"
        ,"99484620"
        ,"99484621"
        ,"99484670"
        ,"99484699"
        ,"99484744"
        ,"99484780"
        ,"99484782"
        ,"99484815"
        ,"99484835"
        ,"99484920"
        ,"99484933"
        ,"99485005"
        ,"99485016"
        ,"99485033"
        ,"99485035"
        ,"99485117"
        ,"99485146"
        ,"99485203"
        ,"99485218"
        ,"99485260"
        ,"99485267"
        ,"99485290"
        ,"99485301"
        ,"99485302"
        ,"99485378"
        ,"99485394"
        ,"99485440"
        ,"99485463"
        ,"99485555"
        ,"99485558"
        ,"99485581"
        ,"99485585"
        ,"99485599"
        ,"99485603"
        ,"99485631"
        ,"99485660"
        ,"99485661"
        ,"99485695"
        ,"99485843"
        ,"99485849"
        ,"99485890"
        ,"99485901"
        ,"99485958"
        ,"99486034"
        ,"99486039"
        ,"99486059"
        ,"99486064"
        ,"99486091"
        ,"99486136"
        ,"99486142"
        ,"99486143"
        ,"99486296"
        ,"99486298"
        ,"99486299"
        ,"99486300"
        ,"99486301"
        ,"99486303"
        ,"99486304"
        ,"99486305"
        ,"99486306"
        ,"99486474"
        ,"99486485"
        ,"99486519"
        ,"99486521"
        ,"99486533"
        ,"99486573"
        ,"99486583"
        ,"99486604"
        ,"99486609"
        ,"99486656"
        ,"99486657"
        ,"99486663"
        ,"99486677"
        ,"99486739"
        ,"99486839"
        ,"99486912"
        ,"99486941"
        ,"99487032"
        ,"99487046"
        ,"99487086"
        ,"99487133"
        ,"99487180"
        ,"99487306"
        ,"99487314"
        ,"99487376"
        ,"99487404"
        ,"99487408"
        ,"99487431"
        ,"99487480"
        ,"99487501"
        ,"99487559"
        ,"99487593"
        ,"99487594"
        ,"99487596"
        ,"99487622"
        ,"99487658"
        ,"99487664"
        ,"99487666"
        ,"99487701"
        ,"99487705"
        ,"99487737"
        ,"99487809"
        ,"99487856"
        ,"99487869"
        ,"99487922"
        ,"99487931"
        ,"99487994"
        ,"99488031"
        ,"99488039"
        ,"99488087"
        ,"99488093"
        ,"99488100"
        ,"99488105"
        ,"99488135"
        ,"99488215"
        ,"99488221"
        ,"99488233"
        ,"99488264"
        ,"99488274"
        ,"99488370"
        ,"99488403"
        ,"99488438"
        ,"99488446"
        ,"99488557"
        ,"99488567"
        ,"99488626"
        ,"99488696"
        ,"99488800"
        ,"99488831"
        ,"99488862"
        ,"99488863"
        ,"99488892"
        ,"99488902"
        ,"99488968"
        ,"99489121"
        ,"99489125"
        ,"99489127"
        ,"99489357"
        ,"99489404"
        ,"99489412"
        ,"99489470"
        ,"99489524"
        ,"99489545"
        ,"99489546"
        ,"99489583"
        ,"99489587"
        ,"99489663"
        ,"99489787"
        ,"99489846"

    );

    // email
    List<String> email = Arrays.asList("hubert.koller@meisinger.at",
        "kfzschieler@aon.at",
        "marco.hochwimmer@icloud.com",
        "lindner@hlindner.at",
        "service@gs-car-tuning.com",
        "",
        "anfrage@kiss-autolack.at",
        "office@autopammer.com",
        "e.yilmaz@reifen2000.at",
        "hakancemtuerk@hotmail.com",
        "",
        "office@car-tech.at",
        "office@autosmieten.at",
        "",
        "auto.schneider@outlook.at",
        "",
        "office@schildberger-kfz.at",
        "rubin@kfz-rubin.at",
        "",
        "",
        "schurlsgarage@gmail.com",
        "info@pribasnig.at",
        "office@wallner.at",
        "apopeiadrian2@gmail.com",
        "info@car-salon.at",
        "",
        "ludek.szabo@gmail.com",
        "office@kfz-rosenberger.at",
        "",
        "info@lackierung-matzhold.at",
        "gulyas.kfz.service@gmail.com",
        "wien10@kfz-messer.at",
        "georgmech@gmx.at",
        "",
        "kfz-herlbauer@gmx.at",
        "office@s-tl.at",
        "",
        "maggale@aon.at",
        "office@ford-ladenberger.at",
        "office@niederndorfer.at",
        "",
        "",
        "kfzniederklapfer@outlook.com",
        "office@lts-spedition.at",
        "tamer.karadas@gmx.at",
        "",
        "",
        "",
        "office@falle.at",
        "kfz-strasser@aon.at",
        "citroenlepuchperko@gmx.at",
        "",
        "",
        "epcarstyling@aon.at",
        "",
        "office@weiswo.at",
        "hyundai@kfz-weber.at",
        "office@werkstatt-popp.at",
        "",
        "",
        "",
        "anton.gimpl@gmx.at",
        "info@foerg.at",
        "kfz-heidrei@gmx.at",
        "hdcarkg@gmail.com",
        "info@denzel-unterberger.cc",
        "stefan@kini.at",
        "",
        "office@karosserie-seidl.at",
        "",
        "",
        "office@kfz-name.at",
        "rechnung@bauer-energie.at",
        "",
        "",
        "office@kfz-drabits.com",
        "",
        "kfz-alexandar@hotmail.com",
        "",
        "",
        "office@hazet.at",
        "office@auvite.com",
        "office@kurvenwetzer-leoben.at",
        "office@gwolf-dach.at",
        "",
        "autocentrum@live.at",
        "",
        "",
        "gerald.absenger@aon.at",
        "office@busse-fraiss.at",
        "office@tin-reifen.at",
        "",
        "felix@kfz-leymueller.at",
        "",
        "markus.hubmaier@wavenet.at",
        "chrboeck102@gmail.com",
        "office@kph.co.at",
        "",
        "",
        "martin.woelfleder@autohaus.at",
        "",
        "ktl@nanet.at",
        "hulech@aol.com",
        "office@autohauslingl.at",
        "office@lobnig.at",
        "steinwender.ch@gmail.com",
        "kfz.stefanac@gmail.com",
        "info@kfz-diebetsberger.at",
        "auto@auto-predi.at",
        "helmut@wolf-dach.at",
        "",
        "",
        "info@kfz-bosch.at",
        "wa@kfz-grill.at",
        "fg@fredsbikeshop.at",
        "zdenko.sinkec@carglass.si",
        "",
        "",
        "buero@kugelkopf.at",
        "",
        "office@kfz-vinci.com",
        "kfz.thaler@sbg.at",
        "kfz-zink@gmx.at",
        "",
        "ricard.schulz@gmx.at",
        "office@carage.at",
        "",
        "office@gcmc.at",
        "",
        "office@kingofcars.at",
        "kfz.artner@gmail.com",
        "florian.glaeser@gmx.at",
        "Buchhaltung@carpaint.at",
        "f.waschulin@gmx.at",
        "guenter.zwanzinger@20ers-werkstatt.at",
        "burza@live.at",
        "info@can.co.at",
        "office@autokuxcher.at",
        "mail@kfz-krisper.at",
        "office@viehhauser-kfz.at",
        "",
        "pz.reutte@arboe.at",
        "office@mandler.at",
        "office@huber-auto.at",
        "kfz-kafender@gmx.at",
        "e.zangl@gmx.at",
        "buchhaltung@auto-hösch.at",
        "",
        "",
        "",
        "bille87@hotmail.com",
        "",
        "groebming@profi-reifen.at",
        "er-rechnung@a-winkler.at",
        "reinhard.flachs@aon.at",
        "kfz_sahin@hotmail.com",
        "lager@auto-weiz.at",
        "office@flori-gmbh.at",
        "",
        "",
        "yousof_bahloul@gmx.at",
        "office@autolackbox.at",
        "mn.mietwagen2018@gmail.com",
        "office@leitner-fladnitz.at",
        "lentnerhermann1@gmail.com",
        "salzburgnord@oeamtc.at",
        "",
        "office@jochenfenz.at",
        "office@kfz-polat.at",
        "",
        "rechnung@hasenoehrl.at",
        "h.florian@sbg.at",
        "info@motore-italiano.com",
        "so@tirol.com",
        "office@bestmotors.at",
        "",
        "office@gp-performance.at",
        "",
        "gerald.vallant@gmx.at",
        "promberger.autorep@aon.at",
        "office@autohaus-ostermann.com",
        "office@breiner.at",
        "kfz-neisser@aon.at",
        "postmaster@kfz-technik-kobald.at",
        "office@kfzstockcar.at",
        "office@kinninger.at",
        "info@azlogistik.at",
        "",
        "vw-audi.narowetz@autohaus.at",
        "",
        "zeintl.max@aon.at",
        "",
        "office@yachtmobile2000.com",
        "",
        "",
        "",
        "",
        "office@fordlang.at",
        "",
        "",
        "",
        "kfz-technik-konrad@gmx.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "kfzautoklinik@gmail.com",
        "",
        "",
        "",
        "",
        "",
        "",
        "Invoice accounting@lucky-car.at",
        "",
        "",
        "kurzarno@aon.at",
        "",
        "",
        "",
        "",
        "",
        "info@kfzbrunner.at",
        "",
        "office@rh-automobile.at",
        "",
        "office@cardoc.at",
        "",
        "",
        "office@prtoberwart.at",
        "",
        "",
        "",
        "autohandel.aigner@iplace.at",
        "kfz@kfz-dasch.at",
        "office@drive-solution.at",
        "office@caracho.at",
        "kfzmotorex@gmail.com",
        "",
        "",
        "",
        "kfz_galler@gmx.at",
        "",
        "",
        "office@carrepaircenter.at",
        "",
        "",
        "",
        "office@kfz-kauer.at",
        "",
        "",
        "",
        "",
        "",
        "paul.bauer@deine-werkstatt.at",
        "poststelle@oeamtc.at",
        "",
        "info@diemeisterwerkstatt.at",
        "",
        "",
        "invoice@teamfraenkel.at",
        "",
        "klabacher@inode.at",
        "",
        "",
        "",
        "er-wf@hitthaller.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "office@oldtimercentervienna.at",
        "patrick.fink@autoparkfink.at",
        "",
        "office@motus-autocenter.at",
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
        "",
        "",
        "haindl@schipany.at",
        "rabimarhi@gmail.com",
        "",
        "",
        "ali-landmaschinen@aon.at",
        "ch.pichler@kneisz.seat.co.at",
        "mail@kfzt-langreiter.at",
        "office@autoglas-windschutzscheibe.at",
        "juergen.moeser@gmx.at",
        "",
        "",
        "hermann.blueml@aon.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "shop@auto-rieser.com",
        "",
        "office@auto-glavas.at",
        "rostklinik@gmail.com",
        "",
        "auto.holleis@gmx.at",
        "",
        "dietmar.koeb@koeb-gmbh.at",
        "office@kfz-upgrade.at",
        "",
        "el.lazo@outlook.at",
        "yalman_yalcino@hotmail.com",
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
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "car-tech@gmx.at",
        "",
        "",
        "",
        "",
        "",
        "stranzi.th1@gmail.com",
        "",
        "",
        "",
        "",
        "",
        "office@kfz-strohmeier.at",
        "buha@diewerkstott.at",
        "",
        "weilguny-rechnung@gmx.at",
        "",
        "jk-kfz@gmx.at",
        "info@kfz-bodensee.at",
        "info@gp-automotive.at",
        "",
        "",
        "buchhaltung@kueblbeck.at",
        "buchhaltung@kueblbeck.at",
        "",
        "",
        "",
        "guenter0304@gmail.com",
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
        "frieseneckerm@es-mobile.at",
        "asa.auto.kfz@gmail.com",
        "office@motofactory.at",
        "info@toyota-innviertel.at",
        "",
        "",
        "",
        "",
        "office@kfzmario-aws.at",
        "",
        "",
        "info@autoland.tirol",
        "office@auto-nigl.at",
        "",
        "auto-delta@hotmail.com",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "office@t-a-t.at",
        "",
        "",
        "ford.schoepe@aon.at",
        "",
        "",
        "bolonikfz@yahoo.com",
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
        "hla.fin.fac@hoedlmayr.com",
        "",
        "",
        "",
        "",
        "",
        "",
        "office@dariosautohaus.at",
        "office@kfz-max.at",
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
        "",
        "",
        "",
        "",
        "",
        "",
        "fredls.glaserei@gmx.at",
        "office@airbroker-steiermark.at",
        "",
        "",
        "",
        "invoice.lwt@liebherr.com",
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
        "",
        "",
        "",
        "",
        "office@rep-car.at",
        "",
        "",
        "",
        "carella@gmx.at",
        "",
        "rechnungseingang@fastbox.at",
        "office@v3tech.at",
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
        "",
        "",
        "office2700@autoebner.at",
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
        "office@team-rsr.com",
        "",
        "kreditoren@linzag.at",
        "kreditoren@linzag.at",
        "",
        "",
        "",
        "rechnungseingang@fastbox.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "office@friekos-garage.at",
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
        "office@autohauscoskuner.at",
        "",
        "",
        "",
        "",
        "feichtmayr@toyota-feichtmayr.at",
        "",
        "office@kfz-meisterbetrieb-kogler.at",
        "",
        "office.omgcars@gmail.com",
        "",
        "",
        "",
        "",
        "",
        "simon.kornprobst@kornprobst.at",
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
        "krani@gmx.net",
        "",
        "",
        "",
        "invoices@linz-airport.com",
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
        "office@autohaus-wunder.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "buchhaltung@honda-kufstein.at",
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
        "meister@kfz-burza.at",
        "",
        "",
        "verkauf@gesslbauer.at",
        "",
        "office@autohaus-maier.at",
        "",
        "",
        "gd.krismer@kufnet.at",
        "",
        "daniel.fersterer@autoschlager.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "reinhold.hoefferer@treibacher.com",
        "fiat@auto-koch.at",
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
        "patrik.fontner@gmail.com",
        "",
        "buchhaltung@frieszl.at",
        "",
        "kevin.moik@autohaus-kamper.at",
        "office@kfztechnik-moser.at",
        "",
        "lukas.hamedinger@gmx.at",
        "",
        "",
        "",
        "9800@gmx.at",
        "office@reifenwinkler.at",
        "kainzr@aon.at",
        "reinhard@kienbauer-auto.at",
        "",
        "",
        "",
        "",
        "Rechnung.BS-Wels1.Post@ooe.gv.at",
        "gisela.schirgi@autohaus-weiz.at",
        "",
        "",
        "",
        "",
        "kfz.azad@hotmail.com",
        "rechnung@mitkal.at",
        "",
        "office@auto-aicher.com",
        "office@alp-p.at",
        "",
        "",
        "",
        "",
        "eduard.kniewallner@hotmail.com",
        "info.kfz@yahoo.com",
        "rechnung@priewasser.at",
        "kfz.service.fischeroliver@gmail.com",
        "",
        "",
        "",
        "st.valentin@exmanco.com",
        "",
        "",
        "",
        "service44@denzel.at",
        "Rechnung.bmwku@unterberger.cc",
        "johann.lengauer@autohaus-strasser.at",
        "",
        "invoices.lannach.mpt@magna.com",
        "",
        "",
        "",
        "martin@drexler-kfz.at",
        "",
        "",
        "office@biro13kfz.at",
        "office@kfztechnik-loew.at",
        "",
        "autowerk@gmx.at",
        "",
        "office@tlp-lungau.at",
        "",
        "",
        "",
        "",
        "kfztechnik.gdg@gmail.com",
        "kfzmican@gmail.com",
        "",
        "er@hengl.at",
        "office@help-car.at",
        "norbert.riegler@die-wildbach.at",
        "office@pletter.at",
        "office@kfz-yakup.at",
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
        "harbalik.og@gmail.com",
        ""

        );

    List<String> line1 = Arrays.asList("Bachmähdle 2",
        "Gemersdorf 3",
        "Erlauweg 1",
        "Hirnsdoef 107",
        "Schlossstraße 7",
        "Bahnhofstraße 15",
        "Gewerbepark 7",
        "Triplatstraße 1",
        "Scheydgasse 44",
        "Grillgasse 51",
        "Siccardsburggasse 44",
        "Schießstattallee 6",
        "Triesterstraße 79",
        "Samergasse 23a",
        "Sandfeld 9D",
        "Poloplastraße 5",
        "Schlitzengasse 17",
        "Teslastraße 1",
        "Oberdorf 33E, Top1",
        "Schneidergasse 10",
        "Wienersdorfer Straße 26/S14/T1",
        "Griffner Strasse 11",
        "Johann Galler Straße 21",
        "Neue Siedlungsstraße 4",
        "St. Pöltner Straße 120",
        "Industriezone 10",
        "Hötzelsdorf 95",
        "Wegscheidsiedlung 4/4",
        "Lamingfeldsiedlung G13",
        "Kopfstetten 31",
        "Am Steinerbach 19",
        "Leebgasse 62",
        "Judenaustraße 18a",
        "Grazer Straße 90",
        "Weidenpoint 5",
        "Gewerbepark Süd 4",
        "Lengberg 35",
        "Bad St. Leonhard 153a",
        "Sachsenplatz 11",
        "Römerstraße 48",
        "Alter Bachweg 7",
        "Astätt 77",
        "Hauptstraße 17",
        "Mitschastraße 44",
        "Anna Grundschober Gasse 6",
        "Jauring 164",
        "Achenweg 30",
        "Stöcklfeld 61",
        "Maria Gailer Straße 59",
        "Reichsstraße 92",
        "St. Veiterstraße 179",
        "Industriestrasse 4",
        "Bruckerstraße 6",
        "Gewerbegebiet 201",
        "Tautenhayngasse 22",
        "Industrieparkstraße 13",
        "Hauptstraße 44",
        "Dürnkruterstraße 57",
        "Seitenhafenstraße 15",
        "Tulwitzviertel 1",
        "Schönburgstraße 7",
        "Staudenführerweg 790",
        "Tiroler Straße 39",
        "Helpfau 50",
        "Mosetiggasse 1A/0, 9-10",
        "Wildauweg 1",
        "Larchwald 360",
        "Ort an der Straße 3",
        "Zaunweg 18",
        "Johann-Böhm-Platz 1",
        "Rehberger Hauptstraße 29",
        "Handelsstraße 3-5/12",
        "Gewerbepark Kammerhof 5 - 7",
        "Stixenlehen 109",
        "Steyrer Straße 32",
        "Betriebsgebiet Hutweide 4-5",
        "Stiglingen 75",
        "Austraße 20",
        "Ebersdorf 64a",
        "Wallensham 46",
        "Oberlaaer Straße 276",
        "Siggerwiesen 32a",
        "Ferdinand-Hanusch-Straße 19",
        "Die Spinnerei 31",
        "Horner Straße 33",
        "Leo Mathauser Gasse 64",
        "Waltersdorferstrasse 8-10",
        "Grazer Straße 116",
        "Empersdorfberg 21",
        "Gewerbepark 12",
        "Arndtstraße 72",
        "Fuhrgasse 30, Halle 1",
        "Grabenmühle 28",
        "Radl (Werkstatt) 1",
        "Oberarnsdorf 56",
        "Bründlweg 3",
        "Industriestrasse 17a",
        "Kleinsemmering 60",
        "Triesterstraße 25",
        "Peßlerstraße 2",
        "Waxenberger Straße 25",
        "Hauptplatz 8",
        "Hainfelder Straße 1",
        "Falkenstein 64a",
        "Umfahrungsstraße 29",
        "Fernitzer Straße 1",
        "Brünner Straße 31",
        "Kahlberg 5",
        "Bruggerstraße 40",
        "Sie Spinnerei 31",
        "Perlsdorf 105",
        "Mühlweg 54",
        "Leo-Mathauser-Gasse 14",
        "Grazer Straße 56",
        "Ing. G. Fildanstraße 7",
        "Ljubljanska cesta 32",
        "Rajspova ulica 22",
        "Industriestraße Ost 1",
        "Neusarlinger Ring 23",
        "Frankenburger Straße 25",
        "Sturzgasse 13",
        "Erlfeld 22",
        "Gewerbepark Nord 2",
        "Gossendorf 197",
        "Rugierstraße 6",
        "Thalgaustraße 38",
        "Selzergasse 38",
        "Viertelfeistritz 46",
        "Gesäusestraße 18",
        "Badener Straße 27",
        "Wiener Neustaedter Strasse 54-56",
        "Josef-Österreicher-Gasse 45A",
        "Triesterstraße 19",
        "Sandfeld 11L",
        "Enzersfelder Straße 33",
        "Adlergasse 42b",
        "Römerstraße 10",
        "Mühlgangweg 2",
        "Bundesstraße 248",
        "Marktstraße 19",
        "Wiener Straße 22",
        "Lechtaler Straße 37",
        "Wiener Straße 3",
        "Bundesstraße 7",
        "Bahnhofstraße 1-3",
        "Riegersburg 202",
        "Südautobahnstraße 3",
        "Wasserfallstraße 217",
        "Rapottenstein 78",
        "Schweizersberg 150",
        "Puchsbaumgasse 42",
        "Vollererhofstraße 45",
        "Hauptstraße 536",
        "Futterknechtgasse 111",
        "Gaferlweg 2",
        "Wiener Straße 9",
        "Lärchenweg 2 - 4",
        "Froschaugasse 2",
        "Bahnhofstraße 28",
        "Ysperstrasse 4",
        "Floridusgasse 38",
        "Konstantingasse 4",
        "Inzersdorfer Straße 18",
        "Schrems 3",
        "Kleinsierndorf 25",
        "Vogelweiderstraße 63",
        "Opelplatz 1",
        "Thayapark 9",
        "Dr. Josef Wenischgasse 34",
        "Inkustraße 20",
        "Wagram 1/1",
        "Mittersillerstraße 11",
        "Liebensdorf 147a",
        "Mühlbachweg 40",
        "Slamastraße 23/BT-B",
        "Turracher Straße 7",
        "Flattendorf 47",
        "Königstetter Straße 163A",
        "Rieding 38",
        "Stoderstraße 181",
        "Rautenweg 22",
        "Johann Galler Straße 8",
        "Wiener Straße 126",
        "Dr. Bathelt-Siedlung 5",
        "St. Georgen 53",
        "Willendorfer Gasse 3",
        "Peter-Mitterhofer-Gasse 29",
        "Feldbachstrasse 6",
        "Pechhüttenbrunnengasse 4-10",
        "Bahnhofstraße 45",
        "Eisenstraße 7",
        "Alte Poststraße 34",
        "Wieshof 67",
        "Dr.-Guido-Salvagnini-Straße 2",
        "Salzachstraße 8",
        "Markt 268/1",
        "Schweiglstraße 11",
        "Steinamangerstraße 24",
        "Ladesstrasse 712",
        "Villacher Straße 14",
        "Wiener Straße 42-44",
        "Untere Masenbergstraße 225",
        "Europastraße 80",
        "Köstendorferstraße 10",
        "Ankershofenstraße 8",
        "Landstraße 139",
        "Mannagettagasse 33",
        "Fuhrgasse 2-4, GI Top3",
        "Rudolf-Diesel-Straße 3a",
        "Försterweg 18",
        "Wiesengasse 11",
        "Reitschulgasse 3",
        "Gewerbepark 14",
        "Tolleterau 22",
        "Haböckgasse 1",
        "St. Nikola 60",
        "Altenburg 11",
        "Seilergasse 8",
        "Klausenburger Straße 27/22",
        "Franz Holbein Straße 19",
        "Linzbüchl 72/2",
        "Entlastungsstraße 1",
        "Salzburger Straße 14",
        "Karolingerstraße 22",
        "Bäumlestraße 9",
        "Bundesstraße 30",
        "Kleedorf 30",
        "Falkenburg 234",
        "Gewerbepark 6",
        "Schillerstraße 10",
        "Marienstraße 6",
        "Wienerstraße 42/Top 4",
        "Meggauerstraße 31",
        "Grazer Straße 74",
        "Salzburger Straße 23",
        "Oberwaltenreith 10",
        "Freschner Riegelweg 5",
        "Bremschlstraße 37",
        "Petritschgasse 6/2/1",
        "Zehenthofstraße 33",
        "Leopold Gattringer Straße 70",
        "Ottogasse 2 / Box 4",
        "Obervisnitz 7",
        "Baumgartenberg 111",
        "Plantagenstraße 5/P9",
        "Bretstein-Gassen 12/2",
        "Makartkai 3",
        "Stadionstraße 40/Halle B, Top 11",
        "Pernerstorferstraße 4",
        "Polling in Tirol 123/4",
        "Schönau 80",
        "Maukenbach 16b",
        "Flurgasse 13",
        "Uferweg 24/1",
        "Grazer Straße 46",
        "Alte Bundesstraße 12",
        "Zwettlerstraße 102",
        "Leibnitz 4",
        "Wiener Neustädter Straße 23",
        "Hadikgasse 192",
        "Ödenburgerstraße 72",
        "Industriestraße 1",
        "Wienerstraße 64",
        "Köstendorfer Landstraße 3",
        "Prager Straße 247B",
        "Elfingerweg 42",
        "Halleiner Landesstraße 32",
        "Mattersburger Straße 15",
        "Marktstraße 2",
        "Hauptstraße 20",
        "Josef Heißl-Straße 1-3",
        "Siegfriedstraße 5",
        "Zehetnergasse 25",
        "Centerpoint 2",
        "Bichlwangerstraße 4",
        "Wagenham 4",
        "Salzburger Straße 1",
        "Lemböckgasse 16",
        "Hof 300",
        "Angererhofweg 15",
        "Mylius-Bluntschli-Straße 32",
        "Frank-Stronach-Straße 3",
        "Ernstbrunnerstraße 7",
        "Linzer Straße 65a",
        "Laabstraße 22",
        "Kaltenbrunnerweg 1",
        "Am Riedenhof 12/4",
        "Mühldorf 335",
        "Dorf 23a",
        "Konradsheim 66",
        "Hauptstraße 89",
        "Römerhof 99",
        "Villacher Straße 150",
        "Sandgasse 1",
        "Kudlichgasse 21/25",
        "Josef-Stefan-Straße 6",
        "Pittermannweg 1",
        "Wallnerfeld 4",
        "Flatschach 5",
        "Hainfelderstraße 47",
        "Donaustraße 3",
        "Bergstraße 3",
        "Rosenbergstraße 6",
        "Weinviertlerstr. 28",
        "Günser Straße 1",
        "Perlmooserstraße 5/2",
        "Grillgasse 46",
        "Furth 12",
        "Tiefbrunnaustraße 36",
        "Siebing 34",
        "Jettsdorferstraße 42",
        "Haböckgasse 1/1",
        "Au 51",
        "Judendorf 19",
        "Saglstraße 71",
        "Kapellenstraße 47",
        "Triester Straße 6a-8",
        "Wagramer Straße 203",
        "Gewerbestraße 2",
        "Industriestraße Ost 3",
        "Gießenweg 5",
        "Schulstraße 31",
        "Dorfstraße 1",
        "Haidhofstraße 89",
        "Bräunlichgasse 6",
        "Austraße 21",
        "St. Nikola 62",
        "Schwarzachtobelstraße 3a",
        "Wiener Straße 28",
        "Johann Metz-Straße 6",
        "Lehenweg 10",
        "Gewerbestraße 10",
        "Oberscheffau (am Tennenge 164, Tür2",
        "Murbergstraße 15-17",
        "Rampersdorf 1",
        "Anton-Azwanger-Straße 36",
        "Niederfeldstraße 11",
        "Hauptstraße 22",
        "Pfarrhofstraße 20",
        "Voglhub 27",
        "Pölten 2",
        "Gnas 120",
        "Eggenbergergürtel 57",
        "Untere Embergstraße 20",
        "Merkersdorf 42",
        "Albrechtsbergergasse 15",
        "Hönigstaler Straße 46",
        "Postfach 500620",
        "Zweite Straße 2",
        "Fröschnitz 25A",
        "Leobersdorfer Straße 90",
        "Hafenstraße 6",
        "Großvolderbergstraße 2",
        "Breitwies 16",
        "Umfahrungsstraße 22a",
        "Leidern 33/1",
        "Unterwies 3",
        "Scherenbrandtnerhofstr. 6",
        "Protteserstraße 40",
        "Unterwölbling 23",
        "Bahnstraße 50",
        "Grazer Straße 60a",
        "Kapellenstraße 25",
        "Schaffenberg 7",
        "Triester Straße 11-13",
        "Schönberg-Lachtal 63",
        "Neusiedler Straße 6",
        "Karl-Adlitzer-Straße 5",
        "B 1 Center 1",
        "Öblarnstraße 191",
        "Wienerstraße 38",
        "Bahnstraße 12",
        "Salzburgerstraße 1",
        "Brünner Straße 170",
        "Kameokastraße 159",
        "Schwendeweg 30",
        "Am Industriepark 1",
        "Wagramer Straße 256",
        "Fabianstraße 3",
        "Ach 1",
        "Bundesstraße 37",
        "Grazer Straße 76",
        "Feldsdorf 32",
        "Lichendorf 140",
        "Höhenstraße 2A",
        "Am Gewerbepark 2",
        "Kärntnerstraße 3",
        "Mittelberg 31",
        "Neukettenhoferstraße 20",
        "Sportplatzgasse 4",
        "Kremsmüllerstraße 1",
        "Tulwitzdorf 7",
        "Jakob-Fuchsgasse 45",
        "Schönbrunner Allee 41",
        "Hauptstraße 7",
        "Lassach Sonnseite 6",
        "Sonnendorf 29",
        "Gries 95",
        "Gasteiger Straße 54",
        "Cesta bratov Cerjakov 43",
        "Gärtnereiweg 2",
        "Raiffeisenstraße 4",
        "Tulwitzviertl 93",
        "Hönigtaler Straße 46",
        "Schulstraße 59",
        "Rauchfangkehrergasse 32",
        "Tannweg 24",
        "Bahnhofstraße 9",
        "Draschestraße 56",
        "Nitscha 84",
        "Pielgasse 17",
        "Leopoldauer Straße 27",
        "Eisbachstraße 4",
        "Linzerstraße 83",
        "Siebenhirtenstraße 13a",
        "Sandfeld 8",
        "Salzburgerstraße 22",
        "Riederstraße 6",
        "Hofmark 19",
        "Jörgerstraße 22",
        "Keplerstraße 6",
        "Waldmühlgasse 17",
        "Spipbachzeller Straße 29",
        "Klopeinstraße 13",
        "Haller Straße 233",
        "Haager Straße 62",
        "Pillweinstraße 16",
        "Baldiagasse 14",
        "Columbusgasse 95",
        "GENINER STRASSE 155a",
        "Gersdorf 172",
        "Kolbengraben 3",
        "Erhard-Wild-Platz 1-3",
        "Erhard Wildplatz 1-3",
        "Wirtschaftspark Straße 2, Nr.6",
        "Weinzierl-Süd 3",
        "Industriestraße 11/3",
        "Zimetsberg 11",
        "Hauptstrasse 85",
        "Hölzlgasse 26",
        "Wolfing 12",
        "Attergauerstraße 99",
        "Parschluger Straße 28",
        "Gewerbestraße 5",
        "Wiener Straße 45",
        "Grund-Bahnhofsiedlung 113",
        "Kalsergasse 26",
        "Haberedt 21",
        "Bergsteiggasse 48",
        "Winkl 59a",
        "Grasbergergasse 1a",
        "Groß-Enzersdorfer Straße 88A",
        "Rosengasse 21a",
        "Erwin-Schrödinger-Straße 1",
        "Salzachweg 13",
        "Eisenstädter Straße 13",
        "Aisting 33",
        "Stadlweg 7",
        "Ebene Reichenau 91",
        "Pischelsdorf 513",
        "Podgorje 13",
        "Gewerbepark / Habach 7",
        "Rottenhofsiedlung 4",
        "Hannesgrub Süd 2",
        "irrsdorfer Straße 33",
        "Achenweg 67",
        "Tauernstraße 27",
        "Seidengasse 30",
        "Straß 16a",
        "Mühltal 31",
        "Berggasse 13",
        "Neubach 61",
        "Neudauerweg 2",
        "Hauptstraße 2",
        "Prager Straße 126a",
        "Kirchenstraße 1",
        "Gewerbepark Ost 3",
        "Nottendorfer Gasse 21",
        "Sermin 7b",
        "Neue Landstraße 84",
        "Eichhorn 60",
        "Kastanienstraße 5",
        "Gewerbestraße 8",
        "Industriestraße 37",
        "Ziegeleistraße 4",
        "Industriegelände 6",
        "Wagramer Straße 36A",
        "Altestrasse 32",
        "Sankt Margarethen an der Raab 44",
        "Glemmerstraße 317",
        "Siezenheimerstraße 31a",
        "Kapruner Straße 36",
        "Hans Liebherr-Straße 35",
        "Berg 5",
        "Unterwasser 55a",
        "Brennerstrasse 5",
        "Unterschwendt 46",
        "Kulm 72",
        "Linzerstraße 7",
        "Hammerweg 7",
        "Äußeres Hirschfeld 3",
        "Gewerbepark 11",
        "Siegfried Marcus-Straße 4",
        "Langenlebarnerstraße 108",
        "Kirchberg 151",
        "Riesstraße 391",
        "Hauptplatz 6",
        "Maretostraße 10",
        "Ozeanstraße 8/2/5",
        "Binderstandweg 30",
        "Austraße 82",
        "Gewerbepark 4",
        "Fischa 6",
        "Erdweis 9",
        "Lastenstraße 15",
        "Wienergasse 118",
        "Radlbrunn 81",
        "Hohenemser Straße 3",
        "Raiffeisenstraße 1",
        "Seestraße 82",
        "Gewerbegebiet Nord 125",
        "Übersiedelungs-Expertsg Halle, 7/11",
        "Rothergasse 2a",
        "Brünnerstraße 64",
        "Eduard Süß Straße 21",
        "Hellwagstraße 2A",
        "Innsbrucker Straße 21",
        "Neumayrgasse 3",
        "Johannesgasse 13",
        "Haberlgasse 80",
        "Pelikanstraße 7",
        "Tulwitzdorf 70",
        "Loferer Bundesstraße 13",
        "Breitenfurter Straße 110",
        "Burgstall 103",
        "Kärntner Straße 86",
        "10. Oktoberstraße 25",
        "Bahnhofstraße 30",
        "Dahlienstraße 6",
        "Fölz 123",
        "Zementwerkstraße 23",
        "Puntigamer Straße 127",
        "Gewerbepark Ost 1/3",
        "Salzstraße 14",
        "Mariazeller Straße 33a",
        "Zwettler Straße 133",
        "Ghegagasse 56/1",
        "Bauhofstraße 8",
        "Larnhauserstraße 5",
        "Dr. Franz Palla Gasse 29",
        "Lustenauerstraße 50a",
        "Michaelerstraße 65",
        "Wengerstr. 13",
        "Achleit 150/1",
        "Kuffnergasse 3-5",
        "Stadionstraße 17",
        "Grazer Straße 13",
        "Pielachtalstraße 16",
        "Untergroßau 203",
        "Südtirolerstrasse 4",
        "Mariatroster Straße 115",
        "Thörl 30",
        "Mannagettagasse 33",
        "Herzog Odilo-Straße 51",
        "Kees 60",
        "Bundesstrtaße 38",
        "Treibacher Straße 4/1",
        "Annaberg 152",
        "Rehbergerstrasse 1",
        "Eisenstraße 54",
        "Wiener Straße 151",
        "Westbahnstraße 2",
        "Jauntalweg 2",
        "Ginzkeystraße 28/1",
        "Stranzingerstraße 33",
        "Pfarrgasse 83",
        "Pultendorf 11",
        "Keuschen 54",
        "Mankerstraße 8a",
        "Gewerbepark Ost 2/6",
        "Bauern 6",
        "Mühlwasen 69",
        "Lukas-Cranach-Weg 1",
        "Gewerbezone 4",
        "Ursprungsweg 70",
        "Vinzenz-Muchitsch-Straße 16",
        "Rosenbach 90",
        "Hans-Brandstetter-Gasse 8",
        "Innsbruckerstraße 58",
        "Eichamtsstraße 3",
        "Neumarkter Straße 47",
        "Mattseer Landesstraße 2",
        "Bundesstraße 25",
        "Gewerbepark 2",
        "Transportstraße 20",
        "Theyernerstraße 9/1",
        "Häusling 2",
        "Wallagasse 6b",
        "Am Hammerrain 4",
        "Wr. Neustädterstrasse 46",
        "Holzleiten 165",
        "Erdbergstraße 236",
        "Linzer Straße 65",
        "Aschauerstraße 102",
        "Schwöbing 74",
        "Gräsalp 82",
        "Weidach 4",
        "Markt 39",
        "Schumanngasse 95",
        "Haindorf 12",
        "Niederland 223",
        "Eybnerstraße 22",
        "Salzburger Straße 29",
        "Tenschertstraße 8",
        "Aumühlweg 17-19",
        "Liebensdorf 33",
        "Passauerstraße 2",
        "Gewerbepark 19",
        "Sommerseite 24",
        "St. Pöltnerstrasse 1/D",
        "Passauer Straße 4",
        "Simmeringer Hauptstraße 397",
        "Friedlach Gew Park 2",
        "Wolfernstraße 37",
        "Rennweg 76",
        "Kauttenstraße 14",
        "Braunegg 42a",
        "Mariazeller Str. 220",
        "Pokornystraße 2",
        "Mooswald 82",
        "Untere Feldstraße 586",
        "Kampstraße 1",
        "Flughafenstraße 1",
        "Adendorf 183",
        "Gasteiner Bundesstraße 6",
        "Gasteinerstraße 78",
        "Südtiroler Straße 1",
        "Gundersdorf 17",
        "Villacher Straße 59",
        "Kohldorf 74",
        "Klagenfurter Straße 13",
        "Hauptstraße 76",
        "Auf der Au 42",
        "Pechhüttenstrasse 4a, Obj. 5",
        "Feldhamer Straße 41",
        "Matznerstraße 28 Top 6",
        "Millstätter Straße 1a",
        "Südring 240",
        "Ellmauthal 52",
        "Industriezone 37",
        "Hadnweg 12",
        "Allgäustraße 2",
        "Mosetiggasse 1A/0/4-10",
        "Schubertstraße 27",
        "Industriestrasse Nord 6A",
        "Hauptstraße 17",
        "Mittagskogelstrasse 6",
        "Judenburgerstraße 29",
        "Gurkgasse 3",
        "Herrschaftswiesen 10",
        "Auwinkel 10E",
        "Föhrenweg 4",
        "Gewerbestraße 1",
        "Hammergraben 8B",
        "Hauptstraße 117",
        "Neubergenstraße 6-8",
        "Ferdinand-Porsche-Platz 1",
        "Wegererstraße 36",
        "Adlergasse 42b",
        "Westbahn Str. 10",
        "Ramseiden 211",
        "Waisenegg 121",
        "Rathausplatz 1",
        "St. Andrä 21",
        "Franz-Grill-Straße 8",
        "Karlsplatz 13/E007",
        "Kaiseraufstieg 26",
        "Brausewettergasse 11",
        "Untere Hauptstraße 41",
        "Grillparzergasse 5",
        "Pitschauegg 13",
        "10. Oktoberstraße 66",
        "Handelsstraße 1",
        "St. Margarethen 154f",
        "Emmerbergstraße 8",
        "Herrengasse 15",
        "Auer-Welsbach-Straße 1",
        "Znaimer Straße 24",
        "Percostraße 22a, Objekt 1",
        "Zeil 28",
        "Dr. Senekowitsch Straße 6",
        "Eggendorfer Straße 1",
        "Werkstraße 23",
        "Wienerstraße 80",
        "Grazer Straße 60a",
        "Wiener Straße 14",
        "Halbenrainerstraße 28",
        "Ramsauer Straße 683",
        "Bundesstraße 20",
        "Hollabrunnerstraße 27",
        "Melkusstrasse 2",
        "Untere Hauptstraße 48",
        "Gschwandnergasse 45",
        "Josef-Kamper-Straße 1",
        "Bundesstraße West 5",
        "Parkgasse 42",
        "Sportplatzstraße 2",
        "Franz Schubert Straße 23",
        "Probelerstraße 3",
        "Roseggerstraße 17",
        "Koschatstasse 33",
        "Guntrams 59",
        "Hippleser Str. 5",
        "Wasserturmstraße 18",
        "Quadrella 7",
        "Richard Neutra Gasse 9a",
        "Riesstraße 40",
        "Slavenberg 11",
        "Linzer Straße 68",
        "Werksweg 10-14",
        "Schünbrunnerweg 1",
        "Entschendorf 36",
        "Salzburgerstraße 293",
        "Fröbelgasse 9",
        "Pechhüttenstraße 13",
        "Laaberstraße 61-63",
        "Hainfelderstraße 49",
        "Hütte 13",
        "Burgfried 8",
        "Ruster Straße 110",
        "Schillingstraße 4",
        "Brunnerstraße 81a",
        "Wienerstraße 338",
        "Schrötten 145",
        "Freilingerstr. 35",
        "Salzburger Straße 26",
        "Dr. Knechtl Straße 4",
        "Munten 5",
        "Oberjahring 1",
        "Raiffeisenstraße 20",
        "Handelsstraße 1",
        "Pflanzsteig 1",
        "Grenzgasse 4",
        "Hagenau 1",
        "St. Veiter Straße 209",
        "Endach 32",
        "Linzer Straße 50",
        "Gewerbestrasse 11",
        "Industriestraße 35",
        "Gewerbepark 5",
        "Neudorf 198",
        "Obergreith 29/1",
        "Schrackgasse 9a",
        "Langenharterstraße 1",
        "Unter Planken 122",
        "Birostrasse 13",
        "Eduard-Kittenberger-Gosse 56/9/2",
        "Lerchenstraße 62",
        "Tiestling 8",
        "Schönweg 56",
        "Gewerbestraße 586",
        "Kreuzbichl 6",
        "Liesinger Flurgasse 15",
        "Gewerbeweg 1",
        "Völkermarkterstraße 45",
        "Grazerstraße 134",
        "Pottendorferstrasse 162",
        "Pfadenhauergasse 10",
        "Hauptstraße 39",
        "Karl-Praunseys-Straße 8",
        "Neunkirchnerstraße 125",
        "Schönbrunner Alllee 41",
        "Kupferschmiedegasse 31/7",
        "Innstraße 19",
        "Hans- Liebherrstraße 29",
        "Keltenstraße 3",
        "Pustertalerstraße 1",
        "Fiali Ring 26",
        "Am Göllgraben 5",
        "Piccostraße 42",
        "Industriestraße B3",
        "Lamprechtsberg 54",
        "Hubertusgasse 7",
        "Schloßstraße 26",
        "Salzstraße 14",
        "Hintergasse 22",
        "Untere Hauptsraße 72",
        "Simmeringer Hauptstraße 2-4"

        );
    List<String> zipcode = Arrays.asList("6850",
        "3071",
        "6373",
        "8221",
        "3464",
        "4752",
        "7141",
        "9020",
        "1210",
        "1110",
        "1100",
        "9300",
        "2353",
        "5020",
        "2100",
        "4060",
        "1030",
        "3100",
        "6591",
        "1110",
        "2514",
        "9100",
        "2120",
        "8740",
        "3130",
        "6175",
        "3753",
        "8160",
        "8600",
        "2305",
        "6306",
        "1100",
        "3442",
        "8101",
        "5272",
        "8121",
        "9782",
        "9462",
        "1200",
        "4800",
        "9112",
        "5221",
        "6433",
        "2130",
        "2000",
        "8623",
        "6364",
        "6365",
        "9500",
        "3300",
        "9020",
        "9314",
        "8130",
        "5581",
        "1150",
        "2130",
        "7442",
        "2225",
        "1020",
        "8163",
        "1040",
        "5412",
        "6424",
        "5261",
        "1230",
        "6410",
        "6210",
        "4722",
        "5071",
        "1020",
        "3500",
        "2201",
        "3202",
        "3345",
        "4300",
        "7061",
        "6850",
        "6832",
        "8322",
        "4786",
        "1230",
        "5101",
        "8700",
        "6845",
        "2095",
        "1230",
        "2500",
        "8682",
        "8081",
        "8792",
        "1120",
        "2201",
        "5205",
        "3814",
        "3621",
        "2134",
        "4053",
        "8160",
        "2630",
        "4752",
        "4181",
        "2135",
        "2564",
        "8673",
        "9100",
        "8401",
        "2201",
        "4794",
        "6973",
        "6845",
        "8342",
        "8402",
        "1230",
        "8605",
        "2490",
        "8000",
        "2250",
        "8605",
        "3370",
        "4870",
        "1150",
        "5441",
        "8793",
        "8330",
        "1220",
        "5310",
        "1150",
        "8184",
        "8940",
        "2514",
        "2483",
        "1230",
        "2351",
        "2100",
        "2202",
        "8055",
        "6065",
        "9400",
        "8077",
        "5611",
        "8820",
        "6600",
        "7551",
        "8753",
        "4053",
        "8330",
        "2512",
        "5440",
        "3911",
        "4575",
        "1100",
        "5412",
        "8962",
        "1230",
        "4073",
        "2230",
        "8160",
        "8010",
        "5211",
        "3683",
        "1210",
        "1160",
        "1100",
        "8163",
        "2033",
        "5020",
        "4633",
        "2136",
        "2620",
        "3400",
        "4303",
        "5722",
        "8081",
        "6175",
        "1230",
        "9560",
        "8230",
        "3430",
        "9431",
        "8962",
        "1220",
        "2120",
        "2345",
        "8664",
        "8786",
        "1230",
        "9020",
        "8083",
        "2345",
        "6900",
        "4502",
        "8644",
        "4201",
        "4482",
        "5710",
        "5431",
        "2620",
        "8243",
        "8960",
        "9620",
        "3400",
        "8232",
        "4600",
        "5202",
        "9020",
        "2410",
        "2340",
        "2201",
        "2000",
        "4300",
        "2331",
        "4600",
        "6405",
        "4710",
        "1230",
        "4381",
        "4322",
        "1010",
        "1100",
        "2263",
        "8271",
        "7561",
        "5301",
        "5020",
        "6973",
        "7221",
        "3943",
        "8952",
        "5161",
        "3550",
        "3121",
        "2120",
        "4020",
        "7400",
        "5102",
        "3533",
        "6800",
        "6706",
        "1210",
        "9500",
        "2345",
        "2333",
        "4224",
        "4342",
        "2103",
        "8763",
        "5020",
        "2700",
        "1100",
        "6404",
        "6252",
        "6241",
        "8230",
        "5101",
        "7574",
        "5071",
        "3920",
        "9064",
        "2483",
        "1140",
        "7163",
        "2201",
        "2514",
        "5163",
        "1210",
        "1220",
        "5411",
        "7000",
        "5660",
        "3034",
        "8700",
        "4300",
        "1140",
        "8733",
        "6322",
        "5233",
        "5162",
        "1230",
        "6951",
        "4030",
        "1110",
        "8200",
        "2130",
        "4240",
        "5280",
        "4400",
        "2481",
        "8330",
        "6210",
        "3340",
        "2603",
        "4894",
        "9800",
        "9300",
        "1100",
        "9065",
        "4030",
        "5620",
        "9555",
        "2560",
        "3421",
        "8770",
        "9020",
        "3491",
        "7350",
        "6322",
        "1110",
        "3241",
        "5324",
        "8481",
        "3484",
        "1230",
        "6134",
        "9360",
        "6410",
        "8020",
        "1100",
        "1210",
        "3364",
        "8607",
        "6263",
        "4421",
        "3441",
        "2500",
        "2700",
        "5582",
        "4381",
        "6858",
        "4800",
        "4020",
        "6971",
        "2500",
        "5440",
        "8072",
        "3380",
        "4400",
        "8940",
        "8410",
        "4761",
        "4671",
        "8493",
        "8342",
        "8020",
        "6272",
        "2115",
        "1120",
        "8301",
        "80976",
        "2011",
        "8685",
        "2560",
        "4020",
        "6111",
        "5303",
        "2225",
        "4850",
        "6682",
        "5020",
        "2230",
        "3124",
        "6844",
        "8680",
        "4664",
        "4707",
        "8020",
        "8831",
        "2230",
        "2514",
        "3370",
        "8952",
        "2401",
        "3363",
        "4982",
        "1210",
        "8720",
        "6911",
        "9431",
        "1220",
        "1110",
        "4632",
        "6063",
        "8480",
        "4201",
        "8083",
        "7222",
        "9413",
        "8811",
        "3550",
        "2320",
        "8101",
        "4641",
        "8163",
        "2345",
        "2331",
        "4901",
        "9821",
        "6334",
        "3281",
        "6382",
        "8250",
        "8600",
        "8530",
        "8163",
        "8301",
        "2603",
        "1150",
        "6380",
        "6824",
        "1230",
        "8200",
        "7023",
        "1210",
        "7000",
        "4240",
        "1230",
        "2100",
        "4910",
        "4924",
        "5602",
        "1170",
        "4850",
        "2391",
        "4550",
        "9122",
        "6020",
        "4400",
        "5020",
        "1160",
        "1100",
        "23560",
        "8212",
        "6833",
        "3340",
        "3340",
        "4482",
        "4320",
        "2620",
        "4941",
        "2571",
        "3400",
        "5121",
        "4880",
        "8605",
        "2620",
        "8720",
        "2042",
        "1210",
        "4775",
        "1170",
        "6233",
        "1030",
        "1220",
        "2301",
        "7100",
        "5061",
        "7092",
        "4311",
        "6020",
        "9565",
        "8212",
        "9253",
        "5321",
        "3244",
        "4911",
        "5204",
        "6370",
        "5550",
        "1070",
        "4850",
        "6363",
        "2401",
        "5523",
        "9400",
        "2630",
        "1210",
        "3843",
        "4846",
        "1030",
        "6000",
        "6841",
        "2225",
        "4300",
        "9300",
        "2353",
        "9400",
        "7331",
        "1220",
        "9871",
        "8321",
        "5752",
        "5020",
        "5671",
        "6410",
        "4752",
        "6384",
        "6150",
        "6385",
        "7521",
        "9990",
        "3180",
        "7100",
        "8772",
        "7000",
        "3034",
        "6733",
        "8010",
        "8291",
        "7111",
        "2353",
        "4030",
        "3512",
        "8641",
        "8342",
        "3522",
        "9020",
        "2380",
        "3710",
        "6890",
        "2100",
        "6973",
        "6261",
        "2521",
        "1220",
        "1210",
        "4020",
        "1200",
        "6380",
        "1160",
        "2453",
        "1160",
        "5020",
        "8163",
        "5760",
        "1120",
        "9433",
        "9900",
        "9500",
        "4752",
        "4621",
        "8621",
        "6700",
        "8055",
        "3424",
        "6170",
        "3160",
        "3970",
        "2620",
        "5280",
        "4060",
        "9020",
        "6850",
        "9500",
        "4716",
        "6320",
        "1160",
        "2700",
        "8670",
        "3232",
        "8261",
        "5310",
        "8043",
        "8983",
        "2340",
        "5310",
        "6952",
        "8472",
        "9523",
        "5524",
        "4551",
        "9330",
        "4021",
        "4020",
        "9100",
        "4600",
        "5112",
        "1230",
        "3110",
        "5310",
        "3250",
        "3424",
        "6844",
        "6972",
        "6845",
        "6167",
        "8045",
        "8020",
        "9183",
        "8010",
        "6060",
        "2136",
        "9361",
        "5161",
        "4341",
        "3314",
        "9300",
        "3508",
        "3642",
        "1110",
        "5542",
        "2490",
        "3350",
        "1110",
        "4240",
        "6365",
        "8665",
        "6886",
        "4072",
        "4271",
        "1170",
        "3384",
        "5091",
        "3100",
        "5204",
        "1230",
        "2544",
        "8081",
        "4792",
        "6405",
        "2225",
        "3150",
        "4190",
        "1110",
        "9555",
        "4400",
        "1030",
        "4060",
        "3650",
        "3100",
        "5630",
        "9712",
        "2823",
        "2345",
        "4063",
        "8812",
        "5640",
        "5500",
        "5310",
        "9020",
        "9300",
        "9125",
        "9400",
        "2763",
        "4283",
        "2320",
        "4655",
        "2242",
        "9523",
        "9020",
        "5452",
        "6460",
        "9065",
        "6912",
        "1230",
        "6330",
        "2601",
        "4952",
        "9232",
        "8753",
        "1140",
        "6842",
        "6352",
        "8530",
        "5202",
        "9300",
        "3813",
        "1150",
        "8041",
        "4400",
        "8055",
        "4482",
        "5760",
        "8190",
        "5760",
        "9433",
        "1030",
        "1040",
        "6341",
        "1220",
        "6350",
        "3830",
        "8544",
        "9800",
        "4844",
        "6220",
        "2724",
        "2020",
        "9330",
        "2070",
        "1220",
        "3971",
        "8330",
        "8230",
        "8940",
        "8630",
        "8680",
        "8820",
        "8490",
        "8970",
        "8740",
        "2111",
        "4664",
        "8234",
        "1170",
        "7100",
        "7442",
        "2443",
        "4694",
        "2232",
        "8712",
        "8700",
        "9800",
        "2625",
        "2114",
        "4642",
        "6706",
        "1210",
        "8063",
        "6305",
        "4600",
        "8160",
        "3244",
        "8093",
        "4030",
        "1160",
        "2320",
        "2384",
        "2564",
        "6345",
        "8900",
        "7000",
        "1220",
        "1230",
        "8051",
        "8422",
        "4064",
        "4910",
        "4050",
        "5205",
        "8505",
        "7540",
        "4300",
        "2000",
        "2511",
        "5101",
        "9020",
        "6330",
        "4780",
        "3492",
        "8502",
        "7502",
        "8262",
        "8160",
        "8650",
        "4300",
        "6722",
        "1230",
        "1230",
        "5023",
        "4502",
        "9433",
        "5582",
        "6111",
        "1230",
        "9020",
        "9300",
        "8430",
        "2700",
        "1140",
        "3721",
        "2201",
        "2700",
        "2331",
        "2201",
        "6122",
        "6410",
        "5221",
        "9900",
        "3133",
        "9873",
        "9500",
        "2345",
        "9472",
        "2201",
        "8076",
        "6170",
        "7210",
        "2291",
        "1110"

        );
    // CITY
    List<String> city = Arrays.asList("Dornbirn",
        "Gemersdorf",
        "Jochberg",
        "Hirnsdorf",
        "Soitzersdorf-Wolfpassing",
        "Riedau",
        "Podersdorf",
        "Klagenfurt",
        "Wien",
        "Wien",
        "Wien",
        "St. Veit",
        "Guntramsdorf",
        "Salzburg",
        "Stetten",
        "Leonding",
        "Wien",
        "St. Pölten",
        "Grins",
        "Wien",
        "Traiskirchen",
        "Völkermarkt",
        "Wolkersdorf",
        "Speilberg",
        "Oberndorf",
        "Kematen",
        "Hötzelsdorf",
        "Thannhausen",
        "Bruck an der Mur",
        "Kopfstetten",
        "Söll",
        "Wien",
        "Langenrohr",
        "Gratkorn",
        "Treubach",
        "Deutschfeistritz",
        "Nikolsdorf",
        "Bad St. Leonhard",
        "Wien",
        "Attnang Puchheim",
        "Griffen",
        "Lochen",
        "Oetz",
        "Mistalbach",
        "Stockerau",
        "Aflenz",
        "Brixen im Thale",
        "Kirchberg in Tirol",
        "Villach",
        "Amstetten",
        "Klagenfurt",
        "Launsdorf",
        "Frohnleiten",
        "St. Margarethen",
        "Wien",
        "Mistelbach an der Zaya",
        "Lockenhaus Hochstrass",
        "Zistersdorf",
        "Wien",
        "Fladnitz",
        "Wien",
        "Puch",
        "Silz",
        "Uttendorf",
        "Wien",
        "Telfs",
        "Wiesing",
        "Steegen",
        "Wals",
        "Wien",
        "Krems",
        "Hagenbrunn",
        "Hofstetten-Grünau",
        "Göstling an der Ybbs",
        "St. Valentin",
        "Trausdorf",
        "Dornbirn",
        "Sulz",
        "Eichkögl",
        "Brunnenthal",
        "Wien",
        "Bergheim",
        "Leoben",
        "Hohenems",
        "Drosendorf",
        "Wien",
        "Baden",
        "Hönigsberg",
        "Heiligenkreuz am Waasen",
        "St. Peter",
        "Wien",
        "Seyring",
        "Schleedorf",
        "Ludweis-Aigen",
        "Oberaqrnsdorf",
        "Waltersdorf bei Staatz",
        "Haid",
        "Kleiz",
        "Ternitz",
        "Riedau",
        "Oberneukirchen",
        "Neudorf im Weinviertel",
        "Weissenbach/Triesting",
        "Ratten",
        "Völkermarkt",
        "Kalsdorf bei Graz",
        "Hagenbrunn",
        "Kopfing",
        "Höchst",
        "Hohenems",
        "Gnas",
        "Werndorf",
        "Wien",
        "Kapfenberg",
        "Ebenfurth",
        "Novo Mesto",
        "Ptuj",
        "Kapfenberg",
        "Ybbs an der Donau",
        "Vöcklamarkt",
        "Wien",
        "Abtenau",
        "Trofaiiach",
        "Feldbach",
        "Wien",
        "Tiefgraben",
        "Wien",
        "Anger",
        "Liezen",
        "Traiskirchen",
        "Ebreichsdorf",
        "Wien",
        "Wr. Neudorf",
        "Stetten",
        "Königsbrunn",
        "Graz",
        "Thaur",
        "Wolfsberg",
        "Goessendorf",
        "Großarl",
        "Neumarkt (Stmk)",
        "Lechaschau",
        "Stegersbach",
        "Hetzendorf",
        "Nettingsdorf",
        "Riegersburg",
        "Tribuswinkel",
        "Golling",
        "Rapottenstein",
        "Roßleithen",
        "Wien",
        "Puch b.Hallein",
        "Gröbming",
        "Wien",
        "Wilhering",
        "Gänserndorf",
        "Weiz",
        "Graz",
        "Lengau",
        "Yspertal",
        "Wien",
        "Wien",
        "Wien",
        "Fladnitz",
        "Kleinsierndorf",
        "Salzburg",
        "Kematen",
        "Laa an der Thaya",
        "Neunkirchen",
        "Klosterneuburg",
        "St. Pantaleon",
        "Niedernsill",
        "Heiligenkreuz",
        "Kematen",
        "Wien",
        "Feldkirchen in Kärnten",
        "Hartberg",
        "Tulln",
        "St. Stefan",
        "Gröbming",
        "Wien",
        "Wolkersdorf",
        "Brunn am Gebirge",
        "St. Barbara im Mürztal",
        "Rottenmann",
        "Wien",
        "Klagenfurt",
        "St. Stefan",
        "Brunn am Gebirge",
        "Bregenz",
        "St. Marien",
        "Mürzhofen",
        "Gramastetten",
        "Ennsdorf",
        "Kaprun",
        "Kuchl",
        "Neunkirchen",
        "Pinggau",
        "Öblarn",
        "Hermagor",
        "Klosterneuburg",
        "Grafendorf",
        "Wels",
        "Neumarkt am Wallersee",
        "Klagenfurt",
        "Hainburg",
        "Mödling",
        "Gerasdorf bei Wien",
        "Stockerau",
        "St. Valentin",
        "Vösendorf",
        "Wels",
        "Pfaffenhofen",
        "St. Georgen bei Grieskirchen",
        "Wien",
        "St. Nikola an der Donau",
        "Windhaag bei Perg",
        "Wien",
        "Wien",
        "Dürnkrut",
        "Großhart",
        "Heiligenkreuz in Lafnitztal",
        "Eugendorf",
        "Salzburg",
        "Höchst",
        "Marz",
        "Schrems",
        "Irding",
        "Elixhausen",
        "Langenlois",
        "Karlstetten",
        "Wolkersdorf",
        "Linz",
        "Oberwart",
        "Anthering",
        "Friedersbach",
        "Feldkirch",
        "Bürs",
        "Wien",
        "Villach",
        "Brunn am Gebirge",
        "Leopoldsdorf",
        "Wartberg",
        "Baumgartenberg",
        "Langenzersdorf",
        "Bretstein",
        "Salzburg",
        "Wr. Neustadt",
        "Wien",
        "Polling in Tirol",
        "Breitenbach",
        "Radstadt",
        "Hartberg",
        "Bergheim",
        "Burgauberg",
        "Wals bei Salzburg",
        "Groß Gerungs",
        "Magdalensberg",
        "Ebreichsdorf",
        "Wien",
        "Andau",
        "Hagenbrunn",
        "Traiskirchen",
        "Mattsee",
        "Wien",
        "Wien",
        "Oberalm",
        "Eisenstadt",
        "Taxenbach",
        "Unter Oberndorf",
        "Leoben",
        "St. Valentin",
        "Wien",
        "St.Marein - Feistritz",
        "Kirchbichl",
        "Pischelsdorf",
        "Obertrum am See",
        "Wien",
        "Lingenau",
        "Linz",
        "Wien",
        "Albersdorf",
        "Mistelbach",
        "Freistadt",
        "Braunau am Inn",
        "St. Ulrich bei Steyr",
        "Achau",
        "Feldbach",
        "Wiesing",
        "Waidhofen an der Ybbs",
        "Felixdorf",
        "Oberhofen",
        "Spittal",
        "St.Veit an der Glan",
        "Wien",
        "Zell (Ebenthal)",
        "Linz",
        "Schwarzach im Pongau",
        "Glanegg",
        "Berndorf",
        "Höflein an der Donau",
        "St. Michael",
        "Klagenfurt",
        "Strass",
        "Oberpullendorf",
        "Kirchbichl",
        "Wien",
        "Kirnberg an der Mank",
        "Faistenau",
        "Weinburg",
        "Grafenwörth",
        "Wien",
        "Vomp",
        "Friesach",
        "Telfs",
        "Graz",
        "Wien",
        "Wien",
        "Neuhofen / Ybbs",
        "Kapfenberg",
        "Fügen",
        "Aschach an der Steyr",
        "Einsiedl",
        "Baden",
        "Wiener Neustadt",
        "St. Michael im Lungau",
        "St. Nikola a.d. Donau",
        "Schwarzach",
        "Attnang-Puchheim",
        "Linz",
        "Hard",
        "Baden",
        "Scheffau",
        "Fernitz-Mellach",
        "Pöchlarn",
        "Steyr",
        "Liezen",
        "Wildon",
        "Enzenkirchen",
        "Aichkirchen",
        "Klöch",
        "Gnas",
        "Graz",
        "Kaltenbach",
        "Ernstbrunn",
        "Wien",
        "Kainbach bei Graz",
        "München",
        "Höbersdorf",
        "Steinhaus am Semmering",
        "Berndorf",
        "Linz",
        "Volders",
        "Thalgau",
        "Zistersdorf",
        "Timalkam",
        "Vils",
        "Salzburg",
        "Gänserndorf",
        "Wölbling",
        "Altach",
        "Mürzzuschlag",
        "Oberweis",
        "Schlüsslberg",
        "Graz",
        "Oberschwölz",
        "Gänserndorf",
        "Traiskirchen",
        "Ybbs",
        "Irdning-Donnersbachtal",
        "Fischamend",
        "Hausmening",
        "Obernber/Inn",
        "Wien",
        "Knittelfeld",
        "Lochau",
        "Wolfsberg (St.Stefan)",
        "Wien",
        "Wien",
        "Pichl",
        "Rum",
        "Murek",
        "Gramastetten",
        "St. Stefan im Rosental",
        "Rohrbach bei Mattersburg",
        "St. Gertraud",
        "Scheifling",
        "Langenlois",
        "Schwechat",
        "Gratkorn",
        "Steinhaus",
        "Fladnitz an der Teichalm",
        "Brunn am Gebirge",
        "Vösendorf",
        "Ottnang",
        "Obervellach",
        "Schwoich",
        "Oberndorf an der Melk",
        "Kirchdorf",
        "Brezice",
        "Bruck an der Mur",
        "Deutschlandsberg",
        "Fladnitz/Teichalm",
        "Kainbach bei Graz",
        "Felixdorf",
        "Wien",
        "St. Johann",
        "Schlins",
        "Wien",
        "Gleisdorf",
        "Pöttelsdorf",
        "Wien",
        "Eisenstadt",
        "Freistadt",
        "Wien",
        "Stetten bei Korneuburg",
        "Ried im Innkreis",
        "Waldzell",
        "Wagrein",
        "Wien",
        "Timelkam",
        "Kaltenleutgeben",
        "Kremsmünster",
        "Kanzian",
        "Innsbruck",
        "Steyr",
        "Salzburg",
        "Wien",
        "Wien",
        "Lübeck",
        "Gersdorf an der Feistritz",
        "Weiler",
        "Waidhofen an der Ybbs",
        "Waidhofen an der Ybbs",
        "Ennsdorf",
        "Perg",
        "Ternitz",
        "Mehrnbach",
        "Altenmarkt",
        "Klosterneuburg",
        "Tarsdorf-Ostermiething",
        "St. Georgen im Attergau",
        "Kapfenberg",
        "Loibersbach",
        "Knittelfeld",
        "Guntersdorf",
        "Wien",
        "Taufkirchen/Pram",
        "Wien",
        "Kramsach",
        "Wien",
        "Wien",
        "Groß Enzersdorf",
        "Neusiedl",
        "Elsbethen",
        "Winden am See",
        "Schwertberg",
        "Innsbruck",
        "Reichenau",
        "Pischelsdorf",
        "Apace",
        "Koppl",
        "Ruprechtshofen",
        "Tumeltsham",
        "Strasswalchen",
        "Kitzbühel",
        "Radstadt",
        "Wien",
        "Timelkam",
        "Westendorf",
        "Fischamend",
        "Lungötz",
        "Wolfsberg",
        "Ternitz",
        "Wien",
        "Dobersberg",
        "Redlham",
        "Wien",
        "Koper",
        "Mäder",
        "Zistersdorf",
        "St. Valentin",
        "St Veit an der Glan",
        "Guntramsdorf",
        "Wolfsberg",
        "Weppersdorf",
        "Wien",
        "Seeboden",
        "Sankt Margarethen an der Raab",
        "Viehhofen",
        "Salzburg",
        "Bruck a.d. Großglocknerstraße",
        "Telfs",
        "Riedau",
        "Waidring",
        "Steinach",
        "Schwendt",
        "Eberau",
        "Nussdorf-Debant",
        "Lilienfeld",
        "Neusiedl am See",
        "Traboch",
        "Eisenstadt",
        "Tulln",
        "Fontanella",
        "Kainbach bei Graz",
        "Burgau",
        "Parndorf",
        "Guntramsdorf",
        "Linz",
        "Mautern",
        "St. Marein im Mürztal",
        "Gnas",
        "Lichtenau im Waldviertel",
        "Klagenfurt",
        "Perchtoldsdorf",
        "Ziersdorf",
        "Lustenau",
        "Korneuburg",
        "Höchst",
        "Strass im Zillertal",
        "Trumau",
        "Wien",
        "Wien",
        "Linz",
        "Wien",
        "St.Johann in Tirol",
        "Wien",
        "Sommerein",
        "Wien",
        "Salzburg",
        "Fladnitz an der Teichalm",
        "Saalfelden",
        "Wien",
        "St. Andrä",
        "Lienz",
        "Villach",
        "Riedau",
        "Sipbachzell",
        "Thörl",
        "Stallehr",
        "Graz",
        "Zeiselmauer",
        "Zirl",
        "Traisen",
        "Weitra",
        "Neunkirchen",
        "Braunau am Inn",
        "Leonding",
        "Klagenfurt",
        "Dornbirn",
        "Villach",
        "Hofkirchen",
        "Angerberg",
        "Wien",
        "Wiener Neustadt",
        "Krieglach",
        "Bischofstetten",
        "Ilz",
        "Mondsee",
        "Graz",
        "Bad Mitterndorf",
        "Mödling",
        "Mondsee",
        "Sibratsgfäll",
        "Spielfeld",
        "Villach",
        "Annaberg",
        "Ried im Traunkreis",
        "Althofen",
        "Linz",
        "Linz",
        "Völkermarkt",
        "Wels",
        "Lamprechtshausen",
        "Wien",
        "Neidling",
        "Mondsee",
        "Wieselburg",
        "Zeiselmauer",
        "Altach",
        "Fußach",
        "Hohenems",
        "Neustift im Stubaital",
        "Graz",
        "Graz",
        "Rosenbach",
        "Graz",
        "Hall",
        "Laa / Thaya",
        "Friesach",
        "Elixhausen",
        "Arbing",
        "Strengberg",
        "St. Veit an der Glan",
        "Höbenbach",
        "Dunkelsteinerwald",
        "Wien",
        "Flachau",
        "Ebenfurth",
        "Haag",
        "Wien",
        "Freistadt",
        "Kirchberg in Tirol",
        "Langenwang",
        "Schoppernau",
        "Alkoven",
        "St. Oswald bei Freistadt",
        "Wien",
        "Groß Sierning",
        "Unken",
        "St. Pölten",
        "Straßwalchen",
        "Wien",
        "Leobersdorf",
        "Empersdorf",
        "Münzkirchen",
        "Pfaffenhofen",
        "Loidesthal",
        "Wilhelmsburg a.d. Traisen",
        "Bad Leonfelden",
        "Wien",
        "Glanegg",
        "Steyr",
        "Wien",
        "Leonding",
        "Pögstall",
        "St. Pölten",
        "Bad Hofgastein",
        "Fresach",
        "Pitten",
        "Maria Enzersdorf",
        "Hörsching",
        "Mariahof",
        "Bad Gastein",
        "Bischofshofen",
        "Mondsee",
        "Klagenfurt",
        "St. Veit",
        "Kühnsdorf",
        "Wolfsberg",
        "Neusiedl",
        "Bad Zell",
        "Schwechat",
        "Vorchdorf",
        "Prottes",
        "Villach",
        "Klagenfurt",
        "Pfarrwerfen",
        "Imst",
        "Ebenthal",
        "Hörbranz",
        "Wien",
        "Kufstein",
        "Sollenau",
        "Weng im Innkreis",
        "Rosegg",
        "Fohnsdorf",
        "Wien",
        "Koblach",
        "Ellmau",
        "Deutschlandsberg",
        "Neumarkt am Wallersee",
        "St. Veit an der Glan",
        "Dietmanns",
        "Wien",
        "Graz-Liebenau",
        "Steyr",
        "Graz",
        "Ennsdorf",
        "Saalfelden",
        "Birkfeld",
        "Saalfelden",
        "St. Andrä",
        "Wien",
        "Wien",
        "Ebbs",
        "Wien",
        "Pöggstall",
        "Waidhofen/Thaya",
        "Pölfing-Brunn",
        "Spittal an der Donau",
        "Regau",
        "Buch in Tirol",
        "Gaaden",
        "Sonnberg",
        "Treibach-Althofen",
        "Retz",
        "Wien",
        "St. Martin",
        "Feldbach",
        "Hartberg",
        "Liezen",
        "Mariazell",
        "Mürzzuschlag",
        "Neumarkt",
        "Radkersburg",
        "Schladming",
        "Zeltweg",
        "Obergänserndorf",
        "Oberweis",
        "Rohrbach / Lafnitz",
        "Wien",
        "Neusiedl am See",
        "Langeck",
        "Deutsch Brodersdorf",
        "Ohlsdorf",
        "Deutsch-Wagram",
        "Niklasdorf",
        "Leoben",
        "Spital an der Drau",
        "Schwarzau am Steinfeld",
        "Großrußbach",
        "Sattledt",
        "Bürs",
        "Wien",
        "Höf-Präbach",
        "Itter",
        "Wels",
        "Weiz",
        "Ruprechtshofen",
        "St. Peter",
        "Linz",
        "Wien",
        "Schwechat",
        "Breitenfurt",
        "Fahrafeld",
        "Kössen",
        "Selzthal",
        "Eisenstadt",
        "Wien",
        "Wien",
        "Graz",
        "St. Nikolai ob Draßling",
        "Oftering",
        "Ried im Innkereis",
        "Traun",
        "Schleedorf",
        "St. Nikolai i.S.",
        "Güssing",
        "St. Valentin",
        "Stockerau",
        "Pfaffstätten",
        "Bergheim",
        "Klagenfurt",
        "Kufstein",
        "Schärding",
        "Walkersdorf",
        "Lannach",
        "Unterwart",
        "Ilz",
        "Mitterdorf an der Raab",
        "Kindberg",
        "St. Valentin",
        "St. Gerold",
        "Wien",
        "Wien",
        "Salzburg",
        "St. Marien",
        "St. Andrä",
        "St.Michael/Lungau",
        "Volders",
        "Wien",
        "Klagenfurt",
        "St.Veit/Glan",
        "Leibnitz",
        "2700 Wr.Neustadt",
        "Wien",
        "Limberg-Maissau",
        "Gerasdorf",
        "Wiener Neustadt",
        "Vösendorf",
        "Hagenbrunn",
        "Fritzens",
        "Telfs",
        "Lochen",
        "Lienz",
        "Traismauer",
        "Döbriach",
        "Villach",
        "Brunn am Gebirge",
        "Ettendorf",
        "Hagenbrunn",
        "Vasoldsberg",
        "Zirl",
        "Mattersburg",
        "Lassee",
        "Wien"

        );
    AtomicInteger index = new AtomicInteger();
    AtomicInteger i = new AtomicInteger();
    custs.forEach(s-> {
      i.getAndIncrement();
      if (i.get()>=0 && i.get() <=500){
        String declareSQL = "DECLARE @user_setting int\n" + "DECLARE @user_id int\n" + "DECLARE @admin_group_id int\n"
            + "DECLARE @hella_gutmann_collection int\n"
            + "SET @hella_gutmann_collection = (select ID from ORGANISATION_COLLECTION where SHORTNAME = 'hgs-at')\n"
            + "DECLARE @hella_gutmann_org int\n"
            + "SET @hella_gutmann_org = (select ID from ORGANISATION where SHORTNAME = 'hgs-at')\n"
            + "DECLARE @org_type int\n" + "SET @org_type = (select ID from ORGANISATION_TYPE where NAME = 'CUSTOMER')\n"
            + "DECLARE @admin_role int\n" + "SET @admin_role = (select ID from ESHOP_ROLE where NAME = 'USER_ADMIN')\n"
            + "DECLARE @normal_role int\n"
            + "SET @normal_role = (select ID from ESHOP_ROLE where NAME  = 'NORMAL_USER')\n"
            + "DECLARE @cust_setting int\n" + "DECLARE @org_id int\n" + "DECLARE @address_id int\n"
            + "DECLARE @normal_group_id int";
        //System.out.println(declareSQL);
        System.out.println("-------" + "customer " + s + "---------");

        String deleteSQL = "DELETE FROM GROUP_USER WHERE USER_ID IN (select ID FROM ESHOP_USER WHERE FIRST_NAME = '99000118');\n"
            + "DELETE FROM GROUP_USER WHERE GROUP_ID IN (SELECT ID FROM ESHOP_GROUP\n"
            + "WHERE NAME ='CUSTOMER_99000118_USER_ADMIN');\n"
            + "DELETE FROM ESHOP_USER WHERE  FIRST_NAME = '99000118';\n"
            + "DELETE FROM ESHOP_USER WHERE USERNAME = 'Agent-99000118';\n"
            + "DELETE FROM ORGANISATION_ADDRESS WHERE ORGANISATION_ID IN (SELECT ID FROM ORGANISATION WHERE ORG_CODE = '99000118');\n"
            + "DELETE FROM GROUP_ROLE WHERE GROUP_ID IN (SELECT id from ESHOP_GROUP where name ='CUSTOMER_99000118_USER_ADMIN');\n"
            + "DELETE FROM ORGANISATION_GROUP WHERE GROUP_ID IN (SELECT id from ESHOP_GROUP where name ='CUSTOMER_99000118_USER_ADMIN');\n"
            + "DELETE FROM COLLECTION_RELATION WHERE ORGANISATION_ID IN (SELECT ID FROM ORGANISATION WHERE ORG_CODE = '99000118');\n"
            + "DELETE FROM ORGANISATION WHERE ORG_CODE = '99000118';";
        System.out.println(deleteSQL.replace("99000118", s));
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

        System.out.println(sb.toString());
        String address1 =
            "INSERT INTO ADDRESS\n" + "(LINE1, LINE2, LINE3, COUNTRYISO, STATE, CITY, ZIPCODE, ADDRESS_TYPE_ID)\n"
                + "VALUES(N'";
        String address2 = "', NULL, NULL, N'', NULL, N'";
        String address3 = "', N'";
        String address4 = "', 1);\n SET @address_id = @@IDENTITY;\n";
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
                + "VALUES(@admin_group_id, @org_id); \n END \n";
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
        eshopUser.append(userEs1).append(s).append(userEs2).append(s).append(userEs3.replace("noReply@sag-austria.at",email.get(index.get()))).append(s).append(userEs4);
        System.out.println(eshopUser.toString());

        String ad1 = "SET @admin_group_id = (SELECT ID FROM ESHOP_GROUP\n" + "WHERE NAME ='CUSTOMER_";
        String ad2 = "_USER_ADMIN');\n" + "INSERT INTO GROUP_USER\n" + "(GROUP_ID, USER_ID)\n"
            + "VALUES(@admin_group_id, @user_id);\n END";
        StringBuilder adminGr = new StringBuilder();
        adminGr.append(ad1).append(s).append(ad2);
        System.out.println(adminGr.toString());

        /*String user1 = "IF (SELECT COUNT(ID)  from V_ACTIVE_USER WHERE USERNAME = N'";
        String user2 = "' AND AFFILIATE='Hella-Austria') = 0 \n" + "BEGIN\n" + "INSERT INTO USER_SETTINGS\n"
            + "(ALLOCATION_ID, PAYMENT_METHOD, DELIVERY_ID, COLLECTIVE_DELIVERY_ID, NET_PRICE_VIEW, NET_PRICE_CONFIRM, VIEW_BILLING, ADDRESS_ID, USE_DEFAULT_SETTING, EMAIL_NOTIFICATION_ORDER, BILLING_ADDRESS_ID, DELIVERY_ADDRESS_ID,  INVOICE_TYPE, SHOW_DISCOUNT, SHOW_HAPPY_POINTS, ACCEPT_HAPPY_POINT_TERM, SALE_ON_BEHALF_OF, SHOW_RECOMMENDED_RETAIL_PRICE, CURRENT_STATE_NET_PRICE_VIEW, CLASSIC_CATEGORY_VIEW, SINGLE_SELECT_MODE)VALUES(1, 2, 2, 1, 1, 1, 0, 0, 1, 0, N'1', N'1', 2, 0, 0, 0, 1, 0, 1, 0, 0);\n"
            + "SET @user_setting = @@IDENTITY;";
        StringBuilder userSetting = new StringBuilder();
        userSetting.append(user1).append(s).append(user2);
        System.out.println(userSetting.toString());*/

        /*String eshop1 = "INSERT INTO ESHOP_USER\n"
            + "(SALUTATION, FIRST_NAME, LAST_NAME, EMAIL, USERNAME, PHONE, [LANGUAGE], [TYPE], HOURLY_RATE, EMAIL_CONFIRMATION, NEWSLETTER, SETTING, VAT_CONFIRM, SIGN_IN_DATE, FAX, ORIGINAL_USER_ID)\n"
            + "VALUES(9, N'";
        String eshopSpace = "', N'";
        String eshop2 = "', null, 1, NULL, 0, 0, 0, @user_setting, 1, NULL, NULL, NULL);\n SET @user_id = @@IDENTITY \n";
        StringBuilder eshopUserAdmin = new StringBuilder();
        eshopUserAdmin.append(eshop1).append(s).append(eshopSpace).append(orgName.get(index.get()).replace(QUOTE, DOUBLE_QUOTE)).append(eshopSpace).append(email.get(index.get()))
            .append(eshopSpace).append("cust-" + s).append(eshop2);
        System.out.println(eshopUserAdmin.toString());

        String groupUser1 = "SET @admin_group_id = (SELECT ID FROM ESHOP_GROUP\n" + "WHERE NAME='CUSTOMER_";
        String groupUser2 = "_USER_ADMIN');\n" + "\n" + "INSERT INTO GROUP_USER\n" + "(GROUP_ID, USER_ID)\n"
            + "VALUES(@admin_group_id, @user_id);\n" + "END;";
        StringBuilder grUser = new StringBuilder();
        grUser.append(groupUser1).append(s).append(groupUser2);
        System.out.println(grUser.toString());*/
        index.getAndIncrement();
      }
    });
  }
}
