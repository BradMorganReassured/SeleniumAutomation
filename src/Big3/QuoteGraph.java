package Big3;

public class QuoteGraph{

    public static String[][] SingleLifeSumAssured = new String[][]{
           /* {"Single","19/10/1968","NonSmoker","10000","10","£8.17","100", "SLSA1"},
            {"Single","19/10/1999","Smoker","49000","5","£8.05","100", "SLSA2"},
            {"Single","29/02/1996","Smoker","90000","15","£15.98","100", "SLSA3"},
            {"Single","01/01/1990","NonSmoker","89000","10","£10.99","0", "SLSA4"},
            {"Single","31/12/1990","NonSmoker","75000","11","£13.82","100", "SLSA5"},
            {"Single","12/07/1988","Smoker","75000","12","£18.28","100", "SLSA6"},
            {"Single","13/07/1988","Smoker","75000","12","£17.38","100", "SLSA7"},
            {"Single","11/07/1988","Smoker","75000","12","£18.28","100", "SLSA8"},
            {"Single","19/10/1991","NonSmoker","47000","30","£10.46","99", "SLSA9"},
            {"Single","19/10/1988","NonSmoker","89768","30","£22.76","100", "SLSA10"},
            {"Single","19/10/1991","Smoker","100000","10","£18.44","100", "SLSA11"},
            {"Single","19/10/1983","NonSmoker","50000","10","£12.88","100", "SLSA12"},
            {"Single","19/10/1988","Smoker","49000","10","£11.40","100", "SLSA13"},
            {"Single","10/11/1990","NonSmoker","100000","10","£16.73","99", "SLSA14"},
            {"Single","09/09/1969","NonSmoker","13000","9","£10.54","100", "SLSA15"},
            {"Single","09/09/1969","NonSmoker","13000","9","£10.54","100", "SLSA16"},
            {"Single","09/09/1969","NonSmoker","13000","9","£9.34","100", "SLSA17"} */


           // {"Single",	"26/06/1958",	"NonSmoker", 		 "10000",		"10",			"£17.59",	"100", "SLP1"},   //NEED TO RUN THIS STILL!!!!
            {"Single",	"26/06/2000",	"Smoker", 			 "49000",		"5",			"£8.05",	"100", "SLP2"},
            {"Single",	"29/02/1996",	"Smoker",            "90000",	    "15",		    "£16.57",	"100", "SLP3"}, //Smoker_Infrequent (Changed to Yes)
            {"Single",	"01/01/1990",	"NonSmoker", 		 "89000",		"10",			"£11.50",	"0", "SLP7"},
            {"Single",	"31/12/1990",	"NonSmoker", 		 "75000",		"11",			"£14.43",	"100", "SLP8"},
            {"Single",	"20/03/1989",	"Smoker", 		   	 "75000",		"12",			"£18.28",	"100", "SLP9"},
            {"Single",	"21/03/1989",	"Smoker", 			 "75000",		"12",			"£17.38",	"100", "SLP10"},
            {"Single",	"19/03/1989",	"Smoker", 			 "75000",		"12",			"£18.28",	"100", "SLP11"},
            {"Single",	"26/06/1992",	"NonSmoker", 		 "47000",		"40",			"£13.70",	"99", "SLP12"},
            {"Single",	"26/06/1994",	"NonSmoker", 		 "10000",		"1",			"£1.60",	"90", "SLP13"},
            {"Single",	"26/06/1988",	"NonSmoker", 		 "89768",		"40",			"£31.38",	"100", "SLP14"},
            {"Single",	"26/06/1992",	"Smoker	", 			 "100000",		"10",			"£18.44",	"100", "SLP18"},
            {"Single",	"26/06/1984",	"NonSmoker", 		 "50000",		"10",			"£12.88",	"100", "SLP20"},
            {"Single",	"26/06/1989",	"Smoker",            "49000",		"10",			"£11.40",	"100", "SLP21"}, // Smoker_Infrequent (Changed to Yes)
            {"Single",	"18/07/1991",	"NonSmoker", 	     "100000",		"10",			"£16.73",	"99", "SLP22"},
            {"Single",	"18/05/1970",	"NonSmoker", 		 "13000",		"9",			"£10.54",	"100", "SLP31"},
            {"Single",	"18/05/1970",	"NonSmoker", 		 "13000",		"9",			"£10.54",	"100", "SLP32"},
            {"Single",	"18/05/1970",	"NonSmoker", 		 "13000",		"9",			"£9.34",	"100", "SLP33"}
            // {"Single",	"26/06/1992",	"NonSmoker", 		 "100000",		"20/03/2028",	"£15.83",	"100", "SLP16"},  //Risk Expiry Date
            // {"Single",	"26/06/1982",	"NonSmoker", 		 "18000",		"29/02/2032",	"£5.51",	"100", "SLP17"},  //Risk Expiry Date

    };

