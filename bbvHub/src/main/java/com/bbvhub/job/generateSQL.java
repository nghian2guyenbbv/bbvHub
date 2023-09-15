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
    // org name
    List<String> orgName = Arrays.asList("Auto Meisinger Filiale Dornbirn"
        ,"Gerhard Schieler KFZ - Service - Reparatur"
        ,"Marco Hochwimmer "
        ,"Lindner GmbH "
        ,"KFZ-Handel-Service Georg Sarközi"
        ,"Auto Nett Riedau GmbH KFZ Technik & Handel"
        ,"Kiss Autolack GmbH Karosserie & Technik"
        ,"Denzel Klagenfurt Südring GmbH "
        ,"EY KFZ TEC & Reifen Zweitausend GmbH"
        ,"Hakan Cem Türk "
        ,"D & C Cars GmbH "
        ,"CAR-TECH KFZ Meisterbetrieb GmbH"
        ,"KFZ-Technik Vieriu Cornelius "
        ,"Dunhofer GmbH Karosserie Autolackierung"
        ,"Auto Schneider "
        ,"Vehikel Verein zur Förderung"
        ,"Eugen Schildberger KFZ Reparatur"
        ,"Rubin e.U. "
        ,"Andreas Valentini KFZ- Techniker Meister"
        ,"AutoWerkstatt 11 Kilicaslan GmbH Emran Kilicaslan"
        ,"Georg Wilhelm Hennigs Schurl´s Garage"
        ,"Autohaus Pribasnig Inh. Günther Rogatschnig"
        ,"Wallner Hochdrucktechnik Industrie Reinigungs GesmbH"
        ,"KFZ APOPEI Apopei Adrian"
        ,"EK Carsalon e.U. Kacir Emre"
        ,"Hofmann Anton Autowerkstatt"
        ,"Ludek Szabo Kfz-Einzelhandel"
        ,"Jürgen Rosenberger KFZ Handel"
        ,"Bernhard Knabl "
        ,"Karosserie&Lackiertechnik David Matzhold"
        ,"KFZ Auto Service Gulyas Zsolt"
        ,"W.Messer KFZ-Werkstätte Ges.m.b.H."
        ,"georgmech KFZ-Meisterbetrieb Inh. Georg Spatz"
        ,"KFZ Jürgen Heil e. U. Meisterwerkstätte"
        ,"Herlbauer Alfred KFZ-Service"
        ,"STS-Schlegl "
        ,"Lindsberger KFZ "
        ,"Hubert Maggale "
        ,"Ladenberger e.U. "
        ,"Niederndorfer Kieswerke- Transportbeton GmbH"
        ,"Karl Kressnig KFZ"
        ,"Alex Autoservice Alexander Thaler"
        ,"Niederklapfer GmbH Kfz Meisterbetrieb"
        ,"LTS Auto Service GmbH "
        ,"Tamer Karadas KFZ Service & Handel"
        ,"Stefan Friedler Gutmann-Aussendienst"
        ,"Josef Seiwald Gutmann-Aussendienst"
        ,"EGERT CARSERVICE Daniel Egert"
        ,"Falle GmbH Freizeit-Sport-Campingwelt"
        ,"Strasser KFZ-Service GmbH "
        ,"Lepuch & Perko GmbH "
        ,"Andreas Bögner KFZ-Meisterbetrieb"
        ,"KFZ Amir Inh. Hr.CRNKIC Amir"
        ,"EP-Carstyling Harald Gruber"
        ,"Autohaus Josef Mersche "
        ,"WEISWO Automobilwerkstatt OG "
        ,"Michael Weber "
        ,"POPP Reinhard Karl Die Meisterwerkstatt"
        ,"Autoservice Wien GmbH Lagermax"
        ,"Jürgen Höfler KFZ-Technik"
        ,"A&U KFZ Technik GmbH Andreas Wagrandl"
        ,"KFZ-Meister Betrieb GIMPL Anton"
        ,"Taxi Förg e.U. Förg Walter Christoph jun."
        ,"Heinrich Dreiblmeier KFZ-HeiDrei"
        ,"HD Car KG Kfz- u. Karosseriebautechnik"
        ,"Denzel - Unterberger GmbH & Co KG Autowelt Unterberger Telfs"
        ,"KTM Flagshipstore WIESING - KINI -"
        ,"Johann Pointner "
        ,"Christian Seidl GmbH Karosseriebau und Lackierung"
        ,"ARBÖ Bundesorganisation "
        ,"TB Wrap Performance Thomas Berger"
        ,"Kfz-Name Alakara Ufuk"
        ,"Bauer GmbH "
        ,"Rottner Ing. Rudolf "
        ,"Magna Powertrain Engineering Center Steyr GmbH & Co KG"
        ,"Thomas Drabits Kfz - Werkstätte"
        ,"Unterberger Automobile GmbH & Co KG "
        ,"Aleksandar Spasojevic "
        ,"Franz Faist Autohandel Service u. Reifen"
        ,"Michael Feichtinger "
        ,"Hazet Bauunternehmung GmbH "
        ,"MiGa Fahrzeugtechnik Michael Gampfer"
        ,"Kurvenwetzer Leoben Oliver Markus Winterer"
        ,"H. Wolf GmbH "
        ,"Robert Döberl Tankstelle"
        ,"Bojan Jankovic "
        ,"CS Autohaus Baden GmbH "
        ,"Manfred Nierer "
        ,"Gerald Josef Absenger Mobile Servicestation"
        ,"Fraiß OG Patrik Fraiß"
        ,"T.I.N. Reifenhaus GmbH "
        ,"Arandca GmbH Inh. Ayman Hammoud"
        ,"KFZ Leymüller Felix Leymüller"
        ,"Franz Rieder "
        ,"Markus Hubmaier KFZ-Service"
        ,"Christian Böck "
        ,"KFZ Patrick Hofer GmbH "
        ,"Maillet Günter KFZ Meisterbetrieb"
        ,"Mani's Boxenstopp e.U. "
        ,"Martin Wölfleder GmbH "
        ,"Autohaus Pramer e.U. Inh. Karl Pramer"
        ,"Christian Lippert KFZ Tuning Lippert"
        ,"Hubert Lechner "
        ,"Lingl Gesellschat m.b.H. Autohaus"
        ,"KFZ Lobnig GmbH "
        ,"Christian Steinwender KFZ Steinwender"
        ,"Stefanac Darko e.U. "
        ,"KFZ-Diebetsberger GmbH Ing. Markus Diebetsberger"
        ,"Auto Predi Freie Werkstatt GmbH "
        ,"H. Wolf GmbH "
        ,"KFZ-Technik Rossmann OG "
        ,"PEICHER US-Cars GmbH "
        ,"Edwin Bosch KFZ Werkstätte"
        ,"Grill KG Kfz Werkstatt"
        ,"Alfred Gersthofer Freds Bikeshop"
        ,"Carglass Novo Mesto Avtosteklo d.o.o."
        ,"Carglass Ptuj, Avtosteklo d.o.o. "
        ,"Adi's KFZ-Elektrik & Technik "
        ,"Regina Otschonsek Kugelkopf Anhängerkupplungen"
        ,"Automobile Gföhler GmbH "
        ,"AV Mechatronik "
        ,"KFZ Thaler GmbH "
        ,"KFZ Zink "
        ,"Franz Spörk "
        ,"Richard Schulz "
        ,"Bert's Carage GmbH Robert Buchschartner"
        ,"Resch Kfz Service & Reparatur Inh. Thomas Resch"
        ,"Green County Motorcycles GmbH "
        ,"Kfz Kopper Service-Reparatur-Aufbereitung"
        ,"KING OF CARS GmbH "
        ,"KFZ-Meisterbetrieb Artner "
        ,"Glaeser Florian Michael KFZ-Fachbetrieb"
        ,"Carpaint Lackschadenreparatur GmbH Mathias Kremser"
        ,"Florian Waschulin "
        ,"20ers-Werkstatt GmbH "
        ,"Hasan Burzic KFZ Service Burza"
        ,"Fatih Can e.U "
        ,"Auto Kucher GmbH "
        ,"Kfz Krisper GmbH "
        ,"Viehhauser Kfz GmbH & Co KG "
        ,"Bernhard Walzer GmbH "
        ,"ARBÖ "
        ,"Mandler GmbH "
        ,"Autohaus Huber Inh. Peter Konrad"
        ,"KFZ-Kafender GmbH "
        ,"ZATEC Automotive "
        ,"Autohaus Hösch GmbH "
        ,"KFZ Hollweger Josef "
        ,"Rauch Mario "
        ,"Zemsauer e.U. "
        ,"Sert Airtrans Partner KG "
        ,"H.M.A. GmbH "
        ,"Profi Reifen und Autoservice 3056 FB Gröbming"
        ,"DI A. Winkler & Co Baugesellschaft m.b.H."
        ,"Kfz Technik Flachs Ing. Reinhard Flachs"
        ,"Sahin Auto Spengler GmbH Sahin Ibrahim Halil"
        ,"PICHLER & PARTNER Auto GmbH "
        ,"Flori GmbH "
        ,"M.P.J. Automobile GmbH Ismet Junuzovic"
        ,"Fahrzeugtechnik & Karosserie Georg Schauer"
        ,"Al-Bahloul Kfz Handel "
        ,"Autolackbox GmbH Monika Haldenwang"
        ,"M&N Mietwagen KG Ion Mihaescu"
        ,"Leitner Fladnitz GmbH "
        ,"Lentner Hermann "
        ,"ÖAMTC - Salzburg Nord "
        ,"STIX Handels Ges.m.b.H. "
        ,"FENZ GmbH "
        ,"Ilhan Polat KFZ Meisterbetrieb"
        ,"Wilfried Fleischmann e. U. Reifen - Autoteile"
        ,"Hasenöhrl GmbH "
        ,"Hochstaffl Florian "
        ,"Oldtaliener "
        ,"Ostermann Bernhard "
        ,"gm best motors KG "
        ,"FINO KFZ Meisterwerkstatt "
        ,"GP-Performance Gerhard Paar"
        ,"Dlouhy GmbH "
        ,"KFZ Service Roland Gruber "
        ,"Promberger Autoreparatur GmbH "
        ,"Autohaus Ostermann GmbH "
        ,"KFZ Breiner GmbH "
        ,"KFZ-Neisser Inh. Michael Neisser"
        ,"KFZ Technik Kobald Philip Kobald"
        ,"KFZ Stockcar Service und Reparatur Gregor Stocker"
        ,"Kinninger Karosserie GmbH "
        ,"AZ Logistik GmbH "
        ,"Erwin Griesbacher "
        ,"Autohaus Narowetz GmbH "
        ,"Landespolizeidirektion Vorarlberg "
        ,"Markus Zeintl "
        ,"Siegfried Schernthaner "
        ,"Yachtmobile 2000 - Reisemobile e.U. Inh. Rudlstorfer Mario"
        ,"WCP Willy´s Cars & Parts Inh. Wilhelm Bauer"
        ,"Fahrzeugtechnik Steger "
        ,"Schönleitner Roland KFZ Elektrik"
        ,"Dumitru Iuncu Kfz-Service"
        ,"Lang e.U. Inhaber Markus Lang"
        ,"SB Tankstelle Thomas Knerzl "
        ,"Autohaus Patterer GmbH drive Patterer"
        ,"Temper Classic Inh. Daniel Temper"
        ,"Gerhard Konrad KFZ-Technik"
        ,"Tam Motors GmbH "
        ,"Car Repair Fuchs Michael Fuchs"
        ,"Auto Eck Jegiasarjan Suren"
        ,"Ponez GmbH "
        ,"A.K.A Trans- und KFZ GmbH "
        ,"Kamil Yalcnkaya e.U. "
        ,"Alexander Jasek KFZ Jasek"
        ,"Stefan Ströbitzer Gutmann-Innendienst"
        ,"AUTOKLINIK LCV KG "
        ,"easygoinc. GmbH Albin Zöchmann"
        ,"Autopark GmbH "
        ,"Johann Nagl "
        ,"TH KFZ Service KG "
        ,"Matthias Friesenecker "
        ,"Perger Martin Kfz-Reparaturwerkstätte"
        ,"Lucky-Car Autoservice GmbH "
        ,"SD-Baron GmbH "
        ,"Raiffeisen Lagerhaus Weinviertel Ost eGen"
        ,"Arno Kurz KFZ & Ersatzteilhandel"
        ,"Transporte Medl GmbH "
        ,"HAI automobile GmbH Rijad Omerovic"
        ,"FLORA Blumengroßhandel GmbH & Co KG"
        ,"Wilfried Gehrer "
        ,"KFZ Czeitschner GmbH "
        ,"Matthias Brunner KFZ Service u. Handel"
        ,"ETS Egger GmbH "
        ,"R&H Automobile GmbH Kfz-Technik"
        ,"Christian Berndl "
        ,"CARDOC e.U. Jürgen Schmidt"
        ,"KFZ Meisterbetrieb Göstl "
        ,"Hermann Wirleitner "
        ,"P.R.T. Kfz Meisterwerkstatt "
        ,"Auto Zukrem Memedoski "
        ,"Waldland Holding GmbH "
        ,"Mähr Bau GmbH "
        ,"Günter Peter Aigner Autohandel Aigner"
        ,"DS Cars GmbH "
        ,"Meta Car GmbH DriveSolutions"
        ,"car.acho GmbH "
        ,"KFZ Motorex Fatmir Maksuti"
        ,"B und B Fahrzeugglas OG "
        ,"Gmeiner GesmbH Skoda Autohaus"
        ,"BAL KFZ-Meisterbetrieb e.U. "
        ,"Franz Rene Galler KFZ Galler"
        ,"Landesberufssschule 1 "
        ,"A.S. Cars Kfz-Reparatur u. Karosseriebau e.U. / Adnan Skopljak"
        ,"BULUT KFZ Fastservice GmbH"
        ,"Thomas Sermonet Kfz-Technik"
        ,"KFZ- Auer Josef "
        ,"A-Z Lackprofis OG "
        ,"Kauer GmbH Helmut Hadl"
        ,"KFZ- JAIK Rainer Eberhartinger"
        ,"Profi Max "
        ,"Ing. Hans Bodner Bau GmbH & Co KG "
        ,"KFZ Binder "
        ,"Wieser Mario KFZ-Technik"
        ,"DEINE WERKSTATT Autoservice OG "
        ,"ÖAMTC - Wien Wien West"
        ,"Autohaus Erich Horvath GmbH "
        ,"DMW e.U. DieMeisterWerkstatt.at"
        ,"ARBÖ NÖ Handels- und Service GmbH"
        ,"PM Automobile GmbH "
        ,"Ing. Fränkel & Kirchner "
        ,"Attila Atel "
        ,"Klabacher GmbH & Co KG Transporte-Brennstoffe KFZ-Technik"
        ,"Autohaus Erich Horvath GmbH "
        ,"Rexeisen Claus Peter Allrad - Rexeisen"
        ,"KFZ Christian Winter "
        ,"Hitthaller + Trixl Baugesellschaft m.b.H."
        ,"Raswan Mancin "
        ,"ContiTrade Austria GmbH "
        ,"KFZ-Handel Grasser Doris "
        ,"KFZ-STA Steinbacher Andreas"
        ,"Robert Strobl "
        ,"Autowelt GmbH Reibersdorfer"
        ,"OCV e.U., Oldtimer Center Vienna Thomas Rab"
        ,"Patrik Fink e.U. AutoParkFink"
        ,"BSB Baustahlverlegung GmbH "
        ,"Motus Autocenter GmbH "
        ,"S-TECService Technologies GmbH & Co OG"
        ,"Auto Reiss GmbH & Co KG "
        ,"Auto Karlinger Ges.m.b.H. "
        ,"Autopark Braunau Inh. Adem Ucan"
        ,"KFZ-Technik Rammelmüller "
        ,"Auto Hangar KFZ- Werkstätte u. Autohandel KG"
        ,"Auto Edelsbrunner GmbH Kfz-Handel u. Reparaturwerkstätte"
        ,"Mühlböck Markus Kfz-Technik"
        ,"Markus Desch "
        ,"Lorenz Cars e.U. "
        ,"Autohaus Sedin GmbH "
        ,"KFZ Moser "
        ,"Autohaus Mairitsch "
        ,"Asat Nabizada "
        ,"KFZ- Kness Inh. Patrick Armin Kness"
        ,"Mick Teyrierl "
        ,"Marco Kober "
        ,"Servicestation Hafner "
        ,"Schipany Walter Automobil"
        ,"SHARAF Omar "
        ,"Mario Lercher "
        ,"KFZ Meisterbetrieb A-Team Adis Brkic"
        ,"Ali KFZ Gmbh "
        ,"Kneisz Paul GmbH "
        ,"Jörn Langreiter KFZ Technik"
        ,"Cindi Autoglas KG "
        ,"KFZ Möser Jürgen Möser"
        ,"Felix Gollackner "
        ,"Trummer Manfred "
        ,"Blüml Hermann Kfz Technik"
        ,"LEO MOTORS GmbH Inh. AYDIN Levent"
        ,"Autokauf Tirol GmbH GF Mst. Hassler Reinhold"
        ,"Robinig Kfz-Technik GmbH "
        ,"ARBÖ Prüfzentrum Telfs "
        ,"ARBÖ Landesorganisation Steiermark "
        ,"Pala Ceyhan OG "
        ,"Pala Ceyhan OG "
        ,"Maly Philipp "
        ,"Haider - Steiniger GmbH "
        ,"Auto Rieser e.U. "
        ,"Karl Schmidhuber GmbH & Co KG "
        ,"Autozentrum Glavas e.U. "
        ,"Rostklinik Inh. Michael Kramarz"
        ,"Viennamobil Kfz Technik GmbH "
        ,"Auto Holleis e.U. Hubert Holleis"
        ,"Manuel Furtlehner "
        ,"Köb GmbH Bosch Car Service"
        ,"KFZ Upgrade e.U. Gökhan Cihan"
        ,"Hannes Mayer Kfz GmbH "
        ,"Saritas Serife EL Lazo der Transporter"
        ,"Yalcin Ethem Yalman "
        ,"Reinhard Bernhofer Auto Bernhofer"
        ,"AUTOHAUS FRITZ Inh. Manfred Fritz"
        ,"KFZ- Woldrich Inh. Gerald Woldrich"
        ,"KFZ-Technik Martin Walcher "
        ,"CarShop Kniewasser GmbH "
        ,"Markus Wankhammer "
        ,"Franz Weberschläger "
        ,"Adamiak Dirk Berthold Blutonium Cars"
        ,"Autohaus Ing. Gernot Praßl "
        ,"W. H. Trummer GesmbH & Co KG "
        ,"Spes Kraftfahrzeugtechnik GmbH "
        ,"Fiechtl Armin KFZ-Technik"
        ,"Eifinger Christoph "
        ,"Kofi´s Car Art "
        ,"KFZ Hödl GmbH "
        ,"MAN Truck & Bus SE Geschäftseinheit L"
        ,"HF Autowerk e.U. Fersat Herdem"
        ,"ARGE Tunnel Fröschnitzgraben Implenia-Swietelsky Tunnelbau"
        ,"Autohaus Gehmayer KG "
        ,"ARBÖ Landesorganisation Oberösterreich"
        ,"MOS Fahrzeugtechnik OG "
        ,"Pichler Karosseriebau & Mechanik Ges.m.b.H"
        ,"Romana Pilwarsch GmbH "
        ,"Xhafa Perparim "
        ,"PS Mähr Inh. Paul Mähr"
        ,"Kfz Meisterbetrieb Car-Tech OG "
        ,"Kremsmüller Industrieanlagenbau KG OMV Gelände"
        ,"Jafar Jahangarnia "
        ,"AS Automobile Alexander Subotic"
        ,"KFZ Verli Drazen "
        ,"Christoph Huemer "
        ,"Thomas Stranzinger "
        ,"Hans Pugl Ges.m.b.H. "
        ,"Leipold Josef Kfz Service Handel"
        ,"ARBÖ "
        ,"ARBÖ Prüfzentrum "
        ,"ARBÖ-Prüfzentrum Ybbs "
        ,"Kfz Technik Gottfried Strohmeier"
        ,"DieWerkstott - Friedrich Richter "
        ,"MW Motorworkshop GmbH "
        ,"Weilguny Gerhard e.U. "
        ,"ARBÖ Landesorganisation Wien "
        ,"JK KFZ-Technik Reinhard Jud"
        ,"KFZ Bodensee Meisterbetrieb Mst. Alexander Brunnmayr"
        ,"GP-Automotive GmbH Gerhard Pietschnig"
        ,"Schmidt Premium Cars GmbH "
        ,"Auto Service Mio Inh. Gürkan Civan"
        ,"Küblbeck GmbH Technischer Großhandel"
        ,"Küblbeck GmbH Technischer Großhandel"
        ,"Autohaus Schaffer GmbH & Co KG "
        ,"Gerald Fröhlich "
        ,"KFZ Pein OG "
        ,"Tankstelle & KFZ-Service Inh. Mag. Monika FRANTA"
        ,"Moitzi Cars Moitzi Phillip"
        ,"Pichler Franz GmbH Car4Me"
        ,"AST Garage e.U. Michael Schallaun"
        ,"KFZ-Technik Hartl Inh. Herbert Hartl"
        ,"Christian Pirsch "
        ,"Kremsmüller Anlagenbau GmbH "
        ,"KFZ Eibisberger Martin "
        ,"KBM Kraemmer Bernd Motors GmbH "
        ,"Djakovic GmbH "
        ,"Autohaus Schmidt e.U. "
        ,"Markus Brunner "
        ,"Service Center Winkler Winkler David"
        ,"Weichberger Gesellschaft m.b.H. "
        ,"Christoph Prattes "
        ,"Koop trgovina d.o.o "
        ,"ÖAMTC Bruck/Mur "
        ,"ÖAMTC Deutschlandsberg "
        ,"Alexander Eibisberger "
        ,"KFZ Hödl GmbH "
        ,"Autohaus Ebner GmbH & Co. KG "
        ,"FunCar - Kfz Technik Racz & Co. GesmbH"
        ,"Johann Egger Landwirt"
        ,"Markus Manser "
        ,"BK Autoservice GmbH "
        ,"Georg Karl Kohl "
        ,"KFZ-Schuber Martin Schuber"
        ,"Theuermann Taxibetrieb GmbH"
        ,"Autohaus Ebner GmbH & Co KG "
        ,"E & S Motors GmbH "
        ,"A-S-A KFZ-Servicestation Inh. Adnan Cidic"
        ,"Motofactory - Gilbert Grabmayer "
        ,"Automobile Gadermayr GmbH Toyota Vertragswerkstatt"
        ,"Bau Mayr GmbH "
        ,"KFZ-Fachbetrieb Stefan Riepler"
        ,"KFZ-Technik Moser Brüder Moser GmbH"
        ,"B2 KFZ-Meisterbetrieb OG "
        ,"KFZ-Mario Mario Kidjemet e.U."
        ,"Rühl Bernhard "
        ,"Karosserietechnik Puschl GmbH "
        ,"Autoland Tirol GmbH "
        ,"Auto Nigl Leinweber GmbH "
        ,"Neimcke AT GmbH & Co KG "
        ,"Auto-Delta Handels- und Kfz.Reparatur Ges.m.b.H."
        ,"Hannes Burda KFZ-Werkstatt"
        ,"OEMERI FARUK KIZIL FAHRZEUGTECHNIK GENIN"
        ,"Geork Karl Kohl KFZ Auto Kohl"
        ,"Serife Saritas El Lazo der Transporter"
        ,"W.Schiebel GmbH "
        ,"Wolfgang Schiebel GmbH "
        ,"GLS Bau und Montage G.M.B.H. Bauhof"
        ,"GLS Bau und Montage G.M.B.H. "
        ,"Tat Auto Technik e.U. "
        ,"KFZ Murauer Inh. Roland Murauer"
        ,"Land- und KFZ Technik Speringer & Speringer GmbH & Co KG"
        ,"Willy Hans Schöpe "
        ,"Autohaus Steiner Lausenhammer GmbH & Co. KG"
        ,"KFZ Christian Resch "
        ,"Bölöni Ioan Servicestation u. Handel"
        ,"Schuh Mario Kfz-Technik "
        ,"Motor Junkies Reparatur & Service e.U."
        ,"Eder Günter "
        ,"Matous Servicetechnik Inh. Andreas Matous"
        ,"KFZ Jöchtl Inh. Andreas Jöchtl"
        ,"I&W Auto-Service 24 GmbH "
        ,"KFZ-Werkstatt Stubenböck GmbH "
        ,"AJ Stern Automobile GmbH "
        ,"T1 ABW Abschleppdienst GmbH "
        ,"Kurtis Werkstatt Inh. Zeilinger Isabella"
        ,"Autocenter Parndorf by Nemeth "
        ,"Gerald Fleischmann "
        ,"Zweiradklinik "
        ,"Hoedlmayr Logistics GmbH "
        ,"ARBÖ Prüfzentrum Innsbruck "
        ,"Gangl KFZ-Service Gangl Peter"
        ,"Lackiererei Ritter "
        ,"Srecko Bohnec s.p. "
        ,"Abay Hayrettin "
        ,"LGP e.U. Ing. Lukas Gruber"
        ,"Darios Autohaus e.U. Inh. Dario Stankovic"
        ,"Kfz-Max e.U. "
        ,"Johannes Pancheri KFZ-Technik & Handel"
        ,"Christian Manuel Kogler "
        ,"Autohaus Seidengasse 30 GmbH "
        ,"Arab Heshmat Ali "
        ,"KFZ-Manzl Andreas "
        ,"SFF Automotive GmbH "
        ,"Andreas Hirscher Auto- und Reifenservice"
        ,"Leitner Dietmar Josef "
        ,"ATT RS GmbH "
        ,"APR Car Service Inh. Vitali Martussin"
        ,"Miksche KEG Tobias Zuwach"
        ,"Michael u. Hermann Steinbichler GbR "
        ,"Wiener Rotes Kreuz Rettungs-, Krankentransport-,"
        ,"Grafist d.o.o. Goran Miskovic"
        ,"Autoklinik Hanci GmbH "
        ,"Alex' Autoservice Inh. Hr. Gaunersdorfer"
        ,"Salfinger KFZ-Technik GmbH "
        ,"Randy Car e.U. Inh. Andreas Rauter"
        ,"M.T.D. Power GmbH "
        ,"Sadiku Nasuf KFZ Handel"
        ,"KFZ Franschitz GmbH Kevin Franschitz"
        ,"F+M Fischer Ges.m.b.H. "
        ,"Fredls Glaserei Amir Avdic E.U "
        ,"Air Broker & Trading GmbH "
        ,"Autohaus Kreidenhuber GmbH&Co. KG "
        ,"Hausbetreuung Bauchinger value enhancing services GmbH"
        ,"Lautner & Partner GmbH & Co KG "
        ,"Liebherr-Werk Telfs GmbH "
        ,"Auto Dick GmbH "
        ,"KFZ Fuchs KG "
        ,"Auto Graber Herr Johann Graber"
        ,"TDK Performance Herr Thomas Kitzbichler"
        ,"Raiffeisen-Lagerhaus Süd-Burgenland eGen Fachwerkstätte Kulm"
        ,"Thomas Steiner "
        ,"Wachter Karl e.U. "
        ,"Thellmachts KG "
        ,"KFZ-Technik Gruber e.U. "
        ,"ARBÖ Landesorganisation Burgenland "
        ,"Landesfeuerwehrkommando NÖ "
        ,"MARTIN Thomas "
        ,"GREGOR Richard Kfz-Technik "
        ,"PM Trocknungs und Sanierungs GmbH "
        ,"ARBÖ Landesorganisation "
        ,"SB KFZ Handel e.U. Ing. Sandor BASKO"
        ,"Roland Luger "
        ,"Juravle Marian e.U. "
        ,"KFZ-Fünder Fünder Gerald"
        ,"Kaufmann Matthias Franz "
        ,"HR-Technics Hermann Rihs"
        ,"Wifi Kärnten GmbH Technikzentrum Ref. 4"
        ,"Autoservice ATO OG "
        ,"KFZ Werkstatt Feik Peter Feik"
        ,"KFZ Werkstatt Gerhard Stauber e.U. "
        ,"RWA Raiffeisen Ware Austria AG "
        ,"Georg Bilgeri Kfz "
        ,"G & L Kfz-Service GmbH Kinga Gulyas"
        ,"KFZ-Boxengasse OG "
        ,"RSZ-20 Reifen Service Zentrum KG "
        ,"Kamuran Kus e.U. Happy Car Company"
        ,"Franz Resch "
        ,"RSZ-20 Reifen Service Zentrum KG Inh. Hr. Murat Caliskan"
        ,"Auto-Sparer GmbH Inh. Herbert Sparer"
        ,"Buder Rainer KG Kfz-Technik"
        ,"Kfz-Reparatur Handel Andreas Schwarz"
        ,"Rep-Car Automobil GmbH "
        ,"Siems & Klein Autowerkstatt-Technik"
        ,"Mayer Chris Andre "
        ,"Auto Beck GmbH "
        ,"Emre Canbaz e.U. "
        ,"Karl Satz "
        ,"Fastbox Autoservice GmbH & Co KG "
        ,"V3tech Service und Handels GmbH "
        ,"Tomescu Ionica-Nicusor "
        ,"Johann Kroiss e.U. Kfz-Service u. Mietwagengewerbe"
        ,"Andreas Grasser "
        ,"Johnny's Garage Johannes Luger"
        ,"Robert Posch Spenglerei Lackiererei Autopflege"
        ,"BT Kfz-Technik und Autohandel Ges.m.b.H."
        ,"KFZ Karner "
        ,"Ali Ihsan Yildiz "
        ,"Raiffeisen-Lagerhaus Gmünd-Vitis eGen"
        ,"Robert Beta "
        ,"Stadtgemeinde Braunau am Inn Wirtschaftshof"
        ,"PM Speedlog GmbH "
        ,"KFZ Josef Schönfelder "
        ,"PS BOX Süleyman Aksoy"
        ,"Fahrzeugzentrum Olsacher "
        ,"Kfz-Standhartinger GmbH "
        ,"Sebastian Gschwentner Kfz-Technik-Gschwentner"
        ,"Dlouhy GmbH "
        ,"Autohaus Ebner GmbH & Co KG "
        ,"Collaku Dardan Autocenter Krieglach"
        ,"KFZ Renz "
        ,"HS Fahrzeugtechnik OG "
        ,"Autohaus Widlroither GmbH u. Co KG "
        ,"ASM Autoservice Mariatrost Inh. Ahmet Özer"
        ,"Autohaus Nemetz e.U. Andreas Nemetz"
        ,"A.K.A Trans und Kfz GmbH "
        ,"Cars & Bikes Mondsee Ing. Bernhard Widlroither"
        ,"Christoph Nußbaumer "
        ,"Autohaus Klingler GmbH "
        ,"Michael Mitzner "
        ,"Auto Moser "
        ,"Team RSR GmbH "
        ,"Abschleppdienst Mario Krassnitzer e.U."
        ,"Linz Linien GmbH für öffentlichen Personennahverkehr"
        ,"Linz Linien GmbH KFZ/BUS-Magazin Tor 3"
        ,"Autohaus Purkowitzer GmbH "
        ,"Rauscher Stefan "
        ,"Hinterbauer Autohaus GmbH "
        ,"Fastbox Autoservice GmbH & Co KG "
        ,"KFZ Speiser e.U. "
        ,"Hierner Johannes Kfz-Teile Handel & Service"
        ,"Öllinger GmbH & Co KG "
        ,"PSM-Automotive 81 GmbH "
        ,"Burtscher Rainer Kfz Meisterbetrieb"
        ,"In Car Rudolf Oberhofer"
        ,"AUTO DUKE - Robert Dukaric Kfz-Meisterbetrieb"
        ,"Manuel Kirchmair "
        ,"Friekos Garage "
        ,"Granit KFZ-Werkstätte GmbH "
        ,"Kfz-Markus Ahne "
        ,"Amt der Steiermärkischen Landesreg. Abt. 6 Bildung und Gesellschaft"
        ,"Huter Karl Franz "
        ,"Schlögl & Partner Autohaus GmbH "
        ,"Philipp Hartenberger Kfz-Technik Hartenberger"
        ,"Traintinger KFZ-Technik Traintinger Gottfried"
        ,"K & C Automobile "
        ,"Martin Panhofer "
        ,"Auto Nelutzu GmbH "
        ,"KFZ-Rossecker Martin Rossecker Martin"
        ,"KFZ Peter Schindele "
        ,"Autohaus Coskuner GmbH "
        ,"Buchsteiner GmbH "
        ,"Kessler Andreas "
        ,"TK Kfz Tamas Kruppa"
        ,"Wiener Netze GmbH "
        ,"Karl Feichtmayr GesmbH "
        ,"Hagleitner Bohrtechnik GmbH & Co. KG"
        ,"KFZ-Technik Kogler / Ehrnhöfer GmbH "
        ,"Auto Moosmann Inh. Adrian Moosmann"
        ,"OMG Cars e.U. Rahim Yasser Amer"
        ,"Feichtmayr Karl GesmbH "
        ,"Lucky-Car MiAk KFZ GmbH"
        ,"Erich Schinnerl KG "
        ,"Autohaus Ebser GmbH "
        ,"Fallmann Kevin "
        ,"Kornprobst GesmbH & Co KG "
        ,"Gustav Schossig "
        ,"LFT KFZ Technik GmbH "
        ,"Franz Krenn, Jun. "
        ,"Mauthner GmbH "
        ,"KFZ-Service Center Tirol Kocaoglan Abdurrahman"
        ,"Ganselmaier Gesellschaft m.b.H. "
        ,"Harald Seidl "
        ,"Altmüller Autoersatzteile Sonja Altmüller"
        ,"Timelog Trans GmbH Selman Karabacak"
        ,"Michael Haraszti KFZ"
        ,"Puchner Automobile GmbH "
        ,"OpenCarBox "
        ,"KFZ Murad KG "
        ,"Lack & Karosserie IBY Ibrahim Susif"
        ,"ÖAMTC Lehrwerkstätte "
        ,"Markus Kranabetter "
        ,"Kfz-Servicestation M.W. Oberdorfer"
        ,"Andreas Fasching e.U. "
        ,"KFZ-Petrik Meisterbetrieb Petrik Fritz"
        ,"Flughafen Linz GmbH "
        ,"ED-Handel Daniel Egger"
        ,"ARBÖ Prüfzentrum Bad Gastein "
        ,"ARBÖ Prüfzentrum Bischofshofen "
        ,"ARBÖ Prüfzentrum Mondsee "
        ,"K&D Zechner GmbH "
        ,"ARBÖ Prüfzentrum St. Veit "
        ,"ARBÖ Prüfzentrum Kühnsdorf "
        ,"ARBÖ Prüfzentrum Wolfsberg "
        ,"M.O.S. KFZ Service Mathias Schmidt"
        ,"Michael Pichler "
        ,"Sen Car GmbH "
        ,"Schausberger KFZ-Teile GmbH "
        ,"KFZ Prottes Ahmet Bayrakci"
        ,"Autohaus Wunder e.U. "
        ,"Unser Lagerhaus Warenhandelsgesellschaft m.b.H."
        ,"Autohaus Erlmoser GmbH "
        ,"ARBÖ Prüfzentrum Imst "
        ,"Stefan Hofstätter "
        ,"Autohaus Leiblachtal "
        ,"TA Carxpert KG "
        ,"Autozentrum Kufstein Zell "
        ,"KFZ Easy e.U. Serkan Aydogdu"
        ,"Auto Schröcker GmbH "
        ,"KFZ-Meisterbetrieb Daniel Prein "
        ,"KFZ-Schaffer-Lindner-Temnitz OG "
        ,"KSW Autoservice GmbH "
        ,"Car Center Koblach "
        ,"GP Mobility GmbH "
        ,"Poprask GmbH Autohaus"
        ,"Automobile Swoboda Neumarkt GmbH "
        ,"Autohandel Grutschnig "
        ,"KFZ Technik Strondl "
        ,"KFZ Technik Sezer e.U. "
        ,"Porsche Inter Auto GmbH & Co KG Porsche Liebenau"
        ,"Claudiu Lazurca "
        ,"Anes Mujkanović Ing. Anes Mujkanović"
        ,"KFZ Aigner "
        ,"Wirtschaftshof der Stadtgemeinde Saalfelden"
        ,"Gesslbauer GmbH "
        ,"Stadtgemeinde Saalfelden "
        ,"Autohaus Maier GmbH "
        ,"TU Wien Automotive Test Center GmbH "
        ,"TU Wien Automotive Test Center GmbH "
        ,"Karosserietechnik Krismer GmbH "
        ,"Manfred Oberortner "
        ,"Autohaus Schlager GmbHq "
        ,"Edi Zuwach GmbH "
        ,"Karlheinz Krasser "
        ,"Auto ROC GmbH "
        ,"drive ME GmbH Autohaus Salzkammergut"
        ,"ARBÖ Prüfzentrum Buch "
        ,"KFZ Franz Riederer "
        ,"KFZ-Technik Lang Lukas Lang"
        ,"Treibacher Industrie AG Reinholt Höfferer"
        ,"Auto-Koch Handelsges.m.b.H. "
        ,"ELM KFZ Fachbetrieb e.U. Marek Wolny"
        ,"Benjamin Mörzinger "
        ,"ÖAMTC Feldbach "
        ,"ÖAMTC Hartberg "
        ,"ÖAMTC Liezen "
        ,"ÖAMTC Mariazell "
        ,"ÖAMTC Mürzzuschlag "
        ,"ÖAMTC Neumarkt "
        ,"ÖAMTC Radkersburg "
        ,"ÖAMTC Schladming "
        ,"ÖAMTC Zeltweg "
        ,"Patrik Fontner "
        ,"RT-Automobile GmbH "
        ,"Autohaus Frieszl GmbH "
        ,"Auto ÖZ e.U. Memis Öztorun"
        ,"Josef Kamper Gesellschaft m.b.H. "
        ,"KFZ-Technik Moser Daniel Moser"
        ,"Anton Auzinger Autocenter Auzinger"
        ,"Lukas Hamedinger "
        ,"Danijel Marjanovic "
        ,"Leobener Realgemeinschaft "
        ,"Leobener Realgemeinschaft "
        ,"Auto Schwinger "
        ,"Winkler GmbH "
        ,"Roland Kainz KFZ-Meisterbetrieb "
        ,"Gerhard Kienbauer KFZ Betrieb"
        ,"Walter Maier GmbH & Co KG "
        ,"Car Pfau GmbH "
        ,"Pammer Peter Franz Dienstleistungen Pammer"
        ,"Sebastian Faistenauer KFZ-Technik Faistenauer"
        ,"Berufsschule Wels 1 "
        ,"Autohaus Weiz GesmbH & Co KG "
        ,"KFZ Freinberger GmbH "
        ,"KFZ Trummer Wolfgang "
        ,"GENIUS CARS GmbH "
        ,"UPM GmbH "
        ,"Omar Azad Abdulrahman "
        ,"Mitkal GmbH "
        ,"MS Wunschauto e.U. "
        ,"Aicher GmbH Peugeot-Suzuki"
        ,"ALP-Performance GmbH "
        ,"Koinegg Service Ges.m.b.H. "
        ,"Auto Stahl Reparatur- und Vertriebs Gesellschaft m.b.H"
        ,"Auto Stahl Reparatur- und Vertriebs Gesellschaft m.b.H"
        ,"Fit Cars Georg Morozov"
        ,"Eduard Kniewallner "
        ,"Javad Nikdel Teymveri "
        ,"Autohaus Priewasser GmbH "
        ,"Kfz-Fischer Oliver "
        ,"Franz Binder Opel Binder"
        ,"Martin Kappel Fahrzeugtechnik Kappel"
        ,"Raiffeisen-Lagerhaus Süd Burgenland eGen"
        ,"Exmanco Platzer GmbH "
        ,"Wirtschaftshof Stockerau "
        ,"Robert Hauke GmbH KFZ+Havarie-Dienst"
        ,"Salzburg AG für Energie Verkehr und Telekommunikation"
        ,"Wolfgang Denzel Auto AG "
        ,"Unterberger Automobile GmbH & Co. KG"
        ,"Auto Strasser GmbH & Co KG "
        ,"KFZ-Familie Nigl GmbH "
        ,"MAGNA Powertrein GmbH & Co KG "
        ,"Raiffeisen-Lagerhaus Süd-Burgenland eGen"
        ,"MAGNA Powertrein GmbH & Co KG TLC Temmel GmbH"
        ,"KFZ Meisterbetrieb Pieber KG "
        ,"KFZ-Technik Drexler Martin Drexler"
        ,"Jekay Motors "
        ,"Müller´s Garage Kevin Müller"
        ,"Biro 13 KFZ GmbH Piotr Goettel"
        ,"KFZ- Technik Löw Michael Löw"
        ,"RS Fahrzeugglas OG "
        ,"Autowerk Hasenleitner GmbH "
        ,"Hubert Fellner KG "
        ,"TLP Lungau GmbH & Co KG "
        ,"Auto Demir GmbH "
        ,"SB Cars GmbH "
        ,"Österreichische Postbus AG Werkstätte"
        ,"Friesnegger Autohaus GmbH "
        ,"KFZ-Technik GDG e.U Devrim Gül"
        ,"KFZ Mican Christopher Mican"
        ,"KFZ Werkstatt Albenberger Karl "
        ,"Hengl Mineral GmbH "
        ,"Help-Car KFZ Fachbetrieb GmbH "
        ,"Wildbach- und Lawinenverbauung Forsttechnischer Dienst"
        ,"Pletter KFZ Technik Radomir Trifkovic"
        ,"KFZ Yakup e.U. Yakup Akarsu"
        ,"KFZ-Bachmann Andreas Bachman"
        ,"Autoverwertung Telfs Niyazi Dogan und Selcuk Tosun"
        ,"Schweiberer Josef Ford Werkstätte"
        ,"ARBOE Prüfzentrum Lienz "
        ,"KFZ Prober Wolfgang Prober"
        ,"KFZ-Technik ALLWORXX Stefan Kirchner"
        ,"Autohaus Ortner GmbH "
        ,"KFZ Carparatur GmbH "
        ,"KFZ-Landtechnik-Obronig "
        ,"Reifenmaster A-Z GmbH "
        ,"Wolfgang Gietl KFZ-Elektrik"
        ,"KFZ Güneri Baris Güneri"
        ,"KFZ-Technik Piniel e.U. "
        ,"Harbalik OG "
        ,"AG Kfz Technik GmbH "

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
    List<String> phone = Arrays.asList("0557240110110",
        "0664/2109784",
        "0664/4477937",
        "03113/2288",
        "0664/4146636",
        "0616/9316040",
        "02177 21354",
        "0463/37660-0",
        "01/2568700",
        "0699/11811658",
        "0676/7731304",
        "04212/3495",
        "+4369911088355",
        "",
        "0699/12962200",
        "",
        "01/7123369",
        "02742/307 60",
        "0699/10780645",
        "+43 660 9323978",
        "0676/4726633",
        "04232/2229-0",
        "043224582855",
        "0664/3635169",
        "02782/83021",
        "052322670",
        "0676 6577202",
        "0676/4309979",
        "",
        "0650/9405572",
        "0660/2102525",
        "01/6061155",
        "0669/11225604",
        "",
        "077248460",
        "",
        "0676/7193263",
        "04350/2336",
        "01330/3391",
        "07674/62565",
        "",
        "0664/4425517",
        "05252 6852",
        "",
        "0699/14046522",
        "",
        "",
        "",
        "04242/32540",
        "07472/62671",
        "0463 418145",
        "",
        "0676/4755338",
        "+436476600",
        "",
        "02572/20786",
        "02616/2256",
        "0253220600",
        "01/7203075",
        "",
        "01/2161999",
        "0664/5428654",
        "0664/8222324",
        "07724/45100",
        "0664/2004541",
        "0537264500-0",
        "05244/99870",
        "07276/2734",
        "0662 852285",
        "01/89121",
        "0664/5163485",
        "0699/17190250",
        "",
        "",
        "07435/5010",
        "06641948889",
        "05572/23286",
        "0676/5504356",
        "+43 3115 41074",
        "",
        "01599460",
        "0664/4299081",
        "0650/5281458",
        "0660 1241422",
        "",
        "0664 5038133",
        "0664/1501551",
        "03852 / 258313",
        "03134/2070",
        "03842 22039",
        "01 / 8131225",
        "",
        "0664/3389634",
        "",
        "0676/5259357",
        "0664 3841656",
        "0664/3654425",
        "0664/4342693",
        "0676/7272996",
        "07764/7431",
        "07212/7010",
        "069981344722",
        "0676/6360170",
        "031732227-0",
        "+4342323171",
        "0650/7130049",
        "+4369910148032",
        "07717-20075",
        "05578/7719-90",
        "0699/10783043",
        "+436645030304",
        "",
        "01/699 39 14",
        "+43386223401261",
        "02624/55095",
        "31595458",
        "51303903",
        "03862/33660",
        "0664/3515307",
        "07682/2103",
        "0650/8771682",
        "06243/3303",
        "0650/9263392",
        "0664/1660634",
        "06769002250",
        "0660 / 5285081",
        "+430043699144...",
        "0676 / 9670620",
        "",
        "0699 / 11304660",
        "+436766335598",
        "01/8029698",
        "02236 / 677104",
        "0664 5348038",
        "06646592653",
        "0664 1623815",
        "0699 13161111",
        "04352/54050",
        "",
        "",
        "",
        "",
        "",
        "",
        "07229/7853289",
        "",
        "02252/259223-47",
        "0664/5262292",
        "0650/6821581",
        "07562/7509",
        "06644681364",
        "06245/73998",
        "0368522369",
        "015877463",
        "0664 / 2550054",
        "02282 / 30357",
        "03317 / 267666",
        "06645330324",
        "07746/28510",
        "0664/6442776",
        "0664 / 7975044",
        "01/9903387",
        "0699/11111235",
        "0317 / 96132",
        "0664 / 8622584",
        "0662871100",
        "06502060506",
        "02522 / 84037",
        "0650 7679857",
        "02243322200",
        "0676 / 83767608",
        "0676 /844246605",
        "0664 /4466366",
        "0676 / 7042268",
        "0660 2223343",
        "06769182626",
        "0676/7352991",
        "02272/6310042",
        "06642276383",
        "0368523675-0",
        "012591095",
        "0699 / 11725494",
        "0664/1028150",
        "0681/20576620",
        "03614/23420",
        "+4318653322",
        "0463 418525",
        "0664/4720949",
        "02236/31335-0",
        "+4359133807100",
        "07229 / 80177",
        "0664/4326271",
        "0664/88926342",
        "0699/19850112",
        "06547/20488",
        "0624420993",
        "0676/7928960",
        "03339/23330",
        "06641058891",
        "04282/2319",
        "0650/3008469",
        "0664 5449868",
        "0676/4602914",
        "0676/9358721",
        "0664/4444788",
        "02165/63399-9",
        "0664/917164",
        "0660/6419749",
        "+43699 20089720",
        "0676/844268651",
        "01890789415",
        "0664/5885239",
        "05262/65400-850",
        "0664/3966997",
        "018901897",
        "0681/20833230",
        "0664/9500379",
        "0677/7995698",
        "",
        "",
        "0664/2119392",
        "0332/54377",
        "+436601673298",
        "0662 827000",
        "",
        "",
        "0664 4918423",
        "",
        "0662/274005",
        "0676/83522555",
        "0676 / 7378400",
        "+436641395664",
        "06643584238",
        "03352/22335",
        "",
        "0664/1651548",
        "05522/76606",
        "06641022449",
        "0660 / 1576237",
        "04242/38370",
        "",
        "0660/3138460",
        "07326/26655",
        "07269 / 22272",
        "",
        "0664/8808950",
        "0662/4316890",
        "0676/7786629",
        "0699/17224380",
        "0699/17194112",
        "",
        "05337/62593",
        "0664/2522035",
        "0650/8580181",
        "0676/5817079",
        "050/69992500",
        "0664/345379",
        "0660/1562717",
        "0664/1395568",
        "",
        "02176/2346",
        "0660/2003689",
        "050123230014",
        "0680/2220948",
        "01/278330818",
        "",
        "06245/80391",
        "02682/63677",
        "06543/21177",
        "0699/19023867",
        "03842/22555190",
        "0664/4655884",
        "",
        "0676/7383160",
        "0676/7404256",
        "0664/3585637",
        "0621/96592",
        "0676/6258899",
        "05513/64660",
        "0676/4630164",
        "01/3771110",
        "03112/90002564",
        "02572/2566",
        "0664/1410515",
        "0676/9204907",
        "0664/4246820",
        "0660/5300053",
        "0664/4073525",
        "05244/64848",
        "0664/5112085",
        "02628/62876",
        "0621/320079",
        "0664/1900545",
        "04212/4392",
        "0676/1225366",
        "0650/3454515",
        "0660/1541985",
        "0660/3647669",
        "0664/1682742",
        "02672/85717",
        "0664/4368421",
        "0664/6203491",
        "0676/6801923",
        "02735 / 73736",
        "0664/1052221",
        "0664/5109623",
        "0660/3108169",
        "0664/3029765",
        "0664/75066770",
        "",
        "0664/2129840",
        "0660/8533006",
        "0676/9201982",
        "+43426820300",
        "0501232708",
        "0560123623",
        "",
        "",
        "0664/1961936",
        "0664/6117250",
        "05288/63758",
        "07259/3497",
        "0699/11549776",
        "0664/2039755",
        "0676/5082034",
        "06477/8400",
        "",
        "05572/58138",
        "0676/7167676",
        "0664/5665239",
        "0676/6617708",
        "0660/3686044",
        "0664/4505165",
        "03135/55693",
        "0660/2126834",
        "0660/6502030",
        "",
        "0699/5044367",
        "0677/61432581",
        "0664/1790129",
        "+4334757408",
        "03151/2231",
        "0316/714830",
        "0660/6300859",
        "0699/10935701",
        "01/8100996",
        "03112/38977",
        "+49 89 1580-0",
        "02267/30109",
        "0664/4562773",
        "0664/3107170",
        "+43 (0) 50 12...",
        "06647416417",
        "0664/1619898",
        "0664/5468877",
        "0676/5076627",
        "0676/9077555",
        "06644428722",
        "0664/2450332",
        "0650/3813842",
        "0664/8443369",
        "0664/88475010",
        "0660/5424133",
        "0664/3818914",
        "0316/715055",
        "0664/5289710",
        "0501232305",
        "0501232320",
        "",
        "0676/9370179",
        "02232/7625110",
        "07475/52370-0",
        "07758/2237",
        "0664/60123343",
        "0660/8911826",
        "0664/2363000",
        "0664/1811323",
        "0664/4007596",
        "0699/10777761",
        "+4351220627520",
        "+4351220627520",
        "03472/2149",
        "0660/7061984",
        "03116/88750",
        "0660/1606207",
        "06604334346",
        "03582/2331",
        "0660/4830800",
        "017076312",
        "03124/22196",
        "0664/2450332",
        "0664/9265509",
        "02236/33212",
        "",
        "07676/7454",
        "0664/3978163",
        "05372/57067",
        "07483/7000-10054",
        "",
        "+386 03867/47...",
        "03862/53527",
        "03462/22970",
        "0664/4420003",
        "03112/7575-11",
        "+43262866100",
        "0676/5771111",
        "0664/9501268",
        "0650/3641155",
        "0676/5050676",
        "0664/3885155",
        "069910528804",
        "",
        "+43268267504",
        "0664/9229339",
        "0676/9428504",
        "02262/63239",
        "07752/8410016",
        "07754/2522",
        "06413/8682",
        "01/4061211",
        "0660 4431713",
        "02238/71580",
        "0660/5690176",
        "0664/1011659",
        "0512/264265",
        "07252/73434-0",
        "0662 / 824490-11",
        "01/4857980",
        "01/6041468",
        "",
        "+436643885155",
        "+43 660 92 66...",
        "0664/1770359",
        "+436641770359",
        "07223/81918-0",
        "07652/57321-0",
        "0660/6065064",
        "0680/2128120",
        "02673/22580",
        "0676/3506845",
        "06278/6327",
        "07666/806326",
        "0676/5106466",
        "0669/11850338",
        "0660/7677116",
        "06804022168",
        "0680/2154848",
        "0676/5885388",
        "0676/7888945",
        "0650/9992626",
        "01/9346460",
        "01 7746812",
        "0664 1555009",
        "02167/90602",
        "0664/9878433",
        "0699/12828801",
        "07262660",
        "050 123 2702",
        "0664/4249308",
        "0664/1770494",
        "+38638631266944",
        "0664/9167766",
        "+43436644316116",
        "07752/80424",
        "+43 676 3776811",
        "05356/62688",
        "+436641514346",
        "01/5234410",
        "06606174898",
        "0676/6904737",
        "+436602671007",
        "0664/1355668",
        "0664/3143404",
        "02630/38212",
        "0664/9271418",
        "+43676843156220",
        "",
        "01/795801511",
        "+386 41 876 848",
        "0699/10987807",
        "0664/9776143",
        "0664/9700957",
        "0664/2400501",
        "0650/5492843",
        "0664/1121632",
        "0664/5943552",
        "01/2634292",
        "+434762/82224",
        "+43664/4615723",
        "06541/6468",
        "+43662/831717",
        "06545/22277",
        "0508096100",
        "0664/4430671",
        "05353/20161",
        "0664/9765661",
        "0660/9649116",
        "0664/88708745",
        "0664/7662004",
        "02762/53896",
        "0699/12366180",
        "0676/3304214",
        "02682/63883-14",
        "02272/9005-13172",
        "0664/9953008",
        "0316/301511",
        "0720/70082851",
        "0 50 / 123 2103",
        "069911373799",
        "+436807738535",
        "0660/8216148",
        "+436645419136",
        "0664/8748363",
        "02718/6449",
        "+43676885868947",
        "01/8690415",
        "0676/7021509",
        "0660/4366323",
        "02262/755500",
        "05578/75513",
        "0660/2102525",
        "+436605901609",
        "069917327065",
        "01/2712970",
        "0677/62558608",
        "0699/17327065",
        "05352/62385",
        "06641314590",
        "02168/62636",
        "0676/879612260",
        "",
        "0664/1257055",
        "06582/72085",
        "0660/4370550",
        "0699/19516577",
        "0664/80203617",
        "+43424224141",
        "0699/18138070",
        "0676/6819603",
        "+436641302211",
        "0664/3918527",
        "0664/8675356",
        "+4322427019013",
        "0650/6200558",
        "02762/62349",
        "0664/6273492",
        "+436602191979",
        "0676/847804410",
        "0660/1150309",
        "0676/4342242",
        "+435572386009",
        "0664/9987198",
        "0773440071",
        "0664/2101518",
        "01/4895861120",
        "02622/61006",
        "06765880561",
        "0676/3302909",
        "0660/5240013",
        "06643320138",
        "0316/721145",
        "03623/2426",
        "0664/1027524",
        "06232/37014",
        "0664/1919056",
        "03453/4105",
        "+43 4242 32371",
        "+4364638334",
        "+43758861918",
        "0676/9707744",
        "0732/34007711",
        "0732/34007711",
        "+4342322519",
        "0660/4603559",
        "06274/21450",
        "0664/80203626",
        "02741/7531",
        "0664/3211224",
        "07416/52410",
        "0664/3267236",
        "0664/3483327",
        "0664/2007510",
        "0664/1945154",
        "0664/3926752",
        "+43436642287357",
        "0664/80610754",
        "0676/9452496",
        "0316471244",
        "0650/4452092",
        "02522/85888-212",
        "",
        "0664/1824330",
        "07269/76560",
        "0664/4035745",
        "",
        "0646/7980202",
        "06767581929",
        "01/7671921",
        "+43436644003555",
        "+436766760737",
        "+436605635474",
        "",
        "07942/75031",
        "05357/35549",
        "0660/5090254",
        "0664/9500857",
        "0699/17181529",
        "",
        "+43 676 531 7936",
        "02749/2949",
        "0664/3892972",
        "0664/3880101",
        "06215/607325",
        "0664/1032392",
        "0660/4871120",
        "06641362775",
        "07716/8300",
        "0676/6166450",
        "02532/8501",
        "06705064334",
        "0660/4945031",
        "0664/2476145",
        "06504563112",
        "07252/76476",
        "01/9972708",
        "0664/1656846",
        "+436601272202",
        "0664/6132540",
        "0676/3072143",
        "0676/3801526",
        "0664/1981181",
        "02236/23600",
        "07221/6000",
        "0664/75067133",
        "050/1232501",
        "050/1232502",
        "050/1232411",
        "+43463410704",
        "0664/60123836",
        "0664/60123833",
        "0664/60123838",
        "0677/64610087",
        "0660/5024556",
        "069910406052",
        "0664/8408019",
        "",
        "+436767077392",
        "0463 3865 3031",
        "064625655",
        "0501232701",
        "+436644591521",
        "",
        "069981163200",
        "05372/64740",
        "",
        "07723/5600",
        "0660/3521162",
        "03357/334482",
        "0676/4711799",
        "0676/9196913",
        "0664/88124875",
        "03462/43112",
        "06216/706618",
        "0650/9687099",
        "0664/4153812",
        "0660/2612825",
        "0505 91140",
        "0681/20157316",
        "0676/5054624",
        "43676844268651",
        "0658272292",
        "03174/4683",
        "06582/797",
        "+4343582253",
        "01/5880131561",
        "01/5880131561",
        "+436605299059",
        "01/2823382",
        "02758/4080",
        "02842/20586",
        "0664/3206661",
        "04762/36581",
        "07672/21224",
        "050 123 2703",
        "0664/2833490",
        "0664/99771933",
        "04262/5050",
        "02942/2280",
        "0676/35640420",
        "0664/5373340",
        "+43 3152 2710",
        "+43 3332 62947",
        "+43 3612 22750",
        "+43 3882 2640",
        "+43 3852 4848",
        "+43 3584 3216",
        "+43 3476 2209",
        "+43 3687 22250",
        "+43 3577 22659",
        "0699/19850319",
        "",
        "03338/2429",
        "0664/3027108",
        "+4321678100-20",
        "02616/2034",
        "0680/3312445",
        "0660/1440474",
        "0664/1433120",
        "038428153612",
        "03842/42002",
        "+436649219749",
        "+43267282731",
        "02263/6669",
        "06642007655",
        "0555265615",
        "0699/17700012",
        "0664/1591598",
        "+436641950122",
        "0732/7720-37503",
        "0664/4335492",
        "027567020",
        "",
        "0664/9613308",
        "0676/879615988",
        "01/7073615",
        "02239/34444",
        "0660/6868005",
        "+434353756249",
        "+4343361221616",
        "02682/65118",
        "0676/840925214",
        "0676/3197868",
        "",
        "+436642187055",
        "0676/7548040",
        "07752/666231",
        "07229/72022",
        "062166586",
        "0664/3996016",
        "03322/42343",
        "+43743554994",
        "02266/6953100",
        "02252/88939",
        "0662/4515133431",
        "04634/3200",
        "05372 6945 0",
        "07712/303725",
        "0676/4839916",
        "050444-3008",
        "03352/389240",
        "0664/804446707",
        "0664/5247414",
        "0676/6099713",
        "0664/2435177",
        "0664/5242643",
        "+436769149839",
        "0699/10782850",
        "0676/5172866",
        "07227/86046",
        "0650/4262222",
        "06477/20045",
        "",
        "0660/4441010",
        "0650/3906346",
        "04212/5919",
        "+436641990371",
        "+436605450119",
        "01/9820293",
        "02958/88223444",
        "+436769780739",
        "+4326222245816",
        "+4316993931",
        "069918303739",
        "0676/7309530",
        "0676/6157071",
        "0664/3378509",
        "0501232709",
        "0676/4872748",
        "0676/4370366",
        "04242/28494",
        "0676/4444686",
        "0676/4315911",
        "0699/19476496",
        "0699/15934424",
        "0650/2024312",
        "",
        "02213/43622",
        "0688/64007001"

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
      if (i.get()>500 && i.get() <=custs.size()){
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
        System.out.println(grUser.toString());
        index.getAndIncrement();
      }
    });
  }
}
