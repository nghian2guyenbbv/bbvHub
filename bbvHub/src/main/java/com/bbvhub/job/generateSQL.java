package com.bbvhub.job;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class generateSQL {


  public static void main(String[] args) {
     String DOUBLE_QUOTE = "\"";
     String QUOTE = "\'";
    List<String> custs = Arrays.asList("99440840"
        ,"99440843"
        ,"99440878"
        ,"99440879"
        ,"99440891"
        ,"99440892"
        ,"99441144"
        ,"99441181"
        ,"99441185"
        ,"99441197"
        ,"99441220"
        ,"99441222"
        ,"99441293"
        ,"99441336"
        ,"99441360"
        ,"99441365"
        ,"99441368"
        ,"99441371"
        ,"99441409"
        ,"99441431"
        ,"99441433"
        ,"99441555"
        ,"99441607"
        ,"99441608"
        ,"99441728"
        ,"99441772"
        ,"99441832"
        ,"99441919"
        ,"99441987"
        ,"99442005"
        ,"99442018"
        ,"99442036"
        ,"99442037"
        ,"99442049"
        ,"99442083"
        ,"99442091"
        ,"99442093"
        ,"99442094"
        ,"99442099"
        ,"99442110"
        ,"99442111"
        ,"99442113"
        ,"99442115"
        ,"99442117"
        ,"99442249"
        ,"99442288"
        ,"99442291"
        ,"99442316"
        ,"99442317"
        ,"99442364"
        ,"99442367"
        ,"99442372"
        ,"99442406"
        ,"99442412"
        ,"99442425"
        ,"99442456"
        ,"99442457"
        ,"99442469"
        ,"99442477"
        ,"99442479"
        ,"99442481"
        ,"99442482"
        ,"99442573"
        ,"99442574"
        ,"99442585"
        ,"99442595"
        ,"99442607"
        ,"99442747"
        ,"99442748"
        ,"99442754"
        ,"99442762"
        ,"99442812"
        ,"99442813"
        ,"99442817"
        ,"99442818"
        ,"99442866"
        ,"99442902"
        ,"99442909"
        ,"99442969"
        ,"99442977"
        ,"99443029"
        ,"99443030"
        ,"99443031"
        ,"99443032"
        ,"99443120"
        ,"99443121"
        ,"99443122"
        ,"99443126"
        ,"99443127"
        ,"99443134"
        ,"99443207"
        ,"99443231"
        ,"99443260"
        ,"99443288"
        ,"99443324"
        ,"99443341"
        ,"99443373"
        ,"99443380"
        ,"99443403"
        ,"99443405"
        ,"99443431"
        ,"99443441"
        ,"99443464"
        ,"99443480"
        ,"99443512"
        ,"99443558"
        ,"99443655"
        ,"99443685"
        ,"99443695"
        ,"99443754"
        ,"99443843"
        ,"99443844"
        ,"99443845"
        ,"99443863"
        ,"99443871"
        ,"99443923"
        ,"99443926"
        ,"99443951"
        ,"99443952"
        ,"99443996"
        ,"99444002"
        ,"99444003"
        ,"99444026"
        ,"99444033"
        ,"99444068"
        ,"99444082"
        ,"99444084"
        ,"99444123"
        ,"99444217"
        ,"99444218"
        ,"99444234"
        ,"99444241"
        ,"99444250"
        ,"99444253"
        ,"99444263"
        ,"99444273"
        ,"99444283"
        ,"99444293"
        ,"99444300"
        ,"99444306"
        ,"99444393"
        ,"99444403"
        ,"99444436"
        ,"99444472"
        ,"99444494"
        ,"99444496"
        ,"99444517"
        ,"99444566"
        ,"99444609"
        ,"99444610"
        ,"99444612"
        ,"99444654"
        ,"99444679"
        ,"99444787"
        ,"99444788"
        ,"99444895"
        ,"99444995"
        ,"99445009"
        ,"99445024"
        ,"99445090"
        ,"99445162"
        ,"99445198"
        ,"99445207"
        ,"99445208"
        ,"99445209"
        ,"99445210"
        ,"99445216"
        ,"99445219"
        ,"99445220"
        ,"99445231"
        ,"99445288"
        ,"99445340"
        ,"99445355"
        ,"99445375"
        ,"99445376"
        ,"99445383"
        ,"99445400"
        ,"99445445"
        ,"99445453"
        ,"99445456"
        ,"99445480"
        ,"99445484"
        ,"99445567"
        ,"99445570"
        ,"99445664"
        ,"99445738"
        ,"99445761"
        ,"99446091"
        ,"99446092"
        ,"99446118"
        ,"99446119"
        ,"99446123"
        ,"99446125"
        ,"99446128"
        ,"99446130"
        ,"99446141"
        ,"99446180"
        ,"99446192"
        ,"99446259"
        ,"99446292"
        ,"99446327"
        ,"99446358"
        ,"99446361"
        ,"99446392"
        ,"99446394"
        ,"99446395"
        ,"99446396"
        ,"99446397"
        ,"99446398"
        ,"99446399"
        ,"99446400"
        ,"99446401"
        ,"99446402"
        ,"99446403"
        ,"99446404"
        ,"99446407"
        ,"99446425"
        ,"99446430"
        ,"99446440"
        ,"99446536"
        ,"99446537"
        ,"99446552"
        ,"99446561"
        ,"99446562"
        ,"99446583"
        ,"99446611"
        ,"99446676"
        ,"99446677"
        ,"99446678"
        ,"99446688"
        ,"99446689"
        ,"99446712"
        ,"99446737"
        ,"99446738"
        ,"99446739"
        ,"99446763"
        ,"99446897"
        ,"99446901"
        ,"99446903"
        ,"99446905"
        ,"99446915"
        ,"99446946"
        ,"99446949"
        ,"99446960"
        ,"99446962"
        ,"99446973"
        ,"99446978"
        ,"99447010"
        ,"99447025"
        ,"99447027"
        ,"99447032"
        ,"99447036"
        ,"99447049"
        ,"99447051"
        ,"99447062"
        ,"99447064"
        ,"99447076"
        ,"99447078"
        ,"99447101"
        ,"99447103"
        ,"99447173"
        ,"99447318"
        ,"99447328"
        ,"99447335"
        ,"99447384"
        ,"99447385"
        ,"99447388"
        ,"99447390"
        ,"99447434"
        ,"99447436"
        ,"99447465"
        ,"99447466"
        ,"99447467"
        ,"99447482"
        ,"99447483"
        ,"99447534"
        ,"99447622"
        ,"99447625"
        ,"99447627"
        ,"99447641"
        ,"99447652"
        ,"99447655"
        ,"99447657"
        ,"99447663"
        ,"99447679"
        ,"99447694"
        ,"99447744"
        ,"99447745"
        ,"99447761"
        ,"99447765"
        ,"99447866"
        ,"99447867"
        ,"99447906"
        ,"99447911"
        ,"99447914"
        ,"99447918"
        ,"99447919"
        ,"99447922"
        ,"99447930"
        ,"99447970"
        ,"99447991"
        ,"99448046"
        ,"99448077"
        ,"99448144"
        ,"99448157"
        ,"99448189"
        ,"99448276"
        ,"99448277"
        ,"99448278"
        ,"99448334"
        ,"99448373"
        ,"99448384"
        ,"99448386"
        ,"99448389"
        ,"99448427"
        ,"99448433"
        ,"99448434"
        ,"99448435"
        ,"99448482"
        ,"99448487"
        ,"99448489"
        ,"99448491"
        ,"99448538"
        ,"99448578"
        ,"99448659"
        ,"99448678"
        ,"99448682"
        ,"99448708"
        ,"99448709"
        ,"99448752"
        ,"99448918"
        ,"99448974"
        ,"99448977"
        ,"99448993"
        ,"99449016"
        ,"99449070"
        ,"99449094"
        ,"99449129"
        ,"99449150"
        ,"99449151"
        ,"99449167"
        ,"99449214"
        ,"99449226"
        ,"99449277"
        ,"99449309"
        ,"99449335"
        ,"99449346"
        ,"99449347"
        ,"99449372"
        ,"99449450"
        ,"99449454"
        ,"99449485"
        ,"99449487"
        ,"99449488"
        ,"99449527"
        ,"99449558"
        ,"99449564"
        ,"99449626"
        ,"99449640"
        ,"99449641"
        ,"99449650"
        ,"99449657"
        ,"99449671"
        ,"99449684"
        ,"99449687"
        ,"99449725"
        ,"99449733"
        ,"99449737"
        ,"99449750"
        ,"99449754"
        ,"99449772"
        ,"99449784"
        ,"99449785"
        ,"99449786"
        ,"99449787"
        ,"99449788"
        ,"99449789"
        ,"99449793"
        ,"99449794"
        ,"99449811"
        ,"99449857"
        ,"99449861"
        ,"99449886"
        ,"99449905"
        ,"99449920"
        ,"99450002"
        ,"99450009"
        ,"99450020"
        ,"99450054"
        ,"99450055"
        ,"99450071"
        ,"99450072"
        ,"99450073"
        ,"99450120"
        ,"99450125"
        ,"99450147"
        ,"99450164"
        ,"99450241"
        ,"99450283"
        ,"99450317"
        ,"99450325"
        ,"99450341"
        ,"99450386"
        ,"99450387"
        ,"99450390"
        ,"99450402"
        ,"99450414"
        ,"99450483"
        ,"99450488"
        ,"99450498"
        ,"99450508"
        ,"99450514"
        ,"99450560"
        ,"99450597"
        ,"99450598"
        ,"99450599"
        ,"99450601"
        ,"99450603"
        ,"99450607"
        ,"99450630"
        ,"99450636"
        ,"99450640"
        ,"99450644"
        ,"99450645"
        ,"99450706"
        ,"99450709"
        ,"99450731"
        ,"99450768"
        ,"99450780"
        ,"99450821"
        ,"99450846"
        ,"99450860"
        ,"99450923"
        ,"99450934"
        ,"99450941"
        ,"99450983"
        ,"99451013"
        ,"99451021"
        ,"99451189"
        ,"99451234"
        ,"99451242"
        ,"99451260"
        ,"99451264"
        ,"99451266"
        ,"99451267"
        ,"99451269"
        ,"99451270"
        ,"99451271"
        ,"99451274"
        ,"99451288"
        ,"99451366"
        ,"99451369"
        ,"99451370"
        ,"99451385"
        ,"99451589"
        ,"99451701"
        ,"99451721"
        ,"99451743"
        ,"99451774"
        ,"99451775"
        ,"99451781"
        ,"99451843"
        ,"99451846"
        ,"99451869"
        ,"99451871"
        ,"99451887"
        ,"99451928"
        ,"99451937"
        ,"99451939"
        ,"99451942"
        ,"99451995"
        ,"99451998"
        ,"99452042"
        ,"99452089"
        ,"99452190"
        ,"99452204"
        ,"99452229"
        ,"99452263"
        ,"99452266"
        ,"99452305"
        ,"99452312"
        ,"99452337"
        ,"99452339"
        ,"99452353"
        ,"99452374"
        ,"99452421"
        ,"99452431"
        ,"99452432"
        ,"99452448"
        ,"99452580"
        ,"99452615"
        ,"99452616"
        ,"99452623"
        ,"99452638"
        ,"99452651"
        ,"99452663"
        ,"99452683"
        ,"99452684"
        ,"99452738"
        ,"99452785"
        ,"99452800"
        ,"99452802"
        ,"99452806"
        ,"99452835"
        ,"99452877"
        ,"99452888"
        ,"99452965"
        ,"99453029"
        ,"99453043"
        ,"99453096"
        ,"99453100"
        ,"99453101"
        ,"99453102"
        ,"99453103"
        ,"99453104"
        ,"99453106"
        ,"99453120"
        ,"99453155"
        ,"99453174"
        ,"99453181"
        ,"99453182"
        ,"99453349"
        ,"99453350"
        ,"99453498"
        ,"99453583"
        ,"99453672"
        ,"99453673"
        ,"99453682"
        ,"99453692"
        ,"99453709"
        ,"99453712"
        ,"99453714"
        ,"99453715"
        ,"99453716"
        ,"99453717"
        ,"99453718"
        ,"99453737"
        ,"99453748"
        ,"99453821"
        ,"99453822"
        ,"99453862"
        ,"99453879"
        ,"99453884"
        ,"99453892"
        ,"99453910"
        ,"99453980"
        ,"99454000"
        ,"99454001"
        ,"99454002"
        ,"99454003"
        ,"99454004"
        ,"99454005"
        ,"99454006"
        ,"99454007"
        ,"99454008"
        ,"99454088"
        ,"99454091"
        ,"99454092"
        ,"99454094"
        ,"99454095"
        ,"99454126"
        ,"99454152"
        ,"99454155"
        ,"99454180"
        ,"99454181"
        ,"99454183"
        ,"99454184"
        ,"99454214"
        ,"99454215"
        ,"99454217"
        ,"99454218"
        ,"99454235"
        ,"99454237"
        ,"99454238"
        ,"99454266"
        ,"99454268"
        ,"99454269"
        ,"99454272"
        ,"99454280"
        ,"99454284"
        ,"99454290"
        ,"99454361"
        ,"99454385"
        ,"99454387"
        ,"99454401"
        ,"99454456"
        ,"99454457"
        ,"99454481"
        ,"99454482"
        ,"99454483"
        ,"99454484"
        ,"99454486"
        ,"99454487"
        ,"99454489"
        ,"99454490"
        ,"99454493"
        ,"99454494"
        ,"99454495"
        ,"99454496"
        ,"99454497"
        ,"99454498"
        ,"99454544"
        ,"99454560"
        ,"99454572"
        ,"99454574"
        ,"99454599"
        ,"99454612"
        ,"99454720"
        ,"99454738"
        ,"99454747"
        ,"99454748"
        ,"99454764"
        ,"99454766"
        ,"99454813"
        ,"99454821"
        ,"99454826"
        ,"99454829"
        ,"99454839"
        ,"99454891"
        ,"99454905"
        ,"99454950"
        ,"99454978"
        ,"99454980"
        ,"99455013"
        ,"99455023"
        ,"99455071"
        ,"99455109"
        ,"99455186"
        ,"99455261"
        ,"99455280"
        ,"99455397"
        ,"99455440"
        ,"99455442"
        ,"99455451"
        ,"99455453"
        ,"99455504"
        ,"99455518"
        ,"99455533"
        ,"99455628"
        ,"99455701"
        ,"99455726"
        ,"99455733"
        ,"99455736"
        ,"99455737"
        ,"99455738"
        ,"99455775"
        ,"99455779"
        ,"99455801"
        ,"99455859"
        ,"99455875"
        ,"99456001"
        ,"99456017"
        ,"99456024"
        ,"99456031"
        ,"99456040"
        ,"99456048"
        ,"99456065"
        ,"99456082"
        ,"99456130"
        ,"99456142"
        ,"99456188"
        ,"99456273"
        ,"99456292"
        ,"99456357"
        ,"99456358"
        ,"99456371"
        ,"99456462"
        ,"99456580"
        ,"99456600"
        ,"99456614"
        ,"99456615"
        ,"99456632"
        ,"99456733"
        ,"99456736"
        ,"99456761"
        ,"99456792"
        ,"99456808"
        ,"99456864"
        ,"99456914"
        ,"99456925"
        ,"99456927"
        ,"99456958"
        ,"99456985"
        ,"99456996"
        ,"99457000"
        ,"99457132"
        ,"99457151"
        ,"99457181"
        ,"99457243"
        ,"99457245"
        ,"99457252"
        ,"99457254"
        ,"99457255"
        ,"99457270"
        ,"99457271"
        ,"99457282"
        ,"99457283"
        ,"99457284"
        ,"99457392"
        ,"99457422"
        ,"99457429"
        ,"99457486"
        ,"99457518"
        ,"99457529"
        ,"99457545"
        ,"99457552"
        ,"99457555"
        ,"99457566"
        ,"99457593"
        ,"99457604"
        ,"99457625"
        ,"99457690"
        ,"99457692"
        ,"99457728"
        ,"99457774"
        ,"99457893"
        ,"99457894"
        ,"99457899"
        ,"99457902"
        ,"99457912"
        ,"99457952"
        ,"99457969"
        ,"99457970"
        ,"99457973"
        ,"99457986"
        ,"99458008"
        ,"99458045"
        ,"99458089"
        ,"99458106"
        ,"99458130"
        ,"99458151"
        ,"99458155"
        ,"99458166"
        ,"99458181"
        ,"99458215"
        ,"99458216"
        ,"99458217"
        ,"99458292"
        ,"99458335"
        ,"99458359"
        ,"99458360"
        ,"99458368"
        ,"99458382"
        ,"99458402"
        ,"99458440"
        ,"99458457"
        ,"99458472"
        ,"99458497"
        ,"99458498"
        ,"99458511"
        ,"99458523"
        ,"99458525"
        ,"99458557"
        ,"99458577"
        ,"99458585"
        ,"99458590"
        ,"99458614"
        ,"99458618"
        ,"99458620"
        ,"99458622"
        ,"99458686"
        ,"99458687"
        ,"99458707"
        ,"99458743"
        ,"99458766"
        ,"99458820"
        ,"99458821"
        ,"99458861"
        ,"99458939"
        ,"99459052"
        ,"99459073"
        ,"99459129"
        ,"99459130"
        ,"99459133"
        ,"99459147"
        ,"99459167"
        ,"99459229"
        ,"99459230"
        ,"99459235"
        ,"99459239"
        ,"99459324"
        ,"99459325"
        ,"99459392"
        ,"99459457"
        ,"99459525"
        ,"99459598"
        ,"99459607"
        ,"99459609"
        ,"99459639"
        ,"99459676"
        ,"99459677"
        ,"99459685"
        ,"99459728"
        ,"99459740"
        ,"99459744"
        ,"99459746"
        ,"99459861"
        ,"99459925"
        ,"99459979"
        ,"99459986"
        ,"99460256"
        ,"99460258"
        ,"99460291"
        ,"99460292"
        ,"99460366"
        ,"99460367"
        ,"99460387"
        ,"99460391"
        ,"99460392"
        ,"99460404"
        ,"99460408"
        ,"99460410"
        ,"99460416"
        ,"99460425"
        ,"99460430"
        ,"99460431"
        ,"99460434"
        ,"99460435"
        ,"99460487"
        ,"99460502"
        ,"99460507"
        ,"99460531"
        ,"99460533"
        ,"99460545"
        ,"99460564"
        ,"99460567"
        ,"99460614"
        ,"99460615"
        ,"99460619"
        ,"99460626"
        ,"99460661"
        ,"99460672"
        ,"99460673"
        ,"99460727"
        ,"99460746"
        ,"99460765"
        ,"99460768"
        ,"99460769"
        ,"99460772"
        ,"99460782"
        ,"99460791"
        ,"99460795"
        ,"99460799"
        ,"99460801"
        ,"99460804"
        ,"99460808"
        ,"99460813"
        ,"99460814"
        ,"99460815"
        ,"99460816"
        ,"99460817"
        ,"99460819"
        ,"99460854"
        ,"99460878"
        ,"99460904"
        ,"99460924"
        ,"99460997"
        ,"99461000"
        ,"99461001"
        ,"99461003"
        ,"99461043"
        ,"99461046"
        ,"99461050"
        ,"99461051"
        ,"99461052"
        ,"99461060"
        ,"99461062"
        ,"99461067"
        ,"99461141"
        ,"99461152"
        ,"99461171"
        ,"99461183"
        ,"99461297"
        ,"99461315"
        ,"99461317"
        ,"99461332"
        ,"99461333"
        ,"99461342"
        ,"99461380"
        ,"99461394"
        ,"99461449"
        ,"99461464"
        ,"99461470"
        ,"99461475"
        ,"99461479"
        ,"99461498"
        ,"99461502"
        ,"99461503"
        ,"99461532"
        ,"99461538"
        ,"99461552"
        ,"99461556"
        ,"99461562"
        ,"99461564"
        ,"99461605"
        ,"99461615"
        ,"99461655"
        ,"99461657"
        ,"99461713"
        ,"99461779"
        ,"99461785"
        ,"99461788"
        ,"99461837"
        ,"99461871"
        ,"99461880"
        ,"99461927"
        ,"99461993"
        ,"99462094"
        ,"99462132"
        ,"99462133"
        ,"99462137"
        ,"99462228"
        ,"99462284"
        ,"99462319"
        ,"99462360"
        ,"99462361"
        ,"99462379"
        ,"99462411"
        ,"99462417"
        ,"99462419"
        ,"99462420"
        ,"99462439"
        ,"99462445"
        ,"99462473"
        ,"99462474"
        ,"99462477"
        ,"99462487"
        ,"99462506"
        ,"99462549"
        ,"99462550"
        ,"99462556"
        ,"99462558"
        ,"99462610"
        ,"99462611"
        ,"99462642"
        ,"99462654"
        ,"99462657"
        ,"99462668"
        ,"99462725"
        ,"99462727"
        ,"99462739"
        ,"99462779"
        ,"99462803"
        ,"99462813"
        ,"99462825"
        ,"99462870"
        ,"99462911"
        ,"99463002"
        ,"99463026"
        ,"99463093"
        ,"99463095"
        ,"99463181"
        ,"99463200"
        ,"99463262"
        ,"99463278"
        ,"99463288"
        ,"99463289"
        ,"99463386"
        ,"99463450"
        ,"99463475"
        ,"99463501"
        ,"99463503"
        ,"99463525"
        ,"99463652"
        ,"99463668"
        ,"99463820"
        ,"99463883"
        ,"99463904"
        ,"99463912"
        ,"99463953"
        ,"99463966"
        ,"99463984"
        ,"99464030"
        ,"99464054"
        ,"99464084"
        ,"99464116"
        ,"99464118"
        ,"99464153"
        ,"99464213"
        ,"99464214"
        ,"99464272"
        ,"99464332"
        ,"99464339"
        ,"99464391"
        ,"99464401"
        ,"99464425"
        ,"99464444"
        ,"99464509"
        ,"99464527"
        ,"99464535"
        ,"99464542"
        ,"99464591"
        ,"99464603"
        ,"99464606"
        ,"99464607"
        ,"99464633"
        ,"99464690"
        ,"99464730"
        ,"99464731"
        ,"99464820"

    );
    // org name
    List<String> orgName = Arrays.asList("KFZ-Service & Handel Sambs "
        ,"HF KFZ Reparatur und Handel Inh. Hasudin Ferkatovic"
        ,"Easy-Car GmbH "
        ,"Autohaus Rath GmbH "
        ,"J. R. Company GmbH "
        ,"Motorrad Josef Kulhavy "
        ,"Heinrich Embacher "
        ,"Franz Baumann Lackierung & Spenglerei"
        ,"KFZ Technik Painer GmbH "
        ,"Marcher & Sohn Ges.m.b.H. Kfz-Werkstätte"
        ,"Gerald Hübner "
        ,"Freregger GmbH "
        ,"Birner Gesellschaft m.b.H "
        ,"M & S Autogarage-Kfz GmbH "
        ,"ABS Lubitz "
        ,"Wolfgang Zrost "
        ,"Alois Krydl GmbH "
        ,"Weiermeier GmbH Autohaus"
        ,"KFZ-Kaltenbrunner "
        ,"HTH Allround GmbH "
        ,"Franz Preiser e.U. "
        ,"Bernhard Inzinger "
        ,"KMT - Karosserie & Mechanik Aldin Salkanovic"
        ,"Royal Elektro "
        ,"Auto Hauptmann GmbH "
        ,"BSF Technik "
        ,"KFZ Kössler "
        ,"Reifen Unger "
        ,"Matthias Mödlhammer KG Kfz-Werkstätte"
        ,"Stadtgemeinde Berndorf "
        ,"Autohaus G. Mild "
        ,"KFZ Robert Ertler "
        ,"Auto Kremer GmbH "
        ,"Delta Cars GmbH "
        ,"Johann Liendl e. U. "
        ,"TOYOTA FREY Retail GmbH "
        ,"TOYOTA FREY Retail GmbH "
        ,"TOYOTA FREY Retail GmbH "
        ,"AM KFZ Lackschaden GmbH "
        ,"TOYOTA FREY Retail GmbH "
        ,"Frey Automobile GmbH "
        ,"TOYOTA FREY Retail GmbH "
        ,"Auto Engel "
        ,"Hermann Hums "
        ,"Autohaus Attia "
        ,"ILHAN Ahmet KG "
        ,"Johann Kollnberger "
        ,"Reinhard Pfeifer "
        ,"H. Slawitscheck GmbH "
        ,"AutoFrey GmbH "
        ,"TOYOTA FREY Retail GmbH "
        ,"Manuel Wurmbrand "
        ,"Open Car Box Metropol Taxi GmbH"
        ,"Tobisch GmbH Karosseriefachbetrieb"
        ,"Auto Hollaus "
        ,"Miki Milkic "
        ,"KFZ-Handel Pahatz "
        ,"Auto Pieber GmbH KFZ Technik handel"
        ,"KFZ Hödl GmbH "
        ,"Bruckner Kfz - Technik GmbH "
        ,"Eisner Auto Villach Vertrieb und Service GmbH"
        ,"Schatzdorfer GmbH "
        ,"WM Karosserietechnik "
        ,"Christian Huber "
        ,"VP Truck KG "
        ,"Thomas Auer "
        ,"Jürgen Kupnick Kfz Reparaturen"
        ,"Josef Schagerl "
        ,"Autoklinik Tockner GmbH "
        ,"Magna Powertrain GmbH & Co. KG "
        ,"Motorfun B30 GmbH "
        ,"Schabler GmbH & Co KG "
        ,"Sabine Richter "
        ,"Andreas Hoffmann "
        ,"Christine Einfalt e.U. "
        ,"Franz Krauck "
        ,"Reinhold Glanz "
        ,"Auto Stocker GesmbH "
        ,"Karl Steiner KFZ "
        ,"Johannes Weninger e. U. "
        ,"KFZ-Herndlhofer GmbH "
        ,"Lurf Automobil GmbH "
        ,"Brucha Gesellschaft m.b.H. "
        ,"Autohaus Lirnberger "
        ,"Manuela Windisch "
        ,"ATSW 24h Service GmbH "
        ,"Uitz - Die Werkstatt "
        ,"KFZ-Fachbetrieb Aydin "
        ,"Manuel Mayrhofer MM Autokosmetik"
        ,"KFZ-Eichinger OG "
        ,"Speed Garage Pelmann "
        ,"VPT Vertriebs GmbH "
        ,"Garage Taufers di Oberbichler Anton & C. SNC"
        ,"Meidlinger KFZ Center "
        ,"KFZ Technik ETM  Mehmet ET "
        ,"Autoservice Paul Blasbichler KG "
        ,"KFZ - Allianz "
        ,"KFZ Comandella "
        ,"Sigrid Pichler "
        ,"Machherndl Peter Kfz-Werkstätte"
        ,"Auto Kogler "
        ,"Österr. Bundesheer Heereslogistikze "
        ,"Ruzicka KFZ Werkstätte KG "
        ,"Strutzenberger Rudolf Ges.m.b.H. "
        ,"KFZ Hiden GmbH "
        ,"Rainer Kraftfahrzeughandels GmbH "
        ,"Florian Beer "
        ,"Landeskrankenanstalten "
        ,"KFZ-Reparaturen J. Wörndl "
        ,"Maria R. Unterlerchner "
        ,"ÖAMTC "
        ,"M. Scheinecker GmbH "
        ,"Reifen und KFZ-Technik Brasser "
        ,"KFZ Meisterbetrieb Lang "
        ,"Heiss & Hutticher GmbH "
        ,"Kleinrath GmbH "
        ,"Eberspächer Tageslichttechnik GmbH "
        ,"Grufeneder GmbH "
        ,"KFZ - Har-Mann OG "
        ,"Pirker & Kampl OG "
        ,"RMS Fahrzeugtechnik Andreas Bauer"
        ,"Blue Line Parcel GmbH "
        ,"KFZ-Technik Gstrein e.U. "
        ,"Klaus Spitzenberger "
        ,"Kfz-Technik Simon Unterweger "
        ,"KFZ Servicestation Burghart Josef "
        ,"Hubert Kühweider "
        ,"Lehnert Tools GmbH "
        ,"Gernot Hubmann GesmbH "
        ,"Autobedarf Türtscher "
        ,"EXMANCO Autozubehör- Handels-GmbH"
        ,"Bodner Garage GmbH "
        ,"Johann Keplinger GmbH & Co KG "
        ,"Kirchhoff Mobility Austria GmbH"
        ,"Tober & Bierbaumer GesmbH "
        ,"Stadtamt Gmunden "
        ,"KFZ - Strauß Alfred "
        ,"AW-Lackschadenreparatur GmbH "
        ,"Roland Schnabl "
        ,"Autohaus JURICA (Renault) Inh. Karl Zirngast"
        ,"Lindner & Knoll GmbH KFZ u. Maschinen Center"
        ,"Jugend am Werk Bildungs:Raum GmbH"
        ,"Birngruber GmbH "
        ,"KFZ-Handel Mario Klammer "
        ,"Andreas Wanger "
        ,"Altran Concept Tech GmbH "
        ,"Kubica KFZ GmbH "
        ,"KFZ Profi Service "
        ,"Lagerhausgen. Vöcklabruck eGen. "
        ,"Servicestation Zinner "
        ,"Rohrmoser & Hettegger GmbH "
        ,"Thomas Kollenhofer Kfz-Technik"
        ,"C&M Kfz Technik OG "
        ,"Autohaus Gerhard Nossian "
        ,"Verbund Hydro Power GmbH "
        ,"Bernhard Bräuer "
        ,"Kfz-Technik Robitza "
        ,"Österreichisches Rotes Kreuz Landesverband Steiermarkt"
        ,"Andreas Thurner "
        ,"Fahrzeug Technik Steiner "
        ,"Demelbauer Kfz-Werkstätte und Handel"
        ,"Hofmann Autohaus GmbH & Co KG "
        ,"Martin Lackner "
        ,"Mag. Alexander Brugger e. U. "
        ,"Auto Wilfling GmbH "
        ,"Magistrat der Stadt Wien MA31-BA9"
        ,"RTA Hirscher GmbH "
        ,"Jürgen Dutter Kfz-Werkstätte"
        ,"FM-Automobile GmbH Inh. Martin Feischl"
        ,"Willis Werkstatt Wilhelm Matzer"
        ,"KFZ-Citroen Seehofer "
        ,"AIM Güngör Civan KG Kfz-Werkstätte"
        ,"Bernhard Weisz KFZ-Meisterbetrieb"
        ,"Autohaus Reich "
        ,"Auto Dienst Pfann "
        ,"Kfz-Technik Michael Deticek "
        ,"Autohaus Kaposi - Hofmeester Holding Gmb"
        ,"Gerhard Böhm "
        ,"Autohaus Gärtner Ges.m.b.H. "
        ,"Kfz & Teile Haselgruber Markus Haselgruber"
        ,"WM Fahrzeugteile Austria GmbH "
        ,"CT Auto-Werkstätte OG "
        ,"ÖAMTC Wien "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Alfred Pichler "
        ,"GAP-Service GmbH "
        ,"Eisner Auto Südring Vertrieb und Service GmbH"
        ,"Birner Gesellschaft m.b.H "
        ,"Birner Gesellschaft m.b.H "
        ,"Klaus Hainzl "
        ,"KFZ Üblacker GmbH "
        ,"Toni Car "
        ,"Roland Oswald "
        ,"AST - Auto Service Technik GmbH "
        ,"Autohandel Plank KG "
        ,"Lambert Fischer "
        ,"Autohaus Matzer e.U "
        ,"EMTA KG "
        ,"Kfz - Zeitlhofer "
        ,"KFZ Saile "
        ,"KFZ Dominic Tüchler "
        ,"Autotec Elvis Delalic Kfz-Meisterbetrieb"
        ,"ST KFZ GmbH Andreas Sedlmayer"
        ,"Osterbauer GmbH "
        ,"KFZ Karl Weiß "
        ,"KFZ-Reparaturen J. Wörndl "
        ,"ATM Autoteile Mehringer GmbH "
        ,"Herbert Huber "
        ,"KFZ-Zierlinger "
        ,"FS-KFZ-Technik OG "
        ,"Reifen John "
        ,"Reifen John "
        ,"Manfred Frühwirth "
        ,"KFZ - Popp "
        ,"ZHJ Fahrzeugtechnik Handels u. Dienstleistungs GesmbH"
        ,"Eisner Auto St. Veiterstr. 119a GmbH"
        ,"KFZ-Technik Maier "
        ,"Kfz-Technik Helmut Ortner "
        ,"Autohaus Litzlbauer "
        ,"Autoglas Plöb GmbH "
        ,"Saint-Gobain Autover Österreich GmbH"
        ,"KFZ - Tafi "
        ,"Reifen John "
        ,"Richard Reznicek "
        ,"Andreas Fuchs "
        ,"Gmeiner GesmbH "
        ,"Helmut Schenk "
        ,"KFZ - Hartl "
        ,"Car Klinik Krgovic e.U. "
        ,"Autohaus Polke "
        ,"Alexander Haas "
        ,"Silmax KFZ-Werkstätte "
        ,"SRT Hofbauer "
        ,"Stefan Lippnegg KFZ GmbH "
        ,"KTAS KG "
        ,"Reifenservice JM GmbH "
        ,"Reinhard Bauer "
        ,"Helmut Mad "
        ,"Leopold Meisl "
        ,"Sebastian Höller "
        ,"KFZ-Spenglerei Fagerer Fagerer Robert"
        ,"Car Base GmbH "
        ,"Autohaus M. Brne GmbH & Co KG "
        ,"Hofer & Söhne "
        ,"Gerald Krondorfer Kfz-Werkstätte"
        ,"Christian Timischl Land-&KFZ-Meister-Werkstatt"
        ,"Stephan Jungwirth "
        ,"Karl Janiba GesmbH "
        ,"Maierhofer Motors "
        ,"Hochstöger Gesellschaft m.b.H. "
        ,"Harrer Reparaturwerkstatt e. U. "
        ,"Reinhold Weingärtner "
        ,"KFZ Dreissger "
        ,"ATP- Monschein Dipl.Ing. Wolfgang Monschein"
        ,"ATP Grill GmbH "
        ,"LTS Lamprecht Technik & Service "
        ,"Kfz-Greindl e. U. "
        ,"Der Autodoktor e. U. "
        ,"Michael Schindlauer "
        ,"Speckl-Ploner Petra KFZ Zweiradservice"
        ,"Georg Mörth "
        ,"Ing. Alfred Köck "
        ,"Fleissner & Mayrhofer OG "
        ,"Gerold Stadler Kraftfahrzeuge "
        ,"Gottfried Hierzer "
        ,"Jochen Zagorschak "
        ,"KFZ - Meisterbetrieb Kröpfl "
        ,"KFZ Thorer e.U. "
        ,"Schranzinger GmbH "
        ,"Exmanco - Steyr GmbH "
        ,"Weiser Andreas Transporte "
        ,"Autohaus Liebhart "
        ,"Lagerhaus Thermenland eGen "
        ,"KFZ Winkler Markus Winkler"
        ,"Valentin Tusch GmbH "
        ,"KFZ Kammerhuber "
        ,"Auto Kareb GmbH "
        ,"KFZ-Bogner GmbH "
        ,"Autohaus Nikles GmbH "
        ,"KFZ RP Car Design "
        ,"KFZ - Kiesling "
        ,"Autoglas König GmbH "
        ,"Markus Ziegler "
        ,"Motor Sound e. U. "
        ,"Kfz-Team RABE GmbH "
        ,"Grassauer Kfz-Technik GmbH "
        ,"Kadir Atilgan "
        ,"Hermann Wenigwieser Kfz Fachwerkstätte"
        ,"Roland Laber "
        ,"Karl Schwarzinger "
        ,"Kölbl GmbH "
        ,"Reifen Winkler GmbH "
        ,"Magna Steyr "
        ,"Rudolf Holzmann 1860 GmbH & Co KG "
        ,"ÖFAG Pinzgau Österr. Fahrzeugbau GmbH"
        ,"Wilhelm+Mayer Bau GmbH "
        ,"Roman Pöllinger "
        ,"KFZ-Service Schuler "
        ,"Autohof Kohl "
        ,"KFZ-Schild "
        ,"öfag Österr. Fahrzeugbau GmbH"
        ,"M&S Güter-Transport KG "
        ,"Paint Master "
        ,"Ruck Zuck Autoservice GmbH "
        ,"Robert Schweinöster "
        ,"A & M KFZ Meisterwerkstatt GmbH "
        ,"NB Automobil GesmbH "
        ,"Stefan Goldschmid "
        ,"Johannes Meschnark "
        ,"Daniel Kovacs KG "
        ,"Ing. Nemeth GmbH & Co KG "
        ,"Novomat d.o.o. "
        ,"Novomat d.o.o. "
        ,"Auto Brugger KG Michael Brugger"
        ,"Oliver Prinz "
        ,"Flügel & Klement GesmbH "
        ,"KFZ Lenaupark e. U. "
        ,"ÖBB-Postbus GmbH "
        ,"Auto Rieger "
        ,"KFZ - CND Inh. Erdi Cindi"
        ,"Erwin Kössler "
        ,"Bilfinger Chemserv GmbH "
        ,"Reifen John "
        ,"Birner Gesellschaft m.b.H "
        ,"Lackschaden- und Hagelschadenreparatur GmbH"
        ,"Grizzly Autoteile "
        ,"Wolfgang Erhardt "
        ,"Automobile Offroad Reisenhofer GmbH"
        ,"Engelbert Treffner "
        ,"Cerenko KG "
        ,"Werner Grögor GmbH "
        ,"M.G. Oberladstätter OG "
        ,"Reifen John "
        ,"Gilbert Holzbauer "
        ,"Speiser GmbH "
        ,"Reifen John "
        ,"Reifen John "
        ,"Beiske GesmbH Kfz-Reparaturwerkstätte"
        ,"Ing. Jörg Fruhmann GmbH "
        ,"Autoglas 4 You GmbH "
        ,"Agrarunion Südost eGen Lagerhaus & Co KG"
        ,"Dietmar Pilz "
        ,"Kabal KFZ "
        ,"Thomas Eppensteiner "
        ,"Manfred Polda "
        ,"Kfz - Mariacher "
        ,"Auto Simon GmbH "
        ,"Peter Ahammer e.U. "
        ,"Auto Smadu "
        ,"Sattler und Greimel GmbH "
        ,"Sascha Windbichler "
        ,"Autohaus Gunz GmbH "
        ,"Michael Zach e.U. "
        ,"KFZ Kollmann "
        ,"Alfred Lehner "
        ,"Ulrich Grassl "
        ,"Performance-Center Stefan Leitner e.U."
        ,"Paulitsch GmbH Lavanttaler Allradcenter"
        ,"Autohaus Aumayr GmbH "
        ,"Alois Altenbuchner "
        ,"Kapeller Rupert "
        ,"Autohaus Schaffer GmbH & Co KG "
        ,"Rathgeb&Landauer OG "
        ,"Schachermayer Großhandelsgesellschaft m."
        ,"Autohaus Schaffer GmbH & Co KG "
        ,"Autohaus Lenzenweger GmbH "
        ,"Würth Handelsges.m.b.H "
        ,"Schicki´s Garage Markus Schickhofer"
        ,"Georg Stranger "
        ,"G. Forsthofer GmbH "
        ,"Car-Selection Dominik Lenzenweger e.U."
        ,"Carglass Murska Sobota "
        ,"Celje Erik Vihar, Rok Lokovsek"
        ,"Carglass Ljubljana "
        ,"Carglass Kranj "
        ,"Carglass Austria GmbH "
        ,"Carglass Austria GmbH "
        ,"Karasek GmbH "
        ,"Udo Nageler "
        ,"Johannes Antretter "
        ,"Hinterleitner Ges.m.b.H "
        ,"WALLA Autoservice Isa Sasmaz"
        ,"Kr. Ing. Emil Pavlik GmbH "
        ,"Fr. Dipl. Ing. Jakubcova Maria "
        ,"KFZ Nolz "
        ,"Autohaus Gönitzer GmbH "
        ,"KFZ Bernd Troger "
        ,"Walter Alois Schwaiger "
        ,"Patrick Schlacher "
        ,"Kevin Kletzenbauer "
        ,"Autohandel Sampt GmbH "
        ,"Autohaus Ernst "
        ,"Christiane Deutschmann e.U. "
        ,"KFZ Meisterbetrieb GT Custom "
        ,"MBH KFZ-Handels KG "
        ,"KFZ Alfred Stumpf GmbH "
        ,"KFZ Thaler GmbH "
        ,"Alfred Egger GmbH "
        ,"Auto Frech Ges.m.b.H "
        ,"UMS Servicewerkstatt Inh. Schäbinger Udo"
        ,"MSM GmbH "
        ,"Auto Kühtreiber Inh. Alexander Kühtreiber"
        ,"Manfred Schäffer "
        ,"GHTrans GmbH "
        ,"Auothaus Franz Zuwach "
        ,"KFZ Rohringer GmbH "
        ,"Schönhofer GmbH "
        ,"Schröding David Kfz-Werkstätte"
        ,"Automobile Klaus Strobl "
        ,"YESCA Mobilitäts GmbH "
        ,"KFZ-Servicestation Sailer-Gritsch "
        ,"Rupert Freisacher "
        ,"YESCA Mobilitäts GmbH "
        ,"Bernhard Grass "
        ,"Dünwald OG "
        ,"Walter Reisen GmbH "
        ,"Bruno Drnovsek "
        ,"KFZ Pointner "
        ,"Autobedarf Deibel GmbH "
        ,"YESCA Mobilitäts GmbH Kitzbühel Haus der smarten Mobilität"
        ,"CAR-TEK e. U. "
        ,"Profi Reifen und Autoservice"
        ,"KFZ Winkler "
        ,"Slawitschek AutohandelsgmbH "
        ,"Fuchs KFZ Christian Fuchs"
        ,"Thomas Jäger "
        ,"WIFI Linz "
        ,"Autohaus Pirker GmbH & Co KG "
        ,"Weingartner-Sturmlehner GmbH Autohaus Weingartner"
        ,"D-Max KFZ-Service OG "
        ,"Autohaus Kopitsch GmbH "
        ,"KFZ-Technik Roth "
        ,"Autohaus Schmid "
        ,"Merbag GmbH "
        ,"Michael Penz "
        ,"Auto Delphin KFZ e.U. "
        ,"Bernhard Mörth "
        ,"ANKER KFZ-Meisterbetrieb e.U. Andreas Anker"
        ,"Resch & Frisch Service GmbH "
        ,"Reifen Alfons e.U. "
        ,"Pichler Fahrzeugtechnik GmbH & CO KG"
        ,"Raiffeisen-Lagerhaus Hollabrunn-Horn eGen"
        ,"Raiffeisen-Lagerhaus Hollabrunn-Horn eGen"
        ,"Raiffeisen-Lagerhaus Hollabrunn-Horn eGen"
        ,"Raiffeisen-Lagerhaus Hollabrunn-Horn eGen"
        ,"Raiffeisen-Lagerhaus Hollabrunn-Horn eGen"
        ,"Raiffeisen-Lagerhaus Zwettl eGen z. Hd. Herr Czech"
        ,"Raiffeisen-Lagerhaus Zwettl eGen "
        ,"Reifen John "
        ,"Automobil Lackier u. Spengler GmbH "
        ,"Marco Kornfeind "
        ,"Wolfgang Thomas "
        ,"Sven Arfsten "
        ,"Autohaus Damisch GmbH "
        ,"Autohaus Stippich Ges.m.b.H. "
        ,"Gerald Seper e.U. "
        ,"Auto Bodner GmbH "
        ,"Zwinz GmbH "
        ,"W & W Automotive Store GmbH "
        ,"Hans Decker Autoreparatur- und Handel GmbH"
        ,"TRENTECH GmbH "
        ,"KFZ Werkstätte Schöngrundner "
        ,"OPC - KFZ Service "
        ,"Mario Hohenfellner und Mitgesellschafter"
        ,"Rene Sadjak "
        ,"KFZ Technik Herbert Penz "
        ,"ARZ Alfons Reifen Zentrum GmbH "
        ,"Udo Tropper "
        ,"Raiffeisen-Lagerhaus Zwettl eGen"
        ,"Raiffeisen-Lagerhaus Korneuburg eGenmbH"
        ,"KFZ Oldtimerhandel Riedl "
        ,"Autohaus Neureiter und Kröll "
        ,"Soner Sütcü KFZ KG "
        ,"BUM Automobil GmbH "
        ,"Autohaus Fritz GmbH & Co KG "
        ,"KFZ Daniel Feichtl "
        ,"Baumit Beteiligungen GmbH "
        ,"Thomas Graef "
        ,"Baumgartner J. u. W. OG Kfz-Werkstätte"
        ,"Oscar Autoservice GmbH "
        ,"Andreas Pfaller "
        ,"Autobedarf Karl Kastner GmbH "
        ,"Reifen-John "
        ,"Walter Spacek KFZ GmbH Kfz-Meisterfachbetrieb"
        ,"KFZ-Technik M. Pichler "
        ,"H & H Kfz und Recycling KG "
        ,"Ilie Florea "
        ,"Bekir Rizvanovic "
        ,"Birner Gesellschaft m.b.H "
        ,"Zoran Stojanovic KFZ Handels GmbH "
        ,"Liebherr-Werk Bischofshofen GmbH "
        ,"R. Helm GmbH "
        ,"Autohaus Bidmon GmbH "
        ,"Auto Steiner GmbH Andreas Steiner"
        ,"Reifen John "
        ,"Auto Renz "
        ,"Raiffeisen Lagerhaus GmbH "
        ,"Autohaus Knunbauer GmbH "
        ,"Kurt Josef Jöchtl "
        ,"Autohaus Limberger GmbH "
        ,"KFZ Pro´s Fa Yavuz OG "
        ,"Autohaus Heinz "
        ,"KFZ - Falkensteiner "
        ,"Peter Hannak GmbH "
        ,"KFZ-Achleitner "
        ,"Auto Boigner GesmbH "
        ,"Reifen John "
        ,"Daniel Müller "
        ,"KFZ-Meiserbetrieb BOZO Ges.m.b.H "
        ,"Stefan Kneisz e.U. "
        ,"Autohaus Käfer GmbH & Co KG "
        ,"Gerold Reischer "
        ,"Autohaus Sieger GmbH "
        ,"Reifen John "
        ,"Car Service Fürnitz "
        ,"Johann Peter Mitterdorfer "
        ,"ABR Automobilvertriebs GmbH "
        ,"Gundacker GmbH Peugeot "
        ,"Gustav Neumüller GmbH "
        ,"Autohaus Georg Schmiderer GmbH"
        ,"Schauer Agrotronic GmbH "
        ,"Auto Holzapfel "
        ,"SL Spenglerei u. Lackiererei "
        ,"Autoglas Neuwirth "
        ,"Auto Ulten GmbH Holzner Wolfgang & Co."
        ,"Better Car Care Center "
        ,"Franz Pfalzer "
        ,"Ernst Lorch KG "
        ,"Autoreparatur Abenthum "
        ,"Huemer Gerhard KFZ "
        ,"Ewald Mayrbäurl "
        ,"mexcar.at GmbH "
        ,"O&U KFZ KG "
        ,"KFZ Pollheimer "
        ,"Fastbox Autoservice GmbH & Co KG "
        ,"O&U KFZ KG "
        ,"Hirner Mietwagen GmbH "
        ,"m-technik GmbH "
        ,"Georg Huainig Kfz-Reparatur u HandelsgesmbH"
        ,"Gerhard Richter "
        ,"Stojci´s Service "
        ,"GENIUS CARS GmbH "
        ,"Alazcioglu & Bilen GmbH "
        ,"ÖAMTC "
        ,"Wolf Ferdinand KIA Motors "
        ,"Green Mobility Line GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"Lucky-Car Autoservice GmbH "
        ,"M&M Servicestation Buyar Metin"
        ,"KFZ Wallner "
        ,"KFZ Ortner e.U. "
        ,"Bernhard Weidinger "
        ,"PSW Car Care GmbH "
        ,"Florian GesmbH "
        ,"E. Wegerer GmbH "
        ,"Theurer's KFZ-Klinik GmbH "
        ,"Edith Reitinger "
        ,"Pree GmbH "
        ,"Andreas Grabitzer "
        ,"Christian Hödl Karosseriefachwerkstätte"
        ,"Garage Frei des Frei Günther "
        ,"Servoking GmbH "
        ,"Dipl. Ing. Walter Frey GesmbH "
        ,"Lechner Reifen und Felgen Service "
        ,"Christian Hofbauer "
        ,"Gerald Gruber "
        ,"Car & Bike Dali e.U. "
        ,"F. Taban e.U. "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Sinhuber GmbH "
        ,"Euro-Reifen Kotulek GmbH "
        ,"Autohaus Hösch GmbH "
        ,"Karosseriecenter Thomas Fellner "
        ,"KFZ-Furtlehner GmbH "
        ,"Gerhard Nöbauer "
        ,"Reifen John "
        ,"Reifen GO "
        ,"Autoglas Fiedler e.U. "
        ,"Josef Geisler "
        ,"ÜZ Automobile e.U. "
        ,"Reifen John "
        ,"KS Autoprofi GmbH "
        ,"Zweirad Bernhard Grabner "
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Raiffeisen Lagerhaus GmbH "
        ,"Raiffeisen Lagerhaus Mostviertel Mitte"
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Raiffeisen-Lagerhaus Weinviertel Ost eGen"
        ,"Raiffeisen-Lagerhaus Weinviertel Ost eGen"
        ,"Raiffeisen-Lagerhaus St. Pölten reg.GenmbH"
        ,"ATZ Steinakirchen "
        ,"Steyr Center NÖ West "
        ,"Autohaus Walter GmbH Inh. Hr. Timo Walter"
        ,"Erdogan Elektrotechnik GmbH "
        ,"RS- CarTech GmbH "
        ,"KFZ-Technik Jürgen Müllauer "
        ,"Mathias Müller "
        ,"Autohaus R. Fuchs GmbH "
        ,"Dieter Brouschek "
        ,"Leitner Auto Service "
        ,"KFZ-Rettensteiner GmbH "
        ,"Auto Steiner GmbH "
        ,"Prinz Karosserie & Lackiererei "
        ,"Tanju Mutlu "
        ,"Autoklinik Draustadt "
        ,"Georg Gastaldo "
        ,"Profi Reifen und Autoservice "
        ,"Profi Reifen und Autoservice "
        ,"Friedrich Hohenberger "
        ,"Muhammet Tosun "
        ,"Pree Fahrzeug & Teilehandel "
        ,"Markus Schildberger "
        ,"Zehentmayr KFZ KG "
        ,"Der Kanal Kanalsanierungs GmbH "
        ,"Kraftfahrzeuge & Landmaschinen GmbH "
        ,"Robert Bibolaru "
        ,"Autoreparatur KF GmbH "
        ,"Reinhard Daxner "
        ,"Josua Bogomolec "
        ,"Autohaus Fürst GmbH "
        ,"Ing. Günther Juriga "
        ,"KFZ Technik Florian Nitsch "
        ,"Unterrainer & Wartbichler OG Automoto"
        ,"Skotschnigg GmbH "
        ,"Reifen Heinzl GmbH "
        ,"Aladár Bucsis "
        ,"Salih Gökmen "
        ,"Wichner Garage GmbH "
        ,"Michael Fibi "
        ,"SuperOne KG "
        ,"Öllinger GesmbH & Co KG "
        ,"Räder Nais GMBH "
        ,"Klaus-Jürgen Steiner "
        ,"Bernhard Hödl "
        ,"FAHRZEUGTECHNIK Ingo Lackner Meisterbetrieb"
        ,"AMA KFZ-Reparatur GmbH "
        ,"irx Karosserie GmbH "
        ,"Öllinger GmbH & Co KG "
        ,"Grand Car Service GmbH "
        ,"Autohaus Levent e.U. "
        ,"Daniel Fürnschlief "
        ,"Rauter Fabian Auto & Motorrad "
        ,"Michael Schartner "
        ,"Autohaus Pfeffer "
        ,"Auto Hüttel GmbH "
        ,"Kos Lackschaden GmbH "
        ,"Gebrüder Oitner Bauunternehmung GmbH"
        ,"Franz Schütz Ges.m.b.H "
        ,"Armin Schwarz "
        ,"Wildbach- und Lawinenverbauung "
        ,"KFZ-Service Peissl "
        ,"Pinar KFZ & Autohandel KG "
        ,"Auto Wohlgenannt GmbH "
        ,"Josef Hrazdil "
        ,"Müller Ferdinand Autowerkstätte"
        ,"Markus-Franz Lipp "
        ,"Robert Kueß "
        ,"Autohaus Ried GmbH "
        ,"Reinhard Vorhauer "
        ,"Walter Krispler GmbH "
        ,"KFZ Gsertz Hannes GmbH "
        ,"Georg Stefan Kircher "
        ,"Autohaus Metzker GmbH "
        ,"Top Repair-Mobilservice GmbH "
        ,"Ion Florin Pincotan "
        ,"Christian Reckendorfer "
        ,"Nedim Omerovic "
        ,"Auto Friesser e.U "
        ,"Schachner & Zamberger GmbH "
        ,"Auto Feichtenschlager "
        ,"KFZ Riederberg "
        ,"Herbitschek Bau-GmbH "
        ,"Manfred Gubenschek Kfz-Service"
        ,"Josip Papkovic Carbox GmbH "
        ,"Thomas Wais "
        ,"Ing. Manfred Hafner "
        ,"Richard Keklik "
        ,"Auto Peterbauer KG "
        ,"Emil Robert Hatzl "
        ,"Ernst Glazmaier "
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Justizanstalt St. Pölten "
        ,"Steindl-Mayr OHG "
        ,"Raiffeisen-Lagerhaus GmbH "
        ,"Autohaus Ergin OG "
        ,"Roider GmbH "
        ,"Mag. Seidl Autohandels GmbH "
        ,"Rohringer Automotiv GmbH "
        ,"Silberbauer "
        ,"Autohaus Niederhofer GmbH "
        ,"J. Marschall GmbH "
        ,"Kurt Kutej Autoglas"
        ,"Christian Kalman OG "
        ,"Autohaus Radl GmbH "
        ,"Reifen John GmbH & Co KG "
        ,"Thomas Sarer "
        ,"Robert Sendlhofer "
        ,"KFZ Technik Mayer GmbH "
        ,"Traunfellner Transport GmbH "
        ,"Roland Auinger "
        ,"Martin Sageder "
        ,"Kelz KFZ-Service GmbH "
        ,"Christian Reidinger "
        ,"Igor Tomic e.U. "
        ,"Wolfgang Stummer "
        ,"KFZ Stone "
        ,"KFZ - Gitti "
        ,"Auto Wiesenberg "
        ,"Matthias Wirth "
        ,"öfag "
        ,"öfag "
        ,"Allemeyer GesmbH "
        ,"KFZ Grünauer "
        ,"ME-Tech KFZ Technik "
        ,"Sandro Selis "
        ,"KFZ Bajrami GmbH "
        ,"Autohaus Nordwald Ing. Roland Prinz e.U."
        ,"Steirerhaus Teubl & Teubl Baugesellschaft mbH"
        ,"Edgar Manandjan "
        ,"DT Autohandel GmbH "
        ,"Klanatsky-Deutsch KFZ Inh. Wolfgang Klanatsky"
        ,"Harald Sagmüller Kfz-Technik"
        ,"Reifen John "
        ,"Reifen John "
        ,"Reifen John "
        ,"Die TECHNIKER Fahrzeugreparatur & Bewertungs-GmbH"
        ,"KFZ Auto TEC GmbH "
        ,"MH Reifen- und Autoservice GmbH "
        ,"Welwich GmbH "
        ,"MRT KFZ-Fachbetrieb KG "
        ,"Reifen John "
        ,"Lucky-Car Kleinschadenreparatur GmbH"
        ,"Kaufmann GmbH "
        ,"Autoglas Express Weber e.U. "
        ,"Ehrengruber "
        ,"Daniel Bamberger "
        ,"Patrick Haubner "
        ,"Wolfgang Denzel Auto AG "
        ,"Johann Rohrer GmbH "
        ,"Guener Garage GmbH Autohaus Sprit-Inn"
        ,"Prad Metallveredelung GmbH "
        ,"Gebrauchtbikes.at GmbH "
        ,"Moritz Walter "
        ,"Franz Hafner & Söhne KG "
        ,"KFZ-Kloiber "
        ,"HP KFZ Technik West "
        ,"KFZ Obernhumer-Scherrer e.U. "
        ,"Autohaus Naas "
        ,"Kasosserie Tirolia GmbH "
        ,"Autohaus Eberhard GmbH "
        ,"RSK Motorsport "
        ,"KFZ-Technik Winter "
        ,"Auto Scheikl GmbH "
        ,"Herbert Diernegger "
        ,"Bauunternehmung Granit Gesellschaft m.b.H."
        ,"Puri KFZ KG "
        ,"KFZ-Werkstätte Bernhard Steinwender "
        ,"KFZ-Service Winter KG "
        ,"Koch Hermann "
        ,"KFZ - Zweirad Friedrich Huber GmbH"
        ,"Manuel Strasser "
        ,"Autohaus Strohmaier GmbH Inh. Florian Strohmaier"
        ,"Steyr Automotive GmbH "
        ,"Mario Steiner "
        ,"Breymann GmbH "
        ,"RH Fahrzeugtechnik e.U. "
        ,"YESCA Mobilitäs GmbH "
        ,"Automeister Schaffer "
        ,"SD CarExpert GmbH Siminic-Iosif Dumitrescu"
        ,"DSK 4 Rad Center GmbH "
        ,"ACS Autocenter Sollenau GmbH "
        ,"KFZ Servicestation Feichtner "
        ,"KFZ-Technik Jöbstl GmbH "
        ,"Klemens Hahn KFZ-Service & -Handel"
        ,"Autohaus Maier Robert e.U. "
        ,"Hermann Neubauer GmbH & Co. KG Autohaus"
        ,"Manuel Unterköffler "
        ,"Wolfgang Häubl "
        ,"Walter Feusthuber "
        ,"HQ7-Autoglas Reparatur GmbH "
        ,"Schillhammer KFZ GmbH "
        ,"Histo-Tech GmbH "
        ,"Fahrschule Liesing Inh. Karl Schlosser"
        ,"KFZ AKSA Meisterbetrieb KG "
        ,"Josef Schmuck "
        ,"Mario De Lorenzo "
        ,"KFZ-Stöckler e.U. Inh. Markus Stöckler"
        ,"Franz Lindner "
        ,"M.T.H.S GmbH "
        ,"Autohaus Brunner GesmbH. "
        ,"Martin & Michael Kleibenzettl GbR "
        ,"Reifen John "
        ,"Josef Holzer GmbH "
        ,"Autohaus Angleitner GmbH "
        ,"Jürgen Hackl "
        ,"Karosserie & Lackierung GmbH "
        ,"BLASY GmbH "
        ,"J. Harmtodt Handels- u. KFZ Reparaturbet"
        ,"FULL Car Service M&M GmbH "
        ,"Hubert Schatz "
        ,"Avtomehanicna Delavnica "
        ,"Autohaus Wang im Alpenvorland GmbH "
        ,"THS Service KG "
        ,"TMW-Kfz e. U. Manfred Trimmel "
        ,"Der Erste Automobil Diensleistungs- "
        ,"Autoprofi 23 GmbH "
        ,"Ernst Thaler "
        ,"Daniel Riegler "
        ,"Autohaus Strnad GmbH "
        ,"Andreas Kreiszner "
        ,"Werner Steiner "
        ,"Carvista Autohandel übernommen durch KdNr. 473453"
        ,"Daniel Temmel "
        ,"Reifen Edtmayer GmbH & Co KG"
        ,"Gerhard Hohl "
        ,"ACFK Werkstättenbetriebs GmbH "
        ,"Heinisch & Partner Plihal Karin Juliana"
        ,"Alexander Kienbichl "
        ,"Stefan Baier "
        ,"Manuel Kusche "
        ,"KFZ Raab-Obermayr KG "
        ,"WIFI Salzburg "
        ,"Marco Krabichler "
        ,"KOCIAN "
        ,"Bernhard Bittmann "
        ,"KFZ-ATAK KG "
        ,"KFZ Niederreiter GmbH "
        ,"F. & P. Gruber O.G. "
        ,"Dolezal Daniel "
        ,"Gerald Troissner "
        ,"Autohaus Lauer GmbH & Co KG "
        ,"Johannes Prietl "
        ,"Walter Christian Kastner "
        ,"Michael Vecsei "
        ,"Denzel Krems GmbH "
        ,"Kaufmann & Unterberger GmbH & Co KG"
        ,"Ali Kaya "
        ,"Karosserie-Center "
        ,"Fragner KFZ-GmbH "
        ,"Ing. Marcus Saider GmbH "
        ,"My Car Kraftfahrzeugtechnik OG "
        ,"Josef Leber "
        ,"Florian Fritz "
        ,"AutoserviceBox A. Dj e.U. "
        ,"Österreichische Bundesforste AG "
        ,"Thomas Kreilinger "
        ,"Landesjugendheim Hartberg "
        ,"Klabacher GmbH und Co KG "
        ,"KFZ-Liberty "
        ,"Ing. Georg Ringseis "
        ,"Baschinger GmbH "
        ,"Hinterberger Michael "
        ,"KFZ Gullner Johann "
        ,"KFZ Rudolf Nagy "
        ,"Lagermax Autotransport GmbH "
        ,"M & M KFZ-Technik OG "
        ,"Porsche Inter Auto GmbH & Co KG "
        ,"Stefan Rehrl "
        ,"HG City KFZ Technik KG "
        ,"Autohaus Scherz GmbH "
        ,"Walter Aitzetmüller "
        ,"Flying Car Service GmbH "
        ,"Morman GmbH "
        ,"Autohaus Wirth e. U. "
        ,"Stefan Rettenwendner "
        ,"Autohaus Greinecker GmbH "
        ,"KFZ Zach GmbH "
        ,"Michael Mach "
        ,"Manfred Osternig "
        ,"WERKdrei Gruber GmbH "
        ,"Autohaus Hecher GmbH "
        ,"R & R Kfz-Servie KG "
        ,"Alpine "
        ,"Maschek Ges.m.b.H. "
        ,"Raiffeisen Lagerhaus Absdorf- Ziersdorf"
        ,"Toyota Lang Dieter "
        ,"Thomas Rau "
        ,"Haider ATB GmbH "
        ,"M&Ö Reifen Autoservice GmbH "
        ,"Gauper-Ertl GmbH "
        ,"R.T.M. Auto OG "
        ,"Edelböck Ges.m.b.H. Technik Point "
        ,"G-KFZ Glabonjat GmbH "
        ,"Vlatko Atlagić KFZ-Mazza"
        ,"Riders Factory KG "
        ,"Dominik Tauschek "
        ,"Auto Gebetsroither GmbH "
        ,"Knöbl e.U. "
        ,"Oliver Stockinger Kfz-Meisterbetrieb"
        ,"Karl Zwickelstorfer "
        ,"Kfz- Tech Summer GmbH Christian Neuhold"
        ,"Weichberger GmbH Reifenfachhandel u. Fahrradverkauf"
        ,"Kfz-Technik Inan "
        ,"Michael Weiss "
        ,"Bünyamin Celik KG "
        ,"Alois Ablinger "
        ,"Autohaus Kargl Lukas "
        ,"KFZ Elektrik Derler GmbH "
        ,"Mikl Markus "
        ,"KFZ Armin Kreuzroither Armin Wolfgang"
        ,"4Rath.at GmbH "
        ,"MP Automotive GmbH "
        ,"Stadtgemeinde Mödling "
        ,"Dietmar Wagner "
        ,"Autohaus Kreidenhuber GmbH&Co. KG "
        ,"KFZ-Technik Peter Fötschl "
        ,"Bernhard Steinhauser "
        ,"Karl Heinz Windischbacher "
        ,"KFZ - Fachbetrieb Sehic "
        ,"KFZ Club 8 "
        ,"Autohaus Esser GmbH "
        ,"Kurtis Werkstatt Inh. Isabella Zeilinger"
        ,"car konzept service GmbH "
        ,"Stefan Dum "
        ,"Taxi-Omnibus Prall GmbH "
        ,"Alpine Reifenhandel GmbH "
        ,"Autohaus Pichler GmbH "
        ,"KFZ Gundacker "
        ,"Go4System GmbH "
        ,"Batur Meryem e.U. "
        ,"DESI Kfz.-Service OG "
        ,"Simic Güterbeförderungs KG und Werkstätt"
        ,"Fa. Autohandel HG "
        ,"Auto Aixner Service GmbH "
        ,"Autotechnik HAKKI Balaban "
        ,"S-Auto-Mobil-Center GmbH & Co KG "
        ,"Autohaus Nimmervoll "
        ,"Julian Hinteregger "
        ,"Patrick Stocker "
        ,"David Scheikl DS-Performance"
        ,"W&G KFZ-Klinik OG "
        ,"ÖAMTC Salzburg "
        ,"KFZ Gruber "
        ,"Mirza Sallaberger "
        ,"Zehethofer mobility e.U. Inh. Franz Peter Zehethofer"
        ,"Dallamassl GmbH "
        ,"Stahlgruber Ges.m.b.H. "
        ,"Auto Elsner KFZ-Meisterbetrieb "
        ,"auto-kneisz SÜD Handels Ges.m.b.H."
        ,"Otto Reisner Automobile"
        ,"Klaus Schennach "
        ,"Carglass Austria GmbH "
        ,"CTS Car & Truck Service GmbH "
        ,"Gökhan Cihan KFZ-Upgrade"
        ,"Old Crow Motor Company OG "
        ,"Pikul Sylwia KFZ-Technik"
        ,"High Valley Bikers Peter Unterer"
        ,"Thomas Seyringer Karosseriefachbetrieb"
        ,"Ferdinand Huber KFZ-Meisterbetreib"
        ,"KFZ Fachbetrieb Kirchner Andreas"
        ,"KFZ G-Meisterbetrieb Göksal Gündogdu"
        ,"Autohaus Tonitz "
        ,"Motorradwerkstatt Michael Müller"
        ,"Jesch GmbH "
        ,"Ing. Friedrich Öller e.U. "
        ,"Yilmaz Samet & Yilmaz Kagen GesbR "
        ,"Teileprofi KFZ Ersatzteile GmbH KFZ  Reifencenter"
        ,"KFZ-Technik Prangl Daniel Prangl"
        ,"Bike Factory Motorradhandels GmbH"
        ,"Fior GmbH "
        ,"Carglass Austria GmbH "
        ,"KFZ Fuchs Markus Fuchs"
        ,"Klein Autoteile Vertriebs-GmbH "
        ,"KFZ-Technik Strobl GmbH "
        ,"KFZ-Technik Strobl GmbH "
        ,"MS Automobile Huben GmbH & Co. KG"
        ,"RundumsAuto e.U. Michael Habersatter"
        ,"Klaus Huemer OG Klaus Garage"
        ,"Karosserie Otto Jernej "
        ,"Gruber Karosseriefachbetrieb GmbH Christoph Gruber"
        ,"Kaspar KFZ-Werkstatt GmbH "
        ,"NordSide Car Service GmbH "
        ,"Fahrzeugtechnik Michl Inh. Günter Michl"
        ,"Kfz Lechner GmbH "
        ,"Werner Grünkranz KFZ-Schlosserei"
        ,"Werner Haselbauer "
        ,"Delta Autoglas & Service GmbH Karl Meingasser"
        ,"Luggi Moto Ludwig Moser"
        ,"Heribert Schweiger e.U. "
        ,"Car-Tec Mühlbauer e.U. "
        ,"RMS engineering GmbH "
        ,"Johann Tscherntschitsch "
        ,"Sepero Korrosionsschutz GmbH "
        ,"Engelbert Helm "
        ,"KFZ Technik Gotthard "
        ,"Günther Pirchner AMS Auto Motor Service"
        ,"Herbert Fest KFZ-Werkstätte"
        ,"Florinel Poloboc "

    );
    // email
    List<String> email = Arrays.asList("",
        "verkauf@kfzsitz.at",
        "",
        "office@autohaus-rath.at",
        "organisation@jrcs.at",
        "",
        "auto@embacher.info",
        "",
        "kfzpainer@utanet.at",
        "kundendienst@auto-marcher.at",
        "",
        "office@freregger.at",
        "office@birner.at",
        "m-s-autogarage@gmx.at",
        "lubitz@aon.at",
        "",
        "office@krydl.at",
        "weiermeier@partner.renault.at",
        "gte1@aon.at",
        "kfz-hth@aon.at",
        "",
        "",
        "office@kmt.at",
        "",
        "office@auto-hauptmann.at",
        "office@bsf-technik.at",
        "kfz.koessler@aon.at",
        "",
        "moedlhammer@utanet.at",
        "",
        "",
        "office@kfz-ertler.at",
        "office@kremer.at",
        "",
        "johann.liendl@aon.at",
        "welcome@frey-automobile.at",
        "amstetten@frey-automobile.at",
        "salzburg@frey-automobile.at",
        "schwechat@lucky-car.at",
        "auhof@rey-automobile.at",
        "retail@freynet.at",
        "",
        "office@autoengel.at",
        "",
        "attia2@gmx.at",
        "kfz-ilhan@hotmail.com",
        "",
        "pfeifer@hostprofis.at",
        "buchhaltung@slawitscheck.bmw.at",
        "citroen@autofrey.at",
        "retail@freynet.at",
        "info@wurmbrand-racing.at",
        "office@opencarbox.at",
        "office@kfz-tobisch.at",
        "office@auto-hollaus.at",
        "mikicardesign@inode.at",
        "andy@autoklinik-pahatz.at",
        "office@auto-pieber.at",
        "",
        "",
        "",
        "",
        "",
        "",
        "office@vp-truck.at",
        "",
        "",
        "",
        "lackierung@autoklinik-tockner.at",
        "",
        "kfz@motorfun-b30.at",
        "office@landtechnik-schabler.at",
        "",
        "",
        "office@opel-einfalt.at",
        "",
        "",
        "stocker@mazdahaendler.at",
        "steinerkfz@gmx.at",
        "office@autohaus-weninger.at",
        "office@kfz-herndlhofer.at",
        "werkstatt@2cv.at",
        "office@brucha.at",
        "alirnberger@autohaus-lirnberger.at",
        "office@windisch-bau.at",
        "office@atsw.at",
        "office@autohaus-uitz.at",
        "info@aydin-kfz.at",
        "manuelmayrhofer01@gmx.at",
        "",
        "fein@speed-garage.at",
        "info@vpt-agrar.com",
        "",
        "office@meidlinger-kfz-center.at",
        "",
        "info@modellbau-blasbichler.it",
        "",
        "kfzcomandella@gmail.com",
        "office@fahrradpichler.at",
        "machherndl@gmx.at",
        "go1a@autokogler.at",
        "",
        "thomas@ruzicka-kfz.at",
        "office@kfz-strutzenberger.at",
        "office@kfzhiden.at",
        "office@rainer.co.at",
        "info@florianbeer.at",
        "office@kabeg.at",
        "",
        "maria.unterlerchner@gmx.at",
        "office@oeamtc.at",
        "regau@scheinecker.com",
        "info@reifen-brasser.at",
        "",
        "toyota@heiss-hutticher.at",
        "s.fazekas@auto-kleinrath.at",
        "office@tageslichttechnik.at",
        "buchhaltung@grufi.at",
        "office@kfz-harmann.at",
        "",
        "",
        "office@bluelineparcel.at",
        "info@kfz-gstrein.at",
        "office@toyota-spitzenberger.at",
        "",
        "",
        "hubert.kuehweider@gmx.net",
        "info@lehnert-tools.com",
        "auto-hubmann@hotmail.com",
        "info@autobedarf-tuertscher.at",
        "st.valentin@exmanco.com",
        "info@bodnergarage.it",
        "office@keplinger-landmaschinen.at",
        "office@kirchhoff-mobility.com",
        "",
        "stadtamt@gmunden.ooe.gv.at",
        "office@kfz-strauss.at",
        "wien19@lucky-car.at",
        "r.schnabl@all-express.at",
        "",
        "info@lindner-knoll.at",
        "",
        "tulln@birngruber.at",
        "office@carpoint24.at",
        "",
        "office.at@altran.com",
        "",
        "jaffarauto@hotmail.com",
        "office@voecklabruck.rlh.at",
        "",
        "info@kia-pongau.at",
        "t.kollenhofer@gmx.at",
        "office@cmkfz.at",
        "",
        "information@verbund.com",
        "office@kfz-braeuer.at",
        "office@kfz-robitza.at",
        "",
        "info@thurner-imst.at",
        "",
        "office@demelbauer.co.at",
        "robert.hofmann@aon.at",
        "",
        "office@mobility.co.at",
        "richard@auto-wilfling.at",
        "museum.wal@ma31.wien.gv.at",
        "office@rta-gmbh.at",
        "office@dutter-racing.at",
        "m.feischl@fm-automobile.at",
        "meisterbine@a1.net",
        "citroen@seehofer-kfz.at",
        "autohausaim@hotmail.com",
        "office@bernhardweisz.at",
        "hyundai.reich@inode.at",
        "",
        "kfzdok@gmail.com",
        "office@kaposi.at",
        "",
        "office@auto-gaertner.at",
        "office@kfz-teile-haselgruber.at",
        "office@wm-fahrzeugteile.at",
        "kontakt@cartech-dornbirn.at",
        "office@oeamtc.at",
        "office@stahlgruber.at",
        "",
        "",
        "office9020@eisner.at",
        "office.linz@birner.at",
        "",
        "kfz-rsr@a1.net",
        "office@kfz-ueblacker.at",
        "",
        "",
        "office@kfz-ast.at",
        "office@auto-plank.com",
        "ebenschmied@a1.net",
        "fritz.matzer@autohaus-matzer.at",
        "",
        "office@kfz-zeitlhofer.at",
        "saile80@gmx.at",
        "dominic.tuechler@gmx.at",
        "",
        "",
        "office@kfz-osterbauer.at",
        "auto.weiss@aon.at",
        "tankstelle@kfz-woerndl.at",
        "office@atm-mehringer.at",
        "herbert.sparhuber@aon.at",
        "kfz-zierlinger@wavenet.at",
        "",
        "",
        "",
        "",
        "office@kfz-popp.at",
        "zhj.fahrzeugtechnik@aon.at",
        "a.salcher@eisner.at",
        "info@kfz-technik-maier.at",
        "kfz-ortner@outlook.com",
        "office@litzlbauer.co.at",
        "office@ploeb.at",
        "autover.wien@saint-gobain.com",
        "info@kfz-tafi.at",
        "",
        "office@revali.at",
        "fahrzeugservice.fuchs.andreas@gmail.com",
        "office@autohaus-gmeiner.at",
        "",
        "kfz-hartl@aon.at",
        "car.klinik.krgovic@gmail.com",
        "office@polke.at",
        "office@autoreinigung-haas.at",
        "silmax@aon.at",
        "kfz@mz1.at",
        "",
        "",
        "info@reifenservice-jm.at",
        "kfz-bauer@gmx.net",
        "",
        "",
        "office@kfz-hoeller.at",
        "kfz-spenglerei.fagerer@gmx.at",
        "office@car-base.at",
        "mario@brne.at",
        "p.hofer@hofer-karosserie.at",
        "office@kfz-krondorfer.at",
        "info@kfz-timischl.at",
        "",
        "office@janiba.at",
        "office@maierhofer-motors.at",
        "dach.hochstoeger@aon.at",
        "",
        "",
        "kfz@30er.at",
        "office@atp-monschein.at",
        "office@kfz-grill.at",
        "office@lts-lamprecht.at",
        "office@kfz-greindl.at",
        "office@der-autodoktor.at",
        "office@kfz-schindlauer.at",
        "specklservice@gmail.com",
        "",
        "",
        "office@pr-performance.at",
        "office@kfz-stadler.at",
        "",
        "",
        "kfz.meisterbetriebkroepfl@gmail.com",
        "office@kfz-thorer.co.at",
        "office@schranzinger.at",
        "info@exmanco-steyr.at",
        "",
        "liebhart-autohaus@aon.at",
        "gf@thermenland.rlh.at",
        "office@kfz-winkler.at",
        "valentin.tusch@security-car.com",
        "kfz-kammerhuber@aon.at",
        "info@opelkareb.at",
        "kfz-bogner@gmx.at",
        "info@autohaus-nikles.at",
        "office@rp-car-design.at",
        "reifenkiesling@aon.at",
        "office@autoglas-koenig.at",
        "",
        "",
        "ilse.rabenlehner@hotmail.com",
        "office@grassauer-kfz.at",
        "",
        "blechklinik@gmx.at",
        "",
        "",
        "office@koelbl-automobile.at",
        "verkauf@winkler-reifen.at",
        "office@magnasteyr.com",
        "stammhaus@rudolfholzmann.at",
        "office@oefag.at",
        "rechnungen@wilhelm-mayer.at",
        "office@poellinger-lack.at",
        "schulerflo@aol.de",
        "autohof.kohl@aon.at",
        "",
        "office@oefag.at",
        "",
        "",
        "office@ruckzuckauto.at",
        "",
        "aum-kfz@tnr.at",
        "service@kfz-bisevac.at",
        "",
        "bosch.meschnark@aon.at",
        "autoglas@carcompany.at",
        "office@nemeth-eisenstadt.at",
        "",
        "",
        "info@haus-brugger.at",
        "office@auto-prinz.at",
        "office@fluegel-klement.com",
        "",
        "info.innsbruck@postbus.at",
        "rieger.ma@gmx.at",
        "",
        "kfz.koessler@gmx.at",
        "kontakt.bis@bilfinger.com",
        "office@contitrade.at",
        "office@birner.at",
        "wien12@lucky-car.at",
        "info@grizzly-autoteile.at",
        "service@kfz-erhardt.at",
        "office@auto-reisenhofer.at",
        "kfz-treffner@gmx.at",
        "office@cerenko.at",
        "",
        "oberladstaetter@kfz-mgo.at",
        "sterneckstrasse@reifen-john.com",
        "kfz-holzbauer@a1business.at",
        "",
        "",
        "saalfelden@reifen-john.com",
        "office@beiske.at",
        "",
        "",
        "office@agrarunion.rlh.at",
        "",
        "",
        "thomaseppensteiner@gmx.at",
        "kfz.polda@aon.at",
        "",
        "johannes.simon@simon.skoda.co.at",
        "office@exmanco.at",
        "autosmadu@gmx.at",
        "info@sattler-greimel.com",
        "",
        "autohaus@gunz.co.at",
        "firma@kfz-zach.at",
        "manfred.kollmann@kfz-kollmann.at",
        "office@sbal.at",
        "",
        "stefan.leitner@performance-center.at",
        "office@allradcenter-paulitsch.at",
        "",
        "",
        "",
        "",
        "info@dielackierer.at",
        "info@schachermayer.at",
        "karin.schaffer@autohaus.at",
        "info-lenzenweger@autohaus.at",
        "info@wuerth.at",
        "markus.schickhofer@gmx.at",
        "",
        "office@forsthofer.at",
        "lenzenweger@car-selection.at",
        "info@carglass.si",
        "",
        "rok.lokovsek@carglass.si",
        "",
        "eingangsrechnung@carglass.at",
        "eingangsrechnung@carglass.at",
        "office@kfz-karasek.at",
        "office@kfz-nageler.at",
        "",
        "",
        "as-tornado@hotmail.com",
        "",
        "",
        "kfz.nolz@aon.at",
        "roland.baumgartner@goenitzer.bmw.at",
        "",
        "w.s-hydraulikcenter@gmx.at",
        "",
        "",
        "kontakt-ap@peugeot.com",
        "ford.ernst@utanet.at",
        "deutschmann@mercedes.at",
        "info@gt-custom.at",
        "masterlia@aon.at",
        "kfz-stumpf@gmx.at",
        "office@thaler-kfz.at",
        "info@kfz-egger.at",
        "kundendienst@toyota-frech.at",
        "office@ums1.at",
        "office@msm-gmbh.at",
        "autokuehtreiber@yahoo.de",
        "",
        "gerhard.pfefferkorn@asset.at",
        "buero@zuwach.at",
        "werkstatt@kfz-rohringer.at",
        "buero@mietwagen-schoenhofer.at",
        "david.schroeding@gmail.com",
        "",
        "yeswecan@yesca.at",
        "",
        "",
        "yeswecan@yesca.at",
        "office@kfz-grass.at",
        "office@duenwald.at",
        "office@walter-reisen.at",
        "",
        "kfz.pointner@gmx.at",
        "office@autobedarf-deibel.at",
        "kitz@yesca.at",
        "office@car-tek.at",
        "bludenz@profi-reifen.at",
        "winklerkfz@aon.at",
        "info@slawitscheck.at",
        "",
        "jaeger.thomas@sbg.at",
        "kundenservice@wifi-ooe.at",
        "office@autohaus-pirker.at",
        "andreas.weingartner89@gmail.com",
        "dmaxkfz@gmail.com",
        "markuskopitsch@gmail.com",
        "",
        "office@mazda-schmid.at",
        "rechnungen@merbag.at",
        "office@autopenz.at",
        "office@autodelphin.at",
        "speed-parts@a1.net",
        "info@anker-kfz.at",
        "office@resch-frisch.com",
        "office@reifenalfons.at",
        "",
        "wk.haugsdorf@hollabrunn.rlh.at",
        "rlh.hollabrunn@hollabrunn.rlh.at",
        "rlh.hollabrunn@hollabrunn.rlh.at",
        "wk.sierndorf@hollabrunn.rlh.at",
        "rlh.hollabrunn@hollabrunn.rlh.at",
        "",
        "sekretariat@zwettl.rlh.at",
        "kufstein@reifen-john.com",
        "office@toyota-stockreiter.com",
        "info@autohaus-kornfeind.at",
        "speedperfection@live.at",
        "svens_autoservice@gmx.at",
        "office@fiatauto.at",
        "fiat@stippich.at",
        "ad-seper@gmx.at",
        "office@autobodner.at",
        "k@zwinz.co.at",
        "rechnung@wuw-automotivestore.com",
        "",
        "office@trentech.at",
        "ferienanlage@aon.at",
        "",
        "info@motoguzzi-hohenfellner.at",
        "office@autoglas-hubner.at",
        "herbert.penz@hotmail.com",
        "office@reifen-alfons.at",
        "auto-motor-boot@aon.at",
        "rlh_ottenschlag@zwettl.rlh.at",
        "rlh_korneuburg@korneuburg.rlh.at",
        "",
        "office@autohaus-neureiter-kroell.at",
        "kfz-soner@hotmail.com",
        "",
        "office@autohausfritz.at",
        "daniel@kfz-danielfeichtl.at",
        "beteiligungen@wopfinger.baumit.com",
        "office@kfz-graef.at",
        "info@mitsubishi-baumgartner.at",
        "office@kfzoscar.com",
        "",
        "office@auto-kastner.at",
        "office@contitrade.at",
        "kfz@spacek.at",
        "martinpichler1990@gmail.com",
        "recycling@h-h.co.at",
        "",
        "bekom@aon.at",
        "office@birner.at",
        "",
        "info.lbh@liebherr.com",
        "raimund@helm.go1a.at",
        "autohaus@bidmon.at",
        "office@auto-steiner.at",
        "strasshof@reifen-john.com",
        "l.renz@auto-renz.at",
        "pottenstein@rlg.rlh.at",
        "autohaus@knunbauer.at",
        "",
        "office@limberger.at",
        "office@kfzpros.at",
        "verkauf@autohausheinz.at",
        "office@kfz-falkensteiner.at",
        "office@reifenhannak.at",
        "office@kfz-achleitner.at",
        "auto-boigner@aon.at",
        "",
        "",
        "office@kfz-bozo.at",
        "op.office@auto-kneisz.at",
        "",
        "",
        "office@autohaus-sieger.at",
        "st.poelten@reifen-john.com",
        "office@car-fuernitz.at",
        "renaultmitterdorfer@utanet.at",
        "autohaus.reiser@autohaus-reiser.at",
        "office@peugeot-gundacker.at",
        "andreas.kuehrer@neumueller.at",
        "office@schmiderer.at",
        "office@schauer-agrotronic.com",
        "office@auto-holzapfel@at",
        "",
        "office@autoglas-neuwirth.at",
        "",
        "office@bettercar.at",
        "office@reifen-pfalzer.at",
        "",
        "",
        "",
        "e.mayrbaeurl@speed.at",
        "",
        "",
        "kurt.pollheimer@aon.at",
        "rechnungseingang@fastbox.at",
        "",
        "hirner-mietwagen@ainet.at",
        "office@m-technik.at",
        "office@huainig.at",
        "gerhardrichter@me.com",
        "",
        "ch.weixlbaumer@gmail.com",
        "office@kfz22.at",
        "kontakt@oeamtc-allentsteig.at",
        "wolf_bach@kiapartner.at",
        "office@greenmobility.at",
        "office@lucky-car.at",
        "",
        "office@lucky-car.at",
        "office@lucky-car.at",
        "office@lucky-car.at",
        "office@lucky-car.at",
        "office@lucky-car.at",
        "office@lucky-car.at",
        "office@lucky-car.at",
        "mundmkoblach@gmail.com",
        "info@kfz-wallner.tirol",
        "",
        "bernhard.weidinger@car-complete.at",
        "info@car-care.at",
        "office@autohaus-florian.at",
        "",
        "office@theurers-kfz-klinik.at",
        "",
        "michael.pree@autopree.at",
        "",
        "ch@spenglereilackiererei.at",
        "",
        "servowien@servoking.at",
        "bau@frey.at",
        "office@lechner-reifen.at",
        "",
        "kfzgruber@kfzgruber.at",
        "cbdali@gmx.at",
        "office@reifen-taban.at",
        "office@stahlgruber.at",
        "annahme@eckerundsinhuber.at",
        "",
        "buchhaltung@hoesch.at",
        "office@karosserie-fellner.at",
        "kfz-furtlehner@aon.at",
        "office@noebauer.at",
        "schwechat@reifen-john.com",
        "",
        "info@autoglas-fiedler.at",
        "info@kfz-geisler.at",
        "umitzengin@live.at",
        "klagenfurt@reifen-john.com",
        "office@ks-autoprofi.at",
        "zweirad.grabner@sbg.at",
        "krumbach@rlg.rlh.at",
        "ternitz@rlg.rlh.at",
        "wrneustadt@rlg.rlh.at",
        "",
        "puchberg@rlg.rlh.at",
        "prellenkirchen@rlg.rlh.at",
        "rlh@weinviertelost.rlh.at",
        "ebilling@weinviertelost.rlh.at",
        "sekretariat@stpoelten.rlh.at",
        "atz@mostvmitte.rlh.at",
        "",
        "lustenau@autohaus-walter.at",
        "",
        "office@rs-cartech.at",
        "",
        "",
        "office@autofuchs.at",
        "office@brouschek.co.at",
        "werkstatt@autoservice-leitner.at",
        "",
        "ford.steiner@aon.at",
        "karosserie-prinz@a1.net",
        "t.mutlu@tm-cars.at",
        "mail@autoklinik-villach.at",
        "office@auto-castaldo.at",
        "baden@profi-reifen.at",
        "office@contitrade.at",
        "kfz.hohenberger@aon.at",
        "kfz.tosun@aon.at",
        "anja_pree@gmx.at",
        "schildberger@mazdahaendler.at",
        "kalwang@kfz-zehentmayr.at",
        "rechnung@derkanal.at",
        "info@klm-neumarkt.at",
        "",
        "office@kf-autoservice.at",
        "reinhard.daxner@gmail.com",
        "",
        "office@autohaus-fuerst.at",
        "",
        "info@kfztechnik-nitsch.at",
        "",
        "office@skotschnigg.at",
        "office@reifen-heinzl.at",
        "bucsis.a@aon.at",
        "",
        "office@wichnergarage.at",
        "",
        "",
        "haag@autohaus-oellinger.at",
        "raedernais@raedernais.com",
        "steinerklaus@gmx.at",
        "spenglerei-hoedl@aon.at",
        "",
        "office@kfz-autowerkstatt.at",
        "office@irx.at",
        "office@autohaus-oellinger.at",
        "office@grandcar-vienna.com",
        "office@autohaus-levent.at",
        "office@karosserie-fuernschlief.at",
        "office@auto-schwarzenbacher.at",
        "",
        "office@autohaus-pfeffer.at",
        "office@autohuettel.at",
        "wienmitte@lucky-car.at",
        "",
        "",
        "",
        "",
        "kfz.herwig_peissl@aon.at",
        "kfzpinar@gmail.com",
        "info@mazda-wohlgenannt.at",
        "",
        "",
        "office@kfz-lipp.at",
        "kuess.kar@aon.at",
        "",
        "i.vorhauer@gmail.com",
        "peugeot.hallein@aon.at",
        "werkstatt@oelbirn.at",
        "stefan.kircher@gmx.net",
        "metzker@automatischbesser.at",
        "",
        "",
        "office@auto-reckendorfer.at",
        "office@nedim.at",
        "friesser@aol.at",
        "",
        "auto_feichtenschlager@inext.at",
        "kfz.kaiblinger@aon.at",
        "rechnungen@herbitschek.at",
        "info@guman.at",
        "",
        "info@kfz-wais.at",
        "office@fiat-hafner.at",
        "office@kr-tuning.at",
        "office@auto-peterbauer.at",
        "emil@autohatzl.at",
        "kfz-spenglerei-glazmaier@aon.at",
        "schwadorf@rlg.rlh.at",
        "wkst_grimmenstein@rlg.rlh.at",
        "",
        "",
        "gerhard.eigner@justiz.gv.at",
        "steindl.mayr@mercedes.at",
        "",
        "",
        "service@roider-kfz.at",
        "info@herbertseidl.at",
        "",
        "",
        "office@niederhofer.at",
        "",
        "kurt.kutej@aon.at",
        "",
        "",
        "",
        "office@kfz-sarer.at",
        "robertsendlhofer@gmail.com",
        "mario.mayer69@icloud.com",
        "tt@antontraunfellner.at",
        "",
        "office@reinraus.at",
        "kelzkfz@gmail.com",
        "",
        "office@help24.co.at",
        "",
        "",
        "office@kfz-gitti.com",
        "office@auto-wiesenberg.at",
        "auto-wirth@gmx.at",
        "",
        "",
        "office@allemeyer.at",
        "power@kfz-gruenauer.at",
        "office@me-tech.at",
        "reifenmarkt-wollmann@gmx.at",
        "office@kfz-bajrami.at",
        "toyota.prinz@gmx.at",
        "martin.wurm@steirerhaus.at",
        "",
        "autohandel@yahoo.de",
        "office@k-kfz.at",
        "harald.sagmueller@a1.net",
        "",
        "",
        "",
        "",
        "office@kfz-autotec.at",
        "office@mhreifen.at",
        "welwich-kfz@aon.at",
        "mrtkfzfachbetrieb@gmail.com",
        "",
        "moedling@lucky-car.at",
        "horn@autoteile-kaufmann.at",
        "",
        "ehrengruber-kfztechnik@a1.net",
        "bambi087@gmx.at",
        "info@kfz-haubner.at",
        "",
        "invoice.rat.schwechat@rohrer-grp.com",
        "office@spritinn.at",
        "office@prad-fahrzeug.com",
        "info@gebrauchtbikes.at",
        "auto.moritz@aon.at",
        "info@autohafner.at",
        "office@kfz-kloiber.at",
        "office@hp-kfz.at",
        "office@kfz-obernhumer-scherrer.at",
        "office@autohaus-naas.at",
        "",
        "office@auto-eberhard.at",
        "office@rsk-motorsport.at",
        "office@kfz-technik-winter.at",
        "office@auto-scheikl.at",
        "",
        "b2b@granit-bau.at",
        "",
        "",
        "info@winter.bmw.at",
        "",
        "office@friedrich-huber.at",
        "",
        "info@strohmaier.go1a.at",
        "",
        "",
        "office@breymann.at",
        "office@rh-fahrzeugtechnik.at",
        "",
        "office@automeister-schaffer.at",
        "sdcarexpert@gmail.com",
        "",
        "office@autocentersollenau.at",
        "",
        "manuelapirker.kfz@gmail.com",
        "",
        "kfz.maier@aon.at",
        "office@autoneubauer.at",
        "",
        "",
        "feusthuber@aon.at",
        "info@hq7autoglas.at",
        "office@kfz-schillhammer.at",
        "office@histo-tech.at",
        "office@fahrschule-liesing.at",
        "office@kfz-aksa.at",
        "office@schmuck-kfz.at",
        "office@die-schrauber.co.at",
        "buchhaltung@kfz-stoeckler.at",
        "lindner.kfz@aon.at",
        "",
        "office@autohaus-brunner.co.at",
        "auto-kleibenzettl@gmx.at",
        "",
        "office@toyota-holzer.at",
        "office.angleitner@autohaus.at",
        "hackl@i-cars.at",
        "a.stippich@aon.at",
        "blasy.gmbh@blasy.at",
        "info@harmtodt.bmw.at",
        "office@kfz-fullservice.at",
        "",
        "",
        "kunden@autohaus-alpenvorland.at",
        "auto.schwab@utanet.at",
        "info@tmw-kfz.at",
        "kfz-automobil@bosch1160.at",
        "office@autoprofi23.at",
        "info@kfzwerkstatt-thaler.at",
        "office@kfz-riegler.at",
        "autohaus@strnad-gesmbh.at",
        "office@karosserie-kreiszner.at",
        "",
        "",
        "office@kfz-temmel.at",
        "office@reifen-edtmayer.at",
        "office@kfz-hohl.at",
        "acfk.werkstaetten.gmbh@chello.at",
        "karin.plihal@kfz-heinisch.at",
        "office@kfz-kienbichl.at",
        "stefan-baier1@gmx.at",
        "",
        "kfz.raab-obermayr@gmx.at",
        "info@wifisalzburg.at",
        "",
        "info@kocian.at",
        "auto.bittmann@inode.at",
        "",
        "kfz-niederreiter@gmx.at",
        "office@gruber-gundacker.at",
        "office@kfzdolezal.at",
        "office@gt-autoservice.at",
        "office@autohaus-lauer.at",
        "auto-prietl@gmx.at",
        "",
        "kfz.bastarz@aon.at",
        "walter.fichtinger@denzel.at",
        "info@kaufmann-unterberger.cc",
        "",
        "office@karosserie-center.at",
        "fragner@fragnerkfz.at",
        "office@schaider.eu",
        "office@mycar-nissan.at",
        "",
        "",
        "autoservice-box@gmx.at",
        "",
        "mail@kfz-kreilinger.at",
        "klabacher@inode.at",
        "",
        "service@kfz-liberty.at",
        "ringseis@kfz-ringseis.at",
        "office@autohaus-Baschinger.at",
        "service@kfz-hinterberger.at",
        "office@kfz-gullner.at",
        "rudolf.nagy@gmx.at",
        "atp.office@lagermax.com",
        "office@mm-kfz.at",
        "porsche.salzburg@porsche.co.at",
        "office@kfz-rehrl.at",
        "office@citykfz.at",
        "auto-scherz@aon.at",
        "cars@aon.at",
        "andreas.zanat@flyingcarservice.at",
        "",
        "autohaus.wirth@ivnet.at",
        "",
        "info@greinecker.at",
        "Rechnungen@zach-kfz.at",
        "kfz-mach@aon.at",
        "office@oktuning.at",
        "office@werkdrei.at",
        "office@auto-hecher.at",
        "rur-kfz-service@gmx.at",
        "office@alpine-kfz.de",
        "office@kfz-maschek.at",
        "office@toyota-lang.at",
        "",
        "",
        "office@haider-atb.at",
        "info@at.euromaster.com",
        "a.gauper@gauper-ertl.at",
        "rtm.auto.villach@gmail.com",
        "technikpoint@netway.at",
        "g.kfz@gmx.at",
        "",
        "office@riders-factory.com",
        "chefmaster1982@gmx.at",
        "info@auto-gebetsroither.at",
        "office@motorsport-knoebl.at",
        "strasspower@gmail.com",
        "kfz.zwickelstorfer@aon.at",
        "cneuhold88@gmx.at",
        "reifen@weichberger.at",
        "",
        "kfz-weiss@inode.at",
        "kfz.celik@gmail.com",
        "kfz@a2a.at",
        "",
        "office@kfzelektrik.at",
        "miklsdrive@gmail.com",
        "",
        "",
        "office@mp-automotive.at",
        "office@moedling.at",
        "kfz.wagner@a1.net",
        "auto@kreidenhuber.at",
        "foetschl.bosch@sbg.at",
        "office@kfz-scs.at",
        "",
        "",
        "",
        "info@autoesser.at",
        "",
        "office@carkonzept.at",
        "",
        "taxi@taxi-prall.at",
        "office@rz-sued.at",
        "office@opel-pichler.at",
        "office@kfz-gundacker.at",
        "",
        "office@batur.at",
        "office@desi-kfz.at",
        "klaudija.simic@chello.at",
        "autohandel-hg@outlook.com",
        "office@aixner.at",
        "",
        "office@s-automobilcenter.at",
        "karin.nimmervoll@toyota-nimmervoll.at",
        "j.hinteregger@gmx.net",
        "",
        "scheikl.david@gmail.com",
        "info@kfz-klinik.at",
        "saalfelden@oeamtc.at",
        "",
        "",
        "fibu@auto-zehethofer.at",
        "",
        "",
        "office@autoelsner.at",
        "ow.office@auto-kneisz.at",
        "otto.reisner@reisner.seat.co.at",
        "",
        "eingangsrechnung@carglass.at",
        "",
        "",
        "",
        "kfz.pikul@yahoo.com",
        "hvb-wildschoenau@gmx.at",
        "office@seyringer.info",
        "",
        "kirchner@kfz-kirchner.at",
        "kfzg@gmx.at",
        "",
        "motorradwerkstatt1@gmail.com",
        "jesch@partner.renault.at",
        "oeller@mazdahaendler.at",
        "info@skykfzservice.at",
        "",
        "",
        "welcome@bikefactory.at",
        "office@techno.co.at",
        "eingangsrechnung@carglass.at",
        "",
        "rechnungskontrolle@klein-autoteile.at",
        "",
        "",
        "info@ms-automobile.at",
        "info@rundumsauto.net",
        "office@klausgarage.at",
        "otto.jernej@gmx.at",
        "",
        "office@kaspar-auto.at",
        "",
        "fahrzeugtechnik-michl@gmx.at",
        "office@kfzlechner.at",
        "",
        "",
        "",
        "",
        "ep@schweiger-heribert.at",
        "office@car-tec.at",
        "office@rms-kfz.at",
        "office@peugeot-tscherntschitsch.at",
        "",
        "helmmotorsport@aon.at",
        "kfz-technikgotthard@gmx.at",
        "ams-ibk@aon.at",
        "",
        ""

        );
    List<String> phone = Arrays.asList("",
        "07227/ 222 121",
        "",
        "02635 62405",
        "0676 83464300",
        "",
        "02262 66117-0",
        "",
        "0316 424480",
        "03862 52182-0",
        "",
        "03632 653-0",
        "01 790 24-0",
        "05572200496",
        "0664 3453354",
        "",
        "07434 49090",
        "07587 8519",
        "",
        "02252 508508",
        "",
        "06643949090",
        "0650 83 25 567",
        "0681 84049838",
        "03383 20134",
        "0699 10 32 97 80",
        "0664 5776948",
        "0664 1233468",
        "06221 20022",
        "",
        "",
        "0680 3023499",
        "07221 74449",
        "01 2933354",
        "03153 8263-0",
        "01610040",
        "0747262274",
        "0662620500-902",
        "01 908 13 08",
        "0161004-611",
        "01 61004-0",
        "",
        "02622 20780",
        "",
        "0664 9225688",
        "014939096",
        "",
        "0664 1400753",
        "07472 66799",
        "0662 623581",
        "01 61004-0",
        "02848 86179",
        "01 9972708",
        "03335 46683",
        "05223 56560",
        "01 2933177",
        "07672 26504",
        "03382 51125",
        "0664 3361727",
        "",
        "04242 2027",
        "",
        "",
        "",
        "06642539191",
        "",
        "",
        "0699 14026310",
        "07252 54143-0",
        "",
        "02862 / 3374332",
        "03184 2231-0",
        "",
        "0664/4126919",
        "02852 52804",
        "",
        "",
        "03685 22 112",
        "02628 47685",
        "02245 6611",
        "",
        "01 4861352",
        "02275 5875-0",
        "02842 52464",
        "02214 20099",
        "0316 72 11 11",
        "03152/8666-0",
        "0662 875795",
        "0664 511 08 70",
        "",
        "07242 207681",
        "0664 3235934",
        "00390474 678852",
        "01 9203020",
        "",
        "00390472 546158",
        "",
        "07482 46 288",
        "",
        "02715 2392",
        "0333820430",
        "",
        "02247 2291",
        "02258 8367",
        "03463 20530",
        "01 60166-0",
        "05518 20604",
        "0463 55212",
        "",
        "04247 2132",
        "01 71199-0",
        "07672/28050-0",
        "03462 40181",
        "",
        "06212/2235",
        "02610 42851",
        "02168 8271-0",
        "07955 23203",
        "06643442277",
        "03583 20390",
        "",
        "",
        "05254 3829",
        "06274 6495-0",
        "",
        "03613 3096",
        "03463 2845",
        "00497139 937760",
        "04252 2237",
        "05552 62832",
        "",
        "00390474 745031",
        "07230 / 7225-0",
        "02262 71700",
        "",
        "07612 794-0",
        "0664 / 4256334",
        "01 368 77 11",
        "",
        "",
        "05224/67852",
        "",
        "2272 691-0",
        "07472 23053",
        "",
        "03124 203 0",
        "",
        "0676 4804843",
        "07682/6681-0",
        "",
        "06415 20120",
        "02642 200 23",
        "05572 394408",
        "",
        "0748321110",
        "07218 469",
        "02168/8276",
        "034762144",
        "0664 190 44 45",
        "",
        "07762 2643-0",
        "07722 62580",
        "",
        "0664 8322102",
        "03118 8131",
        "0676 811 832 923",
        "06463 70114",
        "02747 21917",
        "07613 20055",
        "03456 20100",
        "014854907",
        "01 7492585",
        "07563 70380",
        "0732 781198",
        "",
        "06508105755",
        "0463 42200",
        "",
        "07242 42056",
        "0664 5167534",
        "0316 711112",
        "06642508088",
        "01 71199-0",
        "0662 856666",
        "",
        "07246/8866",
        "04352 2396",
        "0732674299",
        "0316583543",
        "0660 1429457",
        "0660 666 5066",
        "",
        "0664 5266115",
        "01 6620267",
        "0664 3418401",
        "07239 8260",
        "03155 8585-0",
        "",
        "0664 / 40 32 314",
        "02624 53951",
        "06643788688",
        "0664 4080868",
        "0664/1859207",
        "01 4082036",
        "0664 / 3076562",
        "06228 2227",
        "0664 360 37 03",
        "076765066",
        "0664 1532865",
        "",
        "03162930300",
        "0724253861",
        "",
        "0664 47 25 091",
        "04262 27380",
        "046341700",
        "07712 30243-4",
        "04842 20001",
        "07278 8227",
        "0316 263031",
        "02236 90320",
        "02622 22549",
        "",
        "02231 65296",
        "05335 40678",
        "07269 22272",
        "",
        "04233 20642",
        "",
        "02572 2741-0",
        "0664 326 10 98",
        "0160 / 33523",
        "06802113155",
        "03132 3106",
        "0664/6476360",
        "0660 6534346",
        "07227 40024",
        "",
        "",
        "06603456255",
        "0664 424 61 19",
        "0676 6410881",
        "03466 42775",
        "06229 2560",
        "0664 / 75062548",
        "03118 2732",
        "",
        "06219 6040",
        "0664 4518530",
        "07265 5262-0",
        "",
        "",
        "03834 20201",
        "03382 54655",
        "03862 23401",
        "0650 8141588",
        "07956 20 548",
        "0676 3165255",
        "06233 79 999",
        "0699 19470413",
        "",
        "",
        "066475125262",
        "07723 5142",
        "03119 3266",
        "",
        "0424524304",
        "04823 302",
        "07672 77731",
        "07252 47 087",
        "",
        "0535456412",
        "03385 7801-0",
        "03112 7375",
        "04273 21007",
        "07588 7231",
        "06229 2224-0",
        "07614 51 864-0",
        "03329 43373",
        "01 402 45 64",
        "0664 / 2406326",
        "0732 672807",
        "",
        "",
        "01 2701551",
        "0664 521 29 00",
        "0664/3011143",
        "0664 5050193",
        "",
        "",
        "02913 462",
        "06274 7039",
        "0316 404-0",
        "01 27717-0",
        "0662 8384-0",
        "05523 62081",
        "02684 3476",
        "0676/5427795",
        "03862 53514",
        "",
        "0662 8384-0",
        "",
        "",
        "0676844336611",
        "06588 94129",
        "05675 20703",
        "02236/312 123",
        "",
        "04232 22 80",
        "0699 199 505 19",
        "02682 62768-0",
        "",
        "",
        "06432 6637",
        "07252 38338-0",
        "01 7899087",
        "",
        "0512 390 390",
        "0664 5125577",
        "0676 5581085",
        "06432 8336",
        "0732 6987-0",
        "0179844880",
        "046336076",
        "01 8044930",
        "06274 20268",
        "0664 2050332",
        "03115 40740-0",
        "0660 52 20 425",
        "07942 72 560",
        "",
        "05337 62362",
        "0662 871383",
        "02645 5327-0",
        "",
        "0722980090",
        "0658272089",
        "01 6042318",
        "",
        "",
        "031525330-0",
        "",
        "",
        "0664 4550392",
        "0664 5005343",
        "",
        "03352 38966-24",
        "06132 25451-0",
        "0664/5325099",
        "03578 / 40077",
        "",
        "05552 64075-0",
        "03134 2201-0",
        "03134 20653",
        "",
        "",
        "0664 928 09 65",
        "0664 160 10 91",
        "",
        "",
        "",
        "",
        "06582 750 35-0",
        "0732 6599-0",
        "03476/2141-0",
        "07662 2215",
        "05 8242-0",
        "",
        "",
        "06274 6264-0",
        "07230 21775",
        "00386828 04850",
        "",
        "641601806",
        "",
        "0800 230 230",
        "",
        "0699 13002700",
        "04245 3429",
        "",
        "",
        "0699/10128836",
        "",
        "",
        "02176 3517",
        "04352 2540",
        "",
        "06583 7301",
        "",
        "",
        "03322 42478",
        "03382 71882",
        "0316 712139-0",
        "0664 / 13 29 615",
        "01 7487133",
        "03332 62300",
        "07748 20941",
        "06548 8142",
        "02772 54514",
        "0664 2146060",
        "01 4023593",
        "0664 4652286",
        "",
        "0660 867 23 19",
        "02843 2362",
        "02526 20111",
        "07268 720 44",
        "0664 4377323",
        "0664/4548094",
        "0512 346296",
        "",
        "03134 2235-0",
        "0880 270",
        "06642362261",
        "07482 43314-0",
        "0664 105 21 45",
        "",
        "07724 2867",
        "03332 63520",
        "05356 63 153",
        "02630 35848",
        "05552 62552",
        "03133 38499",
        "07472/64962",
        "",
        "06474 2222",
        "05-7000-77",
        "04352 3898",
        "0660 / 6588188",
        "02162 62625",
        "02163 20149",
        "",
        "05522 51186",
        "01/2788545",
        "04352 47139",
        "0699 16175001",
        "03142 22283",
        "0664/1928091",
        "07242 2005-50",
        "01 6042203",
        "",
        "029442225",
        "029823908",
        "029842121",
        "02267 2275",
        "02952 500222",
        "0664/6270980",
        "02822 506-0",
        "0537262906",
        "03842 26720",
        "02614 2660",
        "0650 6860269",
        "06137 6880",
        "0316 692720",
        "04223 2144",
        "02236 61734",
        "04842 6709",
        "02632 8444",
        "0664 4336 368",
        "01 6672112",
        "02622 77425",
        "03176 8868",
        "",
        "05556 74 319",
        "03612 22174",
        "0664 3915533",
        "02255/6255",
        "03135 55813",
        "028727435-0",
        "02262/725 19-0",
        "0664/2644123",
        "06549 7316",
        "0699/11281307",
        "",
        "03112 2117-0",
        "07252 81212",
        "02633 400101",
        "07662 2363",
        "02275 5351-0",
        "0699/10103372",
        "",
        "0512 3312-0",
        "0725272444",
        "",
        "0664 9158706",
        "0664 88194426",
        "03178 28389",
        "06763225675",
        "0512 561400",
        "",
        "05 80910",
        "07353 20036",
        "03512 82 880",
        "04872 20057",
        "0228731410",
        "02762 640 24",
        "0267282421",
        "07713 7132",
        "07753235433",
        "06135 8603",
        "0660 1071571",
        "05244 62253",
        "0664 75024833",
        "01 8042143",
        "07762 43064-0",
        "02244 2464",
        "077123052",
        "",
        "017983733",
        "02612 42364",
        "03382 54 300",
        "",
        "01 76 70 938",
        "02742366468",
        "04257 206 17",
        "04847 5273",
        "06215 7363",
        "02732 76234-0",
        "01 7493196",
        "06588 8360",
        "07277 2326",
        "06506777516",
        "",
        "07242 600979",
        "0039347 3161933",
        "0662 872560",
        "02637 3171",
        "+49(0)1511954...",
        "0512 282263",
        "",
        "07223 82456",
        "04633187000",
        "07229/81111",
        "0676 7345949",
        "",
        "0722981111",
        "03572 42600",
        "05213 20208",
        "0463 49133",
        "06606197291",
        "",
        "06605227669",
        "01 2561822",
        "06766302687",
        "05634 6384",
        "01 50100",
        "050 6677-1120",
        "",
        "050 6677-1120",
        "050 6677-1120",
        "050 6677-1120",
        "050 6677-1120",
        "050 6677-1120",
        "050 6677-1120",
        "050 6677-1120",
        "05523 55441",
        "05359 24140",
        "",
        "02236 506123",
        "0732 773588",
        "03383 2223",
        "",
        "02215 33 77",
        "01 4403382",
        "03365 23129",
        "0664 5458177",
        "06644515821",
        "",
        "01 6161661-0",
        "04852 62266-0",
        "0664 427 31 64",
        "",
        "03132 40290",
        "0660 6501258",
        "01 6991705",
        "0662 856666",
        "02716 20143",
        "",
        "07229 21103",
        "0676 / 611 53 93",
        "07260 8293",
        "0722979955",
        "017071234",
        "",
        "07242 666 20",
        "05287 869 21",
        "0699 / 19512697",
        "0463330217",
        "",
        "06217 6333",
        "0264742246-0",
        "0263561360",
        "0262222177-0",
        "+4327562377",
        "02362262-0",
        "021452227",
        "0253389707-0",
        "02572 2715-0",
        "027632481",
        "0748871490",
        "",
        "",
        "",
        "03842 32201",
        "",
        "",
        "05335 2191-0",
        "0699 17292424",
        "05288 639 86",
        "06458 20433",
        "02245 88243-0",
        "07477 43 565",
        "05525 63626",
        "04242 22394",
        "",
        "04242 41023",
        "04242 41023",
        "04769 3516",
        "06274 76657",
        "06763704392",
        "04236 2660",
        "03846 8255",
        "05 4814141",
        "07733 7242",
        "",
        "01 9713298",
        "06644054251",
        "0662 875795",
        "03352/34763",
        "",
        "06603738800",
        "06582/20777",
        "03454 282",
        "02231 61017",
        "02142 5252",
        "",
        "0676 / 32 43 943",
        "06606435496",
        "",
        "07434/42480",
        "0316 573000-0",
        "0660 4689158",
        "03183 20950",
        "0664/3505233",
        "01 2705329-0",
        "07435 53111",
        "07472 / 68000",
        "06641270270",
        "01 7068989",
        "0676 5302075",
        "04715343",
        "",
        "02267/2489",
        "03457 2530",
        "01 236 00 03",
        "",
        "02715 25140",
        "",
        "0664/8738006",
        "04242 59060",
        "06767711355",
        "05572 22846-0",
        "",
        "05675/4317",
        "03329 45909",
        "0664 340 07 50",
        "",
        "0664 750 86 86 0",
        "06245 83933",
        "02617 21340",
        "0676 43 70 366",
        "02173 2315",
        "",
        "02248 21158",
        "02622 87910",
        "0699 111 330 02",
        "05522 248 20",
        "",
        "07743 2256",
        "02271 8201",
        "03173 2358-0",
        "0664 4546544",
        "",
        "02262 672918",
        "0463 22400",
        "02762 539370",
        "0662 451087",
        "0664/1549739",
        "02773 42729",
        "02230 2235",
        "02644/37137",
        "",
        "",
        "02742840-355726",
        "06245 84054-0",
        "02662 42958",
        "02165 65300-0",
        "+43 662 6263170",
        "03112 80100",
        "",
        "",
        "05574 72223",
        "",
        "0463 418324",
        "01 7862097",
        "",
        "",
        "0664 / 5047648",
        "",
        "+436764200071",
        "07482 90300",
        "",
        "069910800984",
        "0660 23 08 060",
        "",
        "",
        "02877 88106",
        "07229 63047",
        "02783 517",
        "0699 10546409",
        "07714 6708",
        "",
        "",
        "018041656-0",
        "",
        "02635 63086",
        "04352 2304",
        "0676/5448975",
        "02857 2230",
        "03113 2600-0",
        "",
        "04358 3630",
        "03322 42119",
        "02774 72995",
        "",
        "",
        "",
        "0732 641265",
        "02249 30736",
        "0316 272320",
        "04352 81230",
        "0699 17759191",
        "",
        "01 236 31 44",
        "02982 302 22",
        "",
        "0676/6343820",
        "",
        "0650 9091865",
        "",
        "01 7073282",
        "01 5872307",
        "05524 22194",
        "01 6881978",
        "04245 2507",
        "02230 2213-0",
        "03136 20138",
        "0664 1405696",
        "0664 39 12 905",
        "03172 46762",
        "",
        "04212/45800",
        "07244 20129",
        "03847 21071",
        "03864 2394",
        "02752 8216",
        "02252 252608",
        "0660/4828069",
        "",
        "01 7491341",
        "0650/6635230",
        "02243 26909",
        "",
        "07228 20010",
        "0664/88962840",
        "",
        "06246 76088-0",
        "03578 24188",
        "",
        "02633 41113",
        "01/3771111",
        "06769429706",
        "0650 2231086",
        "",
        "0664 751 40 881",
        "",
        "02786 2598",
        "06477 7755",
        "",
        "",
        "06233 8284",
        "01 767 21 23",
        "02239 2171",
        "02635 66699",
        "01 / 865 93 64",
        "01 5451377",
        "0660 7613161",
        "06645240509",
        "0664 1509370",
        "0660 26 25 700",
        "",
        "02254 74018",
        "03135 47262",
        "",
        "01 8042561-0",
        "077503595",
        "0676 9503549",
        "04223 29166",
        "0512 24495",
        "03338 2275-0",
        "0676 879618443",
        "",
        "",
        "07488 71190",
        "03177 2614",
        "02684 23 200",
        "01 4920715",
        "0676 624 37 66",
        "0664 1852636",
        "0664 531 42 60",
        "02626/62191",
        "01 7494164",
        "",
        "0664/4112405",
        "0664 1460388",
        "06232 2068",
        "02252 76147",
        "0650 2001651",
        "0664 9295013",
        "02768 200 17",
        "0660 7675139",
        "",
        "07732 4443",
        "0662/8888-411",
        "",
        "02214 20077155",
        "0463 56457",
        "",
        "0676/9289245",
        "02826 7517",
        "0680 140 50 95",
        "02746 42 499",
        "02282 5080",
        "0664 2337276",
        "",
        "04762 29 34",
        "02732 78200-320",
        "06547 85 34",
        "02234 73317",
        "02626 22650",
        "02734 4488-0",
        "01 7078235",
        "01 9820297",
        "",
        "",
        "02246 20340",
        "",
        "0660 7633300",
        "06245 80391-0",
        "",
        "0149 207 49 0",
        "01 7125303",
        "0732 677277-0",
        "0274524198",
        "02574 28260",
        "01 2803396",
        "06215 8485-0",
        "0660 2311733",
        "0662 8071-0",
        "0699 113 199 03",
        "01 3471472",
        "0664/2560738",
        "069915103420",
        "02627 42658",
        "02249/7444",
        "07752 85588-0",
        "",
        "072468866",
        "0316/428354",
        "02622 77105",
        "06645109898",
        "0660 44 73 392",
        "05246 6956",
        "02236 377413",
        "+49 8654/774125",
        "02576 2334-0",
        "07248 68244",
        "",
        "04272 - 825 14",
        "07263 86054",
        "01 4862311",
        "03117 2295",
        "0676 5048333",
        "02249 2545",
        "0660 4644452",
        "0676/6825301",
        "0650662290",
        "06646343300",
        "07672 30021",
        "02646 3065",
        "04369 / 98112...",
        "02162 8475",
        "0664/4070111",
        "07416 53719",
        "06764068176",
        "06649112999",
        "0699 11 84 63 86",
        "0660 7327787",
        "",
        "03332 64264",
        "0660 6124404",
        "0664/1340893",
        "0664 4230475",
        "",
        "02236 400-0",
        "0664 3088041",
        "06541 6468-0",
        "06477 20045",
        "0699 10144502",
        "",
        "",
        "",
        "06457/2259",
        "0660/3023306",
        "01 2704414",
        "",
        "03463 6404",
        "0800 400171422",
        "0664 2723776",
        "0664 308 30 73",
        "057170",
        "02783 54512",
        "06601425568",
        "02246 34251",
        "0660 2604068",
        "0463 32110",
        "",
        "0662 641483",
        "02955 70224",
        "04229 402 17",
        "0660 1555920",
        "0660 / 2333550",
        "02842 20548",
        "06582 71600",
        "",
        "",
        "03153/8281",
        "",
        "",
        "0316/583106",
        "03352 33610",
        "02686/7426",
        "0660/5201980",
        "0664/88927553",
        "",
        "",
        "",
        "",
        "0676 / 7009830",
        "0662/852355",
        "0664/73522715",
        "02772/51563",
        "0660/2305846",
        "",
        "0660/1301127",
        "03339/22585-0",
        "07262/52484",
        "0664/4219141",
        "",
        "",
        "02742/44230",
        "",
        "",
        "0362253932",
        "",
        "",
        "",
        "05253 54070",
        "0664/5229578",
        "0660/2249307",
        "0676 / 4874992",
        "01/2825147",
        "01/8281840",
        "0699/17257611",
        "02738/22259",
        "0676/6004243",
        "",
        "",
        "07752/84433",
        "",
        "076667821",
        "0621520822",
        "05375/5335",
        "034532273-0",
        "",
        "06641017466",
        "0664/6433457",
        "0512288511",
        "04247/8239",
        ""
        );
    List<String> line1 = Arrays.asList("Sterzinggasse 38",
        "Stelzhamerstraße 8",
        "Brandlweg 20",
        "Neunkirchner Straße 30",
        "Hauptstraße 267a",
        "Payergasse 12",
        "Stockerauerstraße 160",
        "Gewerbegebiet Süd 22",
        "Am Jägerweg 42",
        "Wiener Straße 53-55",
        "Obritz 5",
        "Enns 30",
        "Mayrwiesstrasse 22",
        "Schwefel 38",
        "Linzer Bundesstraße 5",
        "Annaparkgasse 23",
        "Knillhof 15",
        "Jageredtstraße 17",
        "Bahngasse 5",
        "ÖLW-Gasse 3",
        "Weitraerstr. 8b",
        "Pfongau 54",
        "Gewerbepark-Ader 2",
        "Schloßhoferstr. 2",
        "Bad Blumau 143",
        "Fürstenbrunnweg 1",
        "Breitenberg 60",
        "Bergstraße 57",
        "Schlagstraße 20a",
        "Karl Kislingerplatz 2",
        "Hauptstraße 106",
        "Heidenstraße 23B",
        "Welser Heidestraße 6",
        "Wenhartgasse 26",
        "Lembach 7",
        "Stadionstraße 17",
        "Nordlandstraße 2",
        "Aignerstraße 57-61",
        "Bruck-Hainburgerstraße 17",
        "Albert-Schweitzer-Gasse 1",
        "Lilienthalgasse 6-10",
        "Richard Strauss-Straße 34",
        "Zehnergürtel 100-106",
        "Obere Hauptstraße",
        "Simmeringer Hauptstraße 279",
        "Reinlgasse 15",
        "Grinzingerstr. 52/2",
        "Handwerkstraße 10",
        "Landstraße 22",
        "Alpenstraße 85",
        "Wagramer Straße 256",
        "Buchbach 28",
        "Rennweg 76",
        "Obersaifen 256",
        "Burgfrieden 2",
        "Wilhelminenstraße 44",
        "Alm 5",
        "Fehringerstraße 13",
        "Schubertgasse 3",
        "Oberst-Lepperdinger-Straße 1",
        "Ossiacher Zeile 29",
        "Ofteringerstr. 14",
        "Pebering 21",
        "Wagnerstraße 1",
        "Kupferschmiedgasse 9",
        "Schratten 16",
        "Lupitsch 2",
        "Kilber Straße 10",
        "Kremser-Schmidt-Str. 21",
        "Frank-Stronach-Straße 3",
        "Schremserstraße 31",
        "Mitterlabill Nr. 40",
        "Hauptstraße 17",
        "Nr. 61",
        "Schremser Str. 52a",
        "Linzer Straße 16",
        "Westfeldweg 2",
        "Winkl 182",
        "Industriestraße 20",
        "Johann Galler-Straße 8",
        "Steinfeldgasse 1",
        "Klopstockgasse 5",
        "Rusterstraße 33",
        "ÖAMTC-Straße 2",
        "Ortstraße 62",
        "Herrgottwiesgasse 20",
        "Harter Straße 48",
        "Michael Walz Gasse 18a",
        "Gewerbegebiet 12a",
        "Breitenfurterstraße 70 - 74",
        "Jasminstraße 5",
        "Jösserstraße 18b",
        "Zona Industriale Molini 3/B",
        "Zeleborgasse 4",
        "Ing. Etzel Straße 152",
        "Strade del Sole 25",
        "Grillgasse 51",
        "Unterauer Straße 3a",
        "Rechenstraße 1",
        "Bachgasse 19",
        "Schlag 52",
        "Garnisonstraße 1",
        "Richard-Wagner-Gasse 14",
        "Sattelbach 34",
        "Rossegg 51b",
        "Wiedner Gürtel 3A",
        "Schnepfau 181",
        "Feschingstraße 11",
        "Hinterseestraße 47",
        "Millstätter Straße 109",
        "Baumgasse 129",
        "Pucheggerstraße 5 5",
        "Laßnitzerring 14",
        "Olympstraße 4b",
        "Hauptstraße 14",
        "Hauptstraße 70",
        "Obere Hauptstraße 55-59",
        "Linzer Straße 29",
        "Packerstraße 188",
        "Kärntner Straße 23",
        "Viertlerweg 3",
        "Zeppelinstraße 4",
        "Ötztalstraße 4",
        "Wahastraße 13",
        "Aibl 195",
        "Hall 61/2",
        "Graschuh 26",
        "Otto-Neumeister-Straße 8",
        "Hans-Leb-Weg 4",
        "Quadrella 10",
        "Handelsstraße 1",
        "Handwerkzone 17",
        "Gallneukirchner Str. 9",
        "Fohrafeld 8",
        "Donaustraße 87",
        "Rathausplatz 1",
        "Gewerbepark - Stadlhof 5",
        "Heiligenstädter Lände 11",
        "Igelschwang 10",
        "Hauptstraße 12",
        "Waldeben 3",
        "Brünnerstraße 52, Objekt F6",
        "Königstetter Straße 169",
        "Gewerbestraße 12",
        "Leogangerstraße 51A",
        "Concept Straße 1",
        "Studenzen 86",
        "Bundesstraße 9",
        "Bahnhofstraße 15",
        "Florianigasse 7",
        "Gewerbestraße 6",
        "Austraße 5",
        "Schwefel 41",
        "Bernsteinstraße 12",
        "Unterkolbnitz 68",
        "Schallenbergstraße 27",
        "Hauptstraße 53",
        "Merangasse 26",
        "Gewerbepark 9",
        "Aumühlweg 17-19 Halle B",
        "Rien 6",
        "Laaber Holzweg 29",
        "Maltern 38",
        "Am Sonnenhang 211",
        "Obergroßau 72",
        "",
        "Lammertalstraße 24",
        "Rammersdorf 10",
        "Matzing 10",
        "Wippelsach 64",
        "Geblergasse 96",
        "Werkstättenweg 79",
        "Pyhrnstraße 18",
        "Museumstr. 22",
        "Obere Theninger Straße 4",
        "Carl von Lindegasse 2/1c",
        "Lodengasse 27",
        "Elisabethgasse 27",
        "Kornstraße 2",
        "Riederstraße 231",
        "Mühlgasse 93",
        "Wallenmahd 23",
        "Franz-Fellner-Gasse 1",
        "Altenried 7",
        "Alte Bundesstraße 39",
        "Kieswerkstraße 1",
        "Grazerstraße 24",
        "Peinterstraße 3",
        "Eggenberger Allee 27-29",
        "Untergrimming 26",
        "Rathausplatz 4",
        "Hinterseestraße 39",
        "Schlenkenstraße 14",
        "Anton Baumgartnerstraße 14",
        "Lohbachufer 24",
        "Feldsdorf 15",
        "Oberlamm 73",
        "Schneidergasse 10",
        "Oberschweinz 11",
        "Industriegelände 6",
        "Dechant Hauer Straße 26",
        "Trimmelkamer Str. 11",
        "Diepersdorf 1",
        "Waidhausenstraße 23",
        "Oedt 169",
        "Hinterseestraße 47",
        "Walchshoferweg 26",
        "Unterapping 7",
        "Oberbergern 142",
        "Grazer Straße 18",
        "Puntigamerstraße 153",
        "Salzburger Straße 240",
        "Niedergruenbach 54",
        "Eichhorn 20",
        "Mölbling-Ost 4",
        "St. Veiterstr. 119a",
        "Passauerstr. 21",
        "Sillian 1L",
        "Hauserstraße 10",
        "Grillweg 6",
        "Brown-Boveri-Straße 8/B17-2",
        "Hardlgasse 1",
        "Saalachstraße 1",
        "Kaiser Josef-Straße 8",
        "Unterdorf 8",
        "Markt 97",
        "Mühltalstraße 38",
        "Alte Hauptstraße 34",
        "Neubergenstraße 6-8",
        "Haydngasse 2b",
        "Hauptstraße 3",
        "Fernkorngasse 88",
        "Grazerstraße 124",
        "Notstraße 27",
        "Laßnitzthal 301",
        "Bahnhofstraße 1-3",
        "Dambach 29/1",
        "Erlengrund 8",
        "Am Anger 3",
        "Scharermühlenstr. 11",
        "Unterrosenberg 220",
        "Fuhrgasse 8 - 10",
        "Eibiswald 141",
        "Wolfgangseestraße 153",
        "Unteretzerstetten 3/2",
        "Untergroßau 278",
        "Bahnstraße 15",
        "Ausserwall 17",
        "Aredstrasse 29/H.114a",
        "Markt 89",
        "Bundesstraße 79",
        "Ruster Straße 120",
        "Wald am Schoberpaß 33c",
        "Bahnhofstraße 2-4",
        "Kärntnerstraße 154",
        "Boder Straße 38a",
        "Straß 25",
        "Lessinggasse 12",
        "Gessenschwandt 49",
        "Vorgartenstraße 62-66/3/8",
        "St. Lorenzen 12a",
        "Zwirtnergasse 8",
        "Diamantplatz 2",
        "Elling 6",
        "Mittergoggitsch 26",
        "Wollsdorf 76",
        "Bergstraße 10",
        "Stall 108",
        "Schörflinger Straßr 24",
        "Im Stadlgut Zone D6",
        "Schulgasse 13",
        "Spielbergstr. 38",
        "Großwilfersdorf 240",
        "Hofstätten/Raab 210",
        "Plescherken 18",
        "Hauptstraße 11",
        "Dorfstraße 27",
        "Lambacherstraße 41a",
        "Steinriegl 10",
        "Industriestraße B3",
        "Lindengasse 8",
        "Welser Straße 40",
        "Hitzmannsdorf 20",
        "Radetzkystraße 1-3",
        "Korneuburger Str. 169",
        "Pötschachgasse 3",
        "Endresstraße 106",
        "Beheimgasse 43",
        "Draustraße 26",
        "Leystraße 8/7/51",
        "Lehndorf 6a",
        "Ringofenstraße 5",
        "Liebenauer Hauptstraße 317",
        "Brünner Straße 11",
        "Brucker Bundesstraße 108",
        "Dr.-A.-Heinzle-Straße 38",
        "Altbachstraße 3",
        "Berg 16",
        "Leobnerstraße 97",
        "Gerersdorfer Hauptstraße 51",
        "Innsbrucker Bundesstraße 128",
        "St. Pöltner Straße 120",
        "Kornweg 3a-3b",
        "Unterer Bahnweg 7",
        "Gewerbegebiet 260",
        "Sennweg 36",
        "Franz Schubertgasse 13",
        "Viendorf 123",
        "Klagenfurter Str. 49",
        "Himberger Str. 30",
        "Haidäcker-Park 1",
        "Potksejmiscu 28",
        "Volvasorjeva 85",
        "Bundesstraße 463",
        "Ennser Straße 150",
        "Schuhfabrikgasse 17",
        "Lenaustraße 11",
        "Rossaugasse 10",
        "Großteinbach 210",
        "Blumauerstraße 200A",
        "Breitenberg 43",
        "Danubiastraße 21-25",
        "Franzosengraben 4",
        "Südring 325",
        "Breitenfurterstraße 155",
        "Bahnhofstraße 12",
        "Sebersdorf 331",
        "St. Margarethen a.d. Raab 190",
        "Dellach 9",
        "Kaplanstraße 2",
        "Weißgasse 42",
        "St. Gertraudi 74",
        "Sterneckstraße 42",
        "Schöderl 9",
        "Ratzersdorfer Hauptstraße 37",
        "Gewerbepark 13",
        "Zeller Bundesstraße 7",
        "Siccardsburggasse 84",
        "Arndtstraße 50",
        "Aignerstraße 6-10",
        "Lugitschstraße 11",
        "Weißkirchnerstraße 14",
        "Lichtensteinerstr. 111a",
        "Marbach 9",
        "Ritzlhofstraße 131",
        "Ahornweg 1",
        "Industriestraße 6a",
        "Salzburgerstraße 81",
        "Pölling 35",
        "Rötsch 33a",
        "Ohaberg 3",
        "Tränkeweg 2",
        "Marktplatz 24",
        "Liebensdorf 405",
        "Mostviertelstraße 2",
        "Scheffau 236",
        "Gewerbestraße 17",
        "Wolkersdorf 42",
        "Almstraße 8",
        "Großschieder 8",
        "Hummersdorf 26",
        "Halbenrain 122",
        "Gewerbepark Harham 5",
        "Schachermayerstraße 2",
        "Halbenrain 122",
        "Industriegebiet 3",
        "Würthstraße 1",
        "Hofkirchen 190",
        "Sonnberg 168",
        "Bürmooser Sraße 22",
        "Gewerbepark 4",
        "Norsinska ulica 2",
        "Mariborska cesta 166",
        "Kajuhova ulica 32a",
        "Cesta Staneta Zagarja 69",
        "Rosenthalerstraße 162",
        "Königshofstraße 39",
        "Ebreichsdorferstr. 19a",
        "Aichach 4",
        "Sonnwiesenweg 17b",
        "Dornacher Straße 2",
        "Wallagasse 6b",
        "Santorastrasse 2",
        "Dubova 252/50",
        "Wienerstraße 35",
        "Grazerstraße 4",
        "Etrichgasse 30",
        "Hirnreit 114",
        "Lackwirtsiedlung 12b",
        "Gleinalmstraße 101",
        "Faludistraße 21",
        "Antoniusplatz 7",
        "Lagergasse 115",
        "Rabenhofstraße 3",
        "Rautenstrauchgasse 11",
        "St. Johann i. d. Haide 79",
        "Gewerbestraße 15",
        "Gewerbestraße Ost 7",
        "Laurenzistraße 1",
        "Campus 33 Fiali-Ring 26",
        "7. Haidequerstraße 6",
        "Schulstraße 35",
        "Jasnitz 94",
        "Stöckenstraße 17a",
        "Brunnerstraße 45",
        "Patzenthal 87",
        "Hauptstraße 5",
        "Sallaberg am See 95",
        "Lugitsch 19",
        "Trientlgasse 50",
        "Ötztalerhöfe 11",
        "Prosdorf 58",
        "Bachlechnerstraße 25",
        "Ehrenschachen 131",
        "Schmelzergasse 2",
        "Hinterberg 1",
        "Empersdorf 74",
        "Gaismannslohen 3",
        "Eggendorferstraße 3",
        "St. Johannerstraße 10",
        "Bundesstraße 212",
        "Sankt-Peter-Straße 9",
        "Schemerlhöhe 9",
        "Hart-Automeile 2",
        "Klederingerstraße 152",
        "Taurachweg 204",
        "Wienerstrasse 150",
        "Ziegeleistraße 6",
        "Eisenwurzenstraße 52",
        "Alter Hainburger Weg 2",
        "Pachfurtherstraße 15",
        "Zoblstraße 5",
        "Feldkircher Str. 33",
        "Lohnergasse 6",
        "Auenfischerstraße 109",
        "Handelsstraße 3-5/6",
        "Grazer Vorstadt 70",
        "Marbling 7",
        "Heidestraße 19",
        "Neilreichgasse 46",
        "Transportstraße 14",
        "Bahnstraße 17",
        "Pragerstraße 50",
        "Felberstraße 3",
        "Bahnstraße 20",
        "Aspersdorferstraße 13",
        "Pater Werner Deibl-Straße 1",
        "Galgenbergstraße 22",
        "Willy-Graf Straße 15",
        "Lagergasse 4",
        "Oberpullendorferstr. 12",
        "Winzerstraße 2",
        "Moosgasse 188",
        "Andritzer Reichsstraße 89",
        "Zollfeld 21",
        "Parkstraße 2",
        "Sillian 80",
        "Nr. 149",
        "Schwarzenbach 30",
        "Holzhausenplatz 1",
        "Bickfordstraße 25",
        "Buchberg 54",
        "Neubauzeile 5",
        "Silvrettastr. 201",
        "Salzburgerstraße 30",
        "Weingartl 13",
        "Wienerstraße 114",
        "Großsulzer Str. 13",
        "Neuhof 30",
        "Schusterstraße 1",
        "Gewerbepark 19",
        "Mittersiller Bundesstraße 296",
        "2. Haidequerstraße 1 Obj. 7",
        "Salzburger Str. 1",
        "Bürgergasse 22",
        "Wolfernstraße 17",
        "Wopfing 156",
        "Gmundnerstraße 24",
        "Kremser Landstraße 33",
        "Kloppstockgasse 52",
        "Innertreffling 35",
        "Trientlgasse 24",
        "Haager-Str. 42-44",
        "Betriebsstraße 5",
        "Lebing 193",
        "Einöden 37",
        "Prebuch 18",
        "Seilergasse 9",
        "Zellerstraße 47a",
        "Industriestraße 26",
        "Dr.-Hans-Liebherr-Str. 4",
        "Markt 74",
        "Kobenzer Straße 12",
        "Huben 51",
        "Hauptstraße 18",
        "Mariazellerstr. 5-6",
        "Bahnstraße 21",
        "Fronwaldstraße 17",
        "Mühring 31",
        "Obere Marktstraße 25",
        "Grillgasse 51",
        "An der Bundesstr. 152c",
        "Industriegebiet 7",
        "Gregorygasse 1",
        "Ornharting 5",
        "Wiener Straße 48",
        "Passauer Str. 32",
        "Sonnenweg 4",
        "Wielandplatz 11",
        "Wienerstraße 21",
        "Körmenderstraße 11",
        "Richard Felsingerstr. 51",
        "Simmeringer Hauptstraße 269",
        "Kremser Landstraße 74",
        "Rosentalstraße 30",
        "Rodarm 17",
        "Am Schusterbach 11",
        "An der Schütt 3",
        "Rinnböckstraße 36",
        "Lofer Nr. 300",
        "Passauer Straße 1",
        "Bimmersdorf 4",
        "Josef-Huberstraße 6",
        "Salzburgerstr. 44",
        "Schmiedhof 348",
        "Röcklbrunnstraße 26",
        "Gewerbeparkstraße 3",
        "Primelweg 15A",
        "Fürstenweg 141",
        "Kuferzeile 14-16",
        "Neugablonz 3",
        "Schaußgasse 4",
        "Holzbauernstraße 20, Top 1/5",
        "Hauptstrasse 26b",
        "Rheinstrasse 88",
        "Holzbauernstraße 20",
        "Burggasse 71",
        "Boden-Niederlög 7",
        "Feldkirchner Straße 319",
        "Wienerstraße 40-44",
        "Schauching 32",
        "Salzburgerstraße 293",
        "Eipeldauerstraße 43",
        "Zwettlerstraße",
        "Bach 89",
        "Sturzgasse 13",
        "Linzer Straße 167",
        "Wattgasse 19",
        "Adalbert-Stifter-Straße 80",
        "Leopoldauer Straße 42",
        "Anton-Baumgartner-Straße 1",
        "Schönbrunner Schloßstraße 9",
        "Dampfschiffstraße 16",
        "Innerer U-Bahnbogen Gürtell 135-140",
        "Favoritenstraße 218",
        "Torkelgässele 2",
        "Pass-Griessenstraße 11",
        "Hauptstraße 6A",
        "Triesterstr. 4",
        "Prinz-Eugen-Straße 23",
        "Neudauer Str. 266",
        "Wichtelgasse 68",
        "Saatzuchtstraße 34b",
        "Rathstraße 28",
        "Edlitz 24",
        "Jaritzberg 64",
        "Edelsbach 157",
        "Manötsch 15",
        "Lamezanstraße 11",
        "Agnutstraße 34",
        "Lengbach 7",
        "Haslau 81",
        "Harterstrasse 35",
        "Leobnerstraße 66",
        "Triesterstraße 342",
        "Gewerbeparkstraße 31",
        "Seefeldstraße 11",
        "Triester Straße 131",
        "Pasching Point 9",
        "Hauxmoos 11",
        "Forstamt 123",
        "Kremstal Str. 115",
        "Wismayerstr. 4",
        "Henning 3",
        "Wimpassingerstraße 22",
        "Lanersbach 358",
        "Königstraße 26",
        "Krastowitzer Straße 9",
        "Gailtalstraße 40",
        "Salzburger Str. 29",
        "Sägemühle 2",
        "Neunkirchner Straße 34",
        "Wienerstraße 95a",
        "Bahnstrassse 3",
        "Bahnstraße 6a",
        "Pamaerstraße 6",
        "Hausbrunner Straße 131",
        "Wirtschaftspark 1",
        "Kropfsdorf 1",
        "Automeile 1",
        "Bahnhofstr. 17",
        "Glaserweg 33",
        "Hörbranzerstrasse 12",
        "Einödstraße 30",
        "Pürbach 118",
        "Austraße 6",
        "Brixentaler Str. 8",
        "Helenengasse-Bahnviadukte 8-11",
        "Sportplatzweg 3/1",
        "Sonnberg 280",
        "Kindergartengasse 13",
        "Gewerbepark Pölla 4",
        "Walgaustraße 17",
        "Franz v. Tschabuschingstr. 12",
        "Puchsbaumgasse 45",
        "Wr. Straße 83",
        "Wr. Straße 50",
        "Lendorf 21",
        "Gutenbergweg 1",
        "Gaminger Straße 18",
        "Loibegg 18",
        "Marktstraße 64",
        "Birostraße 13",
        "Am Weitenfeld 9",
        "Kremstalstraße 70",
        "Liebhartsgasse 27-29",
        "Bahnhofstraße 88",
        "Eidenham 15",
        "Gewerbepark 13",
        "Hauswiesenweg 1",
        "Schulstraße 6",
        "Gewerbepark-Harham 17",
        "Schlossberg 144",
        "Wiener Straße 48a",
        "Obere Hauptstr. 67c",
        "Wiener Straße 144",
        "Wichnerstraße 14",
        "Hauptstraße 99",
        "Engerthstrasse 92/37",
        "Steyrer Straße 44",
        "Strassgangerstr. 111",
        "Rothenmosstraße 4",
        "Badendorf 80",
        "Pichlern 14",
        "Stryeckgasse 12",
        "Wienerstraße 8",
        "Nordlandstraße 2",
        "Mosetiggasse 1A",
        "Zwölfaxingerstr. 5",
        "Dachsbach 72",
        "Kötschach 181",
        "Lengdorferstraße 10",
        "Untermallebarn 10",
        "Gleinstätten 171",
        "Untere Viaduktgasse 6",
        "Gewerbestraße 14",
        "Landstraße 198",
        "Göttelsberg 128",
        "Steggasse 16",
        "Moosschmiedenweg 10",
        "Perfektastraße 88 Obj.19",
        "Schwefel 56",
        "Josef-Slavikstraße 31",
        "Katzensteig 36",
        "Hauptstraße 39",
        "Vesielach 34",
        "Altendorf 47",
        "Schmidsberg 3",
        "Salzachtalstraße 13",
        "Aussiedlergasse 2a",
        "Sonnwiesen 7/3",
        "Untere Hauptstraße 130",
        "Webereistraße 7",
        "Grosshofen 24",
        "Neunkirchner Straße 70",
        "Zwölfaxingerstraße 3",
        "Beim Gräble 9",
        "Lantschern 193",
        "Dobl 16",
        "Wiener Straße 67",
        "Kirchenviertel 142",
        "Trag 48",
        "Fröbelgasse 33-35",
        "Ortsstraße 14",
        "Villacher Str. 155a",
        "Perlmoosergasse 7",
        "Izlingerhauptstraße 44",
        "Ahornstraße 1+2",
        "Gschaid 24",
        "Lagerhausstraße 3",
        "Lagerhausstraße 1",
        "Eco-Plus-Park, 1. Straße 2",
        "Podersdorferstr. 2",
        "Andreas-Hofer-Straße 3",
        "Garnei 139",
        "Hofbauer Straße 4",
        "Betriebsstr. 6",
        "Christophorusstraße 10",
        "Neugasse 103",
        "Protteser Str. 59",
        "Zissersdorf 4",
        "Dammstraße 4",
        "Ortsstraße 2",
        "Arnoldstraße 2",
        "Gurkgasse 14",
        "Carl-Benz-Straße 4",
        "Siemensstraße 13",
        "Rosengartenweg 7",
        "Wagrainerstr. 54",
        "Gewerbestraße 378",
        "Erlaufpromenade 32-34",
        "Stritzing 6",
        "Pettenbacher Str. 16",
        "Pichlern 58",
        "Wallensham 32",
        "Schellhammergasse 24/5",
        "Voitschlag 40",
        "Kürnbergstr. 4",
        "Oberndorferstraße 49",
        "Pelzgarten 26",
        "Reisdorf 10",
        "Gewerbegebiet Süd 20",
        "Naglerweg 17",
        "Breitenfurterstraße 165",
        "Fridau 22",
        "Schweiglstraße 10",
        "Grazerstraße 1",
        "Jedlseerstr. 55",
        "Bad Großpertholz 214",
        "Großpesendorf 40",
        "Pfenniggeldgasse 4-4a",
        "Hauptstraße 189a",
        "Grazer Straße 62",
        "Hauptstraße 124",
        "Am Gewerbepark 1",
        "Klagenfurter Str. 79",
        "Sagedergasse 24",
        "Gewerbeallee 2",
        "Die Marchfelderstraße 15",
        "Harterstraße 50",
        "Klagenfurterstr. 60",
        "Aufnergasse 7",
        "Salzburger Straße 244",
        "Enzersdorferstraße 7A",
        "Wiener Straße 2",
        "Kroisbach 16",
        "Innbachtalstraße 2",
        "Schnelldorf 62B",
        "Bahnhofstraße 8",
        "Wetzelsdorfer Straße 35",
        "Reinhartsdorfgasse 13",
        "Rechte Wienzeile 43",
        "Bahnhofstraße 9a",
        "Sofie-Lazarsfeld-Straße 17",
        "Pobersacherstraße 150",
        "Fischamenderstraße 7",
        "Gewerbeparkstraße 1",
        "Innsbrucker Straße 68/3/1",
        "Besenberg 9/1",
        "Affental 6",
        "Bsackerau 12",
        "Vökermarkterstraße 39",
        "Gewerbestraße 14",
        "Hauptstraße 14",
        "Wienerstraße 13",
        "Kochholz 12",
        "Handelsstraße 15",
        "Grillgasse 51",
        "Blaiken 111",
        "Felsgasse 3",
        "Münkafeld 2",
        "Inkustraße 11",
        "Bruckenholzerstr. 22",
        "Fischen 2a",
        "Schönauer Straße 5",
        "Schöpfgitter 23",
        "Kalkofenweg 1",
        "Rötsch 30",
        "Gewerbepark 21",
        "Gewerbestraße 16",
        "Perfekterstraße 83",
        "Badener Straße 51",
        "Industriestraße Nord 7",
        "Althofen 26",
        "Marktstraße 1a",
        "Gewerbepark 6a",
        "Obere Ortsstraße 24-25",
        "Höf 39",
        "Haslerweg 53",
        "Othellogasse 14",
        "Oberwang 9",
        "7. Haidequerstraße 6",
        "Hauptstraße 109",
        "Kernstockgasse 2",
        "Breitenfurterstr. 334",
        "Laurenzgasse 12",
        "Schelchweg 19/2",
        "Gseng 30",
        "Fischanger 551",
        "St. Georgener Landesstraße 4",
        "Raxstraße 28/2/11",
        "Linke Bahnzeile 30",
        "Bundesstr. 171",
        "Einödmayergasse 5",
        "Gregorygasse 8",
        "Furt 30",
        "Mitteraustraße 9/8/33",
        "Wutschein 7",
        "Bundesstraße 29",
        "Hauptstraße 240",
        "Deublergasse 38",
        "Klammstein 2",
        "Plintovec 10M",
        "Oberer Markt 25",
        "Etzersdorf 151",
        "Eisenstädterstraße 16",
        "Ludo Hartmann Platz 8",
        "Parttartgasse 34",
        "Großweißenbach 127",
        "Oberneuberg 71",
        "Bundesstraße 3",
        "Pappachgasse 10",
        "Triftgasse 17",
        "Weinviertlerstr. 28a",
        "Hasendorferstr. 1",
        "Maierhof 2",
        "Badnerstraße 69",
        "Körnergasse 4",
        "Triesterstraße 4c",
        "Kernhof 21",
        "Mettmacherstraße 109",
        "Hauptplatz 2",
        "Schauberg 1",
        "Julius-Raab-Platz 2",
        "Kögler 9",
        "Teichhof 4/4",
        "St. Veiterstraße 16",
        "Reinlgasse 15",
        "Gewerbepark Süd 9",
        "Rastenfeld 170",
        "Wolfgang-Mühlwangerstraße 28",
        "Färbergasse 26a",
        "Bodenzeile 1",
        "Großstübing 67",
        "Rattendorf 6",
        "Amlacherweg 4",
        "Gewerbeparkstraße 37",
        "Landesstraße 30",
        "Hauptplatz 8",
        "Victor-Kaplan-Alle 10",
        "Wiener Straße 44",
        "Mannswörther Str. 69",
        "Küfsteingasse 6",
        "Wolfsberg 203",
        "Aubergstraße 21",
        "Alfred Fröhlichstr. 3",
        "Steinkoglstraße 25",
        "Hufnagl 7",
        "Josef-Hallamayr-Straße 19",
        "Halleiner Landesstraße 32",
        "Hippgasse 22",
        "Schwarzenbergplatz 8",
        "Welserstraße 120",
        "Hinterholz 1",
        "Brünnerstraße 37",
        "Varnhagengasse 15",
        "Lagermaxstr. 1",
        "Klagenfurterstr. 10",
        "Vogelweiderstraße 69",
        "Fischachstraße 18",
        "Jedleseerstr. 56",
        "Breitenbach 60",
        "Saarstr. 28",
        "Gewerbepark A 21",
        "Eurostraße 1",
        "Danner 10",
        "Neuberg 112",
        "Kieswerkstraße 1",
        "Puntigamer Str. 70",
        "Fabriksgelände 7",
        "Lang 13",
        "Gewerbepark 1",
        "Achenkirch 206A",
        "Musterhofgasse 2",
        "Reichenhaller Straße 60",
        "Leonhardistraße 328",
        "Grafeneggerstraße 4",
        "Stifterstraße 6",
        "Schmiedgasse 1",
        "Mistlberg 98",
        "Wurlitzergasse 25-27",
        "Weizerstraße 8",
        "Heidenfeldstraße 5",
        "Marchfelder Straße 19",
        "Gewerbepark 1",
        "Viaduktbogen 135",
        "Tirolerstr. 180",
        "Steyrtalstraße 83a",
        "Agerstraße 7b",
        "Wienerstraße 45",
        "Straß 80",
        "Kirchengasse 10",
        "Dietersdorf 144",
        "Gries 95",
        "Perfektastraße 88-4",
        "Kapellenweg 4",
        "Holz-Steiner-Straße 6",
        "Oberaffnang 30",
        "Rettenegg 168",
        "Penzendorf 1",
        "Drautalstraße 14",
        "Arzler Straße 124a",
        "Neudorf 194",
        "Zimetsberg 11",
        "Pfarrgasse 9",
        "Gewerbestraße 10",
        "Glemmerstraße 317",
        "Gewerbestr. 586",
        "Innovationsstr. 5a/2",
        "Klagenfurterstr. 9",
        "Zwicklgasse 11",
        "Industriegasse 16",
        "Kreuzmoosstraße 85",
        "Rosengasse 21a",
        "Leopoldauer Straße 174",
        "Berg 5",
        "Lestein 125",
        "Rosenthalerstraße 162",
        "Loipersdorferstrasse 26",
        "Dölla 9",
        "Laxenburger Straße 216",
        "Wiener Str. 27",
        "Kalkofenweg 1",
        "Hubertusgasse 7",
        "Michael Haydenweg 4",
        "Flatschacherstraße 19",
        "Wallenmahd 23 B1",
        "Eberhard-Fugger-Str. 23",
        "Winzerstraße 1",
        "Hauptstraße 91",
        "Budesstraße 165",
        "Alpinestraße 18b",
        "Am Stadtteich 23",
        "Loferer Bundesstraße 15",
        "Gewerbepark 18",
        "Froschau 10",
        "Riegersburg 97",
        "Scheibenstraße 30",
        "Galgenau 46",
        "Reininghausstraße 32",
        "Wiener Straße 95",
        "Bahnstraße 117",
        "Schrökergasse 171",
        "Rautenweg 2",
        "Gewerbestraße 7",
        "Salzburgerstraße 44",
        "Dr.-Anton-Schneider-Str. 28B",
        "Wörtherstr. 104",
        "Erlenweg, Niederau 205",
        "Laschenskystraße 37",
        "Schrebergartengasse 5",
        "Tullner Straße 190",
        "Industriezone - Burgfeld 6",
        "Klagenfurterstraße 6",
        "Schulgasse 1",
        "Hauptstraße 59",
        "Pratztrum 16",
        "Gewerbestraße 11a",
        "Scheibser Str. 1",
        "Gemeindestraße 48",
        "Mathilde-Beyerknecht-Straße 1",
        "Grazer Straße 94",
        "Linzerstraße 176",
        "Gallhofstrasse 2",
        "Himmelreich 3a",
        "Studenzen 86",
        "Studenzen 86",
        "Huben 222",
        "Schildlehen 90",
        "Gewerbepark 7b",
        "Drabunaschach 1",
        "Hirschstettner Straße 92",
        "Radingerstraße 6",
        "Stadlauerstraße 41A",
        "Gewerbestraße 7",
        "Schnelldorf 62B",
        "Bahnhofstraße 3",
        "Gewerbestrasse 3",
        "Fuchsleiten 10",
        "Marktstraße 7",
        "Nußdorfstrasse 26",
        "Salzburgerstraße 54",
        "Kaltenbach 17",
        "Unterschwarza 55",
        "Unterer Bahnweg 6",
        "Gewerbepark 30/6",
        "Mettersdorf 18",
        "Fürstenweg 103",
        "Arriach 83",
        "Hofstätten 85"


        );
    List<String> zipcode = Arrays.asList("8053",
        "4053",
        "6020",
        "2620",
        "8401",
        "1160",
        "2100",
        "5204",
        "8041",
        "8600",
        "2061",
        "8932",
        "5300",
        "6850",
        "5020",
        "2751",
        "3350",
        "4542",
        "2100",
        "2514",
        "3920",
        "5202",
        "4850",
        "2301",
        "8283",
        "5071",
        "5630",
        "7522",
        "5321",
        "2560",
        "1140",
        "2402",
        "4063",
        "1210",
        "8333",
        "2700",
        "3300",
        "5026",
        "2320",
        "1140",
        "1030",
        "1230",
        "2700",
        "2485",
        "1110",
        "1140",
        "1190",
        "9500",
        "3304",
        "5020",
        "1220",
        "3830",
        "1030",
        "8225",
        "6060",
        "1160",
        "4845",
        "8280",
        "8200",
        "5071",
        "9500",
        "4063",
        "5301",
        "4742",
        "2201",
        "5441",
        "8992",
        "3202",
        "4451",
        "8200",
        "3860",
        "8413",
        "4092",
        "2224",
        "3950",
        "4173",
        "9431",
        "8962",
        "2601",
        "2120",
        "2721",
        "1160",
        "3451",
        "3830",
        "2292",
        "8020",
        "8053",
        "5020",
        "5121",
        "1120",
        "4600",
        "8430",
        "39032",
        "1120",
        "6020",
        "39030",
        "1110",
        "3370",
        "3380",
        "3610",
        "8234",
        "4600",
        "2232",
        "2532",
        "8510",
        "1040",
        "6882",
        "9020",
        "5324",
        "9542",
        "1030",
        "4844",
        "8523",
        "6430",
        "5201",
        "7312",
        "2451",
        "4280",
        "8561",
        "8800",
        "2242",
        "2401",
        "6450",
        "5111",
        "8552",
        "8911",
        "8510",
        "74196",
        "9500",
        "6706",
        "4300",
        "39039",
        "4203",
        "3233",
        "3671",
        "4810",
        "8772",
        "1190",
        "3313",
        "3011",
        "6133",
        "1210",
        "3430",
        "3304",
        "5760",
        "8101",
        "8322",
        "6068",
        "4880",
        "3464",
        "5621",
        "2871",
        "6850",
        "2273",
        "9815",
        "4183",
        "2451",
        "8010",
        "6471",
        "2544",
        "4721",
        "5280",
        "2852",
        "2724",
        "8261",
        "1000",
        "5522",
        "3231",
        "4663",
        "8441",
        "1170",
        "1110",
        "4582",
        "4020",
        "4062",
        "2492",
        "9020",
        "7301",
        "4614",
        "4923",
        "2380",
        "6850",
        "1220",
        "4971",
        "8561",
        "4623",
        "9400",
        "4060",
        "8020",
        "8951",
        "3361",
        "5324",
        "5071",
        "1230",
        "6020",
        "4201",
        "8352",
        "1110",
        "3281",
        "7035",
        "3950",
        "5120",
        "4552",
        "1140",
        "8330",
        "5324",
        "4121",
        "4904",
        "3512",
        "8662",
        "8055",
        "4600",
        "3532",
        "2225",
        "9330",
        "9020",
        "4780",
        "9920",
        "4723",
        "8053",
        "2351",
        "2700",
        "5020",
        "3002",
        "6361",
        "4391",
        "4162",
        "9112",
        "1150",
        "2130",
        "2542",
        "1100",
        "8682",
        "8062",
        "8200",
        "4053",
        "4501",
        "7023",
        "2111",
        "4843",
        "8093",
        "2201",
        "8552",
        "5321",
        "3250",
        "8261",
        "3426",
        "5162",
        "2544",
        "4363",
        "2031",
        "7000",
        "8781",
        "8280",
        "8700",
        "8786",
        "4274",
        "2232",
        "4882",
        "1200",
        "8552",
        "8940",
        "3304",
        "4952",
        "8323",
        "8181",
        "9710",
        "9832",
        "4844",
        "4407",
        "7033",
        "6391",
        "8263",
        "8200",
        "9074",
        "4551",
        "5322",
        "4655",
        "8383",
        "2345",
        "7051",
        "4060",
        "2640",
        "2232",
        "2103",
        "8605",
        "1230",
        "1170",
        "9813",
        "1200",
        "3753",
        "5111",
        "8041",
        "1210",
        "5700",
        "6840",
        "7064",
        "6675",
        "8600",
        "3385",
        "5020",
        "3130",
        "5071",
        "8724",
        "5092",
        "6675",
        "2345",
        "2013",
        "9100",
        "2320",
        "7000",
        "1231",
        "2000",
        "5630",
        "4407",
        "1230",
        "4020",
        "6020",
        "8265",
        "2601",
        "5630",
        "2323",
        "1030",
        "9020",
        "1120",
        "5112",
        "8272",
        "8321",
        "9560",
        "4240",
        "1170",
        "6235",
        "5020",
        "2803",
        "3100",
        "4052",
        "5760",
        "1100",
        "1120",
        "2201",
        "8330",
        "8740",
        "6800",
        "3250",
        "4053",
        "9972",
        "7400",
        "4820",
        "9314",
        "8742",
        "2833",
        "6700",
        "8081",
        "8081",
        "3100",
        "5440",
        "5325",
        "9431",
        "4274",
        "5144",
        "5721",
        "8492",
        "5760",
        "4020",
        "8492",
        "4863",
        "3071",
        "8224",
        "5521",
        "5112",
        "4190",
        "9000",
        "3000",
        "1000",
        "4000",
        "9020",
        "6800",
        "2522",
        "9711",
        "6361",
        "4407",
        "1110",
        "2482",
        "80000",
        "7161",
        "9400",
        "6020",
        "5771",
        "8763",
        "8124",
        "7540",
        "7571",
        "8020",
        "8423",
        "1110",
        "8295",
        "5143",
        "5722",
        "3040",
        "3133",
        "1110",
        "3820",
        "8643",
        "6850",
        "3830",
        "2153",
        "4360",
        "8943",
        "8091",
        "6020",
        "6403",
        "8081",
        "6020",
        "8240",
        "3270",
        "4284",
        "8081",
        "5261",
        "8230",
        "6370",
        "2632",
        "6700",
        "8302",
        "3304",
        "1100",
        "5580",
        "4021",
        "9400",
        "3270",
        "2460",
        "2465",
        "4650",
        "6820",
        "1210",
        "9431",
        "2201",
        "8570",
        "6335",
        "4623",
        "1100",
        "9300",
        "2054",
        "3580",
        "3730",
        "2011",
        "2020",
        "3910",
        "3910",
        "6330",
        "8700",
        "7304",
        "2070",
        "5350",
        "8046",
        "9063",
        "2351",
        "9920",
        "2761",
        "9472",
        "1140",
        "7201",
        "8223",
        "4030",
        "6780",
        "8940",
        "6161",
        "2483",
        "8142",
        "3631",
        "2111",
        "7423",
        "5721",
        "1110",
        "4870",
        "8200",
        "4400",
        "2754",
        "4861",
        "3452",
        "1170",
        "4209",
        "6020",
        "4400",
        "2412",
        "8234",
        "5600",
        "8211",
        "4522",
        "5760",
        "2325",
        "5500",
        "3334",
        "8723",
        "9971",
        "2231",
        "3160",
        "2563",
        "4784",
        "4906",
        "4822",
        "1110",
        "6220",
        "3261",
        "1230",
        "4652",
        "2103",
        "4780",
        "4162",
        "1100",
        "7350",
        "8280",
        "2512",
        "1110",
        "3100",
        "9586",
        "9942",
        "5310",
        "3500",
        "1110",
        "5090",
        "4731",
        "4761",
        "2620",
        "4600",
        "39016",
        "5020",
        "2733",
        "6850",
        "6020",
        "4810",
        "4470",
        "9020",
        "4050",
        "8786",
        "6900",
        "4050",
        "8750",
        "6105",
        "9061",
        "3400",
        "3143",
        "4030",
        "1220",
        "3804",
        "6653",
        "1150",
        "1140",
        "1190",
        "1200",
        "1210",
        "1230",
        "1120",
        "1030",
        "1090",
        "1100",
        "6830",
        "6395",
        "8792",
        "2353",
        "4020",
        "8291",
        "1170",
        "2301",
        "1190",
        "7474",
        "8113",
        "8332",
        "39050",
        "1230",
        "9900",
        "3033",
        "8190",
        "8062",
        "8600",
        "1230",
        "3500",
        "3542",
        "2512",
        "4061",
        "4902",
        "4392",
        "4053",
        "2320",
        "3254",
        "4600",
        "6293",
        "6800",
        "9020",
        "9620",
        "5163",
        "2851",
        "2620",
        "2700",
        "3380",
        "2734",
        "2472",
        "2181",
        "2130",
        "3161",
        "3261",
        "3233",
        "6890",
        "6911",
        "8600",
        "3944",
        "6700",
        "6305",
        "1020",
        "6271",
        "5521",
        "2212",
        "3353",
        "6719",
        "9500",
        "1100",
        "2500",
        "2345",
        "9811",
        "5111",
        "3264",
        "9141",
        "8775",
        "1230",
        "4720",
        "4050",
        "1160",
        "8990",
        "5163",
        "7502",
        "2463",
        "3841",
        "5760",
        "8463",
        "3002",
        "2474",
        "3400",
        "6850",
        "2265",
        "1200",
        "3350",
        "8052",
        "4565",
        "8413",
        "9562",
        "1210",
        "4300",
        "3300",
        "1230",
        "2320",
        "3353",
        "9640",
        "5722",
        "2011",
        "8443",
        "1030",
        "5166",
        "3610",
        "8160",
        "5500",
        "9500",
        "1230",
        "6850",
        "2283",
        "6677",
        "8383",
        "9123",
        "4793",
        "4920",
        "5400",
        "7372",
        "9702",
        "7122",
        "2630",
        "2282",
        "2700",
        "2320",
        "6800",
        "8943",
        "5242",
        "3004",
        "8673",
        "8541",
        "1160",
        "2202",
        "9020",
        "3180",
        "5020",
        "6063",
        "3033",
        "2432",
        "2842",
        "2460",
        "7132",
        "3100",
        "5431",
        "2640",
        "2412",
        "5061",
        "8200",
        "2230",
        "2094",
        "6923",
        "3452",
        "9020",
        "1140",
        "3300",
        "86356",
        "2151",
        "5602",
        "8942",
        "3270",
        "4625",
        "4655",
        "9562",
        "4786",
        "1160",
        "3524",
        "4061",
        "3133",
        "2413",
        "4092",
        "5204",
        "5600",
        "1120",
        "3200",
        "2620",
        "9400",
        "1210",
        "3972",
        "8211",
        "1120",
        "9433",
        "7540",
        "3052",
        "9413",
        "9400",
        "1120",
        "4221",
        "2281",
        "8053",
        "9431",
        "5020",
        "4034",
        "2345",
        "3580",
        "8321",
        "4633",
        "4975",
        "4481",
        "8020",
        "2320",
        "1050",
        "6824",
        "1110",
        "9710",
        "2432",
        "8143",
        "6176",
        "4722",
        "8160",
        "39040",
        "9300",
        "4642",
        "8793",
        "8644",
        "3642",
        "2512",
        "1110",
        "9433",
        "1110",
        "6800",
        "3400",
        "5113",
        "4531",
        "4400",
        "2533",
        "5400",
        "8742",
        "6068",
        "2753",
        "1230",
        "2751",
        "2601",
        "8843",
        "9330",
        "7221",
        "3125",
        "5582",
        "9543",
        "1230",
        "4882",
        "1110",
        "2384",
        "2620",
        "1230",
        "1050",
        "8551",
        "5442",
        "6932",
        "5113",
        "1100",
        "2483",
        "8077",
        "8700",
        "1230",
        "4754",
        "3500",
        "9063",
        "6063",
        "8232",
        "1210",
        "5632",
        "2201",
        "3262",
        "8160",
        "7064",
        "1160",
        "1230",
        "3910",
        "8225",
        "7221",
        "1110",
        "7062",
        "3491",
        "8430",
        "5311",
        "2540",
        "1020",
        "2353",
        "3195",
        "4923",
        "2143",
        "4681",
        "5027",
        "6652",
        "2292",
        "9020",
        "1140",
        "5141",
        "3532",
        "1220",
        "3150",
        "2230",
        "8114",
        "9631",
        "9800",
        "3500",
        "5710",
        "2440",
        "7023",
        "3550",
        "2320",
        "1140",
        "8421",
        "5161",
        "2201",
        "4802",
        "5271",
        "8230",
        "5441",
        "1160",
        "1020",
        "4060",
        "3143",
        "2191",
        "1120",
        "5204",
        "9371",
        "5020",
        "5101",
        "1210",
        "8573",
        "4600",
        "2821",
        "2301",
        "4971",
        "5532",
        "4623",
        "8041",
        "7201",
        "9560",
        "3163",
        "6215",
        "2345",
        "83395",
        "2116",
        "3483",
        "4713",
        "9062",
        "4284",
        "1160",
        "8063",
        "9500",
        "2301",
        "9100",
        "6020",
        "9500",
        "4523",
        "4860",
        "2860",
        "3353",
        "2464",
        "8342",
        "3281",
        "1230",
        "8047",
        "2201",
        "4674",
        "8674",
        "8230",
        "9710",
        "6020",
        "8262",
        "4941",
        "2340",
        "9113",
        "5752",
        "5582",
        "3041",
        "9400",
        "1110",
        "2551",
        "5542",
        "2301",
        "1210",
        "5771",
        "8511",
        "9020",
        "8280",
        "3661",
        "1230",
        "3133",
        "5400",
        "2201",
        "5112",
        "9020",
        "6850",
        "5020",
        "3701",
        "9201",
        "8966",
        "8652",
        "3830",
        "5700",
        "7423",
        "4240",
        "8333",
        "3580",
        "4240",
        "8020",
        "7400",
        "7022",
        "5582",
        "1220",
        "9601",
        "4690",
        "6850",
        "2640",
        "6314",
        "5071",
        "2493",
        "3040",
        "3150",
        "9100",
        "6719",
        "8240",
        "4331",
        "5550",
        "3264",
        "8076",
        "3100",
        "8605",
        "3003",
        "8990",
        "5071",
        "8322",
        "8322",
        "6444",
        "8972",
        "4201",
        "9133",
        "1220",
        "1020",
        "1220",
        "3481",
        "4975",
        "3233",
        "7000",
        "4911",
        "6230",
        "4864",
        "5204",
        "6345",
        "8471",
        "8724",
        "2242",
        "8504",
        "6020",
        "9543",
        "8200"
        );
    // CITY
    List<String> city = Arrays.asList("Graz",
        "Haid",
        "Innsbruck",
        "Neunkirchen-Ternitz",
        "Kalsdorf bei Graz",
        "Wien",
        "Leobendorf",
        "Straßwalchen",
        "Graz-Liebenau",
        "Bruck an der Mur",
        "Obritz",
        "Weißenbach an der Enns",
        "Hallwang",
        "Dornbirn",
        "Salzburg",
        "Steinabrückl",
        "Haag",
        "Nußbach",
        "Leobendorf",
        "Traiskirchen",
        "Groß Gerungs",
        "Neumarkt am Wallersee",
        "Timelkam",
        "Groß-Enzersdorf",
        "Bad Blumau",
        "Wals",
        "Bad Hofgastein",
        "Strem",
        "Koppl",
        "Berndorf",
        "Wien",
        "Maria Ellend",
        "Hörsching",
        "Wien",
        "Riegersburg",
        "Wiener Neustadt",
        "Amstetten-Greinsfurth",
        "Salzburg",
        "Schwechat",
        "Wien",
        "Wien",
        "Wien",
        "Wiener Neustadt",
        "Wampersdorf",
        "Wien",
        "Wien",
        "Wien",
        "Villach",
        "St. Georgen",
        "Salzburg",
        "Wien",
        "Waidhofen an der Thaya",
        "Wien",
        "Pöllau",
        "Hall in Tirol",
        "Wien",
        "Rutzenmoos",
        "Fürstenfeld",
        "Gleisdorf",
        "Wals-Siezenheim",
        "Villach",
        "Hörsching",
        "Eugendorf",
        "Pram",
        "Hagenbrunn",
        "Abtenau",
        "Altaussee",
        "Hofstetten",
        "Garsten",
        "Albersdorf",
        "Heidenreichstein",
        "St. Georgen an der Stiefing",
        "Esternberg",
        "Niedersulz",
        "Gmünd",
        "St. Veit im Mühlkreis",
        "St. Stefan",
        "Gröbming",
        "Sollenau",
        "Wolkersdorf",
        "Bad Fischau",
        "Wien",
        "Michelhausen",
        "Waidhofen an der Thaya",
        "Loimersdorf",
        "Graz",
        "Graz",
        "Salzburg",
        "Ostermiething",
        "Wien",
        "Wels",
        "Tillmitsch",
        "Campo Tures",
        "Wien",
        "Innsbruck",
        "Terenten",
        "Wien",
        "Ybbs an der Donau",
        "Pöchlarn",
        "Wösendorf i.d. Wachau",
        "Rohrbach an der Lafnitz",
        "Wels",
        "Deutsch Wagram",
        "Heiligenkreuz",
        "Stainz",
        "Wien",
        "Schnepfau",
        "Klagenfurt",
        "Faistenau",
        "Afritz am See",
        "Wien",
        "Regau",
        "Frauental an der Laßnitz",
        "Haiming / Ötztal-Bahnhof",
        "Seekirchen",
        "Horitschon",
        "Au am Leithaberge",
        "Königswiesen",
        "Söding",
        "Unzmarkt",
        "Prottes",
        "Fischamend",
        "Sölden",
        "Bürmoos",
        "Eibiswald",
        "Hall",
        "Stainz",
        "Neuenstadt a.K.",
        "Villach",
        "Bürs",
        "St. Valentin",
        "Niederndorf",
        "Altenberg bei Linz",
        "Kilb",
        "Marbach an der Donau",
        "Gmunden",
        "Traboch",
        "Wien",
        "Wallsee",
        "Tullnerbach",
        "Weerberg",
        "Wien",
        "Tulln",
        "St. Georgen",
        "Saalfelden",
        "Gratkorn",
        "Studenzen",
        "Mils",
        "St. Georgen im Attergau",
        "Pettendorf",
        "St. Veit im Pongau",
        "Zöbern",
        "Dornbirn",
        "Hohenau",
        "Kolbnitz",
        "Oberneukirchen (Traberg)",
        "Au am Leithaberge",
        "Graz",
        "Arzl im Pitztal",
        "Leobersdorf",
        "Altschwendt",
        "Braunau am Inn",
        "Hochneukirchen",
        "Hohe Wand-Stollhof",
        "Sinabelkirchen",
        "Wien",
        "St. Martin am Tennengebirge",
        "St. Margarethen an der Siernin",
        "Laakirchen",
        "Fresing",
        "Wien",
        "Wien",
        "Spital am Pyhrn",
        "Linz",
        "Thening",
        "Eggendorf",
        "Klagenfurt",
        "Deutschkreutz",
        "Marchtrenk",
        "Lohnsburg",
        "Perchtoldsdorf",
        "Dornbirn",
        "Wien",
        "Aurolzmünster",
        "Söding",
        "Gunskirchen",
        "Wolfsberg",
        "Leonding",
        "Graz",
        "Stainach-Prügg",
        "Aschbach Markt",
        "Faistenau",
        "Wals",
        "Wien",
        "Innsbruck",
        "Gramastetten",
        "Unterlamm",
        "Wien",
        "Oberndorf an der Melk",
        "Steinbrunn",
        "Dietmanns",
        "St. Pantaleon",
        "Wartberg an der Krems",
        "Wien",
        "Feldbach",
        "Faistenau",
        "Altenfelden",
        "Atzbach",
        "Oberbergern",
        "St. Barbara",
        "Graz",
        "Wels",
        "Niedergruenbach",
        "Zistersdorf",
        "Mölbling",
        "Klagenfurt",
        "Schärding",
        "Sillian",
        "Natternbach",
        "Graz",
        "Wiener Neudorf",
        "Wiener Neustadt",
        "Salzburg",
        "Purkersdorf",
        "Hopfgarten",
        "Waldhausen",
        "Julbach",
        "Griffen",
        "Wien",
        "Mistelbach",
        "Kottingbrunn",
        "Wien",
        "Hönigsberg",
        "Kumberg",
        "Gleisdorf",
        "Nettingsdorf",
        "Neuhofen an der Krems",
        "Stöttera",
        "Kleinrötz",
        "Ampflwang",
        "Sankt Peter am Ottersbach",
        "Gerasdorf",
        "Eibiswald",
        "Koppl",
        "Wieselburg",
        "Sinabelkirchen",
        "Muckendorf",
        "Obertraum",
        "Leobersdorf",
        "Pabneukirchen",
        "Altenmarkt",
        "Eisenstadt",
        "Wald am Schoberpaß",
        "Fürstenfeld",
        "Leoben",
        "Rottenmann",
        "Schönau im Mühlkreis",
        "Deutsch Wagram",
        "Oberwang",
        "Wien",
        "Eibiswald",
        "Weissenbach",
        "St. Georgen am Ybbsfelde",
        "Weng im Innkreis",
        "Nestelbach",
        "Unterfladnitz",
        "Mühlboden",
        "Stall",
        "Regau",
        "Steyr / Gleink",
        "Pöttsching",
        "Fieberbrunn",
        "Großwilfersdorf",
        "Hofstätten an der Raab",
        "Keutschach",
        "Ried im Traunkreis",
        "Hof bei Salzburg",
        "Vorchdorf",
        "St. Martin an der Raab",
        "Brunn am Gebirge",
        "Großhöflein",
        "Leonding",
        "Enzenreith",
        "Deutsch Wagram",
        "Langenzersdorf",
        "Kapfenberg",
        "Wien",
        "Wien",
        "Möllbrücke",
        "Wien",
        "Lehndorf",
        "Bürmoos",
        "Graz",
        "Wien",
        "Zell am See",
        "Götzis",
        "Oslip",
        "Tannheim",
        "Bruck an der Mur",
        "Geresdorf",
        "Salzburg",
        "Oberndorf",
        "Wals",
        "Spielberg",
        "St. Martin bei Lofer",
        "Tannheim",
        "Brunn am Gebirge",
        "Göllersdorf",
        "Völkermarkt",
        "Schwechat",
        "Eisenstadt",
        "Ljubljana",
        "Maribor",
        "Bad Hofgastein",
        "Steyr-Dietach",
        "Wien",
        "Linz",
        "Innsbruck",
        "Großsteinbach",
        "Sollenau",
        "Bad Hofgastein",
        "Schwechat-Mannswörth",
        "Wien",
        "Klagenfurt",
        "Wien",
        "Lamprechtshausen",
        "Sebersdorf",
        "St. Margarethen an der Raab",
        "Feldkirchen",
        "Freistadt",
        "Wien",
        "Reith im Alpbachtal",
        "Salzburg",
        "Schwarzenbach",
        "St. Pölten",
        "Ansfelden",
        "Saalfelden",
        "Wien",
        "Wien",
        "Hagenbrunn",
        "Feldbach",
        "Zeltweg",
        "Feldkirch",
        "Wieselburg",
        "Haid",
        "Virgen",
        "Oberwart",
        "Bad Ischl",
        "Launsdorf",
        "Obdach",
        "Bromberg",
        "Bludenz",
        "Heiligenkreuz am Waasen",
        "Heiligenkreuz am Waasen",
        "St. Pölten",
        "Scheffau",
        "Plainfeld",
        "St. Stefan",
        "Schönau im Mühlkreis",
        "Handenberg",
        "Piesendorf",
        "Halbenrain",
        "Saalfelden",
        "Linz",
        "Halbenrain",
        "Seewalchen am Attersee",
        "Böheimkirchen",
        "Kaindorf",
        "Niederfritz",
        "Lamprechtshausen",
        "Bad Leonfelden",
        "Murska Sobota",
        "Celje",
        "Ljubljana",
        "Kranj",
        "Klagenfurt",
        "Feldkirch",
        "Oberwaltersdorf",
        "Paternion",
        "Hopfgarten",
        "Steyr-Gleink",
        "Wien",
        "Münchendorf",
        "Bratislava",
        "St. Andrä am Zicksee",
        "Wolfsberg",
        "Innsbruck",
        "Leogang",
        "Möderbrugg",
        "Übelbach",
        "Güssing",
        "Rudersdorf",
        "Graz",
        "Rabenhof",
        "Wien",
        "St. Johann in der Haide",
        "Feldkirchen bei Mattighofen",
        "Niedernsill",
        "Markersdorf",
        "Traismauer",
        "Wien",
        "Raabs an der Thaya",
        "Kindberg",
        "Dornbirn",
        "Waidhofen an der Thaya",
        "Patzenthal",
        "Grein",
        "Aigen im Ennstal",
        "Jagerberg",
        "Innsbruck",
        "Flaurling",
        "Heiligenkreuz am Waasen",
        "Innsbruck",
        "Friedberg",
        "Scheibbs",
        "Tragwein",
        "Heiligenkreuz am Waasen",
        "Uttendorf",
        "Hartberg",
        "Kitzbühel",
        "St. Valentin-Landschach",
        "Bludenz",
        "Nestelbach bei Graz",
        "St. Georgen am Ybbsfelde",
        "Wien",
        "Tamsweg",
        "Linz",
        "Wolfsberg",
        "Scheibbs",
        "Bruck an der Leitha",
        "Höflein",
        "Edt bei Lambach",
        "Frastanz",
        "Wien",
        "St. Stefan",
        "Hagenbrunn",
        "Voitsberg",
        "Thiersee",
        "Gunskirchen",
        "Wien",
        "St. Veit an der Glan",
        "Haugsdorf",
        "Horn",
        "Eggenburg",
        "Sierndorf",
        "Hollabrunn",
        "Zwettl",
        "Zwettl",
        "Kufstein",
        "Leoben",
        "Großwarasdorf",
        "Obernalb",
        "Strobl",
        "Graz",
        "Maria Saal",
        "Wiener Neudorf",
        "Sillian",
        "Miesenbach",
        "Ettendorf",
        "Wien",
        "Neudörfl",
        "Stubenberg am See",
        "Linz",
        "Schruns",
        "Liezen",
        "Natters",
        "Ebreichsdorf",
        "Wundschuh",
        "Ottenschlag",
        "Tresdorf",
        "Grafenschachen",
        "Piesendorf",
        "Wien",
        "Vöcklamarkt",
        "Gleisdorf",
        "Steyr",
        "Waldegg",
        "Schörfling",
        "Heiligeneich",
        "Wien",
        "Engerwitzdorf",
        "Innsbruck",
        "Steyr",
        "Wolfsthal",
        "Lebing",
        "St. Johann im Pongau",
        "Prebuch",
        "Sierning",
        "Saalfelden",
        "Himberg",
        "Bischofshofen",
        "Gaflenz",
        "Kobenz",
        "Matrei in Osttirol",
        "Strasshof an der Nordbahn",
        "Traisen",
        "Pottenstein",
        "Schardenberg",
        "Eberschwang",
        "Bad Goisern",
        "Wien",
        "Buch in Tirol",
        "Zarnsdorf",
        "Wien",
        "Fischlham",
        "Langenzersdorf",
        "Schärding",
        "Julbach",
        "Wien",
        "Oberpullendorf",
        "Fürstenfeld",
        "Oeynhausen",
        "Wien",
        "St. Pölten",
        "Fürnitz",
        "Obertilliach",
        "Mondsee",
        "Krems an der Donau",
        "Wien",
        "Lofer",
        "Prambachkirchen",
        "Enzenkirchen",
        "Ternitz",
        "Wels",
        "St. Walburg (Südtirol)",
        "Salzburg",
        "Grünbach",
        "Dornbirn",
        "Innsbruck",
        "Gmunden",
        "Enns",
        "Klagenfurt",
        "Traun",
        "Rottenmann",
        "Bregenz",
        "Traun",
        "Judenburg",
        "Leutasch",
        "Leondorf",
        "Klosterneuburg",
        "Pyhra",
        "Linz",
        "Wien",
        "Allensteig",
        "Bach",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Wien",
        "Rankweil",
        "Hochfilzen",
        "St. Peter-Freienstein",
        "Guntramsdorf",
        "Linz",
        "Burgau",
        "Wien",
        "Probstdorf",
        "Wien",
        "Deutsch Schützen",
        "St. Oswald bei Plankenwarth",
        "Edelsbach bei Feldbach",
        "Triers",
        "Wien",
        "Lienz",
        "Altlengbach",
        "Birkfeld",
        "Eggersdorf",
        "Bruck an der Mur",
        "Wien",
        "Krems an der Donau",
        "Gföhl",
        "Oeynhausen",
        "Pasching",
        "Wolfsegg",
        "Dorfstetten",
        "Haid",
        "Schwechat",
        "Bergland",
        "Wels",
        "Tux",
        "Feldkirch",
        "Klagenfurt",
        "Hermagor",
        "Mattsee",
        "Krumbach",
        "Ternitz",
        "Wiener Neustadt",
        "Pöchlarn",
        "Puchberg am Schneeberg",
        "Prellenkirchen",
        "Dobermannsdorf",
        "Mistelbach",
        "St. Veit an der Gölsen",
        "Wolfpassing",
        "Kilb",
        "Lustenau",
        "Lochau",
        "Bruck",
        "Pürbach",
        "Bludenz",
        "Itter",
        "Wien",
        "Uderns",
        "Niedernfritz",
        "Großengersdorf",
        "Seitenstetten",
        "Bludesch",
        "Villach",
        "Wien",
        "Baden",
        "Brunn am Gebirge",
        "Lendorf",
        "Bürmoos",
        "Gresten",
        "Eberndorf",
        "Kalwang",
        "Wien",
        "Neumarkt im Hausruckkreis",
        "Traun",
        "Wien",
        "Bad Aussee",
        "Palting",
        "Unterwart",
        "Gallbrunn",
        "Windigstein",
        "Saalfelden",
        "Leutschach a.d. Weinstraße",
        "Purkersdorf",
        "Gattendorf",
        "Klosterneuburg",
        "dornbirn",
        "Waltersdorf/March",
        "Wien",
        "Haag",
        "Graz-Wetzelsdorf",
        "Inzersdorf",
        "Ragnitz",
        "Himmerlberg",
        "Wien",
        "St. Valentin",
        "Amstetten",
        "Wien",
        "Rannersdorf",
        "Seitenstetten",
        "Kötschach-Mauthen",
        "Niedersill",
        "Sierndorf",
        "Gleinstätten",
        "Wien",
        "Perwang",
        "Weißenkirchen in der Wachau",
        "Weiz",
        "Bischofshofen",
        "Villach",
        "Wien",
        "Dornbirn",
        "Obersiebenbrunn",
        "Zöblen",
        "St. Martin an der Raab",
        "St. Primus",
        "St. Roman",
        "Schildorn",
        "Hallein",
        "Draßmarkt",
        "Ferndorf",
        "Gols",
        "Ternitz",
        "Grosshofen",
        "Wiener Neustadt",
        "Schwechat/Rannersdorf",
        "Feldkirch",
        "Aigen im Ennstal",
        "St. Johann am Walde",
        "Ried am Riederberg",
        "Ratten",
        "Schwanberg",
        "Wien",
        "Königsbrunn",
        "Klagenfurt",
        "Lilienfeld",
        "Salzburg",
        "Rum",
        "Altlengbach",
        "Schwardorf",
        "Thomasberg",
        "Bruck an der Leitha",
        "Frauenkirchen",
        "St. Pölten",
        "Kuchl",
        "Gloggnitz",
        "Wolfsthal",
        "Elsbethen-Glasenbach",
        "Gleisdorf",
        "Gänserndorf",
        "Zissersdorf",
        "Lauterach",
        "Atzenbrugg",
        "Klagenfurt",
        "Wien",
        "Amstetten",
        "Neusäss",
        "Asparn an der Zaya",
        "Wagrain",
        "Wörschach",
        "Scheibbs",
        "Offenhausen",
        "Vorchdorf",
        "Himmberg",
        "Brunnenthal",
        "Wien",
        "Voitschlag",
        "Pasching",
        "Traismauer",
        "Berg",
        "Esternberg",
        "Straßwalchen",
        "St. Johann im Pongau",
        "Wien",
        "Ober-Grafendorf",
        "Neunkirchen",
        "Wolfsberg",
        "Wien",
        "Bad Großpertholz",
        "Großpesendorf",
        "Wien",
        "St. Andrä im Lavanttal",
        "Güssing",
        "Innermanzing",
        "St. Gertraud",
        "Wolfsberg",
        "Wien",
        "Steyregg",
        "Raasdorf",
        "Graz-Neuhart",
        "St. Stefan",
        "Salzburg",
        "Linz",
        "Brunn am Gebirge",
        "Frauenhofen",
        "St. Margarethen an der Raab",
        "Kematen am Innbach",
        "Suben",
        "Asten",
        "Graz",
        "Rannesdorf",
        "Wien",
        "Schlins",
        "Wien",
        "Feistritz",
        "Schwadorf",
        "Dobl",
        "Völs",
        "Peuerbach",
        "Weiz",
        "Vahrn",
        "St. Veit an der Glan",
        "Sattledt",
        "Trofaiach",
        "Mürzhofen",
        "Kochholz",
        "Oeynhausen",
        "Wien",
        "St. Andrä",
        "Wien",
        "Feldkirch",
        "Klosterneuburg",
        "St. Georgen bei Salzburg",
        "Neuhofen an der Krems",
        "Steyr",
        "Klausen-Leopoldsdorf",
        "Hallein",
        "Obdach",
        "Mils",
        "Markt Piesting",
        "Wien",
        "Matzendorf",
        "Sollenau",
        "St. Peter am Kammersberg",
        "Altenhofen",
        "Marz",
        "Kuffern",
        "St. Michael im Lungau",
        "Arriach",
        "Wien",
        "Oberwang",
        "Wien",
        "Breitenfurt bei Wien",
        "Neunkirchen",
        "Wien",
        "Wien",
        "Wies",
        "Rußbach am Paß Gschütt",
        "Langen",
        "St. Georgen bei Salzburg",
        "Wien",
        "Ebreichsdorf",
        "Gössendorf",
        "Leoben",
        "Wien",
        "Andrichsfurt",
        "Krems an der Donau",
        "Maria Saal",
        "Rum",
        "Grafendorf bei Hartberg",
        "Wien",
        "Dorfgastein",
        "Zgornja Kungota",
        "Wang",
        "Weiz",
        "Oslip",
        "Wien",
        "Wien",
        "Großweißenbach",
        "Pöllau",
        "Marz",
        "Wien",
        "St. Margarethen im Burgenland",
        "Straß im Straßertale",
        "Leibnitz",
        "Innerschwand",
        "Bad Vöslau",
        "Wien",
        "Guntramsdorf",
        "Kernhof",
        "Lohnsburg",
        "Großkrut",
        "Rottenbach",
        "Salzburg",
        "Elbigenalp",
        "Loimersdorf",
        "Klagenfurt",
        "Wien",
        "Moosdorf",
        "Rastenfeld",
        "Wien",
        "Wilhekmsburg",
        "Gänserndorf",
        "Großstübing",
        "Jenig",
        "Spittal an der Drau",
        "Krems an der Donau",
        "Kaprun",
        "Gramatneusiedl",
        "Pöttelsdorf",
        "Langenlois",
        "Schwechat",
        "Wien",
        "Wolfsberg",
        "Elixhausen",
        "Gerasdorf",
        "Ebensee",
        "Moosbach",
        "Hartberg",
        "Oberalm",
        "Wien",
        "Wien",
        "Leonding",
        "Pyhra",
        "Gaweinstal",
        "Wien",
        "Straßwalchen",
        "Brückl",
        "Salzburg",
        "Bergheim",
        "Wien",
        "Kainach bei Voitsberg",
        "Wels",
        "Lanzenkirchen",
        "Groß-Enzersdorf",
        "Aurolzmünster",
        "Filzmoos",
        "Gunskirchen",
        "Graz",
        "Neudörfl",
        "Feldkirchen in Kärnten",
        "Rohrbach",
        "Achenkirch",
        "Brunn am Gebirge",
        "Freilassing",
        "Niederleis",
        "Feuersbrunn/Wagram",
        "Gallspach",
        "Moosburg",
        "Tragwein",
        "Wien",
        "Brodingberg bei Graz",
        "Villach",
        "Groß-Enzersdorf",
        "Völkermarkt",
        "Innsbruck",
        "Villach",
        "Neuzug",
        "Lenzing",
        "Kirchschlag in der Buckligen W",
        "Biberbach",
        "Göttlesbrunn",
        "Gnas",
        "Oberndorf an der Melk",
        "Wien",
        "Kainbach b. Graz",
        "Hagenbrunn",
        "Altenhof am Hausruck",
        "Rettenegg",
        "Hartberg",
        "Neu Feffernitz",
        "Innsbruck",
        "Ilz",
        "Mehrnbach",
        "Mödling",
        "Ruden",
        "Viehofen",
        "St. Michael im Lungau",
        "Asperhofen",
        "Wolfsberg",
        "Wien",
        "Enzesfeld-Lindabrunn",
        "Flachau",
        "Groß Enzersdorf",
        "Wien",
        "Leogang",
        "St. Stefan ob Stainz",
        "Klagenfurt am Wörthersee",
        "Fürstenfeld",
        "Arstetten",
        "Wien",
        "Traismauer",
        "Hallein",
        "Hagenbrunn",
        "Lamprechtshausen",
        "Klagenfurt",
        "Dornbirn",
        "Salzburg",
        "Großweikersdorf",
        "Krumpendorf",
        "Aich-Assach",
        "Kindberg-Aumühl",
        "Waidhofen an der Thaya",
        "Saalfelden",
        "Grafenschachen",
        "Freistadt",
        "Riegersburg",
        "Horn-Frauenhofen",
        "Freistadt",
        "Graz",
        "Oberwart",
        "Loipersbach",
        "St. Michael im Lungau",
        "Wien",
        "Arnoldstein",
        "Schwanenstadt",
        "Dornbirn",
        "Enzenreith",
        "'Wildschönau",
        "Wals",
        "Lichtenwörth-Nadelburg",
        "Markersdorf",
        "Wilhelmsburg",
        "Völkermarkt",
        "Bludesch",
        "Friedberg",
        "Naarn im Marchland",
        "Radstadt",
        "Gresten",
        "Vasoldsberg",
        "St.Pölten",
        "Kapfenberg",
        "Gablitz",
        "Bad Aussee",
        "Wals",
        "Studenzen",
        "Studenzen",
        "Längenfeld",
        "Ramsau",
        "Gramastetten",
        "Miklauzhof",
        "Wien",
        "Wien",
        "Wien",
        "Fels am Wagram",
        "Suben",
        "Kilb",
        "Eisenstadt",
        "Tumeltsham",
        "Brixlegg",
        "Attersee",
        "Straßwalchen",
        "Kössen",
        "Spielfeld",
        "Spielberg",
        "Prottes",
        "Stainztal",
        "Innsbruck",
        "Arriach",
        "Gleisdorf"


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