    public static String[][] JointLifeSumAssured = new String[][]{
          /*  {"Joint","19/10/1968","NonSmoker","19/10/1968","NonSmoker","10000","10","£15.54","100","JLSA1"},
            {"Joint","19/10/1999","Smoker","19/10/1999","NonSmoker","45678","15","£11.14","80","JLSA2"},
            {"Joint","19/10/1999","Smoker","19/10/1968","Smoker","33000","10","£35.01","50","JLSA3"},
            {"Joint","29/10/1985","Smoker","29/10/1985","Smoker","1000","10","£0.46","100","JLSA8"},
            {"Joint","19/10/1991","NonSmoker","19/10/1968","NonSmoker","99000","5","£76.98","100","JLSA4"},
            {"Joint","19/03/1992","NonSmoker","19/10/1968","NonSmoker","67777","9","£60.20","100","JLSA5"},
            {"Joint","19/05/1969","Smoker","19/05/1969","NonSmoker","100000","10","£173.60","100","JLSA6"},
            {"Joint","20/10/1991","Smoker","20/10/1991","Smoker","99999","5","£28.90","100","JLSA7"} */

            //{"Joint",	"26/06/1958", 	"NonSmoker",			"26/06/1958",	"NonSmoker",	"10,000",	"10",	"£31.90",	 "100", "JLSA4"},
            {"Joint",	"26/06/2000", 	"Smoker",				"26/06/2000",	"NonSmoker",	"45,678",	"15",	"£11.14",	 "80",  "JLSA5"},
            //{"Joint",	"26/06/2000", 	"Smoker",				"26/06/1958",	"Smoker",		"33,000",	"10",	"£83.87",	 "50",  "JLSA6"},
            {"Joint",	"06/07/1986", 	"Smoker",				"06/07/1986",	"Smoker",       "1,000",	"10",	"£0.46",	 "100", "JLSA19"}, //Smoker_infrequent
           // {"Joint",	"26/06/1992", 	"NonSmoker",			"26/06/1958",	"NonSmoker",	"99,000",	"5",	"£138.02",	 "100", "JLSA23"},
            //{"Joint",	"26/11/1992", 	"NonSmoker",			"26/06/1958",	"NonSmoker",	"67,777",	"9",	"£111.75",	 "100", "JLSA26"},
            {"Joint",	"27/01/1970", 	"Smoker",	            "27/01/1970",	"NonSmoker",	"100,000",	"10",	"£165.79",	 "100", "JLSA27"}, //Smoker_Infrequent
            {"Joint",	"27/06/1992", 	"Smoker",	            "27/06/1992",	"Smoker",       "99,999",	"5",	"£28.90",	 "100", "JLSA29"} //Smoker_Infrequent
    };

    public static String[][] SingleLifeQuoteByPremium = new String[][]{
           /* {"Single", "31/10/1999", "NonSmoker", "£9.57", "1", "£72,277.00", "100", "SLP1"},
            {"Single", "17/11/1981", "NonSmoker", "£10.10", "10", "£35,488", "100", "SLP2"} */
            {"Single",	"08/07/2000",   "NonSmoker", 	"£9.57",	"1",    "£72,195.00", "100", "SLP15"},
            {"Single",	"26/07/1982",	"NonSmoker", 	"£10.10",	"10",	"£35,488",	  "100", "SLP30"}
    };

    public static String[][] JointLifeQuoteByPremium = new String[][]{
           /* {"Joint", "10/08/1977", "NonSmoker", "19/10/1999", "Smoker", "£4.00", "6", "£9275", "100", "JLP1"},
            {"Joint", "19/12/1971", "NonSmoker", "19/08/1977", "Smoker", "£77.00", "7", "£88461", "100", "JLP1"},
            {"Joint", "19/10/1977", "Smoker", "19/10/1977", "Smoker", "£9.98", "11", "£11921", "100", "JLP1"} */

            {"Joint",	"26/04/1978", 	"NonSmoker",	"26/06/2000",	"Smoker", "£4.00",	"6",	"£9,265",	 "100", "JLP24"},   //Smoker_Infrequent
            {"Joint",	"27/08/1972", 	"Smoker",		"26/04/1978",	"Smoker", "£77.00",	"7",	"£83,214",	 "100", "JLP25"},
            {"Joint",	"26/06/1978", 	"Smoker",		"26/06/1978",	"Smoker", "£9.98",	"11",	"£11,914",	 "100", "JLP28"}, //Smoker_Infrequent
    };

}