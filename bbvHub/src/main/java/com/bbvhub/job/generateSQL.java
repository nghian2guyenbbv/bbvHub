package com.bbvhub.job;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class generateSQL {


  public static void main(String[] args) {
     String DOUBLE_QUOTE = "\"";
     String QUOTE = "\'";
    List<String> custs = Arrays.asList("99416751"
        ,"99416794"
        ,"99416830"
        ,"99416834"
        ,"99416856"
        ,"99416874"
        ,"99416903"
        ,"99416928"
        ,"99416952"
        ,"99417016"
        ,"99417033"
        ,"99417115"
        ,"99417118"
        ,"99417127"
        ,"99417149"
        ,"99417209"
        ,"99417219"
        ,"99417239"
        ,"99417262"
        ,"99417309"
        ,"99417356"
        ,"99417364"
        ,"99417368"
        ,"99417388"
        ,"99417412"
        ,"99417413"
        ,"99417416"
        ,"99417418"
        ,"99417434"
        ,"99417445"
        ,"99417461"
        ,"99417470"
        ,"99417484"
        ,"99417485"
        ,"99417514"
        ,"99417554"
        ,"99417555"
        ,"99417597"
        ,"99417607"
        ,"99417609"
        ,"99417668"
        ,"99417674"
        ,"99417676"
        ,"99417679"
        ,"99417685"
        ,"99417699"
        ,"99417710"
        ,"99417712"
        ,"99417715"
        ,"99417737"
        ,"99417752"
        ,"99417755"
        ,"99417766"
        ,"99417773"
        ,"99417804"
        ,"99417817"
        ,"99417852"
        ,"99417868"
        ,"99417885"
        ,"99417887"
        ,"99417899"
        ,"99417924"
        ,"99417926"
        ,"99417936"
        ,"99417943"
        ,"99417945"
        ,"99417958"
        ,"99417977"
        ,"99417982"
        ,"99418015"
        ,"99418016"
        ,"99418021"
        ,"99418022"
        ,"99418036"
        ,"99418053"
        ,"99418074"
        ,"99418078"
        ,"99418083"
        ,"99418099"
        ,"99418108"
        ,"99418134"
        ,"99418135"
        ,"99418148"
        ,"99418181"
        ,"99418230"
        ,"99418236"
        ,"99418267"
        ,"99418270"
        ,"99418278"
        ,"99418287"
        ,"99418315"
        ,"99418324"
        ,"99418332"
        ,"99418333"
        ,"99418335"
        ,"99418336"
        ,"99418376"
        ,"99418463"
        ,"99418476"
        ,"99418488"
        ,"99418500"
        ,"99418527"
        ,"99418529"
        ,"99418537"
        ,"99418559"
        ,"99418580"
        ,"99418601"
        ,"99418617"
        ,"99418618"
        ,"99418619"
        ,"99418633"
        ,"99418640"
        ,"99418643"
        ,"99418646"
        ,"99418689"
        ,"99418699"
        ,"99418719"
        ,"99418720"
        ,"99418725"
        ,"99418744"
        ,"99418753"
        ,"99418774"
        ,"99418792"
        ,"99418813"
        ,"99418836"
        ,"99418855"
        ,"99418869"
        ,"99418876"
        ,"99418877"
        ,"99418887"
        ,"99418888"
        ,"99418903"
        ,"99418949"
        ,"99418957"
        ,"99418958"
        ,"99418967"
        ,"99418985"
        ,"99419001"
        ,"99419002"
        ,"99419003"
        ,"99419004"
        ,"99419011"
        ,"99419060"
        ,"99419062"
        ,"99419070"
        ,"99419129"
        ,"99419178"
        ,"99419192"
        ,"99419230"
        ,"99419234"
        ,"99419252"
        ,"99419253"
        ,"99419284"
        ,"99419303"
        ,"99419304"
        ,"99419305"
        ,"99419324"
        ,"99419374"
        ,"99419400"
        ,"99419403"
        ,"99419434"
        ,"99419443"
        ,"99419479"
        ,"99419484"
        ,"99419592"
        ,"99419676"
        ,"99419677"
        ,"99419682"
        ,"99419684"
        ,"99419697"
        ,"99419739"
        ,"99419750"
        ,"99419759"
        ,"99419820"
        ,"99419821"
        ,"99419868"
        ,"99419873"
        ,"99419888"
        ,"99419902"
        ,"99419984"
        ,"99419985"
        ,"99420001"
        ,"99420029"
        ,"99420043"
        ,"99420070"
        ,"99420114"
        ,"99420137"
        ,"99420155"
        ,"99420160"
        ,"99420163"
        ,"99420164"
        ,"99420167"
        ,"99420260"
        ,"99420268"
        ,"99420290"
        ,"99420295"
        ,"99420304"
        ,"99420327"
        ,"99420329"
        ,"99420330"
        ,"99420332"
        ,"99420334"
        ,"99420335"
        ,"99420337"
        ,"99420343"
        ,"99420361"
        ,"99420362"
        ,"99420363"
        ,"99420364"
        ,"99420368"
        ,"99420369"
        ,"99420374"
        ,"99420383"
        ,"99420392"
        ,"99420393"
        ,"99420396"
        ,"99420402"
        ,"99420425"
        ,"99420464"
        ,"99420465"
        ,"99420477"
        ,"99420478"
        ,"99420494"
        ,"99420506"
        ,"99420626"
        ,"99420627"
        ,"99420673"
        ,"99420812"
        ,"99420824"
        ,"99420827"
        ,"99420828"
        ,"99420861"
        ,"99420862"
        ,"99420865"
        ,"99420867"
        ,"99420875"
        ,"99420885"
        ,"99420932"
        ,"99420969"
        ,"99420995"
        ,"99420997"
        ,"99421000"
        ,"99421022"
        ,"99421028"
        ,"99421069"
        ,"99421077"
        ,"99421090"
        ,"99421091"
        ,"99421095"
        ,"99421098"
        ,"99421104"
        ,"99421107"
        ,"99421125"
        ,"99421163"
        ,"99421167"
        ,"99421188"
        ,"99421205"
        ,"99421212"
        ,"99421224"
        ,"99421242"
        ,"99421246"
        ,"99421250"
        ,"99421267"
        ,"99421305"
        ,"99421318"
        ,"99421376"
        ,"99421393"
        ,"99421404"
        ,"99421414"
        ,"99421415"
        ,"99421419"
        ,"99421424"
        ,"99421427"
        ,"99421476"
        ,"99421519"
        ,"99421521"
        ,"99421564"
        ,"99421583"
        ,"99421605"
        ,"99421615"
        ,"99421660"
        ,"99421662"
        ,"99421684"
        ,"99421685"
        ,"99421686"
        ,"99421699"
        ,"99421702"
        ,"99421703"
        ,"99421753"
        ,"99421758"
        ,"99421803"
        ,"99421813"
        ,"99421871"
        ,"99421938"
        ,"99421945"
        ,"99421950"
        ,"99421956"
        ,"99421957"
        ,"99421961"
        ,"99421962"
        ,"99421965"
        ,"99422010"
        ,"99422020"
        ,"99422040"
        ,"99422043"
        ,"99422137"
        ,"99422207"
        ,"99422244"
        ,"99422252"
        ,"99422264"
        ,"99422272"
        ,"99422281"
        ,"99422302"
        ,"99422323"
        ,"99422326"
        ,"99422327"
        ,"99422339"
        ,"99422345"
        ,"99422477"
        ,"99422565"
        ,"99422566"
        ,"99422615"
        ,"99422616"
        ,"99422643"
        ,"99422652"
        ,"99422658"
        ,"99422699"
        ,"99422720"
        ,"99422728"
        ,"99422739"
        ,"99422740"
        ,"99422757"
        ,"99422774"
        ,"99422776"
        ,"99422777"
        ,"99422778"
        ,"99422779"
        ,"99422805"
        ,"99422816"
        ,"99422888"
        ,"99422910"
        ,"99422912"
        ,"99422921"
        ,"99422925"
        ,"99423021"
        ,"99423022"
        ,"99423097"
        ,"99423121"
        ,"99423136"
        ,"99423158"
        ,"99423190"
        ,"99423201"
        ,"99423202"
        ,"99423297"
        ,"99423304"
        ,"99423321"
        ,"99423412"
        ,"99423418"
        ,"99423440"
        ,"99423443"
        ,"99423461"
        ,"99423463"
        ,"99423526"
        ,"99423528"
        ,"99423607"
        ,"99423608"
        ,"99423652"
        ,"99423686"
        ,"99423699"
        ,"99423779"
        ,"99423783"
        ,"99423845"
        ,"99423846"
        ,"99423847"
        ,"99423848"
        ,"99423849"
        ,"99423855"
        ,"99423873"
        ,"99423874"
        ,"99423880"
        ,"99423890"
        ,"99423902"
        ,"99423904"
        ,"99423914"
        ,"99423919"
        ,"99423927"
        ,"99423934"
        ,"99423935"
        ,"99423945"
        ,"99423985"
        ,"99423989"
        ,"99423992"
        ,"99424070"
        ,"99424088"
        ,"99424100"
        ,"99424158"
        ,"99424243"
        ,"99424257"
        ,"99424294"
        ,"99424323"
        ,"99424340"
        ,"99424342"
        ,"99424357"
        ,"99424409"
        ,"99424422"
        ,"99424436"
        ,"99424440"
        ,"99424456"
        ,"99424464"
        ,"99424465"
        ,"99424471"
        ,"99424472"
        ,"99424474"
        ,"99424491"
        ,"99424520"
        ,"99424521"
        ,"99424551"
        ,"99424592"
        ,"99424599"
        ,"99424614"
        ,"99424617"
        ,"99424623"
        ,"99424629"
        ,"99424687"
        ,"99424692"
        ,"99424703"
        ,"99424727"
        ,"99424786"
        ,"99424820"
        ,"99424835"
        ,"99424836"
        ,"99424839"
        ,"99424860"
        ,"99424871"
        ,"99424874"
        ,"99424919"
        ,"99424994"
        ,"99424996"
        ,"99425013"
        ,"99425039"
        ,"99425045"
        ,"99425057"
        ,"99425157"
        ,"99425179"
        ,"99425193"
        ,"99425212"
        ,"99425233"
        ,"99425250"
        ,"99425299"
        ,"99425300"
        ,"99425304"
        ,"99425403"
        ,"99425407"
        ,"99425456"
        ,"99425475"
        ,"99425476"
        ,"99425520"
        ,"99425537"
        ,"99425561"
        ,"99425570"
        ,"99425648"
        ,"99425693"
        ,"99425715"
        ,"99425728"
        ,"99425735"
        ,"99425779"
        ,"99425788"
        ,"99425803"
        ,"99425804"
        ,"99425857"
        ,"99425867"
        ,"99425868"
        ,"99425911"
        ,"99425950"
        ,"99425964"
        ,"99426104"
        ,"99426125"
        ,"99426138"
        ,"99426149"
        ,"99426190"
        ,"99426193"
        ,"99426194"
        ,"99426213"
        ,"99426279"
        ,"99426418"
        ,"99426419"
        ,"99426423"
        ,"99426440"
        ,"99426443"
        ,"99426482"
        ,"99426483"
        ,"99426503"
        ,"99426553"
        ,"99426596"
        ,"99426667"
        ,"99426713"
        ,"99426715"
        ,"99426717"
        ,"99426806"
        ,"99426837"
        ,"99426980"
        ,"99427006"
        ,"99427016"
        ,"99427023"
        ,"99427041"
        ,"99427050"
        ,"99427064"
        ,"99427065"
        ,"99427151"
        ,"99427154"
        ,"99427156"
        ,"99427230"
        ,"99427232"
        ,"99427241"
        ,"99427261"
        ,"99427279"
        ,"99427305"
        ,"99427318"
        ,"99427332"
        ,"99427341"
        ,"99427374"
        ,"99427408"
        ,"99427450"
        ,"99427454"
        ,"99427487"
        ,"99427507"
        ,"99427520"
        ,"99427556"
        ,"99427633"
        ,"99427676"
        ,"99427746"
        ,"99427747"
        ,"99427777"
        ,"99427781"
        ,"99427782"
        ,"99427786"
        ,"99427791"
        ,"99427813"
        ,"99427832"
        ,"99427834"
        ,"99427835"
        ,"99427836"
        ,"99427837"
        ,"99427852"
        ,"99427859"
        ,"99427860"
        ,"99427861"
        ,"99427877"
        ,"99427988"
        ,"99427995"
        ,"99428019"
        ,"99428031"
        ,"99428047"
        ,"99428053"
        ,"99428072"
        ,"99428098"
        ,"99428099"
        ,"99428115"
        ,"99428156"
        ,"99428259"
        ,"99428260"
        ,"99428367"
        ,"99428379"
        ,"99428381"
        ,"99428388"
        ,"99428406"
        ,"99428407"
        ,"99428465"
        ,"99428468"
        ,"99428469"
        ,"99428568"
        ,"99428629"
        ,"99428639"
        ,"99428686"
        ,"99428688"
        ,"99428702"
        ,"99428740"
        ,"99428786"
        ,"99428800"
        ,"99428942"
        ,"99428946"
        ,"99428968"
        ,"99429023"
        ,"99429045"
        ,"99429086"
        ,"99429259"
        ,"99429290"
        ,"99429297"
        ,"99429399"
        ,"99429400"
        ,"99429443"
        ,"99429457"
        ,"99429521"
        ,"99429527"
        ,"99429547"
        ,"99429603"
        ,"99429616"
        ,"99429617"
        ,"99429656"
        ,"99429665"
        ,"99429694"
        ,"99429733"
        ,"99429766"
        ,"99430019"
        ,"99430103"
        ,"99430105"
        ,"99430112"
        ,"99430178"
        ,"99430291"
        ,"99430318"
        ,"99430358"
        ,"99430387"
        ,"99430399"
        ,"99430405"
        ,"99430509"
        ,"99430555"
        ,"99430622"
        ,"99430637"
        ,"99430660"
        ,"99430673"
        ,"99430723"
        ,"99430742"
        ,"99430755"
        ,"99430757"
        ,"99430758"
        ,"99430769"
        ,"99430773"
        ,"99430774"
        ,"99430778"
        ,"99430779"
        ,"99430782"
        ,"99430808"
        ,"99430815"
        ,"99430817"
        ,"99430819"
        ,"99430843"
        ,"99430874"
        ,"99430878"
        ,"99430881"
        ,"99430946"
        ,"99430947"
        ,"99430955"
        ,"99430973"
        ,"99431091"
        ,"99431106"
        ,"99431109"
        ,"99431118"
        ,"99431119"
        ,"99431138"
        ,"99431145"
        ,"99431174"
        ,"99431181"
        ,"99431186"
        ,"99431198"
        ,"99431244"
        ,"99431268"
        ,"99431274"
        ,"99431275"
        ,"99431310"
        ,"99431315"
        ,"99431317"
        ,"99431389"
        ,"99431400"
        ,"99431403"
        ,"99431415"
        ,"99431422"
        ,"99431480"
        ,"99431484"
        ,"99431486"
        ,"99431515"
        ,"99431518"
        ,"99431538"
        ,"99431562"
        ,"99431563"
        ,"99431570"
        ,"99431571"
        ,"99431634"
        ,"99431663"
        ,"99431664"
        ,"99431668"
        ,"99431687"
        ,"99431731"
        ,"99431733"
        ,"99431777"
        ,"99431778"
        ,"99431779"
        ,"99431823"
        ,"99431841"
        ,"99431907"
        ,"99431930"
        ,"99431985"
        ,"99432055"
        ,"99432066"
        ,"99432087"
        ,"99432104"
        ,"99432105"
        ,"99432106"
        ,"99432107"
        ,"99432109"
        ,"99432111"
        ,"99432113"
        ,"99432199"
        ,"99432226"
        ,"99432246"
        ,"99432248"
        ,"99432249"
        ,"99432251"
        ,"99432252"
        ,"99432253"
        ,"99432254"
        ,"99432256"
        ,"99432257"
        ,"99432258"
        ,"99432259"
        ,"99432260"
        ,"99432264"
        ,"99432265"
        ,"99432289"
        ,"99432304"
        ,"99432305"
        ,"99432320"
        ,"99432409"
        ,"99432420"
        ,"99432422"
        ,"99432560"
        ,"99432561"
        ,"99432570"
        ,"99432590"
        ,"99432635"
        ,"99432639"
        ,"99432685"
        ,"99432730"
        ,"99432753"
        ,"99432797"
        ,"99432839"
        ,"99432928"
        ,"99432959"
        ,"99432980"
        ,"99433017"
        ,"99433038"
        ,"99433065"
        ,"99433099"
        ,"99433100"
        ,"99433155"
        ,"99433180"
        ,"99433232"
        ,"99433254"
        ,"99433334"
        ,"99433348"
        ,"99433532"
        ,"99433568"
        ,"99433586"
        ,"99433588"
        ,"99433681"
        ,"99433686"
        ,"99433696"
        ,"99433726"
        ,"99433767"
        ,"99433769"
        ,"99433803"
        ,"99433805"
        ,"99433815"
        ,"99433858"
        ,"99433887"
        ,"99433972"
        ,"99434007"
        ,"99434071"
        ,"99434073"
        ,"99434097"
        ,"99434121"
        ,"99434125"
        ,"99434166"
        ,"99434169"
        ,"99434170"
        ,"99434171"
        ,"99434191"
        ,"99434210"
        ,"99434260"
        ,"99434281"
        ,"99434293"
        ,"99434300"
        ,"99434310"
        ,"99434312"
        ,"99434378"
        ,"99434423"
        ,"99434439"
        ,"99434452"
        ,"99434464"
        ,"99434468"
        ,"99434489"
        ,"99434515"
        ,"99434569"
        ,"99434608"
        ,"99434631"
        ,"99434666"
        ,"99434730"
        ,"99434762"
        ,"99434768"
        ,"99434773"
        ,"99434869"
        ,"99434940"
        ,"99434945"
        ,"99434995"
        ,"99435045"
        ,"99435049"
        ,"99435223"
        ,"99435286"
        ,"99435321"
        ,"99435473"
        ,"99435505"
        ,"99435532"
        ,"99435588"
        ,"99435591"
        ,"99435613"
        ,"99435631"
        ,"99435635"
        ,"99435653"
        ,"99435720"
        ,"99435799"
        ,"99435816"
        ,"99435818"
        ,"99435819"
        ,"99435832"
        ,"99435842"
        ,"99435876"
        ,"99435883"
        ,"99435886"
        ,"99435938"
        ,"99436037"
        ,"99436052"
        ,"99436091"
        ,"99436101"
        ,"99436131"
        ,"99436163"
        ,"99436171"
        ,"99436173"
        ,"99436243"
        ,"99436260"
        ,"99436278"
        ,"99436303"
        ,"99436378"
        ,"99436387"
        ,"99436420"
        ,"99436437"
        ,"99436463"
        ,"99436464"
        ,"99436544"
        ,"99436625"
        ,"99436640"
        ,"99436644"
        ,"99436695"
        ,"99436710"
        ,"99436724"
        ,"99436750"
        ,"99436751"
        ,"99436752"
        ,"99436753"
        ,"99436754"
        ,"99436755"
        ,"99436756"
        ,"99436821"
        ,"99436828"
        ,"99436843"
        ,"99436846"
        ,"99436867"
        ,"99436929"
        ,"99436933"
        ,"99436972"
        ,"99436980"
        ,"99437024"
        ,"99437056"
        ,"99437113"
        ,"99437120"
        ,"99437134"
        ,"99437233"
        ,"99437344"
        ,"99437381"
        ,"99437385"
        ,"99437447"
        ,"99437466"
        ,"99437496"
        ,"99437509"
        ,"99437629"
        ,"99437699"
        ,"99437788"
        ,"99437825"
        ,"99437879"
        ,"99437884"
        ,"99437885"
        ,"99437955"
        ,"99437966"
        ,"99437977"
        ,"99437978"
        ,"99438012"
        ,"99438089"
        ,"99438107"
        ,"99438129"
        ,"99438153"
        ,"99438156"
        ,"99438202"
        ,"99438237"
        ,"99438239"
        ,"99438266"
        ,"99438289"
        ,"99438300"
        ,"99438443"
        ,"99438456"
        ,"99438457"
        ,"99438458"
        ,"99438473"
        ,"99438496"
        ,"99438691"
        ,"99438743"
        ,"99438744"
        ,"99438745"
        ,"99438762"
        ,"99438766"
        ,"99438795"
        ,"99438811"
        ,"99438837"
        ,"99438852"
        ,"99438910"
        ,"99438914"
        ,"99438919"
        ,"99438952"
        ,"99438959"
        ,"99438968"
        ,"99438974"
        ,"99438976"
        ,"99439173"
        ,"99439199"
        ,"99439200"
        ,"99439263"
        ,"99439326"
        ,"99439338"
        ,"99439340"
        ,"99439348"
        ,"99439355"
        ,"99439392"
        ,"99439393"
        ,"99439413"
        ,"99439416"
        ,"99439463"
        ,"99439501"
        ,"99439538"
        ,"99439541"
        ,"99439635"
        ,"99439638"
        ,"99439669"
        ,"99439739"
        ,"99439741"
        ,"99439748"
        ,"99439754"
        ,"99439774"
        ,"99439799"
        ,"99439804"
        ,"99439807"
        ,"99439821"
        ,"99439822"
        ,"99439826"
        ,"99439836"
        ,"99439859"
        ,"99439937"
        ,"99439939"
        ,"99439942"
        ,"99439975"
        ,"99440014"
        ,"99440022"
        ,"99440023"
        ,"99440092"
        ,"99440094"
        ,"99440111"
        ,"99440128"
        ,"99440129"
        ,"99440131"
        ,"99440138"
        ,"99440140"
        ,"99440180"
        ,"99440181"
        ,"99440182"
        ,"99440184"
        ,"99440206"
        ,"99440277"
        ,"99440318"
        ,"99440326"
        ,"99440389"
        ,"99440394"
        ,"99440395"
        ,"99440411"
        ,"99440537"
        ,"99440575"
        ,"99440600"
        ,"99440636"
        ,"99440659"
        ,"99440677"
        ,"99440715"
        ,"99440721"
        ,"99440722"
        ,"99440755"
        ,"99440824"

    );

    // email
    List<String> email = Arrays.asList("office@autowindisch.at",
        "info@autozentrum-west.at",
        "smtmotor@outlook.at",
        "wlv@wlv-voeslau.at",
        "ah.hyundai@wvnet.at",
        "",
        "office@mp-carbox.at",
        "info@karosserie-speckbacher.at",
        "",
        "",
        "bikertreff-scharinger@aon.at",
        "office@kfz-nico.at",
        "",
        "",
        "office@mbp-feldkirch.at",
        "",
        "",
        "office@bkt.at",
        "",
        "jagschitz.wolfgang@aon.at",
        "",
        "robert.unger@a1.net",
        "office@kitz-sz.at",
        "ceri1@gmx.at",
        "thomas@kfz-mandl.at",
        "",
        "",
        "",
        "wim.robert@aon.at",
        "office.schleifer@gmx.at",
        "",
        "service@auto-schilchegger.at",
        "",
        "kontakt@kfz-eugendorf.at",
        "christoph.gebert@wm-trost.at",
        "office@karosserie-jandl.at",
        "robert.aichinger@gmx.net",
        "",
        "office@karosserie-panzenboeck.at",
        "service@grindelgarage.at",
        "kfz-thaler@aon.at",
        "schreiner.seidnitzer@aon.at",
        "office@lagerhaus-horitschon-mattersburg.at",
        "alex@reifen-alex.com",
        "",
        "office@toyota-natter.at",
        "",
        "info@diekfzmeister.at",
        "",
        "mwind@aon.at",
        "invoice@orf.at",
        "",
        "automeister@gmx.at",
        "office@faber.at",
        "office27@denzel.at",
        "office@stahlgruber.at",
        "",
        "shop@auto-gratz.at",
        "klagenfurt@wm-trost.at",
        "lambert.siegl@direkt.at",
        "helmut.frittum@gmx.at",
        "rechnungen.gm@pichelsberger.at",
        "office@bloder.net",
        "",
        "autohaus-holzer@aon.at",
        "office@sprinzl.at",
        "manuel.raith@gmx.at",
        "office@matzhold.com",
        "office@kammerhuber.at",
        "dispo@taxibuchinger.at",
        "sekretariat@zwettl.rlh.at",
        "kfz-altindag@gmx.at",
        "info@autofrey.at",
        "office@unterberger-gruppe.cc",
        "",
        "",
        "office@kfzstrasser.at",
        "office@weissensteiner-gmbh.at",
        "office@kfz-zweimueller.at",
        "lichtenwoerther@speed.at",
        "",
        "fiat.trummergraz@aon.at",
        "info@huber-tech.com",
        "office@auto-schwaighofer.at",
        "office@wit-shv.at",
        "",
        "",
        "",
        "",
        "",
        "plesnicar-automobile@aon.at",
        "service@autoburger.at",
        "siegl.bernhard@aon.at",
        "rene@hinterhoelzl.co.at",
        "verkauf@dexinger.at",
        "motorrad.stern@gmx.at",
        "kfz-rieder@aon.at",
        "smkt.kfz@gmail.com",
        "stipper@autohaus-stipper.at",
        "office@mw.co.at",
        "office@alpla.com",
        "",
        "",
        "info@kfzdw.at",
        "jochen.aspeck@aon.at",
        "batterie.bretbacher@gmx.at",
        "ramazan.sari@live.at",
        "",
        "office@auto-reidl.at",
        "",
        "office@tin-reifen.at",
        "info@taxi-horn.at",
        "aon.felber@aon.at",
        "",
        "info@autoklinik-innsbruck.at",
        "werkstatt@kg-auto.at",
        "",
        "",
        "office@werkstatt.wien",
        "",
        "",
        "info@fiat-panwinkler.at",
        "johann.steineck@steineck.skoda.co.at",
        "kfzmairhofer@aon.at",
        "office@akku.co.at",
        "",
        "gmunden@autec.officelight.at",
        "vanessa.schuster@stpoelten.rlh.at",
        "",
        "office@wuetschner.at",
        "kreditoren-buchhaltung@foerch.at",
        "",
        "office@autocenter-guenther.at",
        "",
        "",
        "",
        "thomas.parzmair@utanet.at",
        "",
        "sales@gady.st",
        "invoice@gady.at",
        "tina.steiner@gady.st",
        "",
        "rittnauer@ersatzteil-partner.at",
        "office@cardesign.co.at",
        "",
        "info@autohaus-lamm.at",
        "office@hauser-gmbh.at",
        "wstranzl@aon.at",
        "taufkirchen@swietelsky.at",
        "abz1@wvnet.at",
        "",
        "",
        "peterherbst060@gmail.com",
        "office@kfzali.at",
        "eingangsrechnungen@sbt.at",
        "office@kfz-ok.at",
        "andreas.hiermann@birner.at",
        "",
        "",
        "b2b@granit-bau.at",
        "stemeseder-kfz@aon.at",
        "",
        "amstetten@wuetschner.at",
        "",
        "office@profisamwerk.at",
        "",
        "",
        "",
        "office@profiservice.at",
        "",
        "direktion@htl.rennweg.at",
        "l.piffer@staplerservice.at",
        "er@nothegger.at",
        "dobernig@gmx.net",
        "office@fankhauser-estriche.at",
        "office@wiegele.at",
        "",
        "",
        "auto.niegelhell@aon.at",
        "",
        "jochen.janda@aon.at",
        "wlb.office@wlb.at",
        "",
        "office@kinzel.at",
        "office@a-ebersberger.at",
        "r.muellner@wvnet.at",
        "office@firma-manseder.at",
        "distribution@hella.com",
        "office@hk-motors.com",
        "office@roth-ksl.at",
        "office@rauner.at",
        "sekretariat@stpoelten.rlh.at",
        "leo.haidweger@haidweger.at",
        "office@lanzinger-kfzgmbh.at",
        "info@kfz-andreas.at",
        "",
        "",
        "",
        "hw.leon@speed.at",
        "zentrale@luxbau.at",
        "",
        "office@geraete.com",
        "baumeister@trepka.at",
        "",
        "gf@amstetten.rlh.at",
        "gschaider.franz@aon.at",
        "gf@amstetten.rlh.at",
        "gf@amstetten.rlh.at",
        "gf@amstetten.rlh.at",
        "",
        "office@abbag.com",
        "mazda.verkauf@bws-autotreff.at",
        "office@achleitner.com",
        "office@steffis-werkstatt.at",
        "kfz-kundegraber@aon.at",
        "h.fleck@a1.net",
        "",
        "ch.bergthaler@yahoo.de",
        "",
        "office@gloppergarage.at",
        "office@kfzleitner.at",
        "",
        "office@kfzauer.at",
        "",
        "gf@amstetten.rlh.at",
        "",
        "office@petervanleur.com",
        "",
        "",
        "",
        "",
        "",
        "service@villach.at",
        "office@autohausergin.at",
        "hoffmann.ernst@aon.at",
        "",
        "",
        "",
        "info@akratec.com",
        "",
        "office@kfz-technik-poetz.at",
        "rlh_absdorf@absdorf.rlh.at",
        "",
        "guenter.bauer@auto-bauer.at",
        "office@wp-fahrzeugtechnik.at",
        "",
        "office@furch-services.at",
        "office@toyota-kraft.at",
        "mazda.stockinger@rainbach.net",
        "",
        "",
        "",
        "autograth@utanet.at",
        "kfz-aflenzer@utanet.at",
        "kfz@pernold.at",
        "office@moser-parts.com",
        "rlh_mostvmitte@mostvmitte.rlh.at",
        "office@bikestudio.net",
        "office@gsb1.at",
        "geschaeftsleitung@ford-kaefer.at",
        "",
        "kfz-perl@aon.at",
        "",
        "info@go-glas.de",
        "office@auto-pfandleihhaus.at",
        "auto-neumann@a1.net",
        "",
        "",
        "office@auto-marko.at",
        "",
        "rlh_korneuburg@korneuburg.rlh.at",
        "office@wilfling.co.at",
        "blechundlack@netcompany.at",
        "",
        "haiden.keg@aon.at",
        "reutte@haiden-autoteile.at",
        "",
        "",
        "info@autohaus-munda.at",
        "grieskirchen@autohauslang.at",
        "info@reifen-jais.at",
        "",
        "steinhauer-car-bike@gmx.at",
        "office@der-lackierer.at",
        "",
        "info@autogemo.at",
        "info@lampelmaier.at",
        "annemarie@kendlbacher.at",
        "",
        "",
        "office@blecha.biz",
        "kfz.eckenfellner@aon.at",
        "",
        "",
        "",
        "sms@flughafentransfer.at",
        "office@auto-holzmann.at",
        "",
        "Austria.Rechnung@wm.de",
        "",
        "",
        "kfz.wolfger@aon.at",
        "",
        "office@carbasics.at",
        "",
        "ringhofer.co@aon.at",
        "bau@weixlbaum.at",
        "",
        "rechnungen@merbag.at",
        "kfzwiesler@aon.at",
        "baz@bfi.wien",
        "rainerkunst@gmx.at",
        "office@auto-luger.at",
        "office@jm-anhaenger.at",
        "office@pichler-kfztechnik.at",
        "bukovec@aon.at",
        "office@ksh.co.at",
        "",
        "tischler.wenger@aon.at",
        "office@neffe.at",
        "anton.chladek@utanet.at",
        "",
        "verkauf.linz@hella-austria.at",
        "",
        "woergl@autopark.at",
        "",
        "taxi.kirchhamer@sbg.at",
        "",
        "info@autohaus-dablander.at",
        "kfz-dorninger@aon.at",
        "",
        "johann.schausberger@aon.at",
        "kfz-kren@gmx.at",
        "reifen-nemetz@aon.at",
        "office@kfz-duller.at",
        "salzburg@oeamtc.at",
        "office@werkstatt-hochwarter.at",
        "karosserie.kenzian@aon.at",
        "",
        "office@kuehleitner.at",
        "kfz.napetschnig@aon.at",
        "",
        "",
        "kfz-saliger@outlook.at",
        "",
        "",
        "",
        "ried@oeamtc.at",
        "office@toman.co.at",
        "",
        "info@ginner.at",
        "office@kfz-kuss.at",
        "",
        "",
        "",
        "office@kfz-atik.at",
        "office@vonblon.cc",
        "office@lackierzentrum-klosterneuburg.at",
        "kfz-tausch@gmx.at",
        "office@autoteile-weber.at",
        "office@derfeser.at",
        "",
        "office@maroltingergarage.at",
        "info@laendlegarage.at",
        "info.ibk@falch.co.at",
        "office@autohandel-tatar.at",
        "",
        "info@rauchenecker.at",
        "",
        "office@campingmobile.at",
        "",
        "simon@eggerforst.at",
        "office@contitrade.at",
        "",
        "",
        "",
        "",
        "",
        "post@wienerlinien.at",
        "",
        "kfz@moto-clemens.at",
        "",
        "fiat-machreich@aon.at",
        "steiner.christian1@gmx.at",
        "r.ehn@live.at",
        "",
        "",
        "",
        "office@autohaus-polster.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "j.aichriedler@gmx.at",
        "office@auto-dichtl.at",
        "",
        "stadtgemeinde@feldbach.gv.at",
        "office@autofetz.at",
        "office@ernstschmiderer.at",
        "info@hoval.at",
        "",
        "USCars@friends-garage.at",
        "werkstatt@peter-droessler.at",
        "",
        "",
        "",
        "",
        "",
        "sackl.karl@aon.at",
        "dominic.tuechler@gmx.at",
        "",
        "",
        "reisinger@jrcs.at",
        "",
        "office@stahlgruber.at",
        "office@autohausdoerfler.at",
        "g.stegmaier@wuetschner.com",
        "office@kfzriedl.at",
        "",
        "",
        "",
        "office@kfz-autohit.at",
        "info@carservice-salzburg.at",
        "",
        "",
        "",
        "office@peugeot-laumer.at",
        "office@franye.at",
        "",
        "office@vaduva.at",
        "office@landtechnik-schuster.at",
        "",
        "info@seelos.net",
        "info.auto@wallner.seat.co.at",
        "office@kfz-hainzl.at",
        "christiannoggler1978@gmail.com",
        "office@karosserie-lack-zellan.at",
        "hs-technik@a1.net",
        "",
        "kfz-grassauer@aon.at",
        "info@fahrzeugdoc.at",
        "",
        "greitner@hotmail.com",
        "",
        "office@lkm.co.at",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "kontakt@rauchberger-kfz.at",
        "",
        "",
        "",
        "office@kfz-kammerhofer.at",
        "",
        "",
        "office@kfz-pehe.at",
        "office@kfz-krischan.at",
        "e.kressnig@gmx.at",
        "",
        "office@crashcarservice.at",
        "",
        "verkauf@e-auto.tirol",
        "",
        "rembart@kirchschlag.at",
        "",
        "office@rosenbauer.com",
        "horst.bauer@bauer.skoda.co.at",
        "office@karosserie-sturm.at",
        "auto.parhammer@aon.at",
        "stadtamt@amstetten.at",
        "",
        "josef.kreulitsch@aon.at",
        "",
        "",
        "info@autodiskont.at",
        "office@auto-thurner.at",
        "kfz.friede@aon.at",
        "borpowercenter@gmail.com",
        "",
        "office@onlinecars.at",
        "kfz-maier@inode.at",
        "kfz.thomasholzer@speed.at",
        "",
        "office@auto-lindinger.at",
        "lagerhaus@stmichael.rlh.at",
        "office@thomas-kfz.at",
        "",
        "nina.brugger@sbg.at",
        "office@asfinag.at",
        "office@kfz-rattensperger.at",
        "office@wartelsteiner.at",
        "",
        "",
        "autohaus@unterberger.cc",
        "",
        "kfz.steiner@aon.at",
        "reifen@artbauer.at",
        "fa.schroetter@aon.at",
        "info@didis-auto.at",
        "",
        "info@stockingerbau.at",
        "magistrat@wiener-neustadt.at",
        "",
        "",
        "office@wuetschner.at",
        "",
        "rieger.kfztech@gmx.at",
        "",
        "office@vb-karosseriebau.at",
        "",
        "kfz.loeffler@gmx.at",
        "",
        "office@landtechnik-scheuch.at",
        "",
        "",
        "",
        "",
        "",
        "office@kainrath.eu",
        "kfzgs@gmx.at",
        "",
        "office@kfz-winkler.net",
        "office@kfz-schauer.at",
        "",
        "office@auto-lind.at",
        "",
        "kfz.schierl@gmx.at",
        "kfz.mahrl@aon.at",
        "",
        "buchhaltung@edlerreifen.at",
        "office@kfz-karner.at",
        "office@autohaus-gwirl.at",
        "",
        "office@teichmann-motors.at",
        "",
        "office@avz-autoteile.at",
        "office@autoteile-jedinger.at",
        "wm.garten@aon.at",
        "",
        "",
        "",
        "weyer@weichberger.at",
        "info@reichhart.bmw.at",
        "office@stahlgruber.at",
        "",
        "",
        "",
        "tp.karosserie@gmx.at",
        "office@reifenwelt.at",
        "office@kfz-lacus.at",
        "erwin.sch@aon.at",
        "kfz.ragg@gmx.at",
        "amg@amg-auto.at",
        "vgh-kfz@aon.at",
        "office@wolfram-tindl.at",
        "kfz-sturm@gmx.at",
        "office@kfz-gringer.at",
        "",
        "",
        "office@sturmundkurz.at",
        "forster@forster-reisen.at",
        "kfz-mike@aon.at",
        "office@acschachinger.at",
        "info@tgm.ac.at",
        "office@autoreparatur-kubik.at",
        "",
        "info@autohaus-kastner.at",
        "g.stegmaier@wuetschner.at",
        "",
        "hannes@lumak.at",
        "margreiter-kfz@utanet.at",
        "landtechnik.jordan@aon.at",
        "office@auto-ramsauer.at",
        "",
        "walter.kolm@wdsl.at",
        "",
        "egretzberger_fellner@aon.at",
        "mskfzwinter@gmx.at",
        "info@fahrzeugtechnik-fritz.at",
        "sekretariat@zwettl.rlh.at",
        "porsche.liesing@porsche.co.at",
        "",
        "lachner@flashnet.at",
        "info@suzuki-mayer-tulln.at",
        "buero@autobluemel.at",
        "",
        "office@herzog-kfz.at",
        "",
        "post@wienerlinien.at",
        "",
        "info@sacotec.at",
        "office@aa-austria.at",
        "office@carstudio.at",
        "autohaus.reiter.2563@gmail.com",
        "Amberg-garage@outlook.com",
        "sternwarte.lehner@inode.at",
        "office@kfz-profis.at",
        "",
        "",
        "",
        "office@kfz-klaffel.at",
        "office@auto-kitting.at",
        "",
        "office@marzi-karosserie.at",
        "michael.wimmer@kneidinger.at",
        "",
        "alexander.kitzler@aon.at",
        "office@hofmann-kfz.at",
        "office@reifen-alfons.at",
        "karl@prieth.it",
        "",
        "h.meng@bnet.at",
        "givo@gmx.at",
        "rechnungseingang@fastbox.at",
        "hackl@i-cars.at",
        "",
        "office@schaberauto.com",
        "",
        "",
        "auto.hollin@aon.at",
        "",
        "office@rbt-reifen.at",
        "h.schaffer@diewerkstatt.cc",
        "",
        "kfz@artbauer.at",
        "kfz.fuchs@chello.at",
        "",
        "kfz-hirsch@aon.at",
        "office@auto-buchacher.at",
        "ad.weiss@aon.at",
        "",
        "office@bruderhofer-fuchs.at",
        "office@kfz-stuerzlinger.at",
        "mail@bickel.at",
        "h.zehentner@autohaus-zehentner.at",
        "",
        "",
        "office@ceprocs.com",
        "",
        "",
        "info@kfzhaas.com",
        "",
        "",
        "ckautocarnueziders@hotmail.com",
        "",
        "info@zweiradprofi.at",
        "kfz.kiss@kabelplus.at",
        "office@kfz-jasek.at",
        "buchhaltung@kfz-forstner.at",
        "",
        "office@auto-moriggl.at",
        "matic@lucky-car.at",
        "office@sarp.at",
        "info@finazzer.at",
        "",
        "autohaus.reiter-mondsee@cable.at",
        "ernst@reisenbauer.eu",
        "office@w-paternoster.at",
        "gf@dieklinik.eu",
        "kfz-schmalzl@gmx.at",
        "werkstatt@turbo-tuning.at",
        "office@fischer-kfz.at",
        "",
        "office@theurers-kfz-klinik.at",
        "",
        "kfz@autohaus-aschauer.at",
        "office@auto-werkstatt.at",
        "mayer@autohausmayer.at",
        "office@motorradklinik.at",
        "kindermann.auto@utanet.at",
        "post@magistrat.waidhofen.at",
        "eingangsrechnung@carglass.at",
        "ernst.dicker@gmx.at",
        "abschleppdienst24@hotmail.com",
        "voecklamarkt@scheinecker.com",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "hofer-kastberger@drei.at",
        "office@reifen-zentrum.at",
        "autohaus@seipl.at",
        "",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "wagner@fiwa-kfz.at",
        "office@kfz-reisegger.at",
        "",
        "office@kfz-technik-zentrum.at",
        "kfz-sagmeister@aon.at",
        "",
        "office@fiat-schoenthaler.at",
        "m.wopfner@outlook.com",
        "office@traiskirchen.gv.at",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "mastalier@aon.at",
        "ing.oliverfaast@tmo.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "rechnungseingang@fastbox.at",
        "christoph.kneissl@gmx.at",
        "office@rz-hebinger.at",
        "info.felber@autohaus.at",
        "wien22@lucky-car.at",
        "office@lucky-car.at",
        "",
        "kfz.elektrik.pieber@aon.at",
        "rechnung-spittal@autohaus-staber.at",
        "autohaus.staber@autohaus.at",
        "autoklinik.gablitz@yahoo.de",
        "kfz-esterbauer@gmx.at",
        "office@potzmann-winkler.at",
        "verkauf@hudak.at",
        "glechner1@gmx.net",
        "info@kfz-anzengruber.at",
        "",
        "man@kappel.at",
        "info@mobilerservice-rt.at",
        "office@kfz-nemec.at",
        "schaufler.karotech@aon.at",
        "",
        "office@zmd-kfz.at",
        "office@oberndorfer.at",
        "office@kfz-zehetner.at",
        "",
        "kfz-gehringer@gmx.at",
        "reinhard.klausner@aon.at",
        "office20@zitta.at",
        "office@tomstation.at",
        "autojodas@gmx.at",
        "",
        "office@bbl-fahrzeugtechnik.at",
        "",
        "",
        "",
        "info@kfz-hallein.at",
        "kirchbichl@automuehlbacher.at",
        "",
        "kfz-biermair@aon.at",
        "kfz.bauer@gmx.at",
        "",
        "franz@autoigerc.at",
        "office@autobedarf-kreuzberger.at",
        "reifen@stanitz.at",
        "office@kfz-fangl.at",
        "",
        "autojobst@gmx.at",
        "",
        "service@reichl.at",
        "info@toyota-reinstadler.at",
        "info@feldkirchen.at",
        "",
        "josef.schindler.kaefer@partner.renault.at",
        "info@haidacher.at",
        "info@arboe.at",
        "",
        "opel@autohausscheichl.at",
        "",
        "",
        "hp.smith@eunet.at",
        "info@iq-buchsteiner.com",
        "ernst.daxecker@aon.at",
        "office@kfz-zanger.at",
        "akinci.traun@gmail.com",
        "",
        "er.zentrale@swietelsky.at",
        "",
        "topf2@gmx.at",
        "office.purgstall@steyr-noewest.at",
        "office@rmdprader.at",
        "office@chanceb.at",
        "office@kfz-pletz.at",
        "friedinger.kfz@aon.at",
        "steyr@binder001.com",
        "",
        "kfz_service@aon.at",
        "office@stahlgruber.at",
        "office@autogerster.at",
        "",
        "",
        "gerhart.lieskonig@lieskonig.at",
        "office@warchat.at",
        "",
        "info@kfz-widmann.at",
        "office@carkosmetik.at",
        "",
        "office@toyfl.at",
        "",
        "",
        "info@autohaus-brandtner.at",
        "office@autopark-groedig.at",
        "arthur.kratochwill@gmx.at",
        "",
        "sahl-kfz@aon.at",
        "",
        "karosserie-aspernig@aon.at",
        "automobile-zechmeister@a1.net",
        "ahmic_car-service@hotmail.com",
        "citygarage@aon.at",
        "",
        "auto.gattringer@gmx.at",
        "office@best-performance.at",
        "",
        "j.reitbauer@gmx.at",
        "kirchner@mvnet.at",
        "info@autohausfrainer.at",
        "",
        "guemues@inode.at",
        "oberreiter@automobil-technik.at",
        "office@sg-putz.at",
        "office@autohaus-fleck.at",
        "office@autohauskoestler.at",
        "",
        "fahrzeug-gmbh@aon.at",
        "office@kfz-leitold.at",
        "office@vs-gmbh.at",
        "",
        "office@kfz-achleitner.at",
        "",
        "office@ofnerhydraulik.at",
        "auto@carputt.at",
        "autohaus.manhardt@aon.at",
        "info@garten-winkler.at",
        "kfzservicespauto@gmail.com",
        "office@autohausschwarz.at",
        "carmen.tschernutter@gmx.at",
        "",
        "",
        "",
        "stefan.schmelzer@utanet.at",
        "office@dein-kfz.at",
        "",
        "alfred.zach@aon.at",
        "t.niederstrasser@aon.at",
        "info@karosserie-grabner.at",
        "eingangsrechnung@carglass.at",
        "office@kwm.at",
        "office@carsandmore.at",
        "",
        "shellstation@ad-siedler.at",
        "info@a-z-krakowsky.at",
        "office@pitzer-kfz.at",
        "",
        "office@kfz-reibenbacher.at",
        "abz@stmk.gv.at",
        "kfz-egger@gmx.at",
        "office@unterberger-gruppe.cc",
        "autohaus-kaiser@a1.net",
        "",
        "info@robinson.at",
        "office@pletter.at",
        "office@becker-wenzler.at",
        "",
        "office@vwauto-huber.at",
        "office@kfz-braeuer.at",
        "voecklamarkt@scheinecker.com",
        "",
        "office@rmh.co.at",
        "office@lhl-kfz.at",
        "",
        "",
        "",
        "simon7544@simon.skoda.co.at",
        "",
        "kfz-sterrer@gmx.at",
        "hans.hofer@autohaus.at",
        "kfz-oezkal@hotmail.com",
        "office@autoglasdienst.at",
        "auto-klinik@gmx.at",
        "office@kfz-nagl.at",
        "karl.schoeffl@aon.at",
        "",
        "office@sackl.at",
        "",
        "mail@ah-miro.at",
        "asten@wm-fahrzeugteile.at",
        "",
        "maurice@bs-kfz.at",
        "",
        "office@autonett.at",
        "office@diewerkstatt-grafl.at",
        "kapfgarage@aon.at",
        "autohaus-brunner@aon.at",
        "office@kfz-krug.at",
        "verkauf@mein-importwagen.at",
        "",
        "kfz-mack@aon.at",
        "",
        "info@kfz-koefler.at",
        "office@authried.at",
        "",
        "",
        "office@karosserieprofi.at",
        "office@autohaus-sauseng.at",
        "info@autoservicecenter.at",
        "",
        "ka-ro@schladming-net.at",
        "info.strass@falch.co.at",
        "office@at-autotechnik.at",
        "autohaus@ford-ornig.at",
        "office9020@eisner.at",
        "dispo@oehtb-fahrtendienst.at",
        "office@transdanubia.com",
        "innsbruck@wm-fahrzeugteile.at",
        "office@kfz-schnabl.com",
        "info@samariterbund.net",
        "strohbichler@partner.renault.at",
        "uko@uko.at",
        "automobileat@yahoo.de",
        "office@kfz-tokat.at",
        "windwuehl@aon.at",
        "office@talkner.at",
        "info@opel-scheiber.at",
        "office@kfzmatasovic.at",
        "info@kfzsteger.it",
        "markus.weinberger@aon.at",
        "",
        "office@lerchergmbh.at",
        "heilmayer@aon.at",
        "office@kfz-schachl.at",
        "andreas.kuster@live.at",
        "",
        "info@reiterer-autohaus.at",
        "office@denzel.at",
        "",
        "",
        "",
        "office@kfz-freitag.at",
        "info@radservice.at",
        "office@aicherkg-kfz.at",
        "",
        "office@kfz-peter.at",
        "office@poppis-werkstatt.at",
        "kfz.ott@aon.at",
        "autospengler@kfz-gogo.at",
        "office@kfz-schraufstaedter.at",
        "office@derschmid.at",
        "kfzmc@a1.at",
        "reifen-kfzteile-huber@gmx.at",
        "kfz_lidinger@aon.at",
        "office@kfz-nocker.at",
        "info@novomatic.com",
        "office@autohaus-fischer.at",
        "hirschstetten@lucky-car.at",
        "",
        "direktion@bfw.gv.at",
        "faktura@metallundtechnik.at",
        "",
        "",
        "office@reifenstop.at",
        "company@stoeckl-dino.at",
        "",
        "weigl@weigl.at",
        "info@kfz-peter-wimmer.at",
        "office@ta-autoshop.at",
        "office@kwc.co.at",
        "service.piotr@gmail.com",
        "filipovic@gmx.at",
        "g.alfreider.kfz@hotmail.com",
        "",
        "",
        "office@kfz-laucher.com",
        "rene@kfz-reiter.at",
        "eibl.ludwig@gmail.com",
        "",
        "braunau@go-glas.com",
        "",
        "office@georg-mueller.at",
        "kfz-streyc@aon.at",
        "office@ital-jap.com",
        "office@stahlgruber.at",
        "mario.frajuk@gmail.com",
        "kfz@reichl-pfiel.at",
        "office@figlcc.at",
        "info@at.euromaster.com",
        "office@kfz-rubin.at",
        "office@penner-technik.at",
        "paul.lackner@bnet.at",
        "service@ford-wenger.at",
        "kfz-steinboeck@aon.at",
        "",
        "office@m-worx.at",
        "Max.Mustermann@gmail.com",
        "office@kfz-kien.at",
        "kfz-soner@hotmail.com"

        );

    List<String> line1 = Arrays.asList("Hauptstraße 29",
        "Saglstraße 69c",
        "Hohenemser Straße 3",
        "Badner Str. 88",
        "Schlag 14",
        "Rasis Bündt 15",
        "Fürbergstraße 26",
        "Bahnhofstraße 16",
        "Salzburgerstraße 722",
        "Schöllbüchl 23",
        "Kaplanstraße 20",
        "Trössing 20",
        "Feldgasse 2",
        "Gewerbestraße 12",
        "Lehenhofstraße 7",
        "Ziegelstraße 38",
        "Höhenweg 1",
        "Schwebel 73",
        "Aistenthal 40-41",
        "Kasernenstraße 9",
        "Reisach 14",
        "Pertlstein 164",
        "Dimbach 96",
        "Fuhrgasse 1",
        "Sierling 7",
        "Kirchweg 1",
        "Obere Hauptstrasse 16",
        "Matzner Straße 30/6",
        "Steinbergstraße 42",
        "Ligist 117",
        "Kupferschmiedgasse 19/6",
        "Niedernfritzerstraße 117",
        "Sonnenstraße 12",
        "Wiener Straße 16",
        "Gewerbehofstraße 24",
        "Bach 27",
        "Gauschitzberg 18",
        "Salzstraße 14a",
        "Querstraße 1",
        "Grindelstraße 11",
        "Bundesstraße 1",
        "Weizer Straße 54",
        "Hauptstraße 59",
        "Birkach 382",
        "Industriestraße 2",
        "Am Stein 483",
        "Leitgermoos 7",
        "Lagerstraße 11",
        "Leopoldsgasse 15a",
        "Augasse 194",
        "Hugo-Portisch-Gasse 1",
        "Oberbach 13",
        "Edelsbach 210",
        "Carlbergergasse 66a",
        "Mattersburgerstraße 31",
        "Fischer von Erlachstraße 37",
        "Trattnerring 21",
        "Schießstandstraße 4a",
        "St. Veiter Straße 200",
        "Gaisruckdorf 2",
        "Margeritenweg 2/Hau12",
        "Koaserbauerstrasse 1",
        "Gewerbestraße 11",
        "Brunner Hauptstraße 84",
        "Markstraße 11",
        "Dreyhausenstraße 6-8",
        "Lohngraben 80",
        "Hatzendorf 135",
        "Handelsstraße 1",
        "Am Fischagraben 3",
        "Waldhausen 79",
        "Etrichgasse 30/H.5a",
        "Wiener Bundesstraße 81",
        "Anichweg 1",
        "Tipschern 24",
        "Schwendter Strasse 95",
        "Habruck 29",
        "Hinterberg 30",
        "Hauptstraße 189",
        "Gewerbezone 3",
        "Hammerschmiedgasse 13",
        "Liebenauer Hauptstraße 76",
        "Winsau 12",
        "Schattau 70",
        "Am Kaisermühlendamm 71",
        "Im Alten Riet 23",
        "Hirschstettner Straße 34",
        "Sonnenfeld 23/1",
        "Gigging 5/Hau.8",
        "Kreuzdorfstraße 23",
        "Grindelstraße 16",
        "Audorfer Straße 3",
        "Sportplatzstraße 172",
        "Stroheimer Straße 2",
        "Weitraer Straße 113",
        "Gewerbestraße 2",
        "Sandgasse 25",
        "Untere Viaduktgasse 12",
        "Pichling 134",
        "Industriestraße 2",
        "Allmendstraße 81",
        "Kohlberg 124",
        "Mureckerstr. 13",
        "Etrichgasse 30",
        "Kapellenstraße 69",
        "Raitfeldstr. 25",
        "Ardaggerstraße 91",
        "Burgfrieden 7",
        "Stierlingwaldstraße 5",
        "Fucking 18",
        "Arndtstraße 72",
        "Esterhazygasse 25",
        "Triester Straße 245-247",
        "Erdbergstraße 189-193",
        "Viaduktbogen 147",
        "Josef - Heißl - Straße 11",
        "Gaglhamerweg 26",
        "Schwaig 13",
        "Floridsdorfer Hauptstraße 17",
        "Reith 1",
        "Donaufelderstraße 96",
        "Bad Haller Strasse 13",
        "Sandl 37",
        "Waldweg 2",
        "Gewerbepark 17",
        "Zippererstraße 17/3-5",
        "Neuhofenstraße 37",
        "Dr. - Doch - Gasse 1",
        "Mariazeller Straße 18",
        "Mitterfeldstraße 7",
        "Röcklbrunnstraße 39a",
        "Klagenfurter Straße 47",
        "Technologiepark 2",
        "Brünner Straße 8",
        "Grimsing 51",
        "Hochwassergasse 2-12",
        "Porstenberg 23",
        "Fischanger 161",
        "Kärntnerstraße 573",
        "Leibnitzerstraße 76",
        "Grazer Straße 82",
        "Markt 191",
        "Zehnergürtel 100-106",
        "Wiener Neustädterstraße 46",
        "Schmelzstraße 5",
        "Porschestraße 1",
        "Hinterberg 3",
        "Unterrettenbach 53",
        "Maad 17",
        "Kremserstraße 59",
        "Leesdorfer Hauptstraße 68-70",
        "Eisenbachstraße 12",
        "Johann-Herbst-Strasse 23",
        "Etrichgasse 30",
        "Hauptstraße 2",
        "Wienerstrasse 40",
        "Mühlgasse 91",
        "Salzburger Straße 22",
        "Gerstlgasse 6",
        "Feldgasse 14",
        "Kälberpoint 47",
        "Holzschachen 37",
        "Staffelmayrstraße 2A",
        "Keltenstraße 8",
        "Jacob Mayer-Straße 2",
        "Samhofstraße 277",
        "Wienerstrasse 57",
        "Jeneweingasse 7",
        "Dieselstraße 7",
        "Neusiedlerstraße 27",
        "Rennweg 89b",
        "Rettenbach 10",
        "Maukenbach 18A",
        "Feldkirchner Straße 113",
        "Amerling 120",
        "Heidenfeldstrasse 7",
        "Gewerbestraße 1/2",
        "Schmiedebachweg 2",
        "Prosdorf 41",
        "Altstadt 86A",
        "Tattendorfer Straße 49",
        "Purkytgasse 1B",
        "Aichholzgasse 44",
        "Völkermarkter Str. 145",
        "Rennbahnstraße 25",
        "Großweißenbach 104",
        "Spratzerner Hauptstraße 23",
        "Overhagener Weg 14",
        "Alte Mattseestr. 32",
        "Gewerbestraße 1",
        "Wiener Straße 27",
        "Sitzenberger Bahnstraße 15",
        "Hauptstraße 8a",
        "Arbeitergasse 28",
        "Talstraße 120",
        "Saturnstraße 6",
        "Simmeringer Hauptstraße 279",
        "Kellergasse 8",
        "Schloßberg 34",
        "Kirchengasse 7",
        "Himmelreichstraße 34",
        "Boschstraße 48",
        "Schulstraße 11",
        "Cvetkova Ulica 34",
        "Marktstraße 19",
        "Dorf 26",
        "Kröllendorf 78",
        "Bahnhofstraße 63",
        "Molkereistraße 3",
        "Hirtenbergerstr. 47",
        "Kandaharweg 9",
        "Linzer Straße 244",
        "Innsbrucker Straße 94",
        "Franzhausen 1",
        "Kirchbergstraße 266",
        "Packerstrasse 165",
        "Linzerstraße 106",
        "Schmidham 17",
        "Industriestraße 8",
        "Hellbrunnenstraße 42",
        "Hauptstraße 4",
        "Jaquingasse 25",
        "Hauptstraße 172",
        "Breslauer Str. 49",
        "Ybbsitzerstraße 130",
        "Michael Vogl Straße 8",
        "Perlmooserstraße 22",
        "Martino Carlone Gasse 2",
        "Klagenfurter Straße 205",
        "Nikolaus Lenaustraße 2/18",
        "Rennweg 8",
        "Thernbergerstraße 8",
        "St. Johanner Straße 20",
        "Betriebsstraße 6",
        "Altmannstraße 36",
        "Cankova 53D",
        "Untere Maurerberggasse 3/3",
        "Wörtherstraße 104",
        "Audorfer Straße 19",
        "Schallenbergstraße 27",
        "Berviertel 43",
        "Bahnhofstraße 23",
        "Austraße 59B",
        "Industriegelände West 12",
        "Freiheitsstraße 13",
        "Eumigweg 10",
        "Gewerbepark 6",
        "Wulzeshofen 159",
        "Freistädter Straße 8",
        "Simmeringer Hauptstraße 345",
        "Schlarweg 10",
        "Schwefel 54",
        "Breitenfurter Straße 201",
        "Markt 132",
        "Gewerbepark 1",
        "St. Margarethen 152h",
        "Bahnstraße 3-5",
        "Rosentalerstraße 48",
        "Bauwesenstraße 1",
        "Schildbach 70",
        "Völserstraße 63",
        "Freiheitsstraße 14-16A",
        "Grillgasse 51",
        "Schellenbruckstraße 7",
        "Güssinger Straße 1",
        "Krumpentalerstr. 110",
        "Schneidergasse 10",
        "Felfern 12",
        "Völkermarkter Straße 15",
        "Schlossplatz 35",
        "Kwizdastraße 15",
        "Hansbauerweg 3",
        "Simmerlach 163",
        "Traunweg 2",
        "Forchackerweg 7B",
        "Innsbruckerstraße 18",
        "Sternenweg 4",
        "Joseph Stiegler Gasse 4/1/18",
        "Biberhaufenweg 19A",
        "Wenger Straße 4",
        "Schlöglstraße 59",
        "Wirtschaftspark 7",
        "Antonigasse 37",
        "Sommersberg 1",
        "Achauerstraße 14",
        "Freien 592",
        "Salzburger Straße 33",
        "Gewerbepark 254",
        "Lützowgasse 12",
        "Buchengasse 58",
        "Lienfeldergasse 37",
        "Ziegelofengasse 3",
        "Althofen 26",
        "Grabenweg 40",
        "Haberlgasse 80",
        "Wasserfeldstraße 24a",
        "Hallerstraße 208",
        "Etrichgasse 19",
        "Wagramer Straße 171",
        "Triester Straße 8",
        "Industriezeile 58a",
        "Oberhof 1",
        "Gewerbestr. 7/Halle1",
        "Kolpingstraße 10",
        "Holzgasse 4",
        "Wienerstraße 26",
        "Untersee 169",
        "Neupölla 132",
        "Troststraße 109-111",
        "Sinzingergasse 2",
        "Gutheil-Schoder-Gasse 8-12",
        "Am Bach 8a",
        "Obergermating 12",
        "Nestelbach 163",
        "Kleinmarbach 49",
        "Pfaffstättner Straße 26",
        "Magazinstraße 14",
        "Meilstraße 23",
        "Rußbergstraße 51",
        "Grazerstraße 3",
        "Wiener Straße 10",
        "Deutschstraße 6",
        "Edtstrasse 13",
        "Rosengasse 21a",
        "Innsbruckerstr. 105",
        "Altmelon 63",
        "Bleimühlweg 1",
        "Krakauhintermühlen 16b",
        "Sportplatzweg 10",
        "Triesterstr. 33",
        "Tiroler Straße 23",
        "Oberamt 102",
        "Rosengasse 21a",
        "Oberegging 14",
        "Josefine Gaskin Straße 12",
        "Alpenstraße 102-104",
        "Flurgasse 22",
        "Handwerkstraße 3",
        "Hauptstraße 128-130",
        "Samergasse 23",
        "Bahnhofstraße 27",
        "Leopoldigasse 8-10A",
        "Gernotstraße 48",
        "Heinrich-Heine-Gasse 15",
        "Pater-Werner-Deibl-Str. 7",
        "Industriestraße 21",
        "Kurzegasse 1-3",
        "Fuchsleiten 1",
        "Tenschertstr. 5",
        "Sandberg 5",
        "Walter Jurmann-Gasse 11",
        "Mariatroster-Strasse 25",
        "Gausendorf 2",
        "Schmelzerweg 1",
        "Dr. Niederdorfer Str. 24",
        "Triester Bundesstraße 79",
        "Landtraße 28",
        "Aufeldgasse 68",
        "Michael-Hainisch-Str. 57",
        "Fachmarktzentrum 4, Top 5",
        "Industriestr. 2",
        "Bahnstraße 15",
        "Maroltingergasse 66",
        "Rheinstraße 93",
        "Etrichgasse 40",
        "Franzensthalstraße 1",
        "Ossarner Ortsstr. 37",
        "Schärdinger Straße 53",
        "Dürnbach 143",
        "Badstubenweg 62",
        "Steinamangerstraße 88",
        "Eschenau 76",
        "Leobersdorfer Str. 52",
        "Puchbergerstraße 1-2",
        "Grazerstr. 11",
        "Schenkendorfergasse 8",
        "Harböckgasse 1",
        "Schenkendorfergasse 8",
        "Erdbergstraße 202",
        "Schlarweg 10",
        "Römerstraße 275",
        "Zellerstraße 43/2",
        "Zeller Bundesstr. 10",
        "Voregg 41",
        "Industriegelände 9",
        "Pirchäckerstraße 40",
        "Salumerstraße 57",
        "Hauptstraße 6",
        "Buchengasse 2",
        "Lagerhausstraße 24",
        "Messerschmittweg 13",
        "Bahnhofstraße 231",
        "Kienach 32",
        "Proleber Straße 24",
        "Bachweg 84",
        "Hauptstraße 31",
        "Waidachstraße 14",
        "Hueberstraße 28",
        "Liebensdorf 289",
        "Gleichenbergerstr. 79",
        "Dorf 9",
        "Lofer 285",
        "hovalstraße 11",
        "Am Gassl 10",
        "Salzachuferstraße 39",
        "Stadtbahnbogen 54-55",
        "Gewerbestr. 15",
        "Breitenfelderstr. 28",
        "Gundertshausen 5",
        "Faggen 68",
        "Hainstetten 55",
        "Maierhof 13",
        "Hörmannserstr. 73",
        "Weignersdorf 7",
        "Schillingstraße 14",
        "Hauptstraße 267a",
        "Gutenbergstraße 29",
        "Auenweg 12",
        "Khevenhüllerstr. 5",
        "Mitterfeldstraße 1",
        "Rudolf Waisenhorngasse 16",
        "Gewerbegasse 3a",
        "Rotenhofgasse 59",
        "Alte Mattseer Str. 27",
        "Gewerbestr. 17",
        "Salzburgerstr. 54",
        "Ptujska cesta 178",
        "Winkeläckerstr. 4",
        "Nordstraße 2",
        "Linzerstraße 22",
        "Hubertusweg 8",
        "Dorfstraße 118",
        "Zwerchäckerweg 23",
        "Industrieparkstraße 13",
        "Gewerbestraße 308",
        "Innstraße 3",
        "Großhartmannsdorf 68",
        "Strallegg 119",
        "Dörferstraße 26B",
        "Gewerbestraße 51",
        "Hauptstraße 23",
        "Wiener Bundesstraße 44",
        "Linzerstr. 46",
        "Lichtensteinklammstr. 17",
        "Jubiläumsstr. 1",
        "Waltenbach 1",
        "Südbahnstraße 35",
        "Haidlisse 9",
        "Simmeringer Hauptstraße 24",
        "Ortsstraße 18a",
        "Pfalzgasse 21",
        "St. Veiter Straße 2",
        "Hof 12",
        "Pottendorferstraße 13",
        "Waidhofner Strasse 68",
        "Gnaserstraße 24",
        "Pfongauerstraße 73",
        "Kleine Neugasse 14",
        "Pfarrdorf 59",
        "Handelsstrasse 4",
        "Gewerbegebiet 2",
        "Amstettner Straße 27b",
        "Sonnberg 5",
        "Messerschmittweg 28",
        "Kogelstrasse 34",
        "Wienerstraße 86",
        "Albrechtstraße 66",
        "Paschinger Straße 90",
        "Industriestraße 1",
        "Bayernstr. 89",
        "Höribachstraße 90",
        "Peter-Mitterhofer-Str. 7",
        "Rosenhofweg 5",
        "Hadnweg 6/2",
        "Lichtenwörthergasse 104",
        "Gewerbestraße 1",
        "Alter Hainburgerweg 2b",
        "Jägerweg 15",
        "Hauptstrasse 47",
        "Pechhüttenstraße 6",
        "Hauptstr. 37b",
        "Werner-Gröbl-Straße 3",
        "Viehmarktgasse 29/6",
        "Haidäckerstraße 11",
        "Brolaweg 21 9",
        "Edlgasse 9",
        "Bundesstraße 59",
        "Albrechtserstr. 137",
        "Balldorf 8",
        "Wildkogelbahnstr. 315",
        "Business Center 806",
        "Hofham 4",
        "Talstraße 41",
        "Zillerstraße 4",
        "Großsteinbach 138",
        "Haspingerstraße 12",
        "Mattersburgerstr. 5",
        "Pittermann 4",
        "Rosenbursenstraße 4",
        "Wittmannsdorf 13",
        "Tauernstraße 38",
        "Vichtenstein 94",
        "Kerschham 100",
        "Gymelsdorfer Gasse 52",
        "Leitersdorfstraße 9",
        "Bauland 9",
        "Mostviertelstr. ATC Park 2",
        "Goldegger Straße 10",
        "Hohenau 62",
        "Edelsgrub 212",
        "Telefunkenstraße 21",
        "Halleiner Landesstr. 84",
        "Albersdorf 264",
        "Austraße 59",
        "Ludwigsdorf 76a",
        "Antiesen 13",
        "Grazer Straße 17",
        "Steuerberg Eden 3",
        "Pfarrgasse 16",
        "Adnet 295",
        "Aspersdorfer Straße 10",
        "Plappach 9",
        "Prechtlgasse 22B",
        "Engerreich 6",
        "Pötting 23",
        "Fladnitz 114",
        "Flurgasse 15-17",
        "Linzer Straße 185",
        "Diemlern 56",
        "Walter-Eder-Straße 4",
        "Winzerstr. 3",
        "Maurergasse 2-4",
        "Buchengasse 6",
        "Oberfelben 60",
        "Breitenfurterstraße 28",
        "Zeller Straße 32",
        "Bahngasse 27",
        "Salzburgerstraße 15",
        "Waller Straße 113",
        "Jamm 89",
        "Glavna ulica 33",
        "Lokevina 15",
        "Srednsa Bistrica 87",
        "Platzergasse 8",
        "Pergerstr. 6",
        "Wienerstr. 2",
        "Kupferschmiedgasse 21/Halle7",
        "Laaber Straße 1",
        "Altstadt 86A",
        "Jakob-Auer-Straße 5",
        "Uttendorf 21",
        "Heidestraße (Halle 2) 29",
        "Muschkau 27",
        "Industriezone 10",
        "Wendelinsgasse 6",
        "Holz 8",
        "Obere Hauptstr. 66",
        "Viehhauserstraße 3",
        "Liebenau 84",
        "Haxbach 569",
        "Stockhofstr. 34",
        "Frauendorf 16",
        "Ramingtalstr. 227",
        "Unterdorf 101",
        "Waschenberg 2",
        "Wexstraße 19-23",
        "Hormayrgasse 35",
        "Aching 63",
        "Kärntner Straße 90",
        "Estermannstraße 12",
        "Aumühlweg 17-19 Halle 14",
        "Wienerstrasse 65",
        "Linzer Bundesstr. 39",
        "St. Walburgen 101",
        "Obermühlham 47",
        "Studenzen 16",
        "Jahrings Nr. 55",
        "Baumgasse 60b",
        "Laurenzistraße 10",
        "Sumetsrad 19",
        "Roter Stein 1",
        "Grafenschlag 89",
        "Ketzergasse 120",
        "Sonnberg 22",
        "Reittern 9",
        "Königstetterstraße 122",
        "Prießnitzgasse 10",
        "Steiner Landstraße 4",
        "Neukirchnerstraße 46",
        "Gasselsdorf 4",
        "Paltaufgasse 2",
        "Grub 7",
        "Cumberlandstraße 68",
        "Hochwassergasse 8",
        "Feldgasse 54/1",
        "Hainfelderstraße 18",
        "Reichstraße 123A",
        "Pechhüttenstraße 4A/5",
        "Friedhofgasse 9",
        "Grieshofgasse 14",
        "Schartner Straße 16",
        "Bad Kissingenplatz Nr. 3",
        "Schulstraße 30",
        "Riegl 44",
        "Getzersdorferstr. 27",
        "Linzerstraße 361",
        "Bahnhofstraße 70",
        "Oberdambach 12",
        "Schlösslgasse 5",
        "Ginzkeystraße 28",
        "Hauptstrasse 1",
        "Zona Produttiva 129/H",
        "Villagasse 2",
        "Hauptstraße 90",
        "Siberweg 7",
        "Feldkirchner Str. 38",
        "Brennaustraße 6",
        "Gewerbepark 9",
        "Bahnhof-Umgebung 17",
        "Finksiedlung 31",
        "Industriestraße 23",
        "Glemmtaler Landesstraße 386",
        "Dr. Gass Gasse 2",
        "Goethegasse 61",
        "Hofherr-Schrantz-Gasse 4",
        "Gartenstraße 7",
        "Hernalser Gürtel, Stadtbahnbo 78-80",
        "Kapellenstraße 82",
        "Feldstrasse 90",
        "Tirolerstraße 19",
        "Kärntnerstrasse 14",
        "Nordkammstraße 1",
        "Besenberg 9",
        "Johann-Strauss-Str. 15",
        "Unterer Markt 37",
        "Walgaustraße 82",
        "Zellerstraße 48",
        "Haindorferstraße 6",
        "Puchsbaumgasse 21",
        "Schiessstaettenstrasse 6",
        "Rudolf-Diesel-Str. 11",
        "Wolfenreith 37",
        "Industriestraße A6",
        "Hauptstraße 23",
        "Hauptstrasse 46",
        "Walgaustraße 53",
        "Harterstraße 48",
        "Industriestraße 15",
        "Kleiner Platz 2",
        "Rudolf Diesel Straße 3a",
        "Auhofstraße 151",
        "Obererla 1",
        "Haller Straße 9-15",
        "Parkring 10",
        "Ganglbauergasse 24",
        "Gewerbepark Pitztal 4",
        "Hirschwang 153",
        "Herzog Odilostr. 66",
        "Ödhöfen-Au 207",
        "Schwadorf 18",
        "Puntigamerstraße 143",
        "Hauptstraße 43",
        "Industriegelände 1",
        "Dorfviertel 42",
        "Racking 17",
        "Saatzuchtstraße 34",
        "Seisenegg 15",
        "Grieskirchnerstraße 79",
        "Wallenmahd 10a",
        "Obere Hauptstraße 77",
        "Badstubenweg 68",
        "Schroetten 5",
        "Hammergasse 3",
        "Wiener Straße 55",
        "Nordstraße 2",
        "Betriebsfeld 1",
        "Fornacher Straße 24",
        "Dassanowskyweg 16",
        "Gaswerkstrasse 19",
        "Kramelsbergstraße 8",
        "Rennweg 76",
        "Welserstraße 91-93",
        "Bahnhofstraße 18",
        "Radetzkystraße 116",
        "Fürbergstraße 26",
        "Guntramsdorfer Straße 89",
        "Riederstraße 4",
        "Matznerstraße 28",
        "Hauptstrasse 60",
        "Wienerstr. 94B",
        "Hauptstraße 2",
        "Mandlinggasse 4",
        "Häusern 2",
        "Hauptplatz 17",
        "Weblinger Straße 35",
        "Triester Straße 50",
        "Fürstenweg 109",
        "Im Bäckerfeld 2",
        "Porschestraße 23",
        "Wiener Straße 113,2.2b",
        "Zeppelinstraße 4",
        "Rautenstrauchgasse 11",
        "Mariahilfergürtel 8",
        "Laxenburger Straße 98a",
        "Simmeringer Hauptstraße 31",
        "Ruckergasse 34",
        "Hadikgasse 128-134",
        "Donaustadtstr. 17",
        "Breitenfurter Straße 164",
        "Brunner Straße 86",
        "Gnigler Straße 10",
        "Kärntner Straße 7a",
        "Höttinger Au 45",
        "Mariazeller Straße 124",
        "Fischauer Gasse 217",
        "Unterneuberg 32/1",
        "Prager Straße 44",
        "Fischbacherstr. 5",
        "Percostrasse 3",
        "Triester Straße 172",
        "Salzburgerstraße 2",
        "Hauptstr. 3",
        "Villacher Straße 49",
        "Obervellach Nr. 120",
        "Kaiserbrunnstraße 100",
        "Braunauer Str. 1",
        "Schönbrunnerstraße 18",
        "Pichlwangerstr. 24",
        "Weizerstraße 48",
        "Rossaugasse 11",
        "Unterfeldstraße 27",
        "Mariasdorf 131",
        "Bründlweg 23",
        "Schuhmeierplatz 4",
        "Jauchsdorferstraße 10",
        "Dornbacherstraße 113",
        "Richard-Strauss-Straße 18/Obj 1",
        "Lambacher Str. 14",
        "Mitterndorf 25",
        "Lehberggasse 9",
        "Im Grund 7",
        "Weinstraße 65",
        "Parndorferstraße 22",
        "Mitterstraße 22",
        "Wiener Neustädterstraße 99",
        "Schanzstraße 51",
        "Industriestraße 5",
        "Landstraße 19",
        "Dreihackengasse 26",
        "Bürgerbergweg 20",
        "Degelestraße 6",
        "Berglstraße 2",
        "Achstraße 12",
        "Gewerbepark 15",
        "Hofgasse 1",
        "Handelsstraße 1",
        "Völkermarkterstraße 22",
        "Bundesstraße 4",
        "Hofstraße 9",
        "Emmerberg 6",
        "Hölle 11",
        "Westbahnstr. 10",
        "Panoramastraße 33",
        "Ausserwall 17",
        "Niederhof 214",
        "Kapfstraße 109",
        "Gunnersdorf 5",
        "Gewerbestraße 5",
        "Umfahrungsstraße 1",
        "Pfenniggeldgasse/Gablenzgasse",
        "Liechtensteinerstr. 111a",
        "Linzer Straße 3",
        "Holzstraße 6a",
        "Prüschenkweg 10",
        "Plainstraße 145",
        "Pfarrwerfen 50",
        "Industriezeile 48",
        "Andreas Hofer-Straße 13",
        "Unterer Flötzerweg 13",
        "Zwölfaxingerstraße 5",
        "Dr. Theodor-Körner-Str. 49",
        "Sturzgasse 2",
        "Garmanns 1",
        "Ellershofstraße 1",
        "Strass 16",
        "Franz Josef Str. 3",
        "Bundesstraße 88",
        "Baderberg 15",
        "Lehsdorf 2",
        "Millergasse 36-38",
        "Hermanngasse 34",
        "Gewerbepark 13B",
        "Herrschaftswiesen 14",
        "Brixentalerstr. 24",
        "Albrechtskreithgasse 11",
        "Schlossleiten 11",
        "Dragonerstraße 40",
        "Traunuferstraße 110",
        "Laboisnerstraße 1a",
        "Himberger Straße 64",
        "Hochwassergasse 6 Box 5",
        "Hauptplatz 6",
        "Hauptstraße 6",
        "Hintausstraße 23",
        "Kirchengasse 22",
        "Gartenauerstraße 2a",
        "Hauptstraße 5",
        "Unterthalham 7",
        "Linzer Straße 21",
        "Mollardgasse 19",
        "Edlmanngasse 5",
        "Umfahrungsstraße 4",
        "Korbergasse 10",
        "Bahnhofstr. 11a",
        "Unterspannberg 6",
        "Wegscheid 3",
        "Pechhüttenstraße 4/2",
        "Karlauerplatz 3b",
        "Winzendorf 140",
        "Hauptstraße 31",
        "Walgaustr. 75",
        "Annastr. 78",
        "Leberstraße 118",
        "Linzerstraße 21",
        "Semriacherstraße 100",
        "Bahnhofstraße 1",
        "Beingasse 6",
        "Tattendorferstraße 83/3",
        "In Eggenstein 11",
        "Triester Straße 11",
        "Grimm Straße 4",
        "Steindorf 32a",
        "Jagern 53/1",
        "Malta 175",
        "Hauptstraße 37",
        "Salzburger Straße 23",
        "Himbergerstr. 32",
        "Seehofstraße 36",
        "Laboisnerstraße 1a",
        "Betriebsgebiet Nord 4",
        "Stadionstraße 14",
        "Seybelgasse 13/10",
        "Holzsteinstr. 6A",
        "Bahnhofstraße 57",
        "Hauptstraße 326",
        "Wichtelgasse 41/3",
        "Wilbinger 218",
        "Oberthalheim 33",
        "Auwinkl 13B",
        "Röth 16",
        "Breitenleer Straße 104",
        "Hauptstraße 2",
        "Unering 5",
        "Hauptstraße 32",
        "Wildschönauerstraße 278",
        "Alte Bundesstraße 13",
        "Stanz 108",
        "Schwertfern 22",
        "Hauptstr. 113a",
        "Hoffeldstraße 20",
        "Franz-Ofnerstraße 17",
        "Griesauweg 28",
        "Angerner-Ortsstraße 34",
        "Siberweg 7",
        "Kärntner Straße 30",
        "Schönbrunner Allee 41",
        "Lustkandlgasse 29",
        "Karbach 30",
        "Zeller Straße 89",
        "Schallenbergstraße 27",
        "Edisonstr. 3",
        "Fischof 28",
        "Entschendorf 1",
        "Gewerbegasse 10",
        "St. Peter 28/A",
        "Am Straßfeld 2",
        "Sechshauserstraße 114/1",
        "Tobaj 147",
        "Wörtherstraße 104",
        "Rudolf-Diesel-Straße 1",
        "Walter-Simmer-Str. 1",
        "Holzmeisterstraße 4",
        "Gasslweg 1",
        "Mayerlehen 43",
        "Hauptstraße 18",
        "Landertsham 7",
        "Sechshauser Straße 114/1",
        "Grazer Straße 155",
        "Mühlgraben 17",
        "Brunner Straße 69",
        "Handelsring 5a",
        "Karawankenblickstraße 126",
        "Au 51",
        "Am Sonnenhang 20",
        "Lohnergasse 3A",
        "Hauptstraße 121",
        "Hämmerlestraße 71c",
        "Haxbach 597",
        "Frischg 16",
        "Schrötten 2",
        "Lobfeldstraße 14",
        "Großklein 97",
        "Breitenfurterstr. 149",
        "Hans-Liebherr-Straße 21",
        "Wiener Straße 5",
        "St. Johann/Gisse 61",
        "Urstein Nord 73",
        "Leonfeldner Straße 199",
        "Weizerstraße 4",
        "Kalvarienberggasse 62",
        "Am Bahnhof 14",
        "Bahnhofstr. 786",
        "Siedlung 77",
        "Strohgasse 9",
        "Marburger Straße 107",
        "Südring 332",
        "Kaiser Ebersdorfer Straße 69",
        "Pluskaufstrasse 11",
        "Etrichgasse 19",
        "Nötsch 85",
        "Hollergasse 2-6",
        "Salzburgerstraße 23",
        "Gierstergasse 5",
        "Karl Praunseys Str. 18",
        "Hohenstaufengasse 4",
        "Thayastraße 1",
        "Schremser Straße 81",
        "Waidegg 56",
        "Wienerstr. 57",
        "Baumüllerboden 8",
        "Dorfstraße 49",
        "Friedhofgasse 16",
        "Sägeweg 1",
        "Stadl 190",
        "Ebersau 69",
        "Fischbachgasse 64/a",
        "Frauschereck 66",
        "Frauentaler Straße 104",
        "Brünner Straße 62",
        "Allenweg 1/4",
        "Salzburgerstraße 30",
        "Tieschen 100",
        "Erlaufstraße 35",
        "Josef-Pirchl-Straße 42",
        "Kellerweg 6",
        "Brand 36",
        "Siemensstraße 105",
        "Steinwandweg 39",
        "Hauptstraße 17",
        "Industriegelände 1 Halle B",
        "Hauptstraße 27",
        "Gewerbezone 2",
        "Aufnergasse 7",
        "Gösting 12",
        "Am Stampf 12",
        "Hundsdorfweg 17",
        "Wiener Str. 158",
        "Beckmanngasse 20",
        "Hirschstettnerstr. 44/1",
        "Gruben 38",
        "Seckendorff-Gudentweg 8",
        "Jochberg 5",
        "Friedhofstr. 25",
        "Wallersbach 30",
        "Mühlgasse 24",
        "Grubing 35",
        "Untere Hauptstraße 21",
        "Webereistraße 14",
        "Wildmoos 313",
        "Schwefel 28",
        "Schönstraße 14",
        "Gewerbestraße 1/13",
        "Breitenfurter Straße 349",
        "Josef-Hager-Straße 45",
        "Igelschwang 2",
        "Kainergasse 10a",
        "Föhrenweg 2",
        "Welser Straße 6",
        "Gaissau 11",
        "Steinach 11",
        "Wiener Bundesstraße 17",
        "Industriestr. 3",
        "Dellach im Drautal 7a",
        "Auf der Trift 7",
        "Hilschergasse 5/1",
        "Bundesstraße 24",
        "Eduard-Kittenberger-Gasse 56 Obj. 9",
        "Pfadenhauergasse 10",
        "Kammerhof 1",
        "Triester Straße 336-338",
        "Teslastrasse 1",
        "Alte Landstraße 2",
        "Nodbachweg 6",
        "Kammer 40",
        "Schopenhauerstr. 30",
        "Buchengasse 26-28",
        "Hauptstraße 15",
        "Schmelzerweg 1",
        "Mitterfladnitz 176",
        "Baumgartenstraße 17/4"

        );
    List<String> zipcode = Arrays.asList("2840",
        "6410",
        "6890",
        "2540",
        "3900",
        "6890",
        "5020",
        "6114",
        "5084",
        "3971",
        "2020",
        "8345",
        "3572",
        "3304",
        "6800",
        "8720",
        "6450",
        "6850",
        "4061",
        "7000",
        "9633",
        "8350",
        "4371",
        "2201",
        "8510",
        "6070",
        "3142",
        "2242",
        "2004",
        "8563",
        "2201",
        "5531",
        "39010",
        "5301",
        "5023",
        "3321",
        "4210",
        "6170",
        "2601",
        "6890",
        "6425",
        "8191",
        "7312",
        "6542",
        "7210",
        "6883",
        "5163",
        "2103",
        "1020",
        "8232",
        "1136",
        "6671",
        "8332",
        "1230",
        "7000",
        "5020",
        "2435",
        "6200",
        "9020",
        "4230",
        "1220",
        "4810",
        "8071",
        "2721",
        "4312",
        "1140",
        "8181",
        "8361",
        "4300",
        "2433",
        "3914",
        "6020",
        "5300",
        "6380",
        "8954",
        "6382",
        "3611",
        "3354",
        "4910",
        "2490",
        "6370",
        "8041",
        "6850",
        "5442",
        "1220",
        "9494",
        "1220",
        "5222",
        "3474",
        "6973",
        "6890",
        "6342",
        "8282",
        "4070",
        "3950",
        "9113",
        "3130",
        "1030",
        "8510",
        "6430",
        "6971",
        "8342",
        "8083",
        "6020",
        "8071",
        "5280",
        "3300",
        "6060",
        "5111",
        "5121",
        "1120",
        "1060",
        "1230",
        "1030",
        "6020",
        "8700",
        "5101",
        "3351",
        "1210",
        "3820",
        "1210",
        "4595",
        "4251",
        "4142",
        "6068",
        "1110",
        "4810",
        "3107",
        "3184",
        "3300",
        "5020",
        "9100",
        "4311",
        "2165",
        "3644",
        "1230",
        "3350",
        "6932",
        "8054",
        "8403",
        "8530",
        "5441",
        "2700",
        "2490",
        "8663",
        "4055",
        "5144",
        "8261",
        "4775",
        "3910",
        "2500",
        "7000",
        "5061",
        "6020",
        "2630",
        "2203",
        "2380",
        "5400",
        "1210",
        "8020",
        "5164",
        "3351",
        "4400",
        "3100",
        "3300",
        "5424",
        "8650",
        "1210",
        "3362",
        "7092",
        "1030",
        "6241",
        "6241",
        "9020",
        "6233",
        "9500",
        "9122",
        "6991",
        "8081",
        "2460",
        "2540",
        "1230",
        "1120",
        "9020",
        "3100",
        "3910",
        "3100",
        "59597",
        "5101",
        "3373",
        "3252",
        "3454",
        "2231",
        "2333",
        "6284",
        "4616",
        "1110",
        "3325",
        "4391",
        "3170",
        "5071",
        "4600",
        "3200",
        "9000",
        "3323",
        "5301",
        "3365",
        "3350",
        "3361",
        "2544",
        "6580",
        "4600",
        "6300",
        "3300",
        "8232",
        "8501",
        "3100",
        "4923",
        "2542",
        "6845",
        "8793",
        "1030",
        "2534",
        "83395",
        "3340",
        "2232",
        "6322",
        "7000",
        "9462",
        "3300",
        "4204",
        "2833",
        "9500",
        "2412",
        "3511",
        "9261",
        "3382",
        "2640",
        "6342",
        "4183",
        "8190",
        "3462",
        "6700",
        "2460",
        "2331",
        "2351",
        "2113",
        "2064",
        "4261",
        "1110",
        "8055",
        "6850",
        "1230",
        "3345",
        "2134",
        "6220",
        "3380",
        "9020",
        "3362",
        "8230",
        "6020",
        "4600",
        "1110",
        "84307",
        "7561",
        "8790",
        "1110",
        "9560",
        "9112",
        "2731",
        "2100",
        "8114",
        "9773",
        "4652",
        "6425",
        "6600",
        "8423",
        "8430",
        "1220",
        "4710",
        "6060",
        "9300",
        "1180",
        "4076",
        "2333",
        "6867",
        "5163",
        "5580",
        "1140",
        "1100",
        "1160",
        "3483",
        "8842",
        "6020",
        "1160",
        "5020",
        "6020",
        "6020",
        "1220",
        "8073",
        "4020",
        "9363",
        "2201",
        "1230",
        "3562",
        "2100",
        "4822",
        "3593",
        "1104",
        "8350",
        "1100",
        "2244",
        "4724",
        "8262",
        "3911",
        "2514",
        "4600",
        "6170",
        "1210",
        "8200",
        "2340",
        "1230",
        "4060",
        "2301",
        "6300",
        "3925",
        "5120",
        "8854",
        "6414",
        "2630",
        "9500",
        "3264",
        "2301",
        "3254",
        "9560",
        "5020",
        "7540",
        "9500",
        "2822",
        "5020",
        "9470",
        "1230",
        "3380",
        "9020",
        "3910",
        "2201",
        "2542",
        "4911",
        "1230",
        "4121",
        "1230",
        "8043",
        "8793",
        "6250",
        "8572",
        "2640",
        "6714",
        "3400",
        "2493",
        "7210",
        "6134",
        "2265",
        "1160",
        "6972",
        "6020",
        "2435",
        "3130",
        "4971",
        "7472",
        "9500",
        "7471",
        "5660",
        "2560",
        "2731",
        "8662",
        "1210",
        "1230",
        "1210",
        "1030",
        "8055",
        "6072",
        "5760",
        "5760",
        "5440",
        "7082",
        "8053",
        "6330",
        "2763",
        "7434",
        "5071",
        "6175",
        "8911",
        "8952",
        "8700",
        "8124",
        "5082",
        "5303",
        "4730",
        "8081",
        "8330",
        "6911",
        "5090",
        "4614",
        "3482",
        "5700",
        "1080",
        "5325",
        "5020",
        "5142",
        "6525",
        "3322",
        "8443",
        "3950",
        "4202",
        "1220",
        "8401",
        "3430",
        "9500",
        "9800",
        "3300",
        "1230",
        "2540",
        "1100",
        "5101",
        "3304",
        "5303",
        "2000",
        "1210",
        "5301",
        "3300",
        "7202",
        "8430",
        "1220",
        "2130",
        "5733",
        "6122",
        "8264",
        "8192",
        "6063",
        "4540",
        "3484",
        "5300",
        "4501",
        "5600",
        "2301",
        "8712",
        "8430",
        "2230",
        "1110",
        "2331",
        "1220",
        "9560",
        "4926",
        "2486",
        "3353",
        "8330",
        "5202",
        "1040",
        "9473",
        "9112",
        "2253",
        "3300",
        "5722",
        "6175",
        "3481",
        "2860",
        "4600",
        "4060",
        "7000",
        "5071",
        "5310",
        "3300",
        "7543",
        "9065",
        "7033",
        "8063",
        "2460",
        "8071",
        "2534",
        "2320",
        "2372",
        "8501",
        "8020",
        "2201",
        "6822",
        "4702",
        "8770",
        "3945",
        "3304",
        "5741",
        "1000",
        "5723",
        "6284",
        "5722",
        "8265",
        "6330",
        "7000",
        "8254",
        "1010",
        "8093",
        "5550",
        "4091",
        "5221",
        "2700",
        "8504",
        "3071",
        "3100",
        "3100",
        "8162",
        "8302",
        "4840",
        "5411",
        "8200",
        "6700",
        "3311",
        "4906",
        "7571",
        "9560",
        "3683",
        "5421",
        "2020",
        "3314",
        "2511",
        "5205",
        "4720",
        "8322",
        "8230",
        "4614",
        "8954",
        "3110",
        "2120",
        "8600",
        "8753",
        "5730",
        "1120",
        "4284",
        "7301",
        "6380",
        "4600",
        "8354",
        "9220",
        "3204",
        "9232",
        "3335",
        "4310",
        "2115",
        "2201",
        "2384",
        "2460",
        "5020",
        "4174",
        "2402",
        "9072",
        "6175",
        "6832",
        "5211",
        "2141",
        "5071",
        "4252",
        "7534",
        "3071",
        "3920",
        "4441",
        "6473",
        "4654",
        "1200",
        "1170",
        "5280",
        "8053",
        "4017",
        "2544",
        "2640",
        "5023",
        "9372",
        "4891",
        "8322",
        "3910",
        "1030",
        "3040",
        "4791",
        "6781",
        "3912",
        "1230",
        "6314",
        "4890",
        "3430",
        "1210",
        "3500",
        "2700",
        "8543",
        "1160",
        "4932",
        "4810",
        "1230",
        "7536",
        "2563",
        "6800",
        "2320",
        "7142",
        "1120",
        "4611",
        "7000",
        "3494",
        "8234",
        "3134",
        "1140",
        "4070",
        "4461",
        "3950",
        "4600",
        "2444",
        "39049",
        "5071",
        "7222",
        "6060",
        "9020",
        "3500",
        "6068",
        "6170",
        "5700",
        "39023",
        "5753",
        "2493",
        "2340",
        "1210",
        "9800",
        "1090",
        "8076",
        "2231",
        "9900",
        "9601",
        "4273",
        "4722",
        "4651",
        "4292",
        "6842",
        "5760",
        "3385",
        "1100",
        "2602",
        "86462",
        "3122",
        "2345",
        "6719",
        "6401",
        "6714",
        "8053",
        "2301",
        "7502",
        "2000",
        "1130",
        "3672",
        "6020",
        "1010",
        "1160",
        "6471",
        "2651",
        "5310",
        "2853",
        "3100",
        "8055",
        "2485",
        "7082",
        "8190",
        "3143",
        "2301",
        "3322",
        "4701",
        "6850",
        "3495",
        "9500",
        "8483",
        "3340",
        "3400",
        "5301",
        "3312",
        "4870",
        "1220",
        "9500",
        "4320",
        "1030",
        "4060",
        "6250",
        "6845",
        "5020",
        "2340",
        "4980",
        "2242",
        "7341",
        "2640",
        "2453",
        "2763",
        "6070",
        "2514",
        "8055",
        "9523",
        "6020",
        "4060",
        "3100",
        "2700",
        "2401",
        "1110",
        "1060",
        "1100",
        "1110",
        "1120",
        "1140",
        "1220",
        "1230",
        "1230",
        "5020",
        "8020",
        "6020",
        "3100",
        "2700",
        "8225",
        "3580",
        "8190",
        "1220",
        "1230",
        "5620",
        "7533",
        "9800",
        "9821",
        "3021",
        "5122",
        "1050",
        "4850",
        "8200",
        "6020",
        "6700",
        "7433",
        "6300",
        "1160",
        "5113",
        "1170",
        "1230",
        "4623",
        "5122",
        "2202",
        "3550",
        "3550",
        "2460",
        "8111",
        "2601",
        "1140",
        "2214",
        "3304",
        "8020",
        "5630",
        "5400",
        "6322",
        "6923",
        "4762",
        "3352",
        "4300",
        "9150",
        "5600",
        "2361",
        "2723",
        "2811",
        "4482",
        "2852",
        "5162",
        "6474",
        "6800",
        "3361",
        "2493",
        "6280",
        "1160",
        "6800",
        "4820",
        "3300",
        "4360",
        "5020",
        "5452",
        "5280",
        "6067",
        "4050",
        "2320",
        "2521",
        "1140",
        "3542",
        "3251",
        "6393",
        "8200",
        "8740",
        "4223",
        "3654",
        "1060",
        "1070",
        "6300",
        "6842",
        "6343",
        "1160",
        "8820",
        "4600",
        "4052",
        "9560",
        "2320",
        "1230",
        "2332",
        "2763",
        "2452",
        "8102",
        "5082",
        "2333",
        "4694",
        "4063",
        "1060",
        "9020",
        "7132",
        "1120",
        "6800",
        "5602",
        "3243",
        "2320",
        "8020",
        "8225",
        "3244",
        "6714",
        "45130",
        "1110",
        "4240",
        "8102",
        "8074",
        "1150",
        "2540",
        "4643",
        "8724",
        "2111",
        "4863",
        "4761",
        "9854",
        "2770",
        "5204",
        "1100",
        "9871",
        "9560",
        "7123",
        "9545",
        "1230",
        "2201",
        "4070",
        "8232",
        "1160",
        "6870",
        "4850",
        "6352",
        "4890",
        "1220",
        "2102",
        "4926",
        "7032",
        "6314",
        "5550",
        "8653",
        "4890",
        "8740",
        "8046",
        "5020",
        "6020",
        "3130",
        "6060",
        "8021",
        "2331",
        "1090",
        "8345",
        "5730",
        "4183",
        "4623",
        "4894",
        "8321",
        "4060",
        "39030",
        "2401",
        "1150",
        "7540",
        "2640",
        "2000",
        "5310",
        "5071",
        "2620",
        "5201",
        "2123",
        "4846",
        "1150",
        "8434",
        "8773",
        "1230",
        "4481",
        "9210",
        "6134",
        "5161",
        "1210",
        "7022",
        "6800",
        "7534",
        "9545",
        "8522",
        "3133",
        "8452",
        "1120",
        "6410",
        "3712",
        "39030",
        "5412",
        "4040",
        "8044",
        "1170",
        "8551",
        "8970",
        "6261",
        "9020",
        "8435",
        "9020",
        "1110",
        "4061",
        "6020",
        "9611",
        "1150",
        "5102",
        "1120",
        "2201",
        "8020",
        "3830",
        "3860",
        "9631",
        "2000",
        "39030",
        "2560",
        "8650",
        "8833",
        "8862",
        "4920",
        "6850",
        "5242",
        "8530",
        "1210",
        "4932",
        "8940",
        "8355",
        "3253",
        "6370",
        "4873",
        "6867",
        "1210",
        "3671",
        "4872",
        "7082",
        "2443",
        "7053",
        "5020",
        "2225",
        "2493",
        "5661",
        "2352",
        "1140",
        "1220",
        "6290",
        "1131",
        "5731",
        "4020",
        "8800",
        "1040",
        "5731",
        "7561",
        "4730",
        "5092",
        "6850",
        "3140",
        "2232",
        "1230",
        "6372",
        "3313",
        "1030",
        "5301",
        "4501",
        "5425",
        "4822",
        "5300",
        "2201",
        "9772",
        "2492",
        "1120",
        "5600",
        "1230",
        "1140",
        "3202",
        "1230",
        "3100",
        "2004",
        "7062",
        "4974",
        "1180",
        "1100",
        "4131",
        "6250",
        "8322",
        "1140"

        );
    // CITY
    List<String> city = Arrays.asList("Petersbaumgarten",
        "Telfs",
        "Lustenau",
        "Bad Vöslau",
        "Schwarzenau",
        "Lustenau",
        "Salzburg",
        "Weer",
        "Großgmain",
        "St. Matin",
        "Hollabrunn",
        "Straden",
        "St. Leonhard",
        "St. Georgen",
        "Feldkirch",
        "Knittelfeld",
        "Sölden",
        "Diornbirn",
        "Pasching",
        "Eisentsadt",
        "Reisach",
        "Fehring",
        "Dimbach",
        "Gerasdorf",
        "Stainz",
        "Ampass",
        "Mustetten",
        "Prottes",
        "Niederhollabrunn",
        "Ligist",
        "Hagenbrunn",
        "Eben",
        "Andrian",
        "Eugendorf",
        "Salzburg",
        "Ardagger",
        "Unterweitersdorf",
        "Zirl",
        "Sollenau",
        "Lustenau",
        "Haiming",
        "Koglhof",
        "Horitschon",
        "Pfunds",
        "Mattersburg",
        "Au",
        "Mattsee",
        "Langenzersdorf",
        "Wien",
        "Grafendorf",
        "Wien",
        "Weisenbach",
        "Edelsbach",
        "Wien",
        "Eisenstadt",
        "Salzburg",
        "Wienerherberg",
        "Jenbach",
        "Klagenfurt",
        "Pregarten",
        "Wien",
        "Gmunden",
        "Hausmannstätten",
        "Bad Fischau - Brunn",
        "Ried",
        "Wien",
        "St. Ruprecht",
        "Hatzendorf",
        "St. Valentin",
        "Margarethen am Moos",
        "Waldhausen",
        "Innsbruck",
        "Hallwang",
        "St. Johann",
        "St. Martin",
        "Kirchdorf",
        "Habruck",
        "Wolfsbach",
        "Pattigham",
        "Ebenfurth",
        "Kitzbühel",
        "Graz",
        "Dornbirn",
        "Rußbach",
        "Wien",
        "Schaan",
        "Wien",
        "Munderfing",
        "Altenwörth",
        "Höchst",
        "Lustenau",
        "Niederndorf",
        "Loipersdorf",
        "Eferding",
        "Gmünd",
        "Ruden",
        "Herzogenburg",
        "Wien",
        "Stainz",
        "Ötztal Bahnhof",
        "Hard",
        "Gnas",
        "St. Stefan i. Rosental",
        "Innsbruck",
        "Breitenhilm",
        "Braunau",
        "Amstetten",
        "Hall",
        "Bürmoos",
        "Tarsdorf",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Innsbruck",
        "Leoben",
        "Bergheim",
        "Weistrach",
        "Wien",
        "Raabsith",
        "Wien",
        "Waldneukirchen",
        "Sandl",
        "Hofkirchem",
        "Mils",
        "Wien",
        "Gmunden",
        "St. Pölten",
        "Türnitz",
        "Amstetten",
        "Salzburg",
        "Völkermarkt",
        "Schwertberg",
        "Drasenhofen",
        "Grimsing",
        "Wien",
        "Haag",
        "Langen",
        "Graz",
        "Lebring",
        "Deutschlandsberg",
        "Abtenau",
        "Wr. Neustadt",
        "Ebenfurth",
        "Veitsch",
        "Pucking",
        "Handenberg",
        "Sinabelkirchen",
        "Taufkirchen / Pram",
        "Zwettl",
        "Baden",
        "Eisenstadt",
        "Eisbethen",
        "Innsbruck",
        "Ternitz",
        "Großebersdorf",
        "Perchtoldsdorf",
        "Hallein",
        "Wien",
        "Graz",
        "Seeham",
        "Weistrach",
        "Steyr",
        "St. Pölten",
        "Amstetten",
        "Bad Vigaun",
        "Kindberg",
        "Wien",
        "Mauer",
        "Winden am See",
        "Wien",
        "Radfeld",
        "Radfeld",
        "Klagenfurt",
        "Kramsach",
        "Villach",
        "St. Kanzian",
        "Riezlern",
        "Heiligenkreuz a. Waasen",
        "Bruck an der Leitha",
        "Bad Vöslau",
        "Wien",
        "Wien",
        "Klagenfurt",
        "St. Pölten",
        "Zwettl",
        "St. Pölten",
        "Erwitte",
        "Bergheim",
        "Kemmelbach",
        "Petzenkirchen",
        "Reidling",
        "Strasshof",
        "Leopoldsdorf",
        "Ramsau im Zillertal",
        "Marchtrenk",
        "Wien",
        "Ferschnitz",
        "Waldhausen",
        "Hainfeld",
        "Wals bei Salzburg",
        "Wels",
        "Obergrafendorf",
        "Murska Sobota",
        "Neustadtl-Markt",
        "Eugendorf",
        "Allhartsberg",
        "Haag",
        "Aschbach",
        "Leobersdorf",
        "St. Anton am Arlberg",
        "Wels",
        "Wörgl",
        "Winklarn",
        "Grafendorf b. Hartberg",
        "Lieboch",
        "St. Pölten",
        "Lohnsburg",
        "Kottingbrunn",
        "Hohenems",
        "Trofaiach",
        "Wien",
        "Alland",
        "Freilassing",
        "Waidhofen",
        "Deutsch-Wagram",
        "Kirchbichl",
        "Eisenstadt",
        "Bad St. Leonhard",
        "Amstetten",
        "Haibach",
        "Bromberg",
        "Villach",
        "Wolfsthal",
        "Steinaweg",
        "Cankova",
        "Dunkelsteinerwald",
        "Wörth",
        "Niederndorf",
        "Traberg",
        "Miesenbach b. Birkfeld",
        "Absdorf",
        "Bludenz",
        "Bruck an der Leitha",
        "Vösendorf",
        "Wiener Neudorf",
        "Karnabrunn",
        "Wulzeshofen",
        "Rainbach",
        "Wien",
        "Seiersberg",
        "Dornbirn",
        "Wien",
        "Göstling",
        "Staatz",
        "Buch",
        "Pöchlarn",
        "Klagenfurt",
        "Amstetten",
        "Hartberg",
        "Innsbruck",
        "Wels",
        "Wien",
        "Eggenfelden",
        "Heiligenkreuz",
        "Eisenerz",
        "Wien",
        "Feldkirchen",
        "Griffen",
        "Urschendorf",
        "Korneuburg",
        "Friesach",
        "Irschen",
        "Fischlham",
        "Haiming",
        "Reutte",
        "Lind",
        "Leibnitz",
        "Wien",
        "Grieskirchen",
        "Hall in Tirol",
        "St. Veit/ Glan",
        "Wien",
        "St. Marienkirchen",
        "Leopoldsdorf",
        "Schwarzenberg",
        "Mattsee",
        "Tamsweg",
        "Wien",
        "Wien",
        "Wien",
        "Feuersbrunn",
        "Katsch an der Mur",
        "Innsbruck",
        "Wien",
        "Salzburg",
        "Innsbruck",
        "Innsbruck",
        "Wien",
        "Feldkirchen bei Graz",
        "Linz",
        "Metnitz",
        "Hagenbrunn",
        "Wien",
        "Schönberg",
        "Korneuburg",
        "Bad Goisern",
        "Neupölla",
        "Wien",
        "Fehring",
        "Wien",
        "Spannberg",
        "Neukirchen",
        "Ilz",
        "Rappottenstein",
        "Traiskirchen",
        "Wels",
        "Zirl",
        "Wien",
        "Gleisdorf",
        "Mödling",
        "Wien",
        "Leonding",
        "Groß Enzersdorf",
        "Wörgl",
        "Altmelon",
        "St. Pantaleon",
        "Krakaudorf",
        "Mieming",
        "Ternitz",
        "Villach",
        "Gresten",
        "Groß Enzersdorf",
        "Bergland",
        "Feldkirchen",
        "Salzburg",
        "Güssing",
        "Villach",
        "Föhrenau",
        "Salzburg",
        "St. Paul",
        "Wien",
        "Pöchlarn",
        "Klagenfurt",
        "Zwettl",
        "Hagenbrunn",
        "Kottingbrunn",
        "Tumeltsham",
        "Wien",
        "Altenfelden",
        "Wien",
        "Graz",
        "Trofaiach",
        "Kundl",
        "Bärnbach",
        "Gloggnitz",
        "Nüziders",
        "Klosterneubrug",
        "Lichtenwörth",
        "Mattersburg",
        "Vomp",
        "Drösing",
        "Wien",
        "Fußach",
        "Innsbruck",
        "Ebergassing",
        "Herzogenburg",
        "Aurolzmünster",
        "Dürnbach",
        "Villach",
        "Rechnitz",
        "Taxenbach",
        "Berndorf",
        "Gerarsdorf",
        "Mitterdorf",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Seiersberg",
        "Lans",
        "Saalfelden",
        "Saalfelden",
        "Scheffau",
        "Donnerskirchen",
        "Graz",
        "Kufstein",
        "Pernitz",
        "Bernstein/Dreihütten",
        "Wals",
        "Kematen in Tirol",
        "Admont",
        "Irdning",
        "Leoben",
        "Übelbach",
        "Gröding",
        "Thalgau",
        "Waizenkirchen",
        "Empersdorf",
        "Feldbach",
        "Eichenberg",
        "Lofer",
        "Marchtrenk",
        "Gösing",
        "Zell am See",
        "Wien",
        "Plainfeld",
        "Salzburg",
        "Eggelsberg",
        "Faggen",
        "Viehdorf",
        "Gleinstätten",
        "Dietmanns",
        "Hellmonsödt",
        "Wien",
        "Kalsdorf bei Graz",
        "Tulln",
        "Villach",
        "Spittal an der Drau",
        "Amstetten",
        "Wien",
        "Bad Vöslau",
        "Wien",
        "Bergheim",
        "St. Georgen",
        "Thalgau",
        "Maribor",
        "Wien",
        "Eugendorf",
        "Amstetten",
        "Bad Sauerbrunn",
        "Tillmitsch",
        "Wien",
        "Mistelbach",
        "Bramberg",
        "Fritzens",
        "Großsteinbach",
        "Strallegg",
        "Rum",
        "Bad Hall",
        "Seebarn",
        "Hallwang",
        "Neuhofen",
        "St. Johann im Pongau",
        "Probstdorf",
        "Niklasdorf",
        "Leibnitz",
        "Gänserndorf",
        "Wien",
        "Vösendorf",
        "Wien",
        "Feldkirchen",
        "St. Marienkirchen",
        "Siegersdorf",
        "Seitenstetten",
        "Feldbach",
        "Neumarkt",
        "Wien",
        "Lavamüd",
        "Griffen",
        "Weikendorf",
        "Winklarn",
        "Niedernsill",
        "Kematen",
        "Fels am Wagram",
        "Kirchschlag",
        "Wels",
        "Leonding",
        "Eisenstadt",
        "Wals",
        "St. Lorenz",
        "Amstetten",
        "Neusiedl bei Güssing",
        "Ebenthal",
        "Pöttsching",
        "Eggersdorf bei Graz",
        "Bruck",
        "Hausmannstätten",
        "Alland",
        "Schwechat",
        "Gießhübl",
        "Lieboch",
        "Graz",
        "Hagenbrunn",
        "Röns",
        "wallern a.d. Trattnach",
        "St. Michael",
        "Nondorf",
        "St. Georgen / Ybbsfelde",
        "Neukirchen",
        "Wien",
        "Uttendorf",
        "Ramsau im Zillertal",
        "Niedernsill",
        "Großsteinbach",
        "Kaufstein",
        "Eisenstadt",
        "Wenigzell",
        "Wien",
        "St. Peter a. Ottersbach",
        "Radstadt",
        "Vichtenstein",
        "Lochen",
        "Wr. Neustadt",
        "Preding",
        "Böheimkirchen",
        "St. Pölten",
        "St. Pölten",
        "Passail",
        "Nestelbach",
        "Vöcklabruck",
        "Oberalm",
        "Albersdorf-Prebuch",
        "Bludenz",
        "Zeillern",
        "Eberschwang",
        "Rudersdorf",
        "Feldkirchen",
        "Yspertal",
        "Adnet",
        "Hollabrunn",
        "Strenberg",
        "Pfaffstätten",
        "Schleedorf",
        "Pötting",
        "Fladnitz im Raabtal",
        "Hartberg",
        "Marchtrenk",
        "St. Martin/Grimming",
        "Neidling",
        "Wolkersdorf",
        "Bruck/Mur",
        "Fohnsdorf",
        "Mittersill",
        "Wien",
        "Tragwein",
        "Deutschkreuz",
        "St. Johann",
        "Wels",
        "St. Anna",
        "Lendava",
        "Dobrna",
        "Crensovci",
        "Weyer",
        "Mauthausen",
        "Ernstbrunn",
        "Industriegebiet Hagenbrunn",
        "Breitenfurt",
        "Bruck",
        "Salzurg",
        "Niederwaldkirchen",
        "Maria Ellend",
        "Ludmannsdorf",
        "Kematen",
        "Batschuns",
        "Lengau",
        "Ameis",
        "Walz/Salzburg",
        "Liebenau",
        "Olbendorf",
        "Böheimkirchen",
        "Groß Gerungs",
        "Behamberg",
        "Wenns",
        "Bad Wimsbach",
        "Wien",
        "Wien",
        "Braunau am Inn",
        "Graz",
        "Linz",
        "Leobersdorf",
        "Gloggnitz",
        "Salzburg",
        "Eberstein",
        "Pöndorf",
        "Studenzen",
        "Zwettl",
        "Wien",
        "Markersdorf",
        "Rainbach im Innkreis",
        "Bartholomäberg",
        "Grafenschlag",
        "Wien",
        "Niederau",
        "Frankenmarkt",
        "Tulln",
        "Wien",
        "Krems",
        "Wiener Neustadt",
        "St. Martin",
        "Wien",
        "Kirchheim",
        "Gmunden",
        "Wien",
        "Güttenbach",
        "Pottenstein",
        "Feldkirch",
        "Schwechat",
        "Illmitz",
        "Wien",
        "Buchkirchen",
        "Eisenstadt",
        "Brunn/Felde",
        "Sankt Lorenzen am Wechsel",
        "Reichersdorf",
        "Wien",
        "Eferding",
        "Laussa",
        "Ehrendorf",
        "Wels",
        "Seibersdorf",
        "Sterzing/V",
        "Wals",
        "Rohrbach bei Mattersburg",
        "Hall in Tirol",
        "Klagenfurt",
        "Krems",
        "Mils",
        "Zirl",
        "Zell am See",
        "Laas",
        "Saalbach",
        "Lichtenwörth",
        "Mödling",
        "Wien",
        "Spittal",
        "Wien",
        "Vasoldsberg",
        "Strasshof",
        "Lienz",
        "Arnoldstein",
        "Unterweißenbach",
        "Peuerbach",
        "Stadl-Paura",
        "Kefermarkt",
        "Schlins",
        "Saalfelden",
        "Markersdorf",
        "Wien",
        "Blumau",
        "Langweid",
        "Gansbach",
        "Brunn am Gebirge",
        "Bludesch",
        "Inzing",
        "Nüziders",
        "Graz",
        "Groß-Enzersdorf",
        "Unterwart",
        "Stockerau",
        "Wien",
        "Maria Taferl (Obererla)",
        "Innsbruck",
        "Wien",
        "Wien",
        "Arzl im Pitztal",
        "Reichenau",
        "Mondsee",
        "Krumbach",
        "St. Pölten",
        "Graz",
        "Wimpassing",
        "Donnerskirchen",
        "Miesenbach b. Birkfeld",
        "Pyhra",
        "Probstdorf/Gr. Enzersdorf",
        "Seisenegg",
        "Bad Schallerbach",
        "Dornbirn",
        "Rohrendorf",
        "Villach",
        "Deutsch Goritz",
        "Waidhofen an der Ybbs",
        "Klosterneuburg",
        "Eugendorf",
        "Oed",
        "Vöcklamarkt",
        "Wien",
        "Villach",
        "Perg",
        "Wien",
        "Leonding",
        "Kundl",
        "Hohenems",
        "Salzburg",
        "Mödling",
        "Antiesenhofen",
        "Prottes",
        "Markt St. Martin",
        "Gloggnitz",
        "Sommerein",
        "Pernitz",
        "Ampass",
        "Traiskirchen",
        "Graz",
        "Villach",
        "Innsbruck",
        "Leonding",
        "St. Pölten",
        "Wiener Neustadt",
        "Fischamend",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Salzburg",
        "Graz",
        "Innsbruck",
        "St. Pölten",
        "Wiener Neustadt",
        "Pöllau",
        "Horn",
        "Birkenfeld",
        "Wien",
        "Wien",
        "Schwarzach im Pongau",
        "Ollersdorf im Burgenland",
        "Spittal an der Drau",
        "Obervellach",
        "Pressbaum",
        "Ach",
        "Wien",
        "Timelkam",
        "Gleisdorf",
        "Innsbruck",
        "Bludenz",
        "Mariasdorf",
        "Wörgl",
        "Wien",
        "St. Georgen bei Salzburg",
        "Wien",
        "Wien",
        "Gunskirchen",
        "Hochburg-Ach",
        "Königsbrunn (Enzersfeld i.W.)",
        "Gobelsburg",
        "Gobelsburg",
        "Bruckneudorf",
        "Gratwein-Straßengel",
        "Sollenau",
        "Wien",
        "Auersthal",
        "St. Georgen",
        "Graz",
        "Bad Hofgastein",
        "Hallein",
        "Kirchbichl",
        "Lauterach",
        "St. Willibald",
        "St. Peter in der Au",
        "St. Valentin",
        "Bleiburg",
        "St. Johann im Pongau",
        "Laxenburg",
        "Muthmannsdorf",
        "Wiesmath",
        "Ennsdorf",
        "Hochneukirchen",
        "Obertrum am See",
        "Jerzens",
        "Feldkirch",
        "Aschbach Markt",
        "Lichtenwörth",
        "Zell am Ziller",
        "Wien",
        "Feldkirch",
        "Bad Ischl",
        "Neufurth-Amstetten",
        "Grein",
        "Salzburg",
        "Pfarrwerfen",
        "Braunau am Inn",
        "Absam",
        "Traun",
        "Rannersdorf",
        "Trumau",
        "Wien",
        "Gföhl",
        "Purgstall",
        "St. Ulrich am Pillersee",
        "Gleisdorf",
        "Zeltweg",
        "Katsdorf",
        "Raxendorf",
        "Wien",
        "Wien",
        "Wörgl",
        "Koblach",
        "Brixen im Thale",
        "Wien",
        "Neumarkt in Steiermark",
        "Wels",
        "Ansfelden",
        "Feldkirchen",
        "Schwechat",
        "Wien",
        "Hennersdorf",
        "Pernitz",
        "Mannersdorf",
        "Semriach",
        "Grödig",
        "Leopoldsdorf bei Wien",
        "Ohlsdorf",
        "Hörsching",
        "Wien",
        "Klagenfurt",
        "Frauenkirchen",
        "Wien",
        "Feldkirch",
        "Wagrain",
        "St. Leonhard am Forst",
        "Schwechat",
        "Graz",
        "Pöllau",
        "Ruprechtshofen",
        "Nüziders",
        "Essen",
        "Wien",
        "Freistadt",
        "Semriach",
        "Raaba",
        "Wien",
        "Bad Vöslau",
        "Pettenbach",
        "Spielberg",
        "Tresdorf/Gewerbepark II",
        "Seewalchen am Attersee",
        "Enzenkirchen",
        "Malta",
        "Gutenstein",
        "Straßwalchen",
        "Wien",
        "Seeboden",
        "Feldkirchen in Kärnten",
        "Mönchhof",
        "Radenthein",
        "Wien",
        "Seyring",
        "Eferding",
        "Grafendorf bei Hartberg",
        "Wien",
        "Bezau",
        "Timelkam",
        "Ellmau",
        "Weissenkirchen i. A.",
        "Wien",
        "Flandorf",
        "St. Marienkirchen am Hausruck",
        "Sigless",
        "Wildschönau-Niederau",
        "Radstadt",
        "Stanz",
        "Frankenmarkt",
        "Zeltweg",
        "Graz",
        "Salzburg",
        "Innsbruck",
        "Herzogenburg",
        "Hall in Tirol",
        "Graz",
        "Vösendorf",
        "Wien",
        "Straden",
        "Mittersill",
        "Traberg",
        "Gunskirchen",
        "Oberhofen am Irrsee",
        "St. Margarethen an der Raab",
        "Leonding",
        "St. Peter/Ahrntal",
        "Fischamend",
        "Wien",
        "Tobaj",
        "Gloggnitz",
        "Stockerau",
        "Mondsee",
        "Wals",
        "Diepolz",
        "Seekirchen",
        "Hautzendorf",
        "Redlham",
        "Wien",
        "Tillmitsch",
        "Kammern im Liesingtal",
        "Wien",
        "Asten",
        "Pörtschach am Wörther See",
        "Vomp",
        "Elixhausen",
        "Wien",
        "Schattendorf",
        "Feldkirch-Gisingen",
        "Olbendorf",
        "Radenthein",
        "Groß Sankt Florian",
        "Gemeinlebarn",
        "Großklein",
        "Wien",
        "Telfs",
        "Maissau",
        "Ahrntal",
        "Puch bei Hallein",
        "Linz",
        "Weinitzen",
        "Wien",
        "Wies",
        "Schladming",
        "Strass im Zillertal",
        "Klagenfurt",
        "Wagna",
        "Klagenfurt",
        "Wien",
        "Pasching",
        "Innsbruck",
        "Nötsch",
        "Wien",
        "Anthering",
        "Wien",
        "Gerasdorf",
        "Graz",
        "Waidhofen an der Thaya",
        "Heidenreichstein",
        "Waidegg",
        "Stockerau",
        "Montal/St. Lorenzen",
        "Neusiedl",
        "Kindberg",
        "Teufenbach",
        "Stadl an der Mur",
        "Schildorn",
        "Dornbirn",
        "St. Johann am Walde",
        "Deutschlandsberg",
        "Wien",
        "Kirchheim",
        "Liezen",
        "Tieschen",
        "Erlauf",
        "Kitzbühel",
        "Frankenburg am Hausruck",
        "Schwarzenberg",
        "Wien",
        "Marbach an der Donau",
        "Neukirchen an der Vöckla",
        "Donnerskirchen",
        "Loretto",
        "Hornstein",
        "Salzburg",
        "Zistersdorf",
        "Eggendorf",
        "Rauris",
        "Gumpoldskirchen",
        "Wien",
        "Wien",
        "Brandberg",
        "Wien-Schönbrunn",
        "Hollersbach",
        "Linz",
        "Unzmarkt",
        "Wien",
        "Hollersbach",
        "Heiligenkreuz im Lafnitztal",
        "Waizenkirchen",
        "St. Martin bei Lofer",
        "Dornbirn",
        "Pottenbrunn",
        "Aderklaa",
        "Wien",
        "Oberndorf",
        "Wallsee",
        "Wien",
        "Eugendorf",
        "Neuhofen an der Krems",
        "Gaissau",
        "Bad Goisern am Hallstättersee",
        "Hallwang-Mayrwies",
        "Hagenbrunn",
        "Dellach",
        "Eggendorf",
        "Wien",
        "St. Johann im Pongau",
        "Wien",
        "Wien",
        "Hofstetten",
        "Wien",
        "St. Pölten",
        "Niederhollabrunn",
        "St. Margarethen",
        "Ort im Innkreis",
        "Wien",
        "Wien",
        "Kirchberg",
        "Kundl",
        "Eichkögl",
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
