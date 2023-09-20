package com.bbvhub.job;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class generateSQL {


  public static void main(String[] args) {
     String DOUBLE_QUOTE = "\"";
     String QUOTE = "\'";
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
        ,"99033848"
        ,"99033868"
        ,"99034049"
        ,"99034052"
        ,"99034142"
        ,"99034179"
        ,"99037535"
        ,"99037536"
        ,"99037548"
        ,"99037554"
        ,"99037691"
        ,"99037692"
        ,"99037760"
        ,"99037761"
        ,"99037762"
        ,"99037763"
        ,"99037938"
        ,"99037939"
        ,"99037940"
        ,"99037941"
        ,"99037942"
        ,"99037952"
        ,"99037953"
        ,"99037954"
        ,"99037996"
        ,"99038019"
        ,"99038020"
        ,"99038021"
        ,"99038034"
        ,"99038830"
        ,"99039042"
        ,"99039050"
        ,"99039052"
        ,"99039093"
        ,"99039094"
        ,"99039095"
        ,"99039102"
        ,"99039106"
        ,"99039160"
        ,"99039161"
        ,"99039162"
        ,"99039163"
        ,"99039255"
        ,"99039260"
        ,"99039269"
        ,"99039443"
        ,"99039444"
        ,"99039530"
        ,"99039531"
        ,"99039532"
        ,"99039533"
        ,"99039700"
        ,"99039722"
        ,"99039776"
        ,"99039777"
        ,"99039778"
        ,"99039779"
        ,"99039783"
        ,"99039830"
        ,"99039831"
        ,"99039948"
        ,"99040289"
        ,"99040290"
        ,"99040343"
        ,"99040743"
        ,"99040744"
        ,"99040785"
        ,"99040827"
        ,"99040828"
        ,"99040956"
        ,"99040957"
        ,"99040958"
        ,"99040959"
        ,"99040960"
        ,"99040999"
        ,"99041480"
        ,"99042409"
        ,"99042592"
        ,"99043161"
        ,"99044009"
        ,"99044046"
        ,"99044964"
        ,"99045099"
        ,"99045213"
        ,"99045290"
        ,"99045855"
        ,"99046119"
        ,"99046928"
        ,"99047501"
        ,"99047515"
        ,"99047517"
        ,"99047519"
        ,"99048407"
        ,"99048878"
        ,"99049457"
        ,"99049458"
        ,"99049648"
        ,"99049649"
        ,"99049748"
        ,"99049854"
        ,"99050020"
        ,"99050165"
        ,"99050187"
        ,"99050227"
        ,"99050228"
        ,"99050229"
        ,"99050230"
        ,"99050231"
        ,"99050232"
        ,"99050233"
        ,"99050319"
        ,"99050320"
        ,"99050321"
        ,"99050322"
        ,"99050323"
        ,"99050324"
        ,"99050327"
        ,"99050650"
        ,"99050651"
        ,"99050652"
        ,"99050653"
        ,"99050654"
        ,"99051782"
        ,"99051783"
        ,"99052668"
        ,"99052669"
        ,"99052670"
        ,"99052803"
        ,"99053504"
        ,"99053906"
        ,"99053987"
        ,"99053988"
        ,"99054006"
        ,"99054016"
        ,"99054062"
        ,"99054063"
        ,"99054105"
        ,"99054136"
        ,"99054157"
        ,"99054316"
        ,"99054330"
        ,"99054880"
        ,"99400001"
        ,"99400030"
        ,"99400037"
        ,"99400038"
        ,"99400047"
        ,"99400048"
        ,"99400051"
        ,"99400052"
        ,"99400053"
        ,"99400054"
        ,"99400055"
        ,"99400056"
        ,"99400057"
        ,"99400083"
        ,"99400088"
        ,"99400089"
        ,"99400090"
        ,"99400091"
        ,"99400092"
        ,"99400103"
        ,"99400111"
        ,"99400112"
        ,"99400113"
        ,"99400115"
        ,"99400119"
        ,"99400120"
        ,"99400126"
        ,"99400132"
        ,"99400134"
        ,"99400141"
        ,"99400142"
        ,"99400143"
        ,"99400150"
        ,"99400162"
        ,"99400217"
        ,"99400218"
        ,"99400219"
        ,"99400260"
        ,"99400262"
        ,"99400283"
        ,"99400319"
        ,"99400336"
        ,"99400350"
        ,"99400352"
        ,"99400358"
        ,"99400359"
        ,"99400367"
        ,"99400368"
        ,"99400375"
        ,"99400387"
        ,"99400388"
        ,"99400389"
        ,"99400390"
        ,"99400391"
        ,"99400392"
        ,"99400412"
        ,"99400455"
        ,"99400562"
        ,"99400595"
        ,"99400608"
        ,"99400609"
        ,"99400630"
        ,"99400655"
        ,"99400659"
        ,"99400672"
        ,"99400722"
        ,"99400724"
        ,"99400748"
        ,"99400749"
        ,"99400750"
        ,"99400767"
        ,"99400768"
        ,"99400769"
        ,"99400906"
        ,"99401128"
        ,"99401144"
        ,"99401146"
        ,"99401147"
        ,"99401148"
        ,"99401149"
        ,"99401150"
        ,"99401151"
        ,"99401152"
        ,"99401153"
        ,"99401154"
        ,"99401155"
        ,"99401156"
        ,"99401157"
        ,"99401158"
        ,"99401159"
        ,"99401160"
        ,"99401161"
        ,"99401162"
        ,"99401163"
        ,"99401165"
        ,"99401166"
        ,"99401167"
        ,"99401168"
        ,"99401169"
        ,"99401170"
        ,"99401171"
        ,"99401172"
        ,"99401179"
        ,"99401314"
        ,"99401318"
        ,"99401319"
        ,"99401320"
        ,"99401322"
        ,"99401349"
        ,"99401352"
        ,"99401353"
        ,"99401354"
        ,"99401355"
        ,"99401442"
        ,"99401449"
        ,"99401477"
        ,"99401478"
        ,"99401479"
        ,"99401483"
        ,"99401491"
        ,"99401505"
        ,"99401506"
        ,"99401507"
        ,"99401524"
        ,"99401525"
        ,"99401539"
        ,"99401540"
        ,"99401541"
        ,"99401554"
        ,"99401574"
        ,"99401575"
        ,"99401577"
        ,"99401580"
        ,"99401581"
        ,"99401582"
        ,"99401591"
        ,"99401604"
        ,"99401630"
        ,"99401642"
        ,"99401650"
        ,"99401677"
        ,"99401679"
        ,"99401783"
        ,"99401784"
        ,"99401794"
        ,"99401795"
        ,"99401796"
        ,"99401799"
        ,"99401808"
        ,"99401811"
        ,"99401828"
        ,"99401833"
        ,"99401837"
        ,"99401838"
        ,"99401839"
        ,"99401840"
        ,"99401841"
        ,"99401853"
        ,"99401859"
        ,"99401862"
        ,"99401863"
        ,"99401864"
        ,"99401865"
        ,"99401866"
        ,"99401867"
        ,"99401868"
        ,"99401869"
        ,"99401870"
        ,"99401871"
        ,"99401872"
        ,"99401873"
        ,"99401874"
        ,"99401875"
        ,"99401876"
        ,"99401937"
        ,"99401959"
        ,"99402003"
        ,"99402004"
        ,"99402005"
        ,"99402006"
        ,"99402007"
        ,"99402087"
        ,"99402088"
        ,"99402095"
        ,"99402155"
        ,"99402156"
        ,"99402172"
        ,"99402188"
        ,"99402203"
        ,"99402206"
        ,"99402207"
        ,"99402225"
        ,"99402226"
        ,"99402227"
        ,"99402228"
        ,"99402230"
        ,"99402231"
        ,"99402241"
        ,"99402245"
        ,"99402246"
        ,"99402247"
        ,"99402260"
        ,"99402296"
        ,"99402297"
        ,"99402298"
        ,"99402300"
        ,"99402301"
        ,"99402302"
        ,"99402303"
        ,"99402304"
        ,"99402305"
        ,"99402306"
        ,"99402308"
        ,"99402319"
        ,"99402320"
        ,"99402321"
        ,"99402323"
        ,"99402348"
        ,"99402349"
        ,"99402350"
        ,"99402351"
        ,"99402358"
        ,"99402370"
        ,"99402373"
        ,"99402377"
        ,"99402407"
        ,"99402419"
        ,"99402420"
        ,"99402422"
        ,"99402429"
        ,"99402430"
        ,"99402432"
        ,"99402436"
        ,"99402475"
        ,"99402476"
        ,"99402483"
        ,"99402484"
        ,"99402485"
        ,"99402487"
        ,"99402493"
        ,"99402506"
        ,"99402516"
        ,"99402569"
        ,"99402574"
        ,"99402576"
        ,"99402588"
        ,"99402590"
        ,"99402591"
        ,"99402635"
        ,"99402680"
        ,"99402690"
        ,"99402781"
        ,"99402815"
        ,"99402816"
        ,"99402817"
        ,"99402828"
        ,"99402845"
        ,"99402848"
        ,"99402878"
        ,"99402909"
        ,"99403039"
        ,"99403044"
        ,"99403045"
        ,"99403057"
        ,"99403132"
        ,"99403147"
        ,"99403167"
        ,"99403187"
        ,"99403194"
        ,"99403231"
        ,"99403234"
        ,"99403238"
        ,"99403246"
        ,"99403340"
        ,"99403356"
        ,"99403387"
        ,"99403388"
        ,"99403437"
        ,"99403460"
        ,"99403466"
        ,"99403471"
        ,"99403476"
        ,"99403486"
        ,"99403491"
        ,"99403492"
        ,"99403497"
        ,"99403499"
        ,"99403531"
        ,"99403617"
        ,"99403661"
        ,"99403679"
        ,"99403693"
        ,"99403754"
        ,"99403769"
        ,"99403802"
        ,"99403823"
        ,"99403828"
        ,"99403901"
        ,"99403904"
        ,"99403914"
        ,"99403932"
        ,"99403933"
        ,"99403934"
        ,"99403936"
        ,"99403937"
        ,"99403946"
        ,"99403964"
        ,"99404004"
        ,"99404009"
        ,"99404026"
        ,"99404028"
        ,"99404029"
        ,"99404034"
        ,"99404040"
        ,"99404045"
        ,"99404046"
        ,"99404047"
        ,"99404108"
        ,"99404120"
        ,"99404130"
        ,"99404144"
        ,"99404188"
        ,"99404192"
        ,"99404195"
        ,"99404286"
        ,"99404289"
        ,"99404299"
        ,"99404333"
        ,"99404334"
        ,"99404335"
        ,"99404354"
        ,"99404373"
        ,"99404447"
        ,"99404536"
        ,"99404562"
        ,"99404620"
        ,"99404683"
        ,"99404710"
        ,"99404744"
        ,"99404760"
        ,"99404800"
        ,"99405027"
        ,"99405095"
        ,"99405113"
        ,"99405146"
        ,"99405154"
        ,"99405157"
        ,"99405247"
        ,"99405314"
        ,"99405403"
        ,"99405416"
        ,"99405435"
        ,"99405632"
        ,"99405669"
        ,"99405688"
        ,"99405691"
        ,"99405717"
        ,"99405748"
        ,"99405892"
        ,"99405996"
        ,"99406070"
        ,"99406426"
        ,"99406441"
        ,"99406456"
        ,"99406467"
        ,"99406471"
        ,"99406472"
        ,"99406564"
        ,"99406597"
        ,"99406612"
        ,"99406635"
        ,"99406644"
        ,"99406670"
        ,"99406755"
        ,"99406922"
        ,"99407004"
        ,"99407037"
        ,"99407057"
        ,"99407064"
        ,"99407098"
        ,"99407106"
        ,"99407167"
        ,"99407170"
        ,"99407173"
        ,"99407174"
        ,"99407196"
        ,"99407209"
        ,"99407212"
        ,"99407214"
        ,"99407218"
        ,"99407238"
        ,"99407239"
        ,"99407244"
        ,"99407247"
        ,"99407248"
        ,"99407249"
        ,"99407283"
        ,"99407300"
        ,"99407312"
        ,"99407329"
        ,"99407332"
        ,"99407333"
        ,"99407334"
        ,"99407335"
        ,"99407336"
        ,"99407364"
        ,"99407365"
        ,"99407382"
        ,"99407455"
        ,"99407456"
        ,"99407457"
        ,"99407462"
        ,"99407499"
        ,"99407526"
        ,"99407527"
        ,"99407601"
        ,"99407610"
        ,"99407669"
        ,"99407690"
        ,"99407787"
        ,"99407788"
        ,"99407792"
        ,"99407950"
        ,"99407962"
        ,"99408005"
        ,"99408095"
        ,"99408125"
        ,"99408133"
        ,"99408134"
        ,"99408189"
        ,"99408190"
        ,"99408191"
        ,"99408192"
        ,"99408210"
        ,"99408265"
        ,"99408268"
        ,"99408270"
        ,"99408271"
        ,"99408292"
        ,"99408307"
        ,"99408308"
        ,"99408323"
        ,"99408324"
        ,"99408328"
        ,"99408429"
        ,"99408486"
        ,"99408487"
        ,"99408501"
        ,"99408534"
        ,"99408565"
        ,"99408566"
        ,"99408614"
        ,"99408620"
        ,"99408621"
        ,"99408622"
        ,"99408623"
        ,"99408657"
        ,"99408659"
        ,"99408662"
        ,"99408664"
        ,"99408670"
        ,"99408671"
        ,"99408673"
        ,"99408674"
        ,"99408675"
        ,"99408676"
        ,"99408677"
        ,"99408679"
        ,"99408681"
        ,"99408682"
        ,"99408686"
        ,"99408689"
        ,"99408694"
        ,"99408701"
        ,"99408703"
        ,"99408707"
        ,"99408723"
        ,"99408752"
        ,"99408759"
        ,"99408760"
        ,"99408761"
        ,"99408776"
        ,"99408791"
        ,"99408798"
        ,"99408799"
        ,"99408805"
        ,"99408852"
        ,"99408854"
        ,"99408862"
        ,"99408863"
        ,"99408864"
        ,"99408870"
        ,"99408960"
        ,"99409019"
        ,"99409024"
        ,"99409104"
        ,"99409142"
        ,"99409201"
        ,"99409202"
        ,"99409210"
        ,"99409220"
        ,"99409222"
        ,"99409224"
        ,"99409272"
        ,"99409280"
        ,"99409313"
        ,"99409335"
        ,"99409344"
        ,"99409345"
        ,"99409376"
        ,"99409514"
        ,"99409565"
        ,"99409625"
        ,"99409630"
        ,"99409632"
        ,"99409641"
        ,"99409662"
        ,"99409713"
        ,"99409748"
        ,"99409875"
        ,"99409965"
        ,"99410002"
        ,"99410006"
        ,"99410019"
        ,"99410052"
        ,"99410054"
        ,"99410131"
        ,"99410139"
        ,"99410209"
        ,"99410382"
        ,"99410383"
        ,"99410387"
        ,"99410388"
        ,"99410418"
        ,"99410422"
        ,"99410453"
        ,"99410457"
        ,"99410460"
        ,"99410483"
        ,"99410484"
        ,"99410516"
        ,"99410519"
        ,"99410540"
        ,"99410542"
        ,"99410556"
        ,"99410558"
        ,"99410563"
        ,"99410607"
        ,"99410627"
        ,"99410630"
        ,"99410641"
        ,"99410726"
        ,"99410739"
        ,"99410751"
        ,"99410763"
        ,"99410764"
        ,"99410794"
        ,"99410804"
        ,"99410805"
        ,"99410808"
        ,"99410831"
        ,"99410833"
        ,"99410868"
        ,"99410885"
        ,"99410890"
        ,"99410895"
        ,"99410921"
        ,"99410933"
        ,"99410968"
        ,"99410984"
        ,"99410985"
        ,"99411008"
        ,"99411011"
        ,"99411014"
        ,"99411076"
        ,"99411142"
        ,"99411156"
        ,"99411157"
        ,"99411183"
        ,"99411195"
        ,"99411208"
        ,"99411219"
        ,"99411220"
        ,"99411256"
        ,"99411260"
        ,"99411340"
        ,"99411342"
        ,"99411369"
        ,"99411404"
        ,"99411413"
        ,"99411414"
        ,"99411486"
        ,"99411491"
        ,"99411521"
        ,"99411540"
        ,"99411551"
        ,"99411569"
        ,"99411587"
        ,"99411599"
        ,"99411626"
        ,"99411630"
        ,"99411681"
        ,"99411683"
        ,"99411694"
        ,"99411823"
        ,"99411824"
        ,"99411853"
        ,"99411855"
        ,"99411948"
        ,"99411960"
        ,"99412013"
        ,"99412032"
        ,"99412038"
        ,"99412059"
        ,"99412062"
        ,"99412109"
        ,"99412122"
        ,"99412123"
        ,"99412140"
        ,"99412141"
        ,"99412142"
        ,"99412177"
        ,"99412184"
        ,"99412185"
        ,"99412190"
        ,"99412276"
        ,"99412277"
        ,"99412290"
        ,"99412295"
        ,"99412307"
        ,"99412311"
        ,"99412312"
        ,"99412369"
        ,"99412456"
        ,"99412533"
        ,"99412622"
        ,"99412647"
        ,"99412679"
        ,"99412690"
        ,"99412697"
        ,"99412718"
        ,"99412749"
        ,"99412772"
        ,"99412867"
        ,"99412888"
        ,"99412920"
        ,"99412921"
        ,"99412929"
        ,"99412959"
        ,"99412977"
        ,"99413015"
        ,"99413036"
        ,"99413050"
        ,"99413098"
        ,"99413129"
        ,"99413220"
        ,"99413418"
        ,"99413555"
        ,"99413569"
        ,"99413626"
        ,"99413647"
        ,"99413682"
        ,"99413780"
        ,"99413782"
        ,"99413786"
        ,"99413787"
        ,"99413914"
        ,"99413975"
        ,"99414074"
        ,"99414076"
        ,"99414098"
        ,"99414168"
        ,"99414171"
        ,"99414172"
        ,"99414195"
        ,"99414266"
        ,"99414311"
        ,"99414413"
        ,"99414444"
        ,"99414445"
        ,"99414447"
        ,"99414448"
        ,"99414450"
        ,"99414470"
        ,"99414683"
        ,"99414728"
        ,"99414755"
        ,"99414794"
        ,"99414800"
        ,"99414801"
        ,"99414808"
        ,"99414813"
        ,"99414821"
        ,"99414829"
        ,"99414852"
        ,"99414879"
        ,"99414880"
        ,"99414882"
        ,"99414954"
        ,"99414964"
        ,"99414977"
        ,"99414978"
        ,"99414979"
        ,"99415025"
        ,"99415027"
        ,"99415128"
        ,"99415163"
        ,"99415191"
        ,"99415197"
        ,"99415228"
        ,"99415238"
        ,"99415262"
        ,"99415279"
        ,"99415286"
        ,"99415383"
        ,"99415408"
        ,"99415437"
        ,"99415439"
        ,"99415479"
        ,"99415590"
        ,"99415594"
        ,"99415618"
        ,"99415621"
        ,"99415675"
        ,"99415685"
        ,"99415716"
        ,"99415723"
        ,"99415739"
        ,"99415747"
        ,"99415753"
        ,"99415780"
        ,"99415782"
        ,"99415788"
        ,"99415798"
        ,"99415801"
        ,"99415819"
        ,"99415830"
        ,"99415891"
        ,"99415921"
        ,"99415922"
        ,"99415924"
        ,"99415977"
        ,"99415989"
        ,"99416096"
        ,"99416147"
        ,"99416218"
        ,"99416332"
        ,"99416336"
        ,"99416355"
        ,"99416445"
        ,"99416465"
        ,"99416509"
        ,"99416600"
        ,"99416607"
        ,"99416617"
        ,"99416660"
        ,"99416701"
        ,"99416703"
        ,"99416725"
    );
    // org name
    List<String> orgName = Arrays.asList("Auto Strasser Rupert "
        ,"Holzmeister Auto+Motorrad GmbH & Co KG"
        ,"Rosenbauer International AG "
        ,"Werner Hoffelner "
        ,"Neimcke GmbH & Co. KG "
        ,"Siems & Klein Autowerkstatt-Technik"
        ,"Hella Gutmann Solutions GmbH "
        ,"A.T.U. Auto-Teile-Unger GmbH & CoKG Bergerbräuhofstr. 45, A-5020 Salzbu"
        ,"Költringer & Buchwinkler GmbH Kfz-Meisterbetrieb"
        ,"Gerhard Eder jun. "
        ,"Auto Mangelberger GmbH "
        ,"WM SE Zentrale Rechnungsprüfung"
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Oberösterreich "
        ,"A.T.U. Filiale Nr. 237"
        ,"A.T.U. Filiale Nr. 235"
        ,"A.T.U. Filiale Nr. 236"
        ,"A.T.U. Filiale Nr. 234"
        ,"A.T.U. Filiale Nr. 233"
        ,"A.T.U. Filiale Nr. 231"
        ,"A.T.U. Filiale Nr. 232"
        ,"Steiermärkischer Automobil- und Motorsportclub (STAMK)"
        ,"Matthias Mair "
        ,"Hermann Teufel "
        ,"Witex Handelsgesellschaft mbH "
        ,"TW Manak Inh. Martin Manak"
        ,"Friedrich Nigl "
        ,"Ing. Markus Weidenauer Kfz-Werkstätte e.U."
        ,"Steinmetz GmbH Kfz-Werkstätte"
        ,"Auto Crew Grünstäudl "
        ,"Christian Erlach "
        ,"Pichler.ebbs GmbH "
        ,"Hansbauer Maximilian Kfz-Handel u. Reparatur"
        ,"ÖAMTC Sachmittelverwaltung"
        ,"Andreas Wimmer Kfz-Landmaschinen Wimmer"
        ,"Walserwerkstatt Düringer GmbH"
        ,"Waldmann Werkstatt Technik "
        ,"Avtosteklo d.o.o. "
        ,"Gottfried Koch GmbH & Co KG Kfz - Werkstätte"
        ,"Ing. Manfred Preiser "
        ,"Schlosser GmbH "
        ,"Fastbox Autoservice GmbH & Co KG "
        ,"Ing. Andreas Kronthaler KFZ-Techniker Meister"
        ,"Magna Powertrain GmbH & Co. KG "
        ,"Spilker KFZ Betrieb"
        ,"Alfred Löschenbrand GmbH "
        ,"TGA für KFZ / & Maschinenbau BFI Wien"
        ,"Peter Schöffauer "
        ,"INOWA GmbH & Co. KG "
        ,"LEGAT Automobil GmbH "
        ,"Raiffeisen-Lagerhaus St. Pölten reg. Genossenschaft m.b.H."
        ,"Resch & Frisch Service GmbH "
        ,"Altran Deutschland S.A.S. & Co. KG Kreditorenabteilung"
        ,"Autolackier GmbH "
        ,"Auto Engleder GmbH Kfz-Werkstätte"
        ,"Auto Reiter GmbH KFZ Handel mit Werkstatt"
        ,"Trost Auto Service Technik SE "
        ,"Walserwerkstatt Düringer GmbH "
        ,"Karl Wintersperger "
        ,"CTC Car Technology Center Lackner Stark OG"
        ,"A.T.U. Filiale Nr. 243"
        ,"Helmut Straberger "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"Autohaus Toni Heiß GmbH "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"Lacktechnikzentrum Süd GmbH "
        ,"ÖAMTC "
        ,"ÖAMTC - Melk "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Stützpunkt St.Valentin "
        ,"ÖAMTC - Amstetten "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien Sachmittelverwaltung"
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Wien "
        ,"Kfz Technik Stückelberger "
        ,"Simon-Auto-Tankstelle-GmbH "
        ,"Franz Schandl KFZ - Handel - Reparatur"
        ,"Flechl & Schwab GmbH Kfz Werkstätte"
        ,"Kfz-Technik Steindl Inh. Mst. Dominik Steindl"
        ,"O. St. Auto-Pichler "
        ,"Mario Rathgeb GmbH & Co KG Kfz - Werkstätte"
        ,"Auto Schmidtmayr GmbH "
        ,"Hella Ersatzteilhandel GmbH "
        ,"Schwödiauer GmbH "
        ,"Autohaus Markus Figl GmbH "
        ,"Autohaus Karl Billinger "
        ,"Franz Pachner e.U. "
        ,"Brunnmayr Gerhard "
        ,"Peter Maierhofer Kfz-Technik"
        ,"KFZ-Ruhland GmbH "
        ,"Auer GmbH "
        ,"Tschernutter OG Kfz Meisterbetrieb"
        ,"Autohaus Stuhlmayer GmbH "
        ,"Autoinstandsetzung Bieber GmbH Mechanik + Elektronik"
        ,"Erwin Absenger Kfz-Reparaturwerkstätte"
        ,"Franz Kraller GesmbH "
        ,"Manfred Hütter Old and Youngtimer"
        ,"WM SE "
        ,"Kfz Lins OG "
        ,"Berufsschule Mattighofen "
        ,"Michael Franz Plank Kfz "
        ,"Seiler und Fischbacher OEG "
        ,"Jürgen Loserth "
        ,"Richard Harreiter Kfz Werkstätte"
        ,"Karl Sattler Kfz Werkstätte"
        ,"Moosmann KFZ-Handel & Zubehör "
        ,"Richard Hödl "
        ,"Zitta Betriebs GmbH "
        ,"Landesberufsschule Stockerau II "
        ,"Reinhard Horvath Kfz "
        ,"Josef Kurzmann e. U. Kfz Reparaturwerkst.+Handel"
        ,"A.T.U. "
        ,"A.T.U. Filiale Nr. 240"
        ,"A.T.U. Filiale Nr. 238"
        ,"A.T.U. Filiale Nr. 242"
        ,"Werner Zeschko Kfz Werkstätte"
        ,"Johann Raus "
        ,"ÖAMTC - Vorarlberg "
        ,"Scherndl Bernhard "
        ,"ÖAMTC - Salzburg "
        ,"Automobil- und Touringclub Tirol "
        ,"ÖAMTC "
        ,"ÖAMTC - Kärnten "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC "
        ,"A.T.U. Filiale Nr. 244"
        ,"Porsche Inter Auto GmbH & Co KG"
        ,"Lietz GmbH "
        ,"Franz Niederleitner "
        ,"ÖAMTC - Wien "
        ,"ÖAMTC - Steiermark "
        ,"Auto Reiter GmbH "
        ,"Edwin Marte "
        ,"Fessl Josef "
        ,"Amt der Kärntner Landesregierung Berufsschule Wolfsberg"
        ,"HTL Mödling "
        ,"Auto Josef Soraperra KEG "
        ,"Andreas Antensteiner Car Service Hofpower"
        ,"Nußbaumer Martin "
        ,"ÖAMTC - Vorarlberg Dienstleistungszentrum"
        ,"Autohaus Schuller GesmbH "
        ,"Nacht + Dunkel "
        ,"Morscher Maik e.u KFZ-Technik"
        ,"Johann Rameder Kfz Werkstätte"
        ,"Peter Meier e.U. "
        ,"Johann Binder Kraftfahrzeugstechnik"
        ,"Deuring Josef "
        ,"Auto Wetzel GmbH "
        ,"ÖAMTC - Vorarlberg "
        ,"Auto Dallinger GmbH "
        ,"A.T.U. Filiale Nr. 245"
        ,"ÖAMTC - Vorarlberg Dienstleistungszentrum"
        ,"Manfred Rankl KG Avia Tankstelle/Kfz Werkstätte"
        ,"ÖAMTC - Oberösterreich "
        ,"A.T.U. Filiale Nr. 230"
        ,"A.T.U. Filiale Nr. 241"
        ,"A.T.U. Filiale Nr. 580"
        ,"ECON Werkstattausrüstung GmbH "
        ,"ÖAMTC - Wien "
        ,"A.T.U. Filiale Nr. 581"
        ,"Josef Achorner e.U. "
        ,"Auto Juhn Die Werkstatt KFZ GmbH "
        ,"A.T.U Auto Teile Unger GmbH & Co.KG / FIL 601"
        ,"A.T.U. Filiale Nr. 594"
        ,"ÖAMTC - Steiermark "
        ,"Thomas Uth Fahrzeuge Kfz-Handel"
        ,"A.T.U. Filiale Nr. 620"
        ,"A.T.U. Filiale Nr. 622"
        ,"A.T.U. Filiale Nr. 623"
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"A.T.U. Filiale Nr. 621"
        ,"Gottfried Reisinger e.U. "
        ,"WM Fahrzeugteile Austria GmbH "
        ,"ÖAMTC - Salzburg "
        ,"A.T.U. Filiale Nr. 624"
        ,"ÖAMTC - Kärnten "
        ,"ÖAMTC - Kärnten "
        ,"ÖAMTC - Kärnten "
        ,"ÖAMTC - Kärnten "
        ,"ÖAMTC - Kärnten "
        ,"ÖAMTC - Kärnten "
        ,"ÖAMTC - Kärnten "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"WM Fahrzeugteile Austria GmbH "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Salzburg "
        ,"ÖAMTC - Salzburg "
        ,"ÖAMTC - Salzburg "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"ÖAMTC - Oberösterreich "
        ,"Carat Systementwicklungs- und "
        ,"WM SE "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Englhard GmbH "
        ,"Autoservice Mock KG Dietmar Mock"
        ,"Autohaus Moser KG S.a. S d. F. Josef Moser"
        ,"Huber Josef "
        ,"Thomas Wallner "
        ,"KFZ Günter Knopper "
        ,"Johann PAUL Kfz-Werkstätte"
        ,"Autohaus Ortner GmbH "
        ,"August Wallner "
        ,"KFZ-Technik Harald Stange e.U. "
        ,"Manfred Spiss "
        ,"Fuchs Franz "
        ,"Berufsschule Linz III "
        ,"Berufsschule Wien "
        ,"Auto Piber e.U. Inhaber Manuel Oberortner"
        ,"KFZ - Fortmüller e. U. "
        ,"Auto Eberhaut GmbH Kfz-Meisterwerkstätte"
        ,"Sascha Kellner "
        ,"KFZ - Elektrik Sommer "
        ,"Werner Neunteufel "
        ,"Autohaus Walter Piber "
        ,"Johann Greiner GmbH Kfz-Reparaturwerkstätte"
        ,"ZBK Ges.m.b.H Verkauf-Werkstätte-Lager"
        ,"Auto Rau GmbH "
        ,"Auto Feeberger GesmbH "
        ,"Schützenhofer Fahrzeuge GmbH "
        ,"Rieberer KFZ Technik GmbH "
        ,"Nemeth Ernst "
        ,"Marjan Kosem s.p. Avtoservice"
        ,"Hans Rußner e.U. "
        ,"Boxenstop Autoservice GmbH Mutschlechner Elisabeth"
        ,"Andreas Gussenbauer KFZ Gussenbauer"
        ,"Auto Memo GmbH "
        ,"KFZ Rothwangl Petra Kfz - Werkstätte"
        ,"Innerhofer Hubert Autowerkstatt"
        ,"Mario Klug Kfz-Werkstätte"
        ,"Peter Kobald "
        ,"Autohaus Kumpusch Josef Kumpusch"
        ,"Johann Zelenka "
        ,"Autohaus Pachern GmbH Kfz-Werkstätte"
        ,"Autohaus Fahrnberger Herbert "
        ,"Auto Kornfehl e. U. "
        ,"Hofmair Autohandel GesmbH "
        ,"Gerhard Zöger KFZ-Meisterbetrieb GmbH"
        ,"KFZ Weisl GmbH "
        ,"Josef Rohrauer "
        ,"Zade Autoersatzteil-Handels GmbH "
        ,"Auto Ritzinger "
        ,"Stückelschwaiger OEG "
        ,"Othmar Haberl "
        ,"Lietz Linz GmbH "
        ,"Lietz GmbH "
        ,"Lietz GmbH "
        ,"Lietz GmbH "
        ,"Autohaus Kalcher Ges.m.b.H. "
        ,"Autohaus Leitgeb KFZ-Reparatur u. Handel"
        ,"Autotechnik Stöckl "
        ,"Pannenhilfe-Service Auto KG "
        ,"KTV Juffinger & Gruber OEG "
        ,"Gustav Schossig "
        ,"Ivica Curak "
        ,"Auto Panny "
        ,"Avto Knez Ing. Ciril Knez s.p."
        ,"Autohaus Lang GmbH "
        ,"Meisel Manfred "
        ,"Christian Druck "
        ,"Auto Thomas Egger "
        ,"Vater Kfz - Reparatur GmbH "
        ,"KFZ Technik Kaier "
        ,"Josef Huber "
        ,"Landesberufsschule Arnfels "
        ,"Erwin Garmuth "
        ,"Franz Trummer "
        ,"Reifen Ritz GmbH Kfz-Werkstätte"
        ,"Auto Technik Pölzl GmbH "
        ,"Auto-Götz Inh. Bernt Vasulke"
        ,"Werner Koman GmbH "
        ,"KFZ - Technik "
        ,"Müller Kraftfahrzeug Ges.m.b.H. "
        ,"Müller Kraftfahrzeug Ges.m.b.H. "
        ,"Autohaus Aigner GesmbH "
        ,"Hans Georg Salzmann Kraftfahrzeugtechniker"
        ,"KFZ Holzknecht GmbH "
        ,"KFZ Fachwerkstätte Nesler GmbH "
        ,"Paul Sattler "
        ,"KFZ Filla KG "
        ,"Justizanstalt Graz-Karlau "
        ,"Auto - Fruhmann Kfz - Fachwerkstätte"
        ,"Autotechnik König H. GmbH & Co KG "
        ,"Peter Wahlhütter "
        ,"Schwab Günter "
        ,"KFZ Technik Rainer Wolf "
        ,"Heinz Spannring Kfz Werkstätte"
        ,"Alois Scheucher Kfz Werkstätte"
        ,"Herbert Niegel "
        ,"Nissan - Pipp Kfz-Meisterbetrieb"
        ,"Karl Heinz Filzmaier Kfz Werkstätte"
        ,"Johann Hermann Kfz Werkstätte"
        ,"Andreas Ligg "
        ,"Autohaus Elsenbaumer GmbH "
        ,"Gramsel Autohaus GmbH "
        ,"KFZ - Premm "
        ,"Auto B. Frischmann GmbH Inh. Bernhard Frischmann"
        ,"Klapfer GmbH Kfz-Handel"
        ,"Autohaus Schlitters e. U. "
        ,"Walter Joszt e. U. "
        ,"Ewald Gaiswinkler Kfz-Werkstätte"
        ,"Autohaus Töfferl "
        ,"Schneider Julian "
        ,"Wolfgang Gietl "
        ,"Rudolf Reichel GmbH "
        ,"KFZ DMS Peranovic KG "
        ,"ABJ Jörg Abschlepp & KFZ-Service e.U."
        ,"Bretterklieber Max "
        ,"Ing. Karl Starkl "
        ,"Karl Heinz Skledar "
        ,"Autohaus Gruber GmbH "
        ,"CARS Kfz Reparatur u. Handels GmbH "
        ,"KFZ Strempfl "
        ,"Ing. Walter Kositschek Kfz - Werkstätte"
        ,"Gerhard Horn Kfz - Fachwerkstätte"
        ,"Autohaus Franz Bednar "
        ,"Aksu Tamer service-Station-Unterland"
        ,"Florian Oberhofer "
        ,"Erwin Hofstädter "
        ,"Johann Lembacher "
        ,"A. Gugerell GmbH Kfz-Werkstätte"
        ,"Auto Zechner KFZ-Technik"
        ,"Zemsauer Christian "
        ,"Anika Grundmann "
        ,"Jauk Peter "
        ,"Autohaus Franz Seidl  GesmbH "
        ,"Marchel "
        ,"Karl Darnhofer "
        ,"Auto Pfingstl "
        ,"Anton Wurm GmbH "
        ,"Auto Schwarzl Inh. Denise Schwarzl"
        ,"Zangerl Markus "
        ,"Kramer & Schnablegger GmbH "
        ,"Autozentrum Simmering Mehmet Emin Celik"
        ,"Alois Luger "
        ,"KTM AG Betriebsgebiet Süd"
        ,"Kurt Gotthardt KFZ - Handel und Reparatur"
        ,"Boerhaavegarage "
        ,"Lagerhaus Eferding-OÖ. Mitte eGen "
        ,"Wolfgang Schertler Kfz - Meisterbetrieb"
        ,"Herbert Limberger Kfz - Werkstätte"
        ,"Zöhrer Christian KFZ-Meisterbetrieb Zöhrer"
        ,"Pirker Markus Kfz-Werkstätte"
        ,"KFZ Tech Hofbauer Kfz - Werkstätte"
        ,"KFZ Holzer Roland KG "
        ,"Autohaus Schneider GmbH "
        ,"Zweiradtechnik Primus GmbH "
        ,"Klinger OG Kfz- und Motorradtechnik"
        ,"Herbert Schlacher "
        ,"Autohaus Lackner Ges.m.b.H. & Co KG "
        ,"Auto Winkler GmbH "
        ,"Peter Themessl "
        ,"Balcojvic Zavisa "
        ,"Robert Moser "
        ,"Toklu e.U. "
        ,"Josef Trummer AutohandelsgesmbH"
        ,"Lerch Fahrzeugtechnik GmbH & Co.KG "
        ,"Markus Michael Almer "
        ,"SECAR KFZ - Technik Yavuz Yasar"
        ,"Gelbmann Stefan "
        ,"Maximilian Rupp e. U. "
        ,"Gebe GesmbH "
        ,"Reijnders GmbH KFZ- Werkstätte"
        ,"Wilhelm Arrich "
        ,"Wolfgang Derigo "
        ,"Autohaus Klingler "
        ,"Alex Guillaume Ellinger GmbH &Co KG "
        ,"Raiffeisen-Lager Zwettl eGen "
        ,"IMOTA "
        ,"LIETZ Ges.m.b.H. "
        ,"TGS-Motorrad Team Grinning Skull"
        ,"Auto Urbanek e. U. Kfz-Werkstätte"
        ,"Thomas Riedl "
        ,"Keusch GmbH Kfz-Werkstätte"
        ,"Auto-Dienst Windisch e.U. "
        ,"J. Schörg Ges..m.b.H. KFZ-Reparatur"
        ,"KFZ Technik Zohar GmbH "
        ,"Allacher GmbH "
        ,"Keusch GmbH "
        ,"Raiffeisen Lagerhaus Zwettl eGen. Werkstätte Kottes"
        ,"Raiffeisen-Lagerhaus Zwettl eGen "
        ,"Autohaus Felbermair OG "
        ,"Thomas Steinmayer Kfz-Service"
        ,"Old Skool Garage "
        ,"Lang Günther GmbH Kfz - Werkstätte"
        ,"Autoteile Wieser GesmbH & Co KG "
        ,"Johann Auinger "
        ,"Kurt Gotthardt "
        ,"Oscar Stern GmbH "
        ,"Auto Grabner GmbH KFZ-Meisterbetreib"
        ,"Autohaus Varga, Roland Varga Kfz - Werkstätte"
        ,"Auto-Vorraber GmbH "
        ,"Josef Kalkbrenner Kfz-Werkstätte"
        ,"KFZ Technik Grabner "
        ,"Raiffeisen-Lagerhaus Zwettl e.Gen "
        ,"Zitta Betriebs GmbH "
        ,"Ertl KFZ Technik "
        ,"Herbert Lugmayr "
        ,"Plesnicar Automobile GmbH"
        ,"Herbert Wimmer KFZ Technik & Karosserie"
        ,"Johann Alfred Glaninger "
        ,"Autohaus Hörmann GmbH "
        ,"Raiffeisen-Lagerhaus Zwettl eGen "
        ,"Kfz-Bachmayr Brigitte Kfz-LKW-Landmaschinen,"
        ,"Neumahr Peter "
        ,"Autoservice TOMICIC "
        ,"Autohaus Oberhauser GmbH "
        ,"ÖZKUL KG "
        ,"Autohaus Pichelsberger GmbH Kfz-Werkstätte"
        ,"Autohaus De Bettin GmbH & Co KG "
        ,"Anton Hohl "
        ,"MR KFZ Technik Thomas Hasenöhrl "
        ,"DIT Mitterbauer GmbH "
        ,"M. Gattringer Kfz-Handel & Service"
        ,"Autohaus Hold GmbH "
        ,"Andreas Fojtik "
        ,"Annerer KFZ GmbH "
        ,"ÖZ - Auto Werkstatt "
        ,"Markus Wieder Kfz - Werkstätte"
        ,"Raiffeisen-Lagerhaus Zwettl eGen "
        ,"Franz Jenewein Kraftfahrzeugtechnik"
        ,"Hofbauer "
        ,"Ingrid Pramreiter e.U. "
        ,"Reinwald OEG "
        ,"Katzenschlager Ges.m.b.H. "
        ,"MVC Motors GmbH "
        ,"Autoservice Veider OHG "
        ,"Auto Hartleb "
        ,"KFZ-Servicestation Zeljko Mitar "
        ,"Hirschvogl Alois "
        ,"Pakchehr GmbH "
        ,"Tiroler Fachberufsschule "
        ,"Permetinger GmbH KFZ - Fachwerkstätte"
        ,"Markus Pamperl KFZ-Reparaturwerkstätte"
        ,"Schirk Willibald "
        ,"Erich Pecovnik "
        ,"Moosbrugger Martin Kfz-Betrieb"
        ,"Strohmayer Johann Service-Ersatzteile-Zubehör"
        ,"Strobl Auto GmbH "
        ,"Schnitzer und Hanawegg KFZ GmbH "
        ,"Motodrom Zweirad GmbH "
        ,"Technische Universität Graz "
        ,"Auto Achatz OG "
        ,"Ing. F. Reiter GmbH "
        ,"Autohaus Niko "
        ,"Johannes Wagner Kfz - Werkstätte"
        ,"PIT - Shop "
        ,"Autohaus Luger GesmbH "
        ,"Blitz KFZ-Werkstatt GmbH "
        ,"Werner Weiss "
        ,"Auto Paier GmbH Kfz-Werkstätte"
        ,"Mathis Kurt Kfz e.U. "
        ,"Auto Scheikl GmbH "
        ,"Auto Friedl "
        ,"Autohaus Ford Wien "
        ,"Schuler Hermann KG "
        ,"Ebermayer & Egger GmbH Kfz - Werkstätte"
        ,"Nesa IT-Service "
        ,"Gottfried Hauser "
        ,"Gerhard Flucher "
        ,"Karl's mobile KFZ-Technik Karl de Crinis"
        ,"Mühlbacher Sascha Kfz-Handel"
        ,"Rudolf Franz Sklenar Ges.m.b.H Kfz-Werkstätte"
        ,"Kfz Fachbetrieb Robinig & Partner O "
        ,"Frolik "
        ,"Johann Wieser "
        ,"Luxner Michael Autorep. GmbH "
        ,"Roller Kfz - Meisterbetrieb "
        ,"Bikes & Cars Gerald Prazna "
        ,"Werner Feindt "
        ,"Autohaus Ing. Werner Pletzer "
        ,"Markus Wallinger "
        ,"Klaus Reitbauer "
        ,"Landesberufsschule Bregenz 2 "
        ,"PAUK Abschleppdienst GmbH "
        ,"Hausleitner Stefan "
        ,"Autocenter Kirchheim GmbH "
        ,"Manuel Jahn "
        ,"Autohaus Ing. Gredinger Ges.m.b.H. "
        ,"Robert Pabel "
        ,"Baumgartner Herbert "
        ,"Kfz Glaser "
        ,"RUELAND GmbH "
        ,"Josef Schallgruber GmbH Kfz - Werkstätte"
        ,"Weichsler Hermann "
        ,"ATG KFZ-Zubehör & Ersatzteile GmbH "
        ,"Richi's Checkpoint "
        ,"Zellner Gottfried "
        ,"David Hlavinka "
        ,"Car Care GmbH "
        ,"KFZ - Huemer GmbH "
        ,"Prostis Autoboutique "
        ,"Happy-Car Haider "
        ,"Auto Brückl GmbH Kfz-Werkstätte"
        ,"KFZ Peter Isser "
        ,"Othmar Kager "
        ,"ACD "
        ,"Gady Franz GmbH "
        ,"Franz Sonnleitner "
        ,"Auto Lasser GmbH "
        ,"Kiss Autolack GmbH Karosserie & Technik"
        ,"Rene Reichenbäck "
        ,"Höck Technik "
        ,"Rene Aberer "
        ,"Hyundai Import Gesellschaft m.b.H. "
        ,"KFZ - Technik HGC Gerald Hierzer"
        ,"Raiffeisen-Lagerhaus Zwettl eGen "
        ,"Daniel Pfeiffer Kfz-Pfeiffer Handel"
        ,"Fuchs Kfz Technik GmbH "
        ,"MB Cars Michael Baltic "
        ,"KFZ - Technik Holzer Stephan "
        ,"Autohaus Swed GmbH "
        ,"Fürstaller & Partner GmbH "
        ,"KHA Autoreparaturen GesmbH "
        ,"Auto Falbesoner GmbH "
        ,"Autohaus Saria "
        ,"Reinhard Ohnewas GmbH "
        ,"Autohaus Hager GmbH "
        ,"KFZ Technik Puchas - Greimel "
        ,"De Maestro Kfz-Werkstätte Polat Esat"
        ,"Greul e.U. Roland Greul"
        ,"Ahmed Nurkic "
        ,"Gazda Rudolf GmbH "
        ,"Christian Jansky "
        ,"A. Steiner & Co. GmbH "
        ,"Stadler Motors "
        ,"Taxi Kapshammer GmbH "
        ,"DEDIC Amir "
        ,"Kalcher Andreas "
        ,"Raiffeisen - Lagerhaus Zwettl eGen "
        ,"Gerhard Wintersperger Karosserietechnik"
        ,"Land & KFZ Technik Hackner "
        ,"Mayer & Reuthner OEG Kfz-Meisterbetrieb u. Handel"
        ,"Autohaus Danis GesmbH "
        ,"Auto Degen "
        ,"Christopph Greimel Kfz - Werkstätte"
        ,"E. Bernhard GmbH "
        ,"KFZ - Techniker - LIDER "
        ,"Auto-Garage Markus Troger "
        ,"TOMAX 4x4 GmbH "
        ,"A-Z Winkler "
        ,"Wirtschaftsk. Kärnten Wifi Klagenfurt"
        ,"KFZ Klaus Kusel "
        ,"Brand Autoteile GmbH "
        ,"Autohaus Yspertal GmbH "
        ,"Raiffeisen-Lagerhaus "
        ,"Ing. Christian Mayerhofer GmbH "
        ,"Walter Eder "
        ,"Bruggraber Peter Kfz-Service"
        ,"Butulla & Zidek Ges.m.b.H. "
        ,"Auto Glas Kfz-Werkstätte"
        ,"Dandler e. U. Kfz - Werkstätte"
        ,"Günther Schmid "
        ,"Moser Karl "
        ,"KFZ-Technik Mitter G. GmbH "
        ,"KFZ-Technik Thanner "
        ,"Auto Graf GmbH "
        ,"KFZ Rema "
        ,"Kessler Walter "
        ,"Carpo GmbH "
        ,"Gady Handelsgesellschaft mbH "
        ,"Gady-Steiner GmbH "
        ,"Ford Eichinger "
        ,"Günter Füxl e.U. "
        ,"Autohaus Hans Pfisterer "
        ,"Samir Vejzovic KG "
        ,"Automobil Klinik "
        ,"Autohaus Buchegger GmbH "
        ,"Ing. Kleibl Walter Richard "
        ,"Andreas Dokter "
        ,"TNP Novak Thomas "
        ,"Auto Stahl Reparatur u. Vertriebs-GmbH"
        ,"Kutlesa Zdenko "
        ,"KFZ Arnold "
        ,"KFZ - M. Steyrer Inh. Mario Steyrer"
        ,"Martin Zbornik "
        ,"Race Car Ges.m.b.H. "
        ,"HC-Motorsport Christian Hofer"
        ,"DWA Autohaus Velden GmbH "
        ,"Schell KFZ "
        ,"Herbert Waldner "
        ,"Wiegro GmbH "
        ,"Hubert Pichlmaier Kfz - Werkstätte"
        ,"Otto Krippel GmbH "
        ,"KFZ Tilg GmbH "
        ,"Lonsing Günther "
        ,"RTS-Performance e.U. "
        ,"Auto Maier GmbH "
        ,"Handl Automobile GmbH "
        ,"A.u.H. Lederer Ges.m.b.H. "
        ,"Mario Della Schiava "
        ,"Hofstetter GmbH "
        ,"KFZ Kronsteiner GmbH "
        ,"KFZ Zsoldos OG Kfz-Werkstätte"
        ,"KFZ-Technik Hannes Jesner "
        ,"Helmut Micheler Ges.m.b.H. "
        ,"KFZ-Jonach "
        ,"KFZ Max Moosbrugger GmbH "
        ,"Autodienst Münch "
        ,"Robert Blöch e.U. "
        ,"Ernst Praudisch Kfz-Fachbetrieb"
        ,"BVH Strempfl GmbH "
        ,"Michael Parzer "
        ,"Taxi Andrea Xander "
        ,"Taxi Schneeweiss GmbH "
        ,"Autohaus Winter OHG "
        ,"A.S.P. Auto-Service Pichler "
        ,"KFZ-Korndeuer GmbH "
        ,"KFZ HOLY Nikolas Steinschauer"
        ,"Andreas Baumgartner e.U. "
        ,"Werner Wegscheider "
        ,"LMK Wriessnegger OG KFZ-Meisterbetrieb"
        ,"Josef Dragan GmbH KFZ - Technik"
        ,"Raiffeisen Lagerhaus "
        ,"Herbert Bacher "
        ,"Forge GmbH "
        ,"Siegfried Bammer "
        ,"KFZ-Technik Hanika GmbH "
        ,"Karosserie- Lackierzentrum HOFER KG"
        ,"R.O.C. OG "
        ,"Autohaus Altenweisl "
        ,"KFZ- Freilinger "
        ,"RSE Mechanix GmbH "
        ,"ATB Brenner GmbH "
        ,"Autohaus St.Leonhard Raiffeisen Lagerhaus Mostviertel"
        ,"Gerhard FRANZ GmbH "
        ,"Reinhard Frodl Kfz - Werkstätte"
        ,"Auto B.H. Bosnajak Hadis "
        ,"KFZ - Fritsch "
        ,"Bretschneider & Co Reifenhandel GmbH"
        ,"Johannes Reiterer "
        ,"Diskont - Tankstelle "
        ,"KFZ Werkstätte Erich Kindermann e.U."
        ,"KFZ & Zweirad Kohlbacher Gewerbepark Stadlhof"
        ,"Mario Smonjak "
        ,"KFZ - Elektrik Maximilian Schörkmayer"
        ,"Alois Ablinger "
        ,"Autohaus Schmidberger GmbH "
        ,"KFZ Längenfeld GesmbH "
        ,"KFZ-Schweiger Wolfgang GmbH "
        ,"Auto Engleder Hofkirchen GmbH "
        ,"Auto Engleder Eferding GmbH "
        ,"SV Pool Schadenbesichtigungs GmbH "
        ,"Auto Hutter "
        ,"Autoservice Gert Lemmerer "
        ,"A & L Autotechnik Alois Lederer "
        ,"Fahrzeugtechnik Martin Stampfer "
        ,"Reifen Hollerweger Vertriebs Ges.m.b.H."
        ,"Kfz ENWI e.U. "
        ,"Schwefel-Garage Wolfgang Seppi"
        ,"Prodinger GmbH "
        ,"EP Carstyling "
        ,"Ing. Matthias Wüst "
        ,"KFZ - Meisterbetrieb "
        ,"KFZ - Voit "
        ,"Harald Porta Kfz-Servicestation"
        ,"KFZ Service Center BIRI "
        ,"Biechl Robert KG "
        ,"KFZ Alois Auer "
        ,"KFZ-Parigger Christoph "
        ,"KFZ Prascher "
        ,"Dogan-Tosun OG "
        ,"Tramposch Martin "
        ,"Kluibenschädl Alexander AKM Karosserie u. Motor"
        ,"Gernot Steinlechner "
        ,"Robert Harrer GmbH "
        ,"Toyota Aniser Autodienst Ebbs GmbH"
        ,"Peter Span "
        ,"Fahrzeugtechnik Kager "
        ,"Johann Lengl "
        ,"Just GmbH & Co KG "
        ,"Erich Kuehs KG "
        ,"Harald Horvath "
        ,"Herwig Tiffner Kfz Meisterbetrieb"
        ,"Johann Ondrovcik "
        ,"Autohaus Iser "
        ,"KFZ-Werkstätte und Handel Christian Redl"
        ,"Haiderer Wilhelm Kfz Handel & Zubehör"
        ,"Macherhammer OG "
        ,"Kraxner Elmar KFZ-Meisterbetrieb GmbH"
        ,"Franz Pirker Kfz-Handels GmbH"
        ,"MobilTec OHG "
        ,"Gerry's Box Gerald Pöschl"
        ,"SB-Waschcenter Reifen-Servicest. Inh. Grinschgl Markus e.U."
        ,"S.K.L. Automobile GmbH "
        ,"Alois Gebetsroither "
        ,"Dantinger GmbH "
        ,"Johann Seidl e.U. "
        ,"Robert Schwarzl KFZ - Technik"
        ,"Felix Niederberger AD Autodienst"
        ,"Akgün Autoservice KG "
        ,"Eugen R. Dietrich GmbH & Co KG Mercedes-Benz"
        ,"Johannes Hammerl Kfz-Technik"
        ,"KFZ - Service SOWA "
        ,"KFZ-Takev GmbH "
        ,"Schöllers Autoklinik GmbH "
        ,"A. Stadlbauer (gegr.1845) Tankstellen Bau- u. BetriebsgesmbH"
        ,"Autopark GmbH "
        ,"Little EDI's Garage GmbH Edhem Sejkic"
        ,"Georg Krall Kfz Meisterbetrieb und Handel"
        ,"Richi - Taxi "
        ,"Marjan Todorovic Kfz-Handel"
        ,"Autohaus Hahnl GmbH "
        ,"Johann Holzmüller Kfz - Mechanikermeister"
        ,"Wolfgang Garherr Kfz-Werkstätte"
        ,"Alfons Sullbauer "
        ,"Autohaus Bogner GmbH "
        ,"AMP auer & marth OG "
        ,"Konrad Leonhartsberger GmbH Kfz-Werkstätte"
        ,"RMS Technik Christian Mrlik "
        ,"Berni's Biker Bude "
        ,"KFZ Haydter "
        ,"NUPE Technik GmbH "
        ,"Lattner Ges.m.b.H. "
        ,"Dipl. Ing. Horst Wildbolz "
        ,"Autoservice KG Wallnöfer Gerd & Co."
        ,"J. Gregor - Autoreparatur GmbH "
        ,"Hilbert Werkstätten GmbH "
        ,"Markus Golger "
        ,"KFZ-Technik Senad GmbH DIE WERKSTATT"
        ,"KFZ Technik Kornberger Norbert Kornberger"
        ,"Halil Sezer KG "
        ,"Motorsport Sandra Mair "
        ,"Autoinstandsetzung Bieber GmbH "
        ,"KFZ - Service Ebner "
        ,"Klaus Renzl Kfz "
        ,"Christian Gebhart "
        ,"KFZ Josef Lechner "
        ,"FN KFZ-Technik GmbH "
        ,"K-T-W KFZ -Technik Wuzel "
        ,"Auto Haidinger "
        ,"Schantl Quad ATV "
        ,"Thomas Günther Labi "
        ,"Manfred Wanker "
        ,"Fink & Fink OG "
        ,"KFZ Flexa e.U. "
        ,"Ömer Özata "
        ,"IMEX-Gebrauchtwagen "
        ,"KFZ & Lack Fritz OG "
        ,"Gitschtal Service "
        ,"Platintuning KFZ Meisterbetrieb"
        ,"Ing. Johann Hiebaum e.U. "
        ,"Auto Glock Inh. Michael Glock"
        ,"Sclacher - KFZ "
        ,"KFZ - Service Wonisch "
        ,"KFZ Lorch Sebastian "
        ,"Ing. Franz Greiner "
        ,"Autowelt Sintschnig GmbH "
        ,"Motofactory Gilbert Grabmayer "
        ,"Werner Zettel "
        ,"KFZ-Servicestation Autotech "
        ,"Robert Armstorfer KFZ- Werkstatt"
        ,"Forsterpointner GmbH "
        ,"KFZ - Zierlinger "
        ,"CarTEC Saalfelden Ellikci Mustafa"
        ,"Johann Köppl "
        ,"Helmut Hrdinka Kfz-Werkstatt"
        ,"KFZ - Technik Lederer GmbH "
        ,"Werner Aichwalder "
        ,"Johannes Fischer "
        ,"LKT Mario Mössmer "
        ,"Josef Kohl KFZ - Elektrik"
        ,"KFZ Josef Lammer "
        ,"Martin Fasching Kfz - Fachbetrieb"
        ,"Ferrogarage "
        ,"Landesberufsschule Pinkafeld "
        ,"Autohaus TREFF Stojanovic Nenag KG"
        ,"Vienna Airport Technik GmbH Postfach 1/Obj. 420"
        ,"Auto Dienst E. Schöllhuber "
        ,"AB - Service "
        ,"MH Markus Heigl "
        ,"Karin Kager "
        ,"Michael Wechselberger "
        ,"NB Automobil GmbH "
        ,"Autohaus Neubauer "
        ,"Braumann Tiefbau GmbH "
        ,"Stefan Mayer "
        ,"Ögretim KFZ Servicestation & Autohandel"
        ,"KFZ - Winninger "
        ,"KFZ Technik Peinthor Christoph Peinthor"
        ,"KFZ-Schnellservice Mehmet KIRIS"
        ,"Bouda-Tuning "
        ,"Dagmar Theresia Horvath "
        ,"KFZ - Strobl "
        ,"Car Fit Autoservice Robert Oberndorfer"
        ,"Eisl & Söhne GmbH "
        ,"Alexander Seklehner "
        ,"Martin Schrattenthaler "
        ,"Autocenter Glanninger "
        ,"Martin Geiger "
        ,"RMD Franz Prader GmbH "
        ,"Mandis Ersatzteilhandel Manfred Endmeier"
        ,"Lagerhaus Gleinstätten-Ehrenhausen Wies eGen"
        ,"Autohaus Hnolik "
        ,"Kfz - Wagner Franz "
        ,"Autobedarf Schmid GmbH "
        ,"Haider e.U. "
        ,"Christian Wachter & Partner OG "
        ,"Car & Bike Tunin u. Zubehör GmbH"
        ,"KFZ Martin Schlögl "
        ,"Arja J. Sailer "
        ,"KFZ Werkstätte Zauner Rudolf GmbH "
        ,"Adelbrecht GmbH "
        ,"Fahrzeugtechnik Kelderer OG "
        ,"Autohaus Krünes GmbH Ford Vertragswerkstätte"
        ,"H&Z Kfz OG "
        ,"NSM Taxi GmbH Kfz-Technik"
        ,"Autoarena West Knapp e.U. "
        ,"Kfz Karner "
        ,"Anton Achter Kfz-Handel und Werkstätte"
        ,"Kfz Technik Mayr GmbH "
        ,"Autohaus Hetzendorf "
        ,"Auto Technik Werkstätten Betriebsges.m.b"
        ,"Lechner Robert "
        ,"Stefan Honeder "
        ,"Ing. Herbert Haan "
        ,"Auto Meisinger Ges.m.b.H. "
        ,"Leopol Holzapfel "
        ,"Auto Anthofer e.U. "
        ,"Autohaus Rohrer GmbH "
        ,"Martin Bitschnau "
        ,"WIFI Tirol "
        ,"Wolfgang Kriegner "
        ,"Johann Thüringer Autoverglasung"
        ,"Weakstott Hannes Matzer "
        ,"KFZ - Zehentmayr "
        ,"KFZ-Coskun GmbH Autohaus Zirl"
        ,"Hager Elisabeth Kfz Hager"
        ,"Alfred Pechhacker "
        ,"KFZ - Service Hans Hausberger "
        ,"KFZ - HAAS GmbH "
        ,"Gensluckner + Leitner GmbH "
        ,"Autoklinik Aichinger GmbH "
        ,"Javornik e. U. "
        ,"Markus Mücke "
        ,"G.Rass GmbH "
        ,"Motorrad Samson "
        ,"Vieriu Cornelius "
        ,"Peter Teimel "
        ,"PRO-TAX A.M.B. OG "
        ,"Stiegler Autohandel KG Inh. Heinz Stiegler"
        ,"thegarage Hannes Umgeher "
        ,"Tuppinger GmbH Autohaus"
        ,"Autohaus Pestuka GmbH "
        ,"Groß Andreas "
        ,"Manfred Wallinger Maschinenhandel GmbH"
        ,"Ing. Berger & Brunner Baugesellschaft mbH"
        ,"Senger Ges.m.b.H. Kfz-Fachbetrieb"
        ,"Albert Hocevar "
        ,"Thomas Mittermüller "
        ,"KFZ - Technik Otto Wandaller "
        ,"Gotthard Nothdurfter "
        ,"Peter Wochesländer Kfz Meisterbetrieb"
        ,"Schlögelbauer Wolfgang KFZ-Technik"
        ,"Bernd Pircher GmbH Autospenglerei"
        ,"Raiffeisen-Lagerhaus Tulln-Neulengbach eGen"
        ,"Christopf Beck Kfz-Werkstatt "
        ,"F & G KFZ-Werkstätte u. Handels GmbH"
        ,"Hella Handel Austria Gmbh "
        ,"Schnitzhofer Technik GmbH KFZ-Land & Metalltechnik"
        ,"Edelweiss Bike Travel Reise GesmbH"
        ,"Johann Ruprecht "
        ,"ATM Autotechnik Morina "
        ,"Raupold Ewald KFZ-Meisterbetrieb GmbH"
        ,"Bruckner Kfz - Technik GmbH "
        ,"Toni Kluge e.U. Karosseriebau und Lackierung"
        ,"Johannes Pichler Kfz-Werkstätte"
        ,"Grausgruber KFZ Reparatur & Service GmbH"
        ,"Autocenter - Habernig Inh. Albert Habernig"
        ,"Lietz GmbH "
        ,"W & G Autobedarf Werner Mühlhans GmbH"
        ,"Pongruber + Söhne GbR Robert Pongruber"
        ,"EXMANCO Mitterlehner GmbH "
        ,"Autotechnik Ing. Paul Troger "
        ,"Dorfmayer GmbH "
        ,"KFZ Fachwerkstättte Patrick Hausberger"
        ,"Schopper & Freudenschuß "
        ,"Rindler Erdbau GmbH "
        ,"Peiner u. Weber Autobedarf OHG "
        ,"Autoteile Kralik GmbH "
        ,"Christian Stöger "
        ,"Auto Engl GmbH "
        ,"Christian Walder "
        ,"Christian Lugbauer KFZ-Service & Handel"
        ,"ABV Erich Breinhölder "
        ,"Michael Lidauer "
        ,"MCW Moto City West "
        ,"Autoteile West Inh. Torsten Kukorudz"
        ,"Markus Rathgeb "
        ,"KFZ Köstenbaumer GmbH "
        ,"Kfz Werkstätte Pumi OG "
        ,"Josef Glonner "
        ,"Autohaus Harald Weber GmbH "
        ,"Mario Einspieler "
        ,"Autozubehör MELK Fa. Semenic "
        ,"Nedelko & Szönyegi GmbH "
        ,"Josef Magdalenz "
        ,"Herbert Vallant "
        ,"Servis Celec d.o.o "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Autohaus Rehm GmbH "
        ,"auto-fix Runda & Spitzer GmbH "
        ,"Autohaus Jakob Prügger GmbH Neu- und Gebrauchtwagen"
        ,"Lind GmbH & Co KG "
        ,"Franz Preis "
        ,"KFZ  Werkstatt Stefan Schaub GmbH "
        ,"HOLAS GesmbH "
        ,"Hans Geyrhofer & Sohn Gesellschaft m.b.H."
        ,"Wolfgang HERMANN "
        ,"Pleiner GmbH & Co KG Kfz - Werkstätte"
        ,"KFZ - Tatschl Inh. Harald Hermann Taschl"
        ,"EXMANCO Autozubehör- und Handels-GmbH"
        ,"Carlom GmbH "
        ,"Speed Car Kfz - Reparaturbetriebs GmbH"
        ,"Elmar Santeler "
        ,"Johannes Mittendrein "
        ,"SAFETYCAR KFZ-Service und Reparatur GmbH"
        ,"KFZ - Knipitsch "
        ,"Gerald Eder "
        ,"Michael Steinhauser GmbH "
        ,"KFZ Fachwerkstätte Selli "
        ,"K&K Kfz - Technik Karner Markus Georg"
        ,"Thomas Eckel "
        ,"Topservice Nals "
        ,"Johann Unterguggenberger "
        ,"Ewald Doppler "
        ,"Moto-Z Autoteile Zankl "
        ,"KFZ-Technik Kern GmbH "
        ,"Unterberger Automobile GmbH & Co.KG"
        ,"Markus Leidinger Automobilservice"
        ,"Werner Knapp "
        ,"E & A Liegenschaftsverwaltung GmbH "
        ,"Schreil-Hofer Ges.m.b.H Kfz-Werkstätte"
        ,"Flucher Helmut-Peter & Maria "
        ,"TP Technik Pur OG Michael Gradischnig"
        ,"KFZ BencGarage "
        ,"Herbert Obernhuber Kfz-Reparaturen"
        ,"Jenewein & Fröhlich OG KFZ Fachbetrieb"
        ,"Alexander Mayer "
        ,"ATP Exodus SRL "
        ,"Christian Brenn "
        ,"Grötzer & Büttner GmbH "
        ,"Michael Breneis "
        ,"Autohaus Ambros GmbH "
        ,"Oberhauser Servicestation GmbH "
        ,"Werner Koman GmbH "
        ,"Michael Lahnsteiner e. U. Kfz-Werkstätte"
        ,"ZS-Cars OG Sorger Mario "
        ,"Autohaus Franz Gimpl "
        ,"Karosserie- & Lackiercenter GmbH Manfred Andert"
        ,"Rebernik d.o.o. "
        ,"Rene´s Autoteile "
        ,"Auto Wagner GmbH "
        ,"Doris Haminger "

    );
    // email
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
        "poststelle@oeamtc.at",
        "office@stueckelberger.at",
        "",
        "buero@schandl.co.at",
        "",
        "",
        "office@auto-pichler.at",
        "office@kfz-rathgeb.at",
        "office@peugeot-schmidtmayr.at",
        "",
        "schwoediauer@kt-net.at",
        "kontakt-ap@peugeot.com",
        "karl.billinger@aon.at",
        "fischereder@pachner.at",
        "",
        "",
        "werkstatt@kfz-ruhland.at",
        "office@auer-gmbh.at",
        "kfz-tschernutter@gmx.at",
        "stuhlmayer@aon.at",
        "kfz-reparatur@auto-bieber.com",
        "office@kfz-absenger.at",
        "info@bp-austria.at",
        "mobilservice@aon.at",
        "info@wm-fahrzeugteile.de",
        "",
        "",
        "michael.plank@aon.at",
        "service@sf-tuning.com",
        "kfz@loserth.at",
        "office@kfz-harreiter.at",
        "",
        "office@kfz-moosmann.at",
        "",
        "",
        "",
        "auto.horvath@gmx.at",
        "",
        "",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "",
        "",
        "",
        "office@kfz-scherndl.at",
        "hallein@oeamtc.at",
        "",
        "salzburg@oeamtc.at",
        "rechnungen.kaernten@oeamtc.at",
        "eingangsrechnungenooe@oeamtc.at",
        "",
        "rechnungseingang@at.atu.eu",
        "porschebregenz@porsche.co.at",
        "",
        "office@kfz-niederleitner.com",
        "poststelle@oeamtc.at",
        "murau@oeamtc.at",
        "info@autoreiter.com",
        "",
        "",
        "post.bhwo@ktn.gv.at",
        "office@htl.moedling.at",
        "info@abs24.eu",
        "",
        "auto-nussi@aon.at",
        "",
        "",
        "",
        "kfz-morscher@macpes.eu",
        "",
        "office@kfz-meier.at",
        "office@kfz-binder.at",
        "",
        "office@auto-wetzel.at",
        "",
        "office1@auto-dallinger.at",
        "rechnungseingang@at.atu.eu",
        "",
        "",
        "ried@oeamtc.at",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "info@econ-wa.de",
        "poststelle@oeamtc.at",
        "rechnungseingang@at.atu.eu",
        "",
        "auto-juhn@sbg.at",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "",
        "",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "rechnungseingang@at.atu.eu",
        "",
        "",
        "rechnungseingang@at.atu.eu",
        "",
        "",
        "",
        "rechnungseingang@at.atu.eu",
        "",
        "",
        "klagenfurt@oeamtc.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "info@carat-gruppe.de",
        "",
        "rechnung@stahlgruber.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "rechnung@stahlgruber.at",
        "info@bau-e.de",
        "info@automock.it",
        "",
        "",
        "",
        "",
        "paul-kfz@aon.at",
        "",
        "",
        "",
        "",
        "",
        "bs-linz3.post@ooe.gv.at",
        "peter.strobl@schule.at",
        "buchhaltung@auto-piber.co.at",
        "office@fortmueller.com",
        "ersatzteile@eberhaut.at",
        "kfz.2rad.kellner@weboutlook.at",
        "gerhard.sommer@gmx.at",
        "",
        "",
        "office-greiner@speed.at",
        "",
        "office@auto-rau.at",
        "",
        "",
        "",
        "office@hyundai-nemeth.at",
        "",
        "",
        "office@boxenstop.at",
        "",
        "office@auto-memo.at",
        "",
        "",
        "kfz.klug@gmx.at",
        "kfzkobaldpeter@aon.at",
        "info@autohaus-kumpusch.at",
        "kfz.zelenka@aon.at",
        "",
        "",
        "",
        "office@kfz-hofmair.at",
        "",
        "",
        "",
        "",
        "auto.ritzinger@aon.at",
        "",
        "office@autohaus-haberl.at",
        "linz@lietz.at",
        "j.schoelnhammger@lietz.at",
        "waidhofen@lietz.at",
        "wieselburg@lietz.at",
        "",
        "",
        "",
        "",
        "",
        "kfz.schossig@aon.at",
        "",
        "office@autopanny.at",
        "",
        "office@auto-lang.at",
        "meiselkfz@kabeltvgmunden.at",
        "",
        "info@autothomas.it",
        "",
        "",
        "kfzhuber@outlook.com",
        "",
        "office@garmuth.at",
        "",
        "",
        "",
        "office@autogoetz.at",
        "office@koman.at",
        "",
        "st.konrad@kfz-mueller.at",
        "office@kfz-mueller.at",
        "office@autohaus-aigner.at",
        "",
        "",
        "",
        "",
        "filla@kfzfilla.at",
        "",
        "",
        "honda@auto-koenig.at",
        "",
        "office@webcar.at",
        "rainer@agip-wolf.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "christian.bezgovsek@gramsel.co.at",
        "",
        "",
        "",
        "",
        "werkstatt@joszt.at",
        "",
        "",
        "",
        "",
        "verwaltung1@reichel.co.at",
        "",
        "info@abj-kappl.at",
        "",
        "",
        "",
        "",
        "service@kfz-cars.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "office@firma-grundmann.at",
        "",
        "",
        "",
        "",
        "info@auto-pfingstl.at",
        "",
        "",
        "",
        "",
        "autozentrumsimmering@gmail.com",
        "",
        "Invoice accounting@ktm.com",
        "",
        "",
        "",
        "office@werkstatt-schertler.at",
        "",
        "",
        "werkstattgreifenburg@gmx.at",
        "",
        "",
        "info@autohaus-schneider.at",
        "info@zweirad-primus.at",
        "office@klinger-racing.at",
        "auto.schlacher@utanet.at",
        "office@autohaus-lackner.at",
        "office@autowinkler.at",
        "",
        "",
        "",
        "toklu@aon.at",
        "autotrummer@aon.at",
        "petra.maikisch@lerch-kfz.com",
        "markus.almer@gmx.at",
        "office@secar-kfz.at",
        "",
        "kfz-rupp@a1.net",
        "",
        "info@reijnders.cc",
        "",
        "w.derigo@gmx.at",
        "office@autohausklingler.at",
        "info@autopark-wien.at",
        "",
        "office@motomat.at",
        "",
        "",
        "urbanek@autourbanek.at",
        "",
        "",
        "ad-windisch@aon.at",
        "r.sonnleitner@ford-schoerg.at",
        "",
        "",
        "office@keusch.com",
        "",
        "sekretariat@zwettl.rlh.at",
        "kfz@autohaus-felbermair.at",
        "",
        "office@oldskool-garage.at",
        "lang.haag@autohaus.at",
        "office@autoteile-wieser.at",
        "",
        "kfz-gotthardt@aon.at",
        "office@oscarstern.at",
        "office@auto-grabner.at",
        "autohaus.varga@utranet.at",
        "office@auto-vorraber.at",
        "kalkbrenner.josef@aon.at",
        "office@kfz-technik-grabner.at",
        "sekretariat@zwettl.rlh.at",
        "office20@zitta.at",
        "",
        "",
        "plesnicar-automobile@aon.at",
        "herbertwimmer@aon.at",
        "glaningerj@aon.at",
        "office@auto-hoermann.at",
        "sekretariat@zwettl.rlh.at",
        "bachmayr_kfz@aon.at",
        "",
        "",
        "info@oberhauser.bmw.at",
        "kfztechnikoezkul@aon.at",
        "office@pichelsberger.at",
        "office@autohaus-de-bettin.at",
        "",
        "fa.thasenoehrl@gmail.com",
        "",
        "info@kfz-gattringer.at",
        "office@autohaus-hold.at",
        "office@fojtik-motors.com",
        "kfz@annerer.at",
        "",
        "office@kfzwieder.at",
        "sekretariat@zwettl.rlh.at",
        "kfz-jenewein@tmo.at",
        "",
        "kfz.prami@aon.at",
        "",
        "office@kfz-katzenschlager.at",
        "bruennerstrasse@mvcmotors.at",
        "",
        "office@auto-hartleb.at",
        "kfz-servicestation@chello.at",
        "",
        "",
        "",
        "kfz@permetinger.at",
        "m.pamperl@gmx.net",
        "",
        "",
        "m_moosbrugger@aon.at",
        "auto.strohmayer@aon.at",
        "ronald.grabner@strobl.skoda.co.at",
        "kfz@gmx.at",
        "office@motodrom.com",
        "portier.inffeld@tugraz.at",
        "",
        "office@autoreiter.at",
        "",
        "bpwagner@a1.net",
        "",
        "office@autoluger.at",
        "",
        "",
        "",
        "kfz-mathis@aon.at",
        "",
        "friedl.willibald@aon.at",
        "",
        "ford@schuler.at",
        "info@ebermayer-egger.com",
        "",
        "gottfried.hauser@gmx.at",
        "office@kfz-flucher.at",
        "",
        "sascha.muehlbacher@aon.at",
        "",
        "robinig.partner@speed.at",
        "",
        "",
        "a.eberharter@luxner.skoda.co.at",
        "gerhard@kfz-roller.at",
        "gerald@prazna.at",
        "",
        "info@autopletzer.at",
        "",
        "reitbauer@live.at",
        "sekretariat@lbsbr1.snv.at",
        "info@pauk.at",
        "kfz-hausleitner@aon.at",
        "geraldreich@gmx.at",
        "",
        "info@auto-gredinger.at",
        "office@kfz-pabel.at",
        "",
        "kfz-glaser@a1.net",
        "info@rueland.at",
        "office@schallgruber.at",
        "",
        "office@at-g.at",
        "",
        "info@appartements-zellner.at",
        "",
        "info@cc-center.at",
        "",
        "info@prosti.at",
        "",
        "office@brueckl.info",
        "peter.isser@aon.at",
        "",
        "info@acd-dobl.at",
        "invoice@gady.at",
        "",
        "alina.saischek@auto-lasser.at",
        "anfrage@kiss-autolack.at",
        "",
        "info@hoeck-technik.at",
        "",
        "",
        "service@kfztechnik-hgc.at",
        "",
        "office.kfz.pfeiffer@gmail.com",
        "office@kfz-technik-fuchs.at",
        "",
        "",
        "",
        "office@autohaus-oberaich.at",
        "khan867@yahoo.com",
        "office@falbesoner.com",
        "office@ford-saria.at",
        "reinhard.ohnewas@ohnewas.seat.co.at",
        "m.hager@mazda-hager.at",
        "kfz-technik.greimel@aon.at",
        "office@de-maestro.at",
        "info@kfz-greul.at",
        "",
        "cit.gazda@citroen-gazda.at",
        "jansky@daihatsu.at",
        "office@kfz-bilek.at",
        "stadler-motors@gmx.at",
        "taxi5050@gmx.at",
        "",
        "info@rent-a-ferrari.at",
        "",
        "karosserie@aon.at",
        "",
        "",
        "autohaus-danis@aon.at",
        "info@auto-degen.at",
        "",
        "info@auto-bernhard.at",
        "office@samir-kfz.at",
        "kfzberndtroger@gmx.at",
        "office@tomax4x4.at",
        "",
        "wirtschaftskammer@wkk.or.at",
        "kfz-kusel@gmx.at",
        "office@kfz-brand.at",
        "",
        "",
        "office@mayerhofer.at",
        "",
        "",
        "office@renault-schwechat.at",
        "info@auto-glas.co.at",
        "info@dandler.eu",
        "",
        "",
        "office@reifenmitter.at",
        "",
        "office@auto-graf.at",
        "firma@kfz-rema.at",
        "",
        "office@auto-posch.com",
        "gerald.pieler@gady.at",
        "niederwoelz@gady.at",
        "ford.eichinger@aon.at",
        "office@fuexl.at",
        "hyundai.pfisterer@aon.at",
        "info@samir-kfz.at",
        "automobil-klinger@aon.at",
        "office@autohaus-buchegger.at",
        "vergaser.kleibl@aon.at",
        "",
        "thomas.novak@aon.at",
        "wien20@autostahl.com",
        "kutlesa@aon.at",
        "office@info-reifen.at",
        "supermariokfz@gmx.at",
        "kfz_zbornik@aon.at",
        "race-car@gmx.at",
        "",
        "info@autohaus-velden.at",
        "office@schell-kfz.com",
        "herbert.waldner@gmx.at",
        "office@wiegro.com",
        "hubert-pichlmaier-oeg@aon.at",
        "o.krippel@aon.at",
        "fa.tilg@gmx.at",
        "tcs-lonsing@gmx.at",
        "office@rts-performance.at",
        "info@automaier.at",
        "handl.automobile@zell-net.at",
        "office@autorep-lederer.at",
        "mario.della.schiava@aon.at",
        "office@kfz-hofstetter.at",
        "office@kfzkronsteiner.at",
        "info@kfz-zsoldos.at",
        "h.jesner@gmx.at",
        "benatho@gmx.at",
        "kfz-jonach@aon.at",
        "info@max-moosbrugger.at",
        "admuench@gmx.at",
        "buchhaltung@bloech.at",
        "kfz.praudisch@aon.at",
        "bvh.strempfl@aon.at",
        "kfz-parzer@gmx.at",
        "taxi.xander@aon.at",
        "offce@taxi9011.at",
        "auto.winter@aon.at",
        "asp@speed.at",
        "kfztuning@gmx.at",
        "m.holy@utanet.at",
        "a.baumgartner@automobil-service.at",
        "wegscheider.w@gmx.net",
        "office@wriessnegger.at",
        "office@dragan.cc",
        "",
        "herbert-bacher@aon.at",
        "office@ford-gebrauchtteile.at",
        "siegl.bammer@gmx.at",
        "wss@utanet.at",
        "karosserie.hofer@aon.at",
        "office@roccar.at",
        "auto.altenweisl@aon.at",
        "",
        "office@rse-mechanix.at",
        "atb.brenner@aon.at",
        "rboeck@mostvmitte.rlh.at",
        "office@renault-franz.at",
        "kfz.frodl@aon.at",
        "hadis.b@gmx.at",
        "office@kfz-fritsch.at",
        "office@bretschneiderreifen.at",
        "kfz.hannes@aon.at",
        "diskont-tankstelle@kabsi.at",
        "erich.kindermann@speed.at",
        "kuli98@gmx.at",
        "kfz-smonjak@aon.at",
        "office@auto-elektrik.at",
        "kfz@a2a.at",
        "auto@schmidberger.co.at",
        "amirpakchehr@yahoo.com",
        "wolfi.schweiger@aon.at",
        "",
        "",
        "office@svpool.at",
        "autohutter@aon.at",
        "gert@kfz-lemmerer.at",
        "",
        "info@kfz-stampfer.at",
        "mh@reifen-hollerweger.com",
        "enwi_cars@gmx.at",
        "w.seppi@schwefel-garage.at",
        "horst.prodinger@kfz-prodinger.at",
        "epcarstyling@aon.at",
        "h.m.wuest@aon.at",
        "office@kfz-meisterbetrieb.at",
        "office@kfz-voit.at",
        "kfz-harald-porta@outlook.com",
        "biris-kfz@aon.at",
        "robertbiechl.keg@biechl.at",
        "kfz-aer@aon.at",
        "christoph.parigger@gmx.at",
        "martin.muessigang@gmail.at",
        "kfzteam@aon.at",
        "kfztramposch@gmail.com",
        "alex@kluibenschaedl.at",
        "office@kfz-steinlechner.at",
        "office@robert-harrer.at",
        "toyota@aniser.at",
        "kfz.span@gmail.com",
        "office@kager-fahrzeugtechnik.at",
        "office@lengl.at",
        "service@auto-just.at",
        "kuehskg.erich@utanet.at",
        "custoca@gmail.com",
        "office@kfz-tiffner.at",
        "johann.ondrovcik@aon.at",
        "office@autoiser.at",
        "office@kfz-redl.at",
        "office@kfz-haiderer.at",
        "marina@macherhammer.co.at",
        "info@kfz-kraxner.at",
        "office@autopirker.at",
        "",
        "office@gerrys-box.at",
        "",
        "office@skl-automobile.at",
        "",
        "",
        "info@karosseriebau-seidl.at",
        "kfz-technik-schwarzl@aon.at",
        "office@autodienst-nw.at",
        "",
        "dietrich@mercedes.at",
        "j.hammerl@gmx.net",
        "",
        "",
        "willi.schoeller@aon.at",
        "office@ecodrom.at",
        "innsbruck@autopark.at",
        "littleedisgarage@aon.at",
        "",
        "taxi-richi@aon.at",
        "kaufdesjahres@hotmail.com",
        "office@autohaus-hahnl.at",
        "auto.holzmueller@aon.at",
        "",
        "alfons111@a1.net",
        "office@autohaus-bogner.at",
        "office@am-power.at",
        "kfz.leonhartsberger@aon.at",
        "office@rms-technik.at",
        "",
        "info@kfz-haydter.at",
        "office@nupe.at",
        "office@lattner.at",
        "",
        "",
        "office@kfz-gregor.at",
        "office@auto-hilbert.at",
        "service@golger-kfzwerkstaette.com",
        "info@senad-kfz.at",
        "n.kornberger@aon.at",
        "office@kfzsezer.at",
        "office@motorsport-sandra.at",
        "office@auto-bieber.com",
        "kfz-ebner@tmo.at",
        "kfz-renzl@renzl.info",
        "office@christian-gebhart.com",
        "kfz.josef@gmx.at",
        "office@fn-kfz-technik.at",
        "office@kfz-wuzel.at",
        "",
        "schantl-austria@aon.at",
        "kfzlabi@aon.at",
        "wanker.manfred@aon.at",
        "",
        "",
        "",
        "",
        "info@kfz-lack-fritz.at",
        "",
        "",
        "office@hiebaum.com",
        "service@auto-glock.at",
        "office@schlacher-kfz.at",
        "",
        "kfz-lorch@live.at",
        "",
        "office@sintschnig.com",
        "office@motofactory.at",
        "firma.zettel@aon.at",
        "",
        "kfz-armstorfer@gmx.at",
        "info@forsterpointner.at",
        "kfz-zierlinger@wavenet.at",
        "",
        "autokoeppl@aon.at",
        "hrdinka@aon.at",
        "kfz.lederer@gmail.com",
        "",
        "",
        "office@lkt.co.at",
        "kfzelektrik.kohl@gmx.at",
        "kfz-lammer@gmx.at",
        "",
        "office@ferrogarage.at",
        "",
        "",
        "Vat-rechnung@viennaairport.com",
        "e.schollhuber@utanet.at",
        "abservice@gmx.at",
        "office@kfz-heigl.at",
        "",
        "office@schraubwerk.at",
        "service@kfz-bisevac.at",
        "office@auto-neubauer.at",
        "office@braumann-tiefbau.eu",
        "office@transporte-mayer.at",
        "",
        "kfz-winninger@aon.at",
        "info@kfz-peinthor.at",
        "kfz.kiris@aon.at",
        "",
        "",
        "",
        "",
        "office@eisl-soehne.at",
        "",
        "info@kfz-schrattenthaler.at",
        "autocenterglanninger@aon.at",
        "",
        "office@rmdprader.at",
        "",
        "office@gleinstaetten.rlh.at",
        "",
        "office@wagner-steyregg.at",
        "buchhaltung@autobedarf-schmid.com",
        "haider_ohg@aon.at",
        "wachteroeg@aon.at",
        "carundbikeverkauf@speed.at",
        "",
        "",
        "werkstaette@zauner-rudolf.at",
        "info@adelbrecht.eu",
        "office@fahrzeugtechnik-kelderer.at",
        "verkauf@ford-kruenes.at",
        "hzw-kfz@gmx.at",
        "office@atw-kfz.at",
        "",
        "kfz.karner@gmx.at",
        "iris@auto-achter.at",
        "office@kfz-mayr.at",
        "office@autohaus-hetzendorf.at",
        "",
        "office@lechner-tischlerei.at",
        "office@kfz-honeder.at",
        "kfz-haan@aon.at",
        "office@meisinger.at",
        "leopold@holzapfel-moto.at",
        "auto-anthofer@aon.at",
        "office@autohausrohrer.at",
        "",
        "kundenservice@wktirol.at",
        "",
        "",
        "",
        "office@kfz-zehentmayr.at",
        "info@autohauszirl.at",
        "office@kfz-hager.at",
        "office@kfz-pechhacker.at",
        "",
        "kfzhaaskarlheinz@aon.at",
        "kfz-gensluckner-leitner@utanet.at",
        "office@autoklinik-aichinger.at",
        "ja@kfz-spezialist.at",
        "",
        "info@autovermietung-tirol.at",
        "motorrad_samson@aon.at",
        "",
        "buchhaltung@uscar-teimel.at",
        "office@protax.at",
        "kfz.stiegler@gmx.com",
        "",
        "tuppinger@partner.renault.at",
        "pestuka@honda-vertragspartner.at",
        "",
        "office@manfredwallinger.com",
        "office.inzing@bb-bau.at",
        "office@kfz-senger.at",
        "",
        "auto@mittermueller.cc",
        "otto.wandaller@aon.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "verkauf.wien@hella-austria.at",
        "office@kfz-schnitzhofer.at",
        "worldtours@edelweissbike.com",
        "office@kfz-ruprecht.at",
        "",
        "office@raupold.at",
        "rechnung@bruckner.at",
        "toni.kluge@aon.at",
        "pichler-johannes@aon.at",
        "office@grausgruber-kfz.at",
        "albert.habernig@speed.at",
        "wolfern@lietz.at",
        "",
        "",
        "",
        "info@autotechnik-troger.at",
        "office@dorfmayer.at",
        "office-hausberger@a1.net",
        "info@atp-sf.at",
        "",
        "",
        "office@autoteile-kralik.at",
        "stoeger.hans@aon.at",
        "",
        "",
        "",
        "abv@aon.at",
        "",
        "info@moto-city-west.at",
        "office@autoteile-west.at",
        "markus.rathgeb@hotmail.com",
        "",
        "office@autohaus-pumi.at",
        "auto@glonner.at",
        "vigne@autohaus-harald-weber.at",
        "",
        "semenic@gmx.at",
        "autonedelko@speed.at",
        "",
        "h.vallant@aon.at",
        "",
        "",
        "autohaus@rehm.at",
        "kfz@autofix.at",
        "info@pruegger-exklusiv.at",
        "office@auto-lind.at",
        "",
        "office@kfzschaub.at",
        "info@holas.at",
        "Rechnung@geyrhofer.bmw.at",
        "tuningcenter@powerquad.at",
        "office@pleiner.at",
        "kfz-tatschl@gmx.at",
        "",
        "",
        "office@speedcar.at",
        "mazda@pitztalnet.at",
        "office@jm-automobile.at",
        "office@safetycar-kfz.at",
        "kfz-knipitsch@gmx.at",
        "edergerald@gmx.at",
        "office@nissan-steinhauser.at",
        "",
        "karner.hubert@aon.at",
        "",
        "",
        "",
        "",
        "info@moto-z-autoteile.at",
        "kfztechnikkern@kundl.at",
        "",
        "",
        "knapp.pannendienst@aon.at",
        "office@eua.at",
        "",
        "kfz-flucher@aon.at",
        "",
        "office@benc-garage.at",
        "kfz.obernhuber@aon.at",
        "froehlich@kfz-steinach.at",
        "mayer.alexander@aon.at",
        "",
        "",
        "",
        "",
        "office@autohaus-ambros.at",
        "info@cc-oberhauser.at",
        "office@koman.at",
        "office@lahnsteiner.at",
        "",
        "autohaus.gimpl@sbg.at",
        "office@karosseriecenter.at",
        "",
        "info@renes-autoteile.com",
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
        "Rot Kreuz Gasse 29",
        "Föhrenweg 10",
        "Hochstrasse 368",
        "Raabserstraße 113",
        "Seitenberggasse 78",
        "Behamberg 225",
        "Josef Heißl Straße 11",
        "Schwaighof 64",
        "Nr. 16",
        "Edtstrasse 13",
        "Sulzbach 1",
        "Tullner Straße 71",
        "Maasbach 40",
        "Pfeffergasse 20",
        "Freindorf 8",
        "Weitraer Staße 117",
        "Schacherfeld 2",
        "Statz 92",
        "Bahnhofstraße 196",
        "Austrasse 7",
        "Schelleingasse 10",
        "Bergstraße 21",
        "Kaiser Franz Josef-Straße 171",
        "Muggenau 55",
        "Lindauer Str. 120",
        "Montanast 40",
        "Feldstraße 3",
        "Hämmerlestraße 71c",
        "Wildbichlerstraße 3",
        "Wienerstraße 12",
        "Arzberger Straße 2",
        "Römerweg 15",
        "Im Dielen 21",
        "Kaltwasserstraße 19",
        "Mühlgasse 82",
        "Weg zur Marienhöhe 3",
        "Hauptstraße 77",
        "Waltendorfer Hauptstraße 19a",
        "Bergerbräuhofstr. 45",
        "Fischauer Gasse 160",
        "Prager Straße 264-268",
        "Bundesstraße 47",
        "Triester Straße 162",
        "Petermühlweg 15b",
        "Untere Roßmähder 2",
        "Landstraße 34",
        "Europastraße 2",
        "Andechsstraße 81",
        "Alpenstraße 102-104",
        "Alois-Schader-Straße 11",
        "Wankmüllerhofstraße 60",
        "Schubertring 1-3",
        "Poststraße 2",
        "Rheinstraße 9",
        "Wolfernstraße 18a",
        "Tal 19",
        "Wienerbergstraße 27c",
        "Märzenkeller 18",
        "Berg bei Hamet 3 3",
        "Sebastianstraße 12",
        "Maiersdorf 70",
        "St. Jakober Straße 2",
        "Technikerstraße 1-5",
        "Sportplatzweg 8",
        "Sonnleiten 2",
        "Ignaz-Harrer-Strasse 94",
        "Langgasse 120",
        "Gams 120",
        "Sauerbrunnstr. 90",
        "Walgaustrasse 42",
        "Poggschlag 2",
        "Gewerbegasse 3a",
        "Prinz Eugen Straße 5/1",
        "Baien 166",
        "Bubenried 1",
        "Herrenau 8",
        "Schacherweg 2",
        "Altmannsdorfer Straße 140/141",
        "Rheinstraße 11",
        "Haslau 29",
        "Schnalla 105",
        "Ennser Straße 18",
        "Wiener Strasse 310-312",
        "Königshofstraße 48",
        "Märkerstr. 15",
        "Shuttleworthstraße 8",
        "Villacher Straße 126",
        "Kaiserbach 1a",
        "Werner Baderstraße 2",
        "Max Planck - Straße 6",
        "Schwefel 47-49",
        "Conrad von Hötzendorf Straße 127",
        "Walserstraße 311",
        "Laxenburger Straße 248a",
        "Alpenstraße 137",
        "Josef - Reither - Straße 12",
        "Karl Schachinger Straße 6",
        "Kramelsbergstraße 1",
        "Wachaustraße 11",
        "Wolfharting 13",
        "Puchgasse 2A",
        "Loferer Bundesstraße 40",
        "Handelsring 5",
        "Obervellach 94",
        "Helga-Perkonig-Straße 3",
        "Villacherstraße 115",
        "Klagenfurter Straße 54",
        "Klagenfurter Straße 21",
        "Henry Dunant Straße 3",
        "Gewerbezeile 1",
        "Auf der Haiden 105",
        "Johannesstraße 15",
        "Reiner-Burgholzer-Straße 3",
        "Badhöring 46",
        "Gleinker Hauptstraße 1c",
        "Linzer Straße 220",
        "Triester Straße 8",
        "Peterbauerstraße 6",
        "Litzelsdorf 219",
        "Bundesstraße 2D",
        "Moosstraße 37",
        "Straß 22",
        "Galgenau 45",
        "Salzburger Straße 25a",
        "Gewerbealle 31",
        "Warte am See 27",
        "Salzburger Straße 84",
        "Am Viktoria-Turm 2",
        "Neuburger Straße 149",
        "Am Römerstein 17",
        "Jägerweg 2",
        "Prager Straße 245",
        "Einödmayergasse 13",
        "Griesauweg 25",
        "Puntigamer Straße 149",
        "Samuel-Morse-Straße 3",
        "Eduard-Sueß-Str. 21",
        "Arlbergstraße 7",
        "Harlanderstraße 7",
        "Feuerwehrstraße 3",
        "Richard-Strauß-Straße 41",
        "Ambergerstraße 31",
        "Rosengartenstraße 12",
        "Fabrikstraße 4",
        "Mundenham 38",
        "Nr. 44",
        "Lestein 74",
        "Margaretenstraße 125",
        "Gewerbestraße 8",
        "Marburger Straße 96",
        "Liebenauer Hauptstr. 127",
        "Tribulan 2",
        "Feistritz 1",
        "Makartstraße 3",
        "Scheydgasse 40",
        "Leifling 25",
        "Jamm 22",
        "Eichfeld 127",
        "Hummelstraße 1",
        "Mühlgasse 6",
        "Ketten 15",
        "Förolach 46",
        "Grazer Straße 25",
        "Kärntnerstrasse 115",
        "Schmiedgasse 3",
        "Hauptstraße 111",
        "Erbersdorf 188",
        "Nr. 56a",
        "Wienerstr. 26",
        "Jesenovec 9",
        "Pichl 24",
        "Liebenauer Hauptstraße 79",
        "Dr. Reinhard-Kamitzstraße 6",
        "Haberedt 25",
        "Mitterstraße 104A",
        "Seilbahnstraße 9",
        "Lagerstraße 10",
        "Rosenaler Straße 106",
        "Austraße 12",
        "Höflach 14",
        "Harter Süd Str. 6",
        "Am Spitz 12",
        "Thernbergerstr. 8",
        "Hungerberg 3",
        "Pottendorferstraße 162",
        "Nr. 32",
        "Alhaming 100",
        "Mitterfeldstraße 9",
        "Vordernberger Straße 74",
        "Hauptstraße 9A",
        "Am Schneidergraben 3",
        "St.-Peter-Straße 21",
        "Schlüsselstraße 3",
        "Ybbsitzer Str. 107",
        "Zur Autobahn 5",
        "Grazer Straße 24",
        "Krappfelder Straße 38",
        "Stöcklfeld 72",
        "Meilstraße 48",
        "Vorderer Trojer 12",
        "Fischerstraße 10",
        "Mitterstraße 200",
        "Hauptstraße 57",
        "Gallusova ulica 1",
        "Hauptstraße 62",
        "Bahnhofstr. 61",
        "Lind 22",
        "Zona Artigianlae 5L2",
        "Staudgasse 57",
        "Dietersdorf 47",
        "Salzburger Straße 26",
        "Hardegger Straße 160",
        "Reichsstraße 36",
        "Grazerstraße 21",
        "Wienerstrasse 119",
        "Haslach 80",
        "Leschetitzkygasse 2",
        "Schirmitzbühelstr. 12",
        "Industriestraße 1-3",
        "Bundesstraße 14",
        "Au 54",
        "Edt 28",
        "Gewerbepark 8",
        "Unterlängenfeld 117a",
        "Sankt-Peter-Straße 43",
        "Waltendorfer Hauptstr. 30",
        "Lastenstraße 31",
        "Herrgottwiesgasse 50",
        "Kirchbach Nr. 22",
        "Schildbach 58",
        "Petersdorf 57b",
        "Schützing 21",
        "Stockach 29a",
        "Weisskirchnerstraße 14",
        "Raning 137",
        "Pernreith 18",
        "Nr. 159",
        "Bahnhofstraße 8",
        "Siedlerstraße 20",
        "Bahnhofstraße 7",
        "Lobisserweg 2",
        "Wiener Straße 50",
        "Unterwald 118",
        "Farchat 2",
        "Hieflauerstraße 82",
        "Gewerbegebiet 26f",
        "Rosengasse 36",
        "Saggraben 156",
        "Nr. 23",
        "Nr. 27",
        "Schloßstr. 26",
        "Grazer Str. 17",
        "Gewerbestrasse 7",
        "Lochau 378",
        "Lestein 46",
        "Nr. 32",
        "Korngasse 14",
        "Hauptstraße 1",
        "Schröttergasse 44",
        "Schattauberg 89",
        "Grafendorfer Straße 12",
        "Im Dorf 11",
        "Rautenweg 41",
        "Egerbach 76a",
        "Puntigamerstraße 127",
        "Sandgasse 8",
        "Obergasse 24",
        "Staudgasse 45",
        "Liebensdorf 313",
        "Mühlwangstraße 22",
        "Hartl 43",
        "Nr. 2",
        "Hauptstraße 75",
        "Schrötten 4",
        "Kulming 37",
        "Thien 81",
        "Gewerbering 1",
        "Minihof-Liebau 118",
        "Nr. 83b",
        "Schlechtastrasse 3",
        "Simmeringer Hauptstraße 107",
        "Hauptstraße 1",
        "Stallhofner Straße 3",
        "Unterlimbach 81",
        "Boerhaavegasse 23",
        "Bahnhofstraße 51-55",
        "Hippleserweg 7",
        "Burgweg 10",
        "Weberegg 25/1",
        "Bahnhofstraße 329",
        "Feldkirchnerstraße 4",
        "Kringstraße 129",
        "Unterrohr Straße 5",
        "Rheinstraße 99d",
        "Ortsried 13",
        "Dorfstraße 3",
        "Glocknerstraße 6",
        "Pichlhofen 36",
        "Niederndorfer Str. 44",
        "Äußere Jochenstr. 89a",
        "Wiener Straße Werkstr. 105",
        "Neustiftgasse 2",
        "Seibuttendorf 4",
        "Heimatstrasse 2",
        "Etzersdorf 70",
        "Eichenstraße 3",
        "Steinbruch 1/6",
        "Gewerbeparkstraße 9",
        "Linzerstraße 139",
        "Ernstbrunner Straße 102",
        "Kappel an der Drau 45",
        "Hauptstrasse 280",
        "Nr. 227",
        "Rennbahnweg 80",
        "Syrnauerplatz 3",
        "Breitenfurterstraße 99",
        "Mostnystrasse 8",
        "Altenmarkter Straße 1/3",
        "Rembrandtstr. 32-34",
        "Thayagasse 4",
        "Lorenz-Müller-Gasse 7-11",
        "Berndorf Nr. 142",
        "Gersthoferstraße 101",
        "Ortsstraße 24",
        "Marktgasse 23",
        "Lorenz-Müller-Gasse 7-11",
        "Schulstraße 20/2",
        "Zwettlerstraße 16",
        "Schnittering 41",
        "Aumühlweg 17-19/6a",
        "Zerlach 73",
        "Reischau 6",
        "Bizäntweg 3",
        "Kefergasse 34",
        "Unterlimbach 81",
        "Rauholzstraße 27e",
        "Freßnitzstraße 7",
        "Hauptstraße 190",
        "Feldstraße 2a",
        "Bundesstraße West 5",
        "Semmeringstraße 5",
        "Linzer Straße 99",
        "Oberlaaerstr./ Murbangasse 3",
        "Viertelfeistritz 109",
        "Teesdorf 9",
        "Grindelstraße 4",
        "Gewerbestraße 1",
        "St. Severinstraße 6",
        "Schremser Strasse 69",
        "Wolfhoferamt 148",
        "Großmengersdorf 17",
        "Blumengasse 31",
        "Lazarettgürtel 75",
        "Untere Marktstraße 75",
        "Bäckerfeldstraße 19",
        "Feldhamerstrasse 25",
        "Grazer Straße 93",
        "Packer Straße 51 / 1 u.",
        "Betriebsstraße 24",
        "Gewerbepark-Wagram 1",
        "Mairhof 7",
        "Hauptstraße 168",
        "Klein-Engersdorferstr. 62",
        "Raiffeisenstraße 48",
        "Puchstraße 157",
        "Gewerbestraße 3/1",
        "Sportplatzstraße 2",
        "Römerstraße 10",
        "Gschwandtnergasse 31",
        "Betriebsgebiet Nord 2",
        "Sofienalpenstr. 1",
        "Sochorgasse 4",
        "Brünner Straße 66",
        "Antholzer Talstrasse 15/A",
        "Bundesstraße 64a",
        "Haberlgasse 34",
        "Feldgasse 1",
        "Breitenfurter Str. 70-74",
        "Mandelsbergerstr. 12",
        "Großlehen 7",
        "Attemsgasse 6",
        "Oleandergasse 11",
        "Albersdorfstraße 29",
        "Knaufstraße 12",
        "Prarath 7",
        "Mühldorf 435",
        "Hitzendorf 38",
        "Lodengasse 23 / Ecke Südring 223",
        "Inffeldgasse 11/l",
        "Josef-Pock-Strasse 3",
        "Albrechtsbergergasse 22",
        "Ganglbauergasse 24",
        "Enzersdorferstr. 43-45",
        "Silberergasse 2",
        "Moosmahdstraße 10a",
        "Leopold-Ernst-Gasse 26",
        "Oberwiedenstraße 71",
        "Dr. Viktor Verdroß-Straße 5",
        "Dorn 909",
        "Leobner Straße 48",
        "Lödersdorf Nr. 81",
        "Triesterstraße 40",
        "Am Bach 27",
        "Kaiserstrasse 23a",
        "Franz-Guggenbergerstraße 18",
        "Kobl 8",
        "Gündorf Narrath 13",
        "Gnies 13",
        "Neundling 2",
        "Tetmajergasse 5",
        "Liedinger Straße 2",
        "Untere Hauptstr. 45",
        "Hintertober 12",
        "Umfahrungsstr. 635c",
        "Hungberg 6",
        "Anton-Maller-Str. 19",
        "Moserrautweg 12",
        "Innsbrucker Straße 10",
        "Lacken / Gries 7",
        "Röhrenbachstrasse 1",
        "Feldweg 25",
        "Ostbahnweg 15",
        "Gewerbestraße 3",
        "Alleenweg 1",
        "Schirnitz 23",
        "Obere Hauptstrasse 112",
        "Aspernstraße 129",
        "St. Peter im Holz 13",
        "Sturmberg 200",
        "Brennbichl 39",
        "Josef Jessernigg-Str. 10",
        "Nr. 3",
        "Am Spitz 9 / Top 3",
        "Marbergerstr. 35",
        "Nr. 516",
        "Fröbelgasse 33-35",
        "Weinberg 30",
        "Krenglbacher Straße 66",
        "Zellerstrasse 83",
        "Bundesstrasse 212",
        "Greithweg 6",
        "Bundesstrasse 26",
        "Kärtnerstrasse 354",
        "Liebochstrasse 18",
        "Gadystraße 1A",
        "Unterer Markt 21",
        "Seizerstraße 1",
        "Betriebsgebiet-Nord 1",
        "Bahnhofstraße 122",
        "Pass-Thurn-Straße 27",
        "Wallenmahd 2",
        "Richard Strauss Straße 14",
        "Regerstätten 7",
        "Badgasse 19",
        "Farcha 25",
        "Josef-Ortis Strasse 30",
        "Dieselstrasse 7",
        "Haagbergstrasse 35/1",
        "Inning 64",
        "Tulpenweg 2",
        "Breitenfurterstrasse 34",
        "Ruifach 4",
        "Nr. 69",
        "Obkirchergasse 29",
        "Gewerbering 3",
        "Höhenstrasse 35",
        "Hans Liebherr Str. 25",
        "Texing 20",
        "Salzburgerstraße 42",
        "Schönburgstrasse 7",
        "Nobilegasse 21",
        "Zöppelgasse 16",
        "Virgener Straße 16",
        "Bahnhofstraße 48/2",
        "Hafnerstraße 37",
        "Käferheim Str. 53",
        "Kreuzberg 112",
        "Wiener Neustädter Straße 45",
        "Leobersdorfer Straße 84b",
        "Münichreith 2",
        "Knaufstraße 10",
        "Industriestrasse 15",
        "Oberbergstraße 65a",
        "Antlassweg 1",
        "Pechhüttenstraße 4A",
        "Egger-Lienz Straße 6",
        "Johann Steinböck-Strasse 7",
        "Süd Ost Siedlerstrasse 3",
        "Europaplatz 1",
        "Saturnerstraße 3",
        "Renetshammer Weg 47",
        "Hauptstraße 66",
        "Raiffeisenstrasse 16",
        "Fischauer Gasse 207",
        "Zissersdorf 35",
        "Sonnberg 104",
        "Wiener Straße 50",
        "Beharding 7",
        "Altenmarkt 5",
        "Oberlembach 12",
        "Gschriet 28",
        "Turracher Straße 5",
        "Stein 10",
        "Industriestraße 2",
        "Niederdorferstrasse 44",
        "Beschling - Dorfstraße 34",
        "Kapellenstraße 63",
        "Bundesstraße 2",
        "Niederwölz 130",
        "Neusiedlung 129",
        "Anzengruberstraße 23",
        "Egerbach 78",
        "Pechhüttenstraße 4a/8",
        "Faunastraße 2",
        "Schratten 19",
        "Gartenstraße 1",
        "Waldgasse 2",
        "Wienerstraße 42 top",
        "Heistergasse 4-6",
        "Mariazellerstraße 92a",
        "Josef-Wildberger-Str. 48",
        "Dorfstraße 3",
        "Leobersdorfer Straße 86",
        "Hubertusgasse 7",
        "Mühlau 8",
        "Klagenfurter Straße 15a",
        "Faning 10",
        "Kreuzstraße 11",
        "Burgstall 62",
        "Kärntner Straße 283",
        "Josef-Ressel-Straße 1",
        "Bahnhofstraße 163",
        "Fabianistr. 9",
        "Alter Hainburgerweg 2",
        "Postfeld 347",
        "Moos 1a",
        "Landstraßer Hauptstr. 128",
        "Siegbichler Straße 22",
        "Thayastraße 12",
        "Wirtschaftspark F",
        "Altenburger Straße 4-5",
        "Jassing 2",
        "Reklewskigasse 32",
        "Landesstraße 31",
        "Rasis Bündt 5a",
        "Lastenstraße 21",
        "Nikolaus-August-Otto-Straße 10",
        "Hirschtraße 36/IZ-West",
        "Hart 113",
        "Edt 7",
        "Pustertaler Straße 5",
        "Rheinstraße 38",
        "Hauptstraße 33",
        "Lambacher Straße 11",
        "Ybbsfeldstraße 16",
        "Hackhofergasse 4",
        "Wiener Straße 82",
        "Edtsiedlung 143",
        "Glantschach 21",
        "Mageregger Straße 59",
        "Zissersdorf 96",
        "Millstätter Straße 40",
        "Alois Lehrgasse 4",
        "Matzlerberg 30b",
        "Gewerbepark 2",
        "Loferer Bundesstraße 46",
        "Hoffeld 27",
        "Drautalbundesstraße 14",
        "Messenbach 19",
        "Josef Teublstraße 6",
        "Gewerbepark 3",
        "Steghofweg 1",
        "Genochplatz 9",
        "Diepersdorf 1",
        "Dürerstraße 37",
        "Bundesstraße 19",
        "Herndlgasse 15",
        "Mollramerstraße 45",
        "Hauptstraße 121",
        "Kirchenweg 7",
        "Bundesstraße 18",
        "Greuth 26",
        "Industriestraße Ost 1",
        "Schlaugenham 24/2",
        "Linzerstraße 56",
        "Arndtstraße 50",
        "Framrach 50",
        "Falkensteinerstraße 1",
        "Bahnhofstraße 70",
        "Berndorf 19",
        "Nauders 260",
        "Klamm 12",
        "Dorfstraße 47 E/3",
        "Lofererstraße 56",
        "Atterseerstraße 115",
        "Köglerweg 5",
        "Johann-Georg-Ulmer-Straße 8",
        "Pirning 124",
        "Gewerbegebiet 201",
        "Siegfried-Charoux-Straße 20",
        "Industriestraße 2",
        "Ragnitzstraße 377",
        "Bahnweg 94",
        "Autstraße 4a",
        "Burgenlandstraße 18",
        "Außerweg 61",
        "Bahnhof Umgebung 17",
        "Bachgasse 2a",
        "Untermarktstraße 63",
        "Fiecht 6",
        "Tiroler Straße 117",
        "Schlagturm 31",
        "Auen 61",
        "Wildbichler Straße 52",
        "Dorfstraße 14",
        "Hauptstraße 18a",
        "Riegersbach 222",
        "Loferer Bundesstraße 32",
        "Tulpenweg 2",
        "Roseggergasse 21",
        "Höfling, Schwarze Straße 4",
        "Pframa 63",
        "Hauptstraße 83",
        "Holzstraße 3",
        "Alois-Ebner-Straße 3",
        "Schmiedingerstraße 6",
        "Schlappach 7",
        "Kleinprethal 24",
        "J. Weingartner - Str. 85",
        "Stadtplatz 30",
        "Packerstraße 162",
        "Laaer Bundesstraße, Parzelle 252",
        "Kemating 36a",
        "Ausfahrtsstraße Objekt 966",
        "Lagerhausstraße 28",
        "Aflenz Kurort 410",
        "Winklarner Straße 10",
        "Hochwassergasse 6 Box 5",
        "Jägerstraße 68-70",
        "Eichberg 141",
        "Fressnitzstraße 43",
        "Neusiedler Straße 17",
        "Perfektastraße 88/3",
        "Betriebsstraße 1",
        "Langer Weg 12",
        "Oboakergasse 25",
        "Tulpenweg 2",
        "Hochart 69",
        "Schimmelgasse 11/27-28",
        "Industriestraße 1",
        "Albrechtstraße 50",
        "Berndorfer Straße 29",
        "Goritschitzen 28",
        "Felixstraße 2-12",
        "Olympstraße 29",
        "Breitenbruck 71",
        "Wolfshoferamt 25",
        "Industriepark Süd A3",
        "Uferstraße 14",
        "Bambergergasse 62/1",
        "Haselböckaustraße 2",
        "Bundesstraße 33",
        "Punistraße 4",
        "Storkgasse 16",
        "Madlsederstraße 1",
        "Truttendorf 35",
        "Werkstraße 4",
        "Speisingerstraße 159",
        "Kupferschmiedgasse 19/7",
        "Ing. Etzelstraße Viaduktbogen 72/73",
        "Graf-Starhemberggasse 33",
        "Ing.-Etzel-Straße 141",
        "Franking 17",
        "Hallerstraße 141",
        "Salzstraße 14",
        "Seestadtstraße 8 / Objekt 1",
        "Purkersdorfer Straße 53",
        "Straß 16",
        "Untergiem 44",
        "Oberbuch 51",
        "Haller Innbrücke 9c",
        "Gaden 159a",
        "Hebragasse 5",
        "Holzmüllerstraße 8",
        "Grazerstraße 24",
        "Bärbichl",
        "Weißbriach 237",
        "Pfarrer Karl Schillingasse 3",
        "Feldbacher Straße 62",
        "Bahnstraße 12",
        "Judenburgstraße 14a",
        "Kirchbach 122",
        "Industriezone 1",
        "Feldgasse 1",
        "Südbahngürtel 8",
        "Gewerbepark II 4a",
        "Neustift 5",
        "Im Buch 50",
        "Zettlau 6",
        "Obertrumer Landesstraße 9",
        "Oberbergern 142",
        "Otto-Gruber-Straße 7",
        "Moartalstraße 5",
        "Hauptstraße 6A",
        "Glocknerweg 4",
        "Schwendnergasse 5",
        "Eichenbrunn 169",
        "Wiener Straße 126",
        "Mozartstraße 1",
        "Preßguts 56",
        "Kleinengersdorfer Hauptstraße 38",
        "Ferrogasse 16",
        "Schlossgasse 1",
        "Brünnerstraße 420",
        "",
        "Kremsegger Straße 16",
        "Gewerbepark 12",
        "Theyernerstraße 4",
        "Anna-Dengel-Straße 10a Top 32",
        "Scherenbrandtnerhofstraße 8",
        "Mannagettagasse 33",
        "Aspanger Zeile 49",
        "Rieder Straße 18",
        "Nr. 61",
        "Landturmstraße 2",
        "Aigenfliessen 20",
        "Ehrenschachen 226",
        "Ing. Etzel Straße Viaduktbogen 139",
        "Perfektastraße 88",
        "Bundesstraße 9",
        "Hag 5",
        "Mühlbacherstraße 74",
        "Au 31",
        "Ditscheinergasse 3",
        "Tegelanger 251/1",
        "Rennbahnweg 74",
        "Sallaberg am See 133",
        "Strass 91",
        "Aichberg 21",
        "Gleinstraße 136",
        "Linzerstraße 479",
        "Windegg 5",
        "Bodenstraße 2",
        "Lanzendorf 35",
        "Burgstraße 11",
        "Wiener Straße 6",
        "Weidach 372a",
        "Auland 2",
        "Gewerbegebiet Ehring 11",
        "Unterglan 41",
        "Meilstraße 48",
        "Stubaitalstraße 1",
        "Obere Hauptstraße 85",
        "Burgstall 62",
        "St.Gertraudi 76",
        "Grünau 19",
        "Wiener Straße 20",
        "Dr. Franz Werner Straße 31",
        "Hetzendorfer Straße 1",
        "Hauptstraße 172",
        "Unterberg 16a",
        "Kaiser-Friedrich-Straße 5",
        "Ulmerfelderstraße 6",
        "Innsbrucker Straße 57-59",
        "Untere Hauptstraße 14",
        "Sperkental 25",
        "Churer Straße 30",
        "Hintere Achmühlerstraße 9",
        "Egger-Lienz-Str. 116",
        "Füchselbachstraße 11",
        "Sportplatzstraße 9",
        "Zerlach 29",
        "Schoberpaß Bundesstraße 23",
        "Mailstraße 59",
        "Badweg 2",
        "Fabrikstraße 6",
        "Kirchdorf 13",
        "Mediastraße 3",
        "Salzstadtstraße 2",
        "Linzer Straße 11",
        "Klederinger Straße 37",
        "Franz-Broschek-Platz 8",
        "Salzburgerstraße 39",
        "Brunnengasse 15",
        "Hauptstraße 186",
        "Betriebsstraße II/15",
        "Pechhüttenstraße 6",
        "Fischertratten 69",
        "Mayerling 17",
        "Industriestraße 13",
        "Umfahrungsstraße 30",
        "Mettersdorf 148",
        "Markt 125",
        "Schießstand 28",
        "Mitterweg 20",
        "Ulrichsberg 31",
        "Industriestraße 11-13",
        "Trebesing-Bad 33",
        "Vorderkrimml 79",
        "Mönichkirchnerstraße 9",
        "Hintere Ortsstraße 76",
        "Lustenauer Straße 75b",
        "Bahnhofstraße 29",
        "Dreßlen 496",
        "Hubertusgasse 7",
        "Deutschstraße 6",
        "Vordertalstraße 72",
        "Sportplatzweg 14",
        "Wiener Straße 14",
        "Purkersdorferstraße 20",
        "Betriebsgebiet Nord 1",
        "Eichetstraße 5-7",
        "Am Bahndamm 8",
        "Venedigstadt 21",
        "Starhemberg 15",
        "Gewerbestraße 3",
        "Gewerbepark 2",
        "St. Margarethenstraße 152g",
        "Handelspark 3",
        "Wiener Straße 43",
        "Wiesing 23A",
        "Westbahnstraße 114",
        "Bahnhofstraße 4",
        "Bruckner Bundesstraße 25",
        "Unterkolbnitz 57",
        "Klagenfurterstraße 49",
        "Linzerstraße 42",
        "Handberg 42",
        "Industriezone 8",
        "Fürstenweg 97",
        "Hochreit 1",
        "Missindorfstraße 6",
        "Stockedt 5",
        "Urichstraße 72",
        "Badstubenweg 72",
        "Gewerbepark 5",
        "Hart 84",
        "Villacher Str. 127",
        "Theaterweg 3",
        "Gewerbering 15",
        "Gießenstraße 26",
        "Abt Karlstraße 75",
        "Paltramplatz 2",
        "Harterstraße 48",
        "Kellau 37",
        "Dolnii Slaveci 120A",
        "Körmenderstraße 15",
        "Bundesstraße 1038",
        "Zehenthofstraße 32",
        "Grazerstraße 37",
        "Hauptstraße 27",
        "Badenerstraße 54",
        "Laxenburgerstraße 17",
        "Horner Straße 27",
        "Hans-Sachs-Straße 133",
        "Bahnhofstraße 1",
        "Luftenbergstraße 26",
        "Kaisersbergerstraße 11",
        "Naarner Straße 48",
        "Arthur-Krupp Straße 2",
        "Sofie-Lazarsfeld-Straße 16",
        "Scheibrand 152",
        "Walkersdorf 80",
        "Wiener Straße 2b",
        "Landscha 74",
        "Hauptstraße 10",
        "Tullner Straße 2",
        "Viaduktbogen 108",
        "Obersdorf 138",
        "Obere Hauptstraße 62",
        "Zollstraße 7",
        "Stublerfeld 19",
        "Kurzenkirchen 2",
        "Gewerbestraße 3",
        "Dr. Hans-Bachmann-Straße 51",
        "An der Bundesstraße 109",
        "Quadrella 12",
        "Innsbruckerstraße 36a",
        "2. Betriebsstraße 9",
        "Hagerweg 7",
        "Hauptswtraße 36-B67",
        "Adnet 115b",
        "Mobilkomstraße 7",
        "Lauterbach 14",
        "Saxen 24",
        "Weitenfeld 42",
        "Sub Dura 4-5",
        "Schlöglgasse 6",
        "Eipeldauer Str. 43",
        "Herzog-Odilo-Straße 112",
        "Oberlebing 45",
        "Mühltal 59",
        "Weinzierler Brücke 20",
        "Langwieser Straße 102",
        "Kärtnerstraße 115",
        "Adnet 37",
        "Äußeres Hirschfeld 8",
        "Ul. Hermana Potocnika 37",
        "Dr. Hans Bachmannstraße 28",
        "Unterhömbach 18",
        "Steinhaus 107"

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
        "7100",
        "2282",
        "8240",
        "3862",
        "1170",
        "4441",
        "8700",
        "5602",
        "4871",
        "4060",
        "4443",
        "3040",
        "4980",
        "4600",
        "4730",
        "3950",
        "4771",
        "6143",
        "9711",
        "6710",
        "1040",
        "8083",
        "9872",
        "8451",
        "88046",
        "6822",
        "5230",
        "6805",
        "6341",
        "2326",
        "8162",
        "2752",
        "6971",
        "3413",
        "2380",
        "2000",
        "7361",
        "8010",
        "5020",
        "2700",
        "1210",
        "6063",
        "8073",
        "8073",
        "6850",
        "4652",
        "5400",
        "6020",
        "5020",
        "9020",
        "4020",
        "1010",
        "4060",
        "6971",
        "4400",
        "4723",
        "1100",
        "8850",
        "4141",
        "6800",
        "8083",
        "9400",
        "2340",
        "6414",
        "4573",
        "5020",
        "6830",
        "8922",
        "8401",
        "6811",
        "3664",
        "2540",
        "2442",
        "6870",
        "6914",
        "6706",
        "4932",
        "1230",
        "6971",
        "5241",
        "4910",
        "4400",
        "8051",
        "6800",
        "56307",
        "1210",
        "9800",
        "6330",
        "5111",
        "4840",
        "6850",
        "8010",
        "6993",
        "1230",
        "5020",
        "3430",
        "4070",
        "4320",
        "3500",
        "4906",
        "1220",
        "5700",
        "4481",
        "9620",
        "9560",
        "9800",
        "9100",
        "9400",
        "9300",
        "9500",
        "5280",
        "4710",
        "4563",
        "4782",
        "4407",
        "4600",
        "8073",
        "4481",
        "5580",
        "5600",
        "5301",
        "4850",
        "4240",
        "5230",
        "4150",
        "5311",
        "4820",
        "68163",
        "94036",
        "5071",
        "9020",
        "1210",
        "8700",
        "6020",
        "8055",
        "2700",
        "4020",
        "6850",
        "3100",
        "4845",
        "1230",
        "92260",
        "39100",
        "39031",
        "5163",
        "3925",
        "8511",
        "1050",
        "4320",
        "8435",
        "8041",
        "6824",
        "3653",
        "4020",
        "1210",
        "9635",
        "8345",
        "8480",
        "2410",
        "8665",
        "8943",
        "9615",
        "8120",
        "8053",
        "9062",
        "8753",
        "8322",
        "8071",
        "2483",
        "4228",
        "4575",
        "8041",
        "2203",
        "4775",
        "8055",
        "39010",
        "8580",
        "9020",
        "8112",
        "8330",
        "8075",
        "2620",
        "2833",
        "4702",
        "2700",
        "8953",
        "4511",
        "4600",
        "8790",
        "8793",
        "5120",
        "4020",
        "3363",
        "3340",
        "3250",
        "8350",
        "9330",
        "6365",
        "6170",
        "6335",
        "2331",
        "8073",
        "2230",
        "3240",
        "8354",
        "4810",
        "9113",
        "39010",
        "1180",
        "8142",
        "4850",
        "8454",
        "8430",
        "8410",
        "2700",
        "8443",
        "1180",
        "8605",
        "8045",
        "4817",
        "4654",
        "4823",
        "5630",
        "6444",
        "6700",
        "8010",
        "8020",
        "8020",
        "8082",
        "8230",
        "8323",
        "8333",
        "6653",
        "8740",
        "8342",
        "8342",
        "9613",
        "9754",
        "2482",
        "8112",
        "9342",
        "2514",
        "8563",
        "6441",
        "8790",
        "6262",
        "7453",
        "3633",
        "9473",
        "5732",
        "8076",
        "8600",
        "2512",
        "6555",
        "8511",
        "3522",
        "8020",
        "3493",
        "1100",
        "8211",
        "9360",
        "8763",
        "1220",
        "6334",
        "8055",
        "7412",
        "8162",
        "1180",
        "8081",
        "4810",
        "8362",
        "8453",
        "8063",
        "8411",
        "8212",
        "8342",
        "8054",
        "8384",
        "6563",
        "1110",
        "1110",
        "4771",
        "5230",
        "8292",
        "1030",
        "4070",
        "2124",
        "4531",
        "8451",
        "9761",
        "8054",
        "8250",
        "4532",
        "6971",
        "8401",
        "8160",
        "9990",
        "8756",
        "9521",
        "2230",
        "2700",
        "2434",
        "8421",
        "6820",
        "8160",
        "1120",
        "7141",
        "2604",
        "1140",
        "2003",
        "9162",
        "8401",
        "8471",
        "1220",
        "3910",
        "1120",
        "4040",
        "8551",
        "1020",
        "2136",
        "1200",
        "8324",
        "1180",
        "2301",
        "7122",
        "1200",
        "3623",
        "3542",
        "4632",
        "2544",
        "8082",
        "4680",
        "9800",
        "4645",
        "8292",
        "6971",
        "8670",
        "7302",
        "8076",
        "7442",
        "2620",
        "3925",
        "1100",
        "8184",
        "2523",
        "6890",
        "4671",
        "3313",
        "3860",
        "3572",
        "4540",
        "1170",
        "8020",
        "4822",
        "4050",
        "4655",
        "4820",
        "8583",
        "2483",
        "4061",
        "4121",
        "2231",
        "2102",
        "8010",
        "8055",
        "7301",
        "3931",
        "6065",
        "1170",
        "3300",
        "1140",
        "2512",
        "1210",
        "39030",
        "8740",
        "1160",
        "2211",
        "1120",
        "6020",
        "5102",
        "1220",
        "1220",
        "8062",
        "8940",
        "8443",
        "8330",
        "8151",
        "9020",
        "8010",
        "8051",
        "1120",
        "1160",
        "2340",
        "1220",
        "6850",
        "1170",
        "1160",
        "8530",
        "6867",
        "8600",
        "8334",
        "1100",
        "6334",
        "6380",
        "2100",
        "5102",
        "8452",
        "8261",
        "4931",
        "1210",
        "9341",
        "7035",
        "8163",
        "6290",
        "4723",
        "3011",
        "9523",
        "6353",
        "5662",
        "3203",
        "6900",
        "1220",
        "8184",
        "4932",
        "8211",
        "7122",
        "1220",
        "9811",
        "8160",
        "6463",
        "2000",
        "9753",
        "2620",
        "6424",
        "6236",
        "1160",
        "6250",
        "4631",
        "5730",
        "2632",
        "6421",
        "6100",
        "8054",
        "8143",
        "8501",
        "3262",
        "8793",
        "7123",
        "8240",
        "6372",
        "6850",
        "1230",
        "8160",
        "3650",
        "8160",
        "8130",
        "3362",
        "3364",
        "3383",
        "8600",
        "1120",
        "6092",
        "8342",
        "1190",
        "2020",
        "8047",
        "6410",
        "3242",
        "4600",
        "1040",
        "1150",
        "1120",
        "9971",
        "4780",
        "8073",
        "5071",
        "3920",
        "2483",
        "2560",
        "3662",
        "8940",
        "8075",
        "8282",
        "6336",
        "2320",
        "6020",
        "2345",
        "8053",
        "9021",
        "4614",
        "4910",
        "3683",
        "3382",
        "2700",
        "2094",
        "8653",
        "2320",
        "4794",
        "8934",
        "3962",
        "9702",
        "9560",
        "8940",
        "3470",
        "9521",
        "6710",
        "8076",
        "7532",
        "8831",
        "3921",
        "4020",
        "6334",
        "2320",
        "8052",
        "5441",
        "3433",
        "8582",
        "2120",
        "1200",
        "8605",
        "6020",
        "5325",
        "2560",
        "2201",
        "6383",
        "9220",
        "9062",
        "8071",
        "9433",
        "8700",
        "3464",
        "6574",
        "1110",
        "2460",
        "5741",
        "4890",
        "1030",
        "9062",
        "3830",
        "8940",
        "7100",
        "8770",
        "1232",
        "9241",
        "6890",
        "9020",
        "2700",
        "9020",
        "8212",
        "4650",
        "9900",
        "6900",
        "8920",
        "4655",
        "3376",
        "1190",
        "2020",
        "5531",
        "9556",
        "9020",
        "2094",
        "9545",
        "2325",
        "8713",
        "2801",
        "5700",
        "9751",
        "9990",
        "4772",
        "8295",
        "7412",
        "3243",
        "1220",
        "4552",
        "4030",
        "8770",
        "1100",
        "2620",
        "7022",
        "9232",
        "8770",
        "9121",
        "8605",
        "4902",
        "4531",
        "1120",
        "9433",
        "4142",
        "4070",
        "8324",
        "6543",
        "8768",
        "6240",
        "6322",
        "4850",
        "8042",
        "6850",
        "8863",
        "5581",
        "2103",
        "2100",
        "8047",
        "6405",
        "6063",
        "6020",
        "6145",
        "6170",
        "6065",
        "6410",
        "6134",
        "6408",
        "6135",
        "8162",
        "6341",
        "6175",
        "8244",
        "8253",
        "5700",
        "9150",
        "8663",
        "9560",
        "2305",
        "2301",
        "3680",
        "3150",
        "5102",
        "6421",
        "8742",
        "39022",
        "3874",
        "8561",
        "2100",
        "4863",
        "1300",
        "5071",
        "8623",
        "3300",
        "1230",
        "1200",
        "8234",
        "8670",
        "2340",
        "1230",
        "4210",
        "6020",
        "1160",
        "9581",
        "7423",
        "1030",
        "3900",
        "3945",
        "2561",
        "9062",
        "7210",
        "6430",
        "4223",
        "3572",
        "9330",
        "3313",
        "1220",
        "4553",
        "8753",
        "39020",
        "1050",
        "4400",
        "9131",
        "4650",
        "1230",
        "2201",
        "6020",
        "1040",
        "6020",
        "5131",
        "6020",
        "6170",
        "1220",
        "3100",
        "4850",
        "8330",
        "8274",
        "6070",
        "6943",
        "1090",
        "4030",
        "7423",
        "6351",
        "9622",
        "2700",
        "8083",
        "2824",
        "8741",
        "8082",
        "6175",
        "2304",
        "9020",
        "2111",
        "2291",
        "6840",
        "5112",
        "5201",
        "3512",
        "5760",
        "5440",
        "2231",
        "5671",
        "9020",
        "2152",
        "2020",
        "8280",
        "8211",
        "2102",
        "1180",
        "7423",
        "1210",
        "1300",
        "4550",
        "6094",
        "3508",
        "6060",
        "5020",
        "2340",
        "2700",
        "4980",
        "4421",
        "5020",
        "4432",
        "8240",
        "6020",
        "1230",
        "7221",
        "6410",
        "4063",
        "5360",
        "1030",
        "6313",
        "1220",
        "8943",
        "6393",
        "4974",
        "8443",
        "1140",
        "4221",
        "6322",
        "4283",
        "6091",
        "2120",
        "6105",
        "6103",
        "5112",
        "9560",
        "6170",
        "6142",
        "7162",
        "9433",
        "6235",
        "3202",
        "2222",
        "6020",
        "1120",
        "2534",
        "6111",
        "4360",
        "3364",
        "6176",
        "3684",
        "3532",
        "6830",
        "6850",
        "6020",
        "4060",
        "7152",
        "8082",
        "8784",
        "6170",
        "6322",
        "2551",
        "6335",
        "7423",
        "5400",
        "4650",
        "2320",
        "2514",
        "6380",
        "1160",
        "2384",
        "2482",
        "2320",
        "9853",
        "2534",
        "9800",
        "2225",
        "8092",
        "5441",
        "6401",
        "3281",
        "8530",
        "8075",
        "9852",
        "5742",
        "2870",
        "2325",
        "6850",
        "3040",
        "6861",
        "2201",
        "1239",
        "4824",
        "6414",
        "5301",
        "3100",
        "2165",
        "5020",
        "9800",
        "2860",
        "4680",
        "2831",
        "4493",
        "6220",
        "5161",
        "3340",
        "6200",
        "4300",
        "8774",
        "5700",
        "9815",
        "9400",
        "4240",
        "4391",
        "39030",
        "6020",
        "3345",
        "1140",
        "4905",
        "6500",
        "9500",
        "6091",
        "9587",
        "9020",
        "6341",
        "2020",
        "6972",
        "3390",
        "1100",
        "8053",
        "5431",
        "9264",
        "8280",
        "6863",
        "9500",
        "8071",
        "8240",
        "2751",
        "2353",
        "3902",
        "4600",
        "2490",
        "4225",
        "8713",
        "4320",
        "3300",
        "1110",
        "6481",
        "8262",
        "3340",
        "8435",
        "8740",
        "3041",
        "6020",
        "8983",
        "2424",
        "39010",
        "6123",
        "4502",
        "5300",
        "6250",
        "6261",
        "6706",
        "6060",
        "2482",
        "4490",
        "8430",
        "5421",
        "7350",
        "5151",
        "6150",
        "3300",
        "437229",
        "2531",
        "1220",
        "5310",
        "4320",
        "6363",
        "4560",
        "4802",
        "8053",
        "5421",
        "7100",
        "1000",
        "6250",
        "3364",
        "4641"
        );
    // CITY
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
        "Neusiedl am See",
        "Markgrafneusiedl",
        "Friedberg",
        "Eisgarn",
        "Wien",
        "Behamberg",
        "Leoben",
        "Wagrein",
        "Haslach",
        "Leonding",
        "Maria Neustift",
        "Neulengbach",
        "Antiesenhofen",
        "Schleissheim",
        "Heiligenberg",
        "Gmünd",
        "Sigharting",
        "Matrei am Brenner",
        "Paternion",
        "Nenzing",
        "Wien",
        "St. Stefan im Rosental",
        "Millstatt",
        "Heimschuh",
        "Friedrichshafen",
        "Dünserberg",
        "Mattighofen",
        "Gisingen",
        "Ebbs",
        "Maria Lanzendorf",
        "Passail",
        "Wöllersdorf",
        "Hard",
        "Unterkirchbach",
        "Perchtoldsdorf",
        "Stockerau",
        "Kroat. Geresdorf",
        "Graz",
        "Salzburg",
        "Wr. Neustadt",
        "Wien",
        "Rum",
        "Feldkirchen",
        "Feldkirchen",
        "Dornbirn",
        "Steinerkirchen a.d. Traun",
        "Hallein",
        "Innsbruck",
        "Salzburg",
        "Klagenfurt",
        "Linz",
        "Wien",
        "Leonding",
        "Hard",
        "Steyr",
        "Natternbach",
        "Wien",
        "Murau",
        "Pfarrkirchen",
        "Feldkirch/Gisingen",
        "St. Stefan im Rosent",
        "Wolfsberg",
        "Mödling",
        "Mieming",
        "Hinterstoder",
        "Salzburg",
        "Rankweil",
        "Gams",
        "Kalsdorf",
        "Göfis",
        "Martinsberg",
        "Bad Vöslau",
        "Unterwaltersdorf",
        "Reuthe",
        "Hohenweiler",
        "Bürs",
        "Kirchheim",
        "Wien - Inzersdorf",
        "Hard",
        "Maria Schmolln",
        "Ried im Innkreis",
        "Steyr",
        "Graz",
        "Feldkirch",
        "Dernbach",
        "Wien",
        "Spittal an der Drau",
        "Kufstein",
        "Bürmoos",
        "Vöcklabruck",
        "Dornbirn",
        "Graz",
        "Mittelberg",
        "Wien - Inzersdorf",
        "Salzburg",
        "Tulln",
        "Eferding",
        "Perg",
        "Krems",
        "Eberschwang",
        "Wien",
        "Zell am See",
        "Asten",
        "Hermagor",
        "Feldkirchen",
        "Spittal an der Drau",
        "Völkermarkt",
        "Wolfsberg",
        "St. Veit/Glan",
        "Villach",
        "Braunau",
        "Grieskirchen",
        "Micheldorf",
        "St. Florian am Inn",
        "Steyr",
        "Wels",
        "Feldkirchen bei Graz",
        "Asten",
        "Tamsweg",
        "St. Johann im Pongau",
        "Eugendorf",
        "Timalkam",
        "Freistadt",
        "Mattighofen",
        "Rohrbach",
        "Innerschwand",
        "Bad Ischl",
        "Mannheim",
        "Passau",
        "Wals bei Salzburg",
        "Klagenfurt",
        "Wien-Strebersdorf",
        "Leoben",
        "Innsbruck",
        "Graz",
        "Wr. Neustadt",
        "Linz",
        "Dornbirn",
        "St. Pölten",
        "Regau-Rutzenmoos",
        "Wien - Inzersdorf",
        "Ammerthal",
        "Bozen",
        "Bruneck",
        "Palting",
        "Arbesbach",
        "St. Stefan ob Stainz",
        "Wien",
        "Perg",
        "Wagna",
        "Graz-Liebenau",
        "Schlins",
        "Feistritz",
        "Linz",
        "Wien",
        "Dellach/Gail",
        "St. Anna am Aigen",
        "Mureck",
        "Hainburg",
        "Langenwang",
        "Aigen im Ennstal",
        "Görtschach",
        "Peggau",
        "Graz",
        "Moosburg",
        "Fohnsdorf",
        "Eichkögl",
        "Vasoldsberg",
        "Ebreichsdorf",
        "Zelezniki",
        "Roßleithen",
        "Graz-Liebenau",
        "Großebersdorf",
        "Taufkirchen / Pram",
        "Graz - Seiersberg",
        "Vöran",
        "Köflach",
        "Klagenfurt",
        "Gratwein",
        "Gossendorf",
        "Hart bei Graz",
        "Neunkirchen",
        "Bromberg",
        "Wallern an der Trattnach",
        "Lichtenwörth",
        "Donnersbach",
        "Allhaming",
        "Wels",
        "Eisenerz",
        "Trofaiach",
        "Reith",
        "Linz",
        "Ulmerfeld-Hausmening",
        "Waidhofen an der Ybbs",
        "Wieselburg",
        "Fehring",
        "Althofen",
        "Kirchberg",
        "Zirl",
        "Thiersee",
        "Vösendorf",
        "Feldkirchen",
        "Gänserndorf",
        "Smarje pri Jelsah",
        "St. Anna am Aigen",
        "Gmunden",
        "Ruden",
        "San Felice",
        "Wien",
        "Zwaring-Pöls",
        "Timelkam",
        "Arnfels",
        "Leibnitz",
        "Wildon",
        "Wiener Neustadt",
        "Gleinstätten",
        "Wien",
        "Kapfenberg",
        "Graz",
        "St. Konrad",
        "Bad Wimsbach",
        "Steeg",
        "Bad Hofgastein",
        "Längenfeld",
        "Bludenz",
        "Graz",
        "Graz",
        "Graz",
        "Kirchbach",
        "Hartberg",
        "Petersdorf",
        "Riegersburg, Steierm",
        "Bach",
        "Zeltweg",
        "Raning",
        "Gnas",
        "Feistritz/Gail",
        "Steinfeld",
        "Münchendorf",
        "Gratwein",
        "Gurk",
        "Traiskirchen",
        "Ligist",
        "Umhausen",
        "Eisenerz",
        "Schlitters",
        "Steinberg-Dörfl",
        "Schönbach",
        "Lavamünd",
        "Mühlbach",
        "Vasoldsberg",
        "Bruck / Mur",
        "Tribuswinkel",
        "Kappl",
        "St. Stefan ob Stainz",
        "Lichtenau im Waldviertel",
        "Graz",
        "Hadersdorf - Kammern",
        "Wien",
        "Ilztal",
        "Friesach",
        "Möderbrugg",
        "Wien",
        "Schwoich",
        "Graz",
        "Wolfau",
        "Passail",
        "Wien",
        "Heiligenkreuz",
        "Gmunden",
        "Söchau",
        "St. Johann",
        "Eggersdorf",
        "Hengsberg",
        "Kulm/Weiz",
        "Gnas",
        "Pirka",
        "Minihof-Liebau",
        "Galtür",
        "Wien",
        "Wien",
        "Sigharting",
        "Mattighofen",
        "Unterlimbach",
        "Wien",
        "Eferding",
        "Oberkreuzstetten",
        "Kematen an der Krems",
        "Heimschuh",
        "Greifenburg",
        "Graz-Straßgang",
        "Vorau",
        "Rohr im Kremstal",
        "Hard",
        "Kalsdorf bei Graz",
        "Preding",
        "Nußdorf/ Debant",
        "St. Georgen ob Juden",
        "Treffen bei Villach",
        "Gänserndorf",
        "Wiener Neustadt",
        "Götzendorf an der Leitha",
        "Wolfsberg",
        "Nenzing",
        "Weiz",
        "Wien",
        "Podersdorf am See",
        "Theresienfeld",
        "Wien",
        "Leitzersdorf",
        "Strau",
        "Kalsdorf bei Graz",
        "Spielfeld",
        "Wien",
        "Zwettl",
        "Wien",
        "Linz-Urfahr",
        "Wies",
        "Wien",
        "Laa an der Thaya",
        "Wien",
        "Kirchberg an der Raab",
        "Wien",
        "Rutzendorf",
        "Gols",
        "Wien",
        "Kottes",
        "Gföhl",
        "Pichl bei Wels",
        "Leobersdorf",
        "Kirchbach",
        "Haag am Hausruck",
        "Spittal an der Drau",
        "Grünau",
        "Neudau",
        "Hard",
        "Krieglach",
        "Nikitsch",
        "Vasoldsberg",
        "Langeck",
        "Neunkirchen",
        "Arbesbach",
        "Wien",
        "Anger",
        "Tattendorf",
        "Lustenau",
        "Aichkirchen",
        "Wallsee",
        "Heidenreichstein",
        "Wolfshoferamt",
        "Bad Hall",
        "Wien",
        "Graz",
        "Bad Goisern",
        "Traun",
        "Vorchdorf",
        "Bad Ischl",
        "Edelschrott",
        "Ebreichsdorf",
        "Pasching",
        "Altenfelden",
        "Strasshof",
        "Bisamberg",
        "Graz",
        "Graz",
        "Deutschkreutz",
        "Schweiggers",
        "Thaur",
        "Wien",
        "Amstetten",
        "Wien",
        "Traiskirchen/Oeynhausen",
        "Wien",
        "Rasen/Antholz",
        "Zeltweg",
        "Wien",
        "Pillichsdorf",
        "Wien",
        "Innsbruck",
        "Anthering",
        "Wien",
        "Wien",
        "Kumberg",
        "Weißenbach bei Liezen",
        "Gleinstätten",
        "Feldbach",
        "Hitzendorf",
        "Klagenfurt",
        "Graz",
        "Graz",
        "Wien",
        "Wien",
        "Mödling",
        "Wien",
        "Dornbirn",
        "Wien",
        "Wien",
        "Deutschlandsberg",
        "Schwarzenberg",
        "Bruck / Mur",
        "Lödersdorf",
        "Wien",
        "Schwoich",
        "St. Johann",
        "Korneuburg",
        "Anthering",
        "Großklein",
        "Sinabelkirchen",
        "Mettmach",
        "Wien",
        "Straßburg",
        "Steinbrunn",
        "Fladnitz",
        "Mayrhofen",
        "Natternbach",
        "Tullnerbach",
        "Villach-Landskron",
        "Going",
        "Taxenbach",
        "Rabenstein an der Pi",
        "Bregenz",
        "Wien",
        "Anger",
        "Kirchheim",
        "Ilztal",
        "Gols",
        "Wien",
        "Lendorf",
        "Naas",
        "Karrösten",
        "Stockerau",
        "Leßnig",
        "Neunkirchen",
        "Silz",
        "Alpbach",
        "Wien",
        "Kundl",
        "Krenglbach",
        "Mittersill",
        "Grafenbach-St.Valent",
        "Rietz",
        "Seefeld",
        "Graz-Straßgang",
        "Dobl",
        "Lieboch",
        "Wang",
        "Trofaiach",
        "Mönchhof",
        "Friedberg",
        "Oberndorf",
        "Dornbirn",
        "Wien",
        "Weiz",
        "Pöggstall",
        "Weiz",
        "Frohnleiten",
        "Amstetten/ Mauer",
        "Neuhofen an der Ybbs",
        "Hürm",
        "Oberaich",
        "Wien",
        "Birgitz",
        "Gnas",
        "Wien",
        "Hollabrunn",
        "Kainbach b. Graz",
        "Telfs",
        "Texing",
        "Wels",
        "Wien",
        "Wien",
        "Wien",
        "Matrei",
        "Schärding",
        "Feldkirchen",
        "Wals",
        "Groß Gerungs",
        "Ebreichsdorf",
        "Berndorf II",
        "Münichreith am Ostrong",
        "Weissenbach bei Liezen",
        "Hart bei Graz",
        "Loipersdorf",
        "Langkampfen",
        "Schwechat",
        "Innsbruck",
        "Brunn am Gebirge",
        "Graz-Neuhart",
        "Klagenfurt",
        "Marchtrenk",
        "Ried im Innkreis",
        "Yspertal",
        "Loosdorf",
        "Wiener Neustadt",
        "Drosendorf",
        "Stanz",
        "Schwechat",
        "Kopfing",
        "Altenmarkt",
        "Oberlembach",
        "Ferndorf",
        "Feldkirchen",
        "Lassing",
        "Kirchberg",
        "Treffen",
        "Nenzing",
        "Breitenhilm",
        "Litzelsdorf",
        "Niederwölz",
        "Langschlag",
        "Linz",
        "Schwoich",
        "Schwechat",
        "Graz",
        "Abtenau",
        "Königstetten",
        "Rosental",
        "Wolkersdorf",
        "Wien",
        "Kapfenberg",
        "Innsbruck",
        "Plainfeld",
        "Berndorf",
        "Hagenbrunn",
        "Erpfendorf",
        "Velden a Wörthersee",
        "Moosburg in Kärnten",
        "Vasoldsberg",
        "St. Andrä im Lavanttal",
        "Leoben",
        "Hausleiten",
        "Pettneu am Arlberg",
        "Wien",
        "Bruck an der Leitha",
        "Neukirchen am Großvenediger",
        "Frankenmarkt",
        "Wien",
        "Moosburg",
        "Waidhofen/Thaya",
        "Liezen",
        "Neusiedl am See",
        "St.Michael in Obers",
        "Wien",
        "Wernberg",
        "Lustenau",
        "Klagenfurt",
        "Wr. Neustadt",
        "Klagenfurt",
        "Pischelsdorf",
        "Edt bei Lambach",
        "Lienz",
        "Bregenz",
        "Hieflau",
        "Vorchdorf",
        "Ennsbach",
        "Wien",
        "Hollabrunn",
        "Eben",
        "Liebenfels",
        "Klagenfurt",
        "Zissersdorf",
        "Radenthein",
        "Himberg",
        "St.Stefan",
        "Katzelsdorf",
        "Zell am See",
        "Sachsenburg",
        "Nußdorf/Debant",
        "Lambrechten",
        "St. Johann in der Haide",
        "Wolfau",
        "St.Leonhard",
        "Wien",
        "Wartberg an der Krems",
        "Linz",
        "St.Michael in Obers",
        "Wien",
        "Neunkirchen",
        "Schattendorf",
        "Rosegg",
        "St.Michael in Obers",
        "Tainach",
        "Kapfenberg",
        "Wolfsegg am Hausruck",
        "Kematen/Krems",
        "Wien",
        "St. Andrä / Lavanttal",
        "Hofkirchen",
        "Eferding",
        "Kirchberg / Raab",
        "Nauders",
        "Rottenmann",
        "Radfeld",
        "Kirchbichl",
        "Timelkam",
        "Graz",
        "Dornbirn",
        "Predlitz",
        "St. Margarethen",
        "Langenzersdorf",
        "Korneuburg",
        "Kainbach bei Graz",
        "Pfaffenhofen",
        "Neu Rum",
        "Innsbruck",
        "Navis",
        "Zirl",
        "Thaur",
        "Telfs",
        "Vomp",
        "Pettnau",
        "Stans",
        "Passail",
        "Ebbs",
        "Kematen in Tirol",
        "Schäffern",
        "Waldbach",
        "Zell am See",
        "Bleiburg",
        "Veitsch",
        "Feldkirchen",
        "Pframa",
        "Groß Enzersdorf, Wittau",
        "Persenbeug",
        "Wilhelmsburg",
        "Anthering",
        "Rietz",
        "Obdach",
        "Algund bei Meran",
        "Litschau",
        "Södling",
        "Korneuburg",
        "Seewalchen am Attersee",
        "Flughafen Wien",
        "Wals bei Salzburg",
        "Aflenz",
        "Amstetten",
        "Wien",
        "Wien",
        "Rorbach an der Lafn",
        "Krieglach",
        "Mödling",
        "Wien",
        "Unterweitersdorf",
        "Innsbruck",
        "Wien",
        "Ledenitzen",
        "Pinkafeld",
        "Wien",
        "Schwarzenau",
        "Nondorf",
        "Hernstein",
        "Moosburg",
        "Mattersburg",
        "Ötztal Bahnhof",
        "Katsdorf",
        "St.Leonhard",
        "Althofen",
        "Wallsee",
        "Wien",
        "Schlierbach",
        "Aichdorf",
        "Glurns",
        "Wien",
        "Steyr",
        "Grafenstein",
        "Edt bei Lambach",
        "Wien",
        "Hagenbrunn",
        "Innsbruck",
        "Wien",
        "Innsbruck",
        "Franking",
        "Innsbruck",
        "Zirl",
        "Wien",
        "St.Pölten",
        "Timelkam",
        "Mühldorf",
        "Oberbuch",
        "Ampass",
        "Riefensberg",
        "Wien",
        "Linz",
        "Pinkafeld",
        "Scheffau",
        "Weißbriach",
        "Wr.Neustadt",
        "St. Stefan",
        "Seebenstein",
        "Weißkirchen",
        "Kirchbach",
        "Kematen",
        "Orth",
        "Klagenfurt",
        "Tresdorf",
        "Lassee",
        "Götzis",
        "Lamprechtshausen",
        "Seekirchen am Waller",
        "Oberbergern",
        "Saalfelden am Steine",
        "Golling",
        "Strasshof",
        "Bruck",
        "Klagenfurt",
        "Gnadendorf",
        "Hollabrunn",
        "Fürstenfeld",
        "Preßguts bei Weiz",
        "Kleinengersdorf",
        "Wien",
        "Pinkafeld",
        "Wien",
        "Wien-Flughafen",
        "Kremsmünster",
        "Axams",
        "Höbenbach",
        "Hall in Tirol",
        "Salzburg",
        "Mödling",
        "Wiener Neustadt",
        "Antiesenhofen",
        "Aschach an er Steyr",
        "Salzburg",
        "Ernsthofen",
        "Friedberg",
        "Innsbruck",
        "Wien",
        "Marz",
        "Telfs",
        "Hörsching",
        "SAt.Wolfgang",
        "Wien",
        "Wildschönau",
        "Wien",
        "Aigen im Ennstal",
        "St.Ulrich am Pillersee",
        "Ort im Innkreis",
        "Gleinstätten",
        "Wien",
        "Steyregg",
        "Kirchbichl",
        "Bad Zell",
        "Götzens",
        "Wolkersdorf",
        "Leutasch",
        "Reith bei Saalfeld",
        "Lamprechtshausen",
        "Feldkirch",
        "Zirl",
        "Mieders",
        "Tadten",
        "St. Andrä im Lavanttal",
        "Reith",
        "Hofstetten",
        "Kollnbrunn",
        "Innsbruck",
        "Wien",
        "Alland",
        "Volders",
        "Grein",
        "Neuhofen/Ybbs",
        "Völs",
        "St. Oswald",
        "Sperkental",
        "Rankweil",
        "Dornbirn",
        "Innsbruck",
        "Leonding",
        "Pamhagen",
        "Kirchbach",
        "Trieben",
        "Zirl",
        "Kirchbichl",
        "Enzesfeld",
        "Thiersee",
        "Pinkafeld",
        "Hallein",
        "Edt bei Lambach",
        "Kledering",
        "Möllersdorf",
        "St.Johann",
        "Wien",
        "Breitenfurt bei Wien",
        "Münchendorf",
        "Schwechat",
        "Gmünd",
        "Alland",
        "Spittal an der Drau",
        "Zistersdorf",
        "Mettersdorf",
        "Abtenau",
        "Inzing",
        "Oberndorf",
        "Deutschlandsberg",
        "Hart bei Graz",
        "Trebesing",
        "Wald",
        "Aspang",
        "Himberg",
        "Dornbirn",
        "Neulengbach",
        "Alberschwende",
        "Hagenbrunn",
        "Wien",
        "Gosau",
        "Mieming",
        "Eugendorf",
        "St. Pölten",
        "Drasenhofen",
        "Salzburg",
        "Spittal an der Drau",
        "Kirschlag in der buckl.Welt",
        "Haag am Hausruck",
        "Warth",
        "Wolfern",
        "Buch in Tirol",
        "Elixhausen",
        "Waidhofen",
        "Wiesing",
        "St. Valentin",
        "Mautern",
        "Zell am See",
        "Kolbnitz",
        "Wolfsberg",
        "Freistadt",
        "Waldhausen",
        "Gais",
        "Innsbruck",
        "Göstling",
        "Wien",
        "Ottnang",
        "Landeck",
        "Villach",
        "Götzens",
        "Riegersdorf",
        "Klagenfurt",
        "Ebbs",
        "Hollabrunn",
        "Fußach",
        "Melk",
        "Wien",
        "Graz-Neuhart",
        "Kuchl",
        "Grad",
        "Fürstenfeld",
        "Egg",
        "Villach",
        "Hausmannstätten",
        "Frieberg",
        "Matzendorf",
        "Guntramsdorf",
        "Vitis",
        "Wels",
        "Ebenfurth",
        "Luftberg",
        "St. Stefan ob Leoben",
        "Perg",
        "Amstetten",
        "Wien",
        "St. Leonhard",
        "Ilz",
        "Waidhofen/Ybbs",
        "Gabersdorf",
        "Zeltweg",
        "Asperhofen",
        "Innsbruck",
        "Bad Mitterndorf",
        "Zurndorf",
        "Nals",
        "Terfens",
        "St. Marien",
        "Hallwang",
        "Kundl",
        "Strass",
        "Bürs",
        "Hall",
        "Münchendorf",
        "St. Florian",
        "Leitring/ Leibnitz",
        "Adnet",
        "Oberpullendorf",
        "Nußdorf",
        "Steinach",
        "Amstetten",
        "Sasar",
        "Gaaden",
        "Wien",
        "Mondsee",
        "Allerheiligen/Perg",
        "Westendorf",
        "Kirchdorf",
        "Ebensee",
        "Graz-Neuhart",
        "Adnet",
        "Neusiedl am See",
        "Ljubljana",
        "Kundl",
        "Neuhofen",
        "Steinhaus"
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
