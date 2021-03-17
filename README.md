# productDisplay
This project will display list of projects in different currencies.

Request and Response for getting the products -
Request - http://localhost:8080/products
Response -
[
    {
        "productId": 1,
        "productName": "Product1",
        "productDescription": "This is Product1",
        "price": {
            "amount": 100,
            "currency": "EUR"
        },
        "pricesInOtherCurrencies": null
    },
    {
        "productId": 2,
        "productName": "Product2",
        "productDescription": "This is Product2",
        "price": {
            "amount": 200,
            "currency": "EUR"
        },
        "pricesInOtherCurrencies": null
    },
    {
        "productId": 3,
        "productName": "Product3",
        "productDescription": "This is Product3",
        "price": {
            "amount": 300,
            "currency": "EUR"
        },
        "pricesInOtherCurrencies": null
    }
]


Request and Response for getting the products with all the currencies -
Request - http://localhost:8080/productsWithAllCurrencies
Response -
[
    {
        "productId": 1,
        "productName": "Product1",
        "productDescription": "This is Product1",
        "price": {
            "amount": 100,
            "currency": "EUR"
        },
        "pricesInOtherCurrencies": [
            {
                "amount": 243.1043,
                "currency": "FJD"
            },
            {
                "amount": 2452.9666,
                "currency": "MXN"
            },
            {
                "amount": 2452300.2693,
                "currency": "STD"
            },
            {
                "amount": 71.994,
                "currency": "LVL"
            },
            {
                "amount": 2523.6757,
                "currency": "SCR"
            },
            {
                "amount": 236849.8182,
                "currency": "CDF"
            },
            {
                "amount": 240.3214,
                "currency": "BBD"
            },
            {
                "amount": 919.4622,
                "currency": "GTQ"
            },
            {
                "amount": 86622.8051,
                "currency": "CLP"
            },
            {
                "amount": 2889.7843,
                "currency": "HNL"
            },
            {
                "amount": 436222.6475,
                "currency": "UGX"
            },
            {
                "amount": 1771.1424,
                "currency": "ZAR"
            },
            {
                "amount": 328.0202,
                "currency": "TND"
            },
            {
                "amount": 119.02,
                "currency": "CUC"
            },
            {
                "amount": 119.025,
                "currency": "BSD"
            },
            {
                "amount": 1211623.4698,
                "currency": "SLL"
            },
            {
                "amount": 45227.613,
                "currency": "SDG"
            },
            {
                "amount": 174066.7345,
                "currency": "IQD"
            },
            {
                "amount": 3154.0297,
                "currency": "CUP"
            },
            {
                "amount": 6104.5241,
                "currency": "GMD"
            },
            {
                "amount": 3355.3279,
                "currency": "TWD"
            },
            {
                "amount": 11714.2992,
                "currency": "RSD"
            },
            {
                "amount": 6821.0677,
                "currency": "DOP"
            },
            {
                "amount": 49232.6675,
                "currency": "KMF"
            },
            {
                "amount": 489.6483,
                "currency": "MYR"
            },
            {
                "amount": 85.6209,
                "currency": "FKP"
            },
            {
                "amount": 65401.729,
                "currency": "XOF"
            },
            {
                "amount": 396.3625,
                "currency": "GEL"
            },
            {
                "amount": 0.0021153837,
                "currency": "BTC"
            },
            {
                "amount": 5302.4743,
                "currency": "UYU"
            },
            {
                "amount": 1071.5401,
                "currency": "MAD"
            },
            {
                "amount": 11056.9678,
                "currency": "CVE"
            },
            {
                "amount": 269.8658,
                "currency": "TOP"
            },
            {
                "amount": 203.2313,
                "currency": "AZN"
            },
            {
                "amount": 45.8223,
                "currency": "OMR"
            },
            {
                "amount": 420.7355,
                "currency": "PGK"
            },
            {
                "amount": 13056.2942,
                "currency": "KES"
            },
            {
                "amount": 1011.7814,
                "currency": "SEK"
            },
            {
                "amount": 8636.4487,
                "currency": "BTN"
            },
            {
                "amount": 3295.8048,
                "currency": "UAH"
            },
            {
                "amount": 1193532.4366,
                "currency": "GNF"
            },
            {
                "amount": 1785.3275,
                "currency": "ERN"
            },
            {
                "amount": 8734.2779,
                "currency": "MZN"
            },
            {
                "amount": 1041.5059,
                "currency": "SVC"
            },
            {
                "amount": 10847.1847,
                "currency": "ARS"
            },
            {
                "amount": 433.3528,
                "currency": "QAR"
            },
            {
                "amount": 5011336.7077,
                "currency": "IRR"
            },
            {
                "amount": 42490.1157,
                "currency": "MRO"
            },
            {
                "amount": 774.3327,
                "currency": "CNY"
            },
            {
                "amount": 3660.3438,
                "currency": "THB"
            },
            {
                "amount": 1253994.5814,
                "currency": "UZS"
            },
            {
                "amount": 11972.9163,
                "currency": "XPF"
            },
            {
                "amount": 10092.6341,
                "currency": "BDT"
            },
            {
                "amount": 535.8981,
                "currency": "LYD"
            },
            {
                "amount": 119.02,
                "currency": "BMD"
            },
            {
                "amount": 35.9298,
                "currency": "KWD"
            },
            {
                "amount": 5819.7795,
                "currency": "PHP"
            },
            {
                "amount": 8676.4145,
                "currency": "RUB"
            },
            {
                "amount": 788063.4648,
                "currency": "PYG"
            },
            {
                "amount": 15159.5453,
                "currency": "ISK"
            },
            {
                "amount": 17421.8532,
                "currency": "JMD"
            },
            {
                "amount": 423651.6523,
                "currency": "COP"
            },
            {
                "amount": 6161.603,
                "currency": "MKD"
            },
            {
                "amount": 119.02,
                "currency": "USD"
            },
            {
                "amount": 15876.0308,
                "currency": "DZD"
            },
            {
                "amount": 119.025,
                "currency": "PAB"
            },
            {
                "amount": 85.6209,
                "currency": "GGP"
            },
            {
                "amount": 160.1059,
                "currency": "SGD"
            },
            {
                "amount": 4790.5396,
                "currency": "ETB"
            },
            {
                "amount": 85.6209,
                "currency": "JEP"
            },
            {
                "amount": 10090.7477,
                "currency": "KGS"
            },
            {
                "amount": 69507.6879,
                "currency": "SOS"
            },
            {
                "amount": 1188.7124,
                "currency": "VEF"
            },
            {
                "amount": 12923.461,
                "currency": "VUV"
            },
            {
                "amount": 1117002.5868,
                "currency": "LAK"
            },
            {
                "amount": 160.11,
                "currency": "BND"
            },
            {
                "amount": 1071322.941,
                "currency": "ZMK"
            },
            {
                "amount": 65351.3541,
                "currency": "XAF"
            },
            {
                "amount": 20649.0287,
                "currency": "LRD"
            },
            {
                "amount": 4.5916,
                "currency": "XAG"
            },
            {
                "amount": 110.0822,
                "currency": "CHF"
            },
            {
                "amount": 757.8473,
                "currency": "HRK"
            },
            {
                "amount": 12288.867,
                "currency": "ALL"
            },
            {
                "amount": 21152.2411,
                "currency": "DJF"
            },
            {
                "amount": 2623.0147,
                "currency": "ZMW"
            },
            {
                "amount": 276007.3225,
                "currency": "TZS"
            },
            {
                "amount": 2747338.4155,
                "currency": "VND"
            },
            {
                "amount": 0.0687,
                "currency": "XAU"
            },
            {
                "amount": 153.6727,
                "currency": "AUD"
            },
            {
                "amount": 392.2815,
                "currency": "ILS"
            },
            {
                "amount": 683.2291,
                "currency": "GHS"
            },
            {
                "amount": 24901.8929,
                "currency": "GYD"
            },
            {
                "amount": 107114.4236,
                "currency": "KPW"
            },
            {
                "amount": 821.8571,
                "currency": "BOB"
            },
            {
                "amount": 482745.07,
                "currency": "KHR"
            },
            {
                "amount": 2096.5089,
                "currency": "MDL"
            },
            {
                "amount": 1717934.5271,
                "currency": "IDR"
            },
            {
                "amount": 99.1891,
                "currency": "KYD"
            },
            {
                "amount": 62805.6376,
                "currency": "AMD"
            },
            {
                "amount": 1307.9596,
                "currency": "BWP"
            },
            {
                "amount": 85.6209,
                "currency": "SHP"
            },
            {
                "amount": 891.8524,
                "currency": "TRY"
            },
            {
                "amount": 181531.3491,
                "currency": "LBP"
            },
            {
                "amount": 1356.2903,
                "currency": "TJS"
            },
            {
                "amount": 84.3847,
                "currency": "JOD"
            },
            {
                "amount": 437.1845,
                "currency": "AED"
            },
            {
                "amount": 924.2676,
                "currency": "HKD"
            },
            {
                "amount": 116639.5896,
                "currency": "RWF"
            },
            {
                "amount": 100,
                "currency": "EUR"
            },
            {
                "amount": 1765.0397,
                "currency": "LSL"
            },
            {
                "amount": 743.5892,
                "currency": "DKK"
            },
            {
                "amount": 148.0829,
                "currency": "CAD"
            },
            {
                "amount": 195.5671,
                "currency": "BGN"
            },
            {
                "amount": 167823.8339,
                "currency": "MMK"
            },
            {
                "amount": 4791.1405,
                "currency": "MUR"
            },
            {
                "amount": 1009.1116,
                "currency": "NOK"
            },
            {
                "amount": 61030.5605,
                "currency": "SYP"
            },
            {
                "amount": 85.6209,
                "currency": "IMP"
            },
            {
                "amount": 38324.476,
                "currency": "ZWL"
            },
            {
                "amount": 85.6209,
                "currency": "GIP"
            },
            {
                "amount": 488.5411,
                "currency": "RON"
            },
            {
                "amount": 23656.0212,
                "currency": "LKR"
            },
            {
                "amount": 45227.5911,
                "currency": "NGN"
            },
            {
                "amount": 72737.0394,
                "currency": "CRC"
            },
            {
                "amount": 2613.7739,
                "currency": "CZK"
            },
            {
                "amount": 18650.3166,
                "currency": "PKR"
            },
            {
                "amount": 321.6575,
                "currency": "XCD"
            },
            {
                "amount": 213.6512,
                "currency": "ANG"
            },
            {
                "amount": 9270.6375,
                "currency": "HTG"
            },
            {
                "amount": 44.8725,
                "currency": "BHD"
            },
            {
                "amount": 49865.9723,
                "currency": "KZT"
            },
            {
                "amount": 1684.6113,
                "currency": "SRD"
            },
            {
                "amount": 1765.0314,
                "currency": "SZL"
            },
            {
                "amount": 351.4351,
                "currency": "LTL"
            },
            {
                "amount": 446.3675,
                "currency": "SAR"
            },
            {
                "amount": 808.6764,
                "currency": "TTD"
            },
            {
                "amount": 29796.6347,
                "currency": "YER"
            },
            {
                "amount": 1838.8469,
                "currency": "MVR"
            },
            {
                "amount": 9206.2164,
                "currency": "AFN"
            },
            {
                "amount": 8630.8357,
                "currency": "INR"
            },
            {
                "amount": 214.236,
                "currency": "AWG"
            },
            {
                "amount": 134584.1938,
                "currency": "KRW"
            },
            {
                "amount": 13818.3338,
                "currency": "NPR"
            },
            {
                "amount": 12976.8674,
                "currency": "JPY"
            },
            {
                "amount": 339356.3611,
                "currency": "MNT"
            },
            {
                "amount": 73830.5058,
                "currency": "AOA"
            },
            {
                "amount": 459.5213,
                "currency": "PLN"
            },
            {
                "amount": 85.6242,
                "currency": "GBP"
            },
            {
                "amount": 943.343,
                "currency": "SBD"
            },
            {
                "amount": 308.27,
                "currency": "BYN"
            },
            {
                "amount": 36749.8651,
                "currency": "HUF"
            },
            {
                "amount": 2332791.7924,
                "currency": "BYR"
            },
            {
                "amount": 233636.2392,
                "currency": "BIF"
            },
            {
                "amount": 93430.7238,
                "currency": "MWK"
            },
            {
                "amount": 449300.482,
                "currency": "MGA"
            },
            {
                "amount": 83.3185,
                "currency": "XDR"
            },
            {
                "amount": 239.915,
                "currency": "BZD"
            },
            {
                "amount": 194.8561,
                "currency": "BAM"
            },
            {
                "amount": 1867.6264,
                "currency": "EGP"
            },
            {
                "amount": 952.1201,
                "currency": "MOP"
            },
            {
                "amount": 1765.1017,
                "currency": "NAD"
            },
            {
                "amount": 4177.1638,
                "currency": "NIO"
            },
            {
                "amount": 439.515,
                "currency": "PEN"
            },
            {
                "amount": 165.48,
                "currency": "NZD"
            },
            {
                "amount": 299.2003,
                "currency": "WST"
            },
            {
                "amount": 417.7602,
                "currency": "TMT"
            },
            {
                "amount": 3.1393,
                "currency": "CLF"
            },
            {
                "amount": 669.452,
                "currency": "BRL"
            }
        ]
    },
    {
        "productId": 2,
        "productName": "Product2",
        "productDescription": "This is Product2",
        "price": {
            "amount": 200,
            "currency": "EUR"
        },
        "pricesInOtherCurrencies": [
            {
                "amount": 486.2086,
                "currency": "FJD"
            },
            {
                "amount": 4905.9332,
                "currency": "MXN"
            },
            {
                "amount": 4904600.5386,
                "currency": "STD"
            },
            {
                "amount": 143.988,
                "currency": "LVL"
            },
            {
                "amount": 5047.3514,
                "currency": "SCR"
            },
            {
                "amount": 473699.6364,
                "currency": "CDF"
            },
            {
                "amount": 480.6428,
                "currency": "BBD"
            },
            {
                "amount": 1838.9244,
                "currency": "GTQ"
            },
            {
                "amount": 173245.6102,
                "currency": "CLP"
            },
            {
                "amount": 5779.5686,
                "currency": "HNL"
            },
            {
                "amount": 872445.295,
                "currency": "UGX"
            },
            {
                "amount": 3542.2848,
                "currency": "ZAR"
            },
            {
                "amount": 656.0404,
                "currency": "TND"
            },
            {
                "amount": 238.04,
                "currency": "CUC"
            },
            {
                "amount": 238.05,
                "currency": "BSD"
            },
            {
                "amount": 2423246.9396,
                "currency": "SLL"
            },
            {
                "amount": 90455.226,
                "currency": "SDG"
            },
            {
                "amount": 348133.469,
                "currency": "IQD"
            },
            {
                "amount": 6308.0594,
                "currency": "CUP"
            },
            {
                "amount": 12209.0482,
                "currency": "GMD"
            },
            {
                "amount": 6710.6558,
                "currency": "TWD"
            },
            {
                "amount": 23428.5984,
                "currency": "RSD"
            },
            {
                "amount": 13642.1354,
                "currency": "DOP"
            },
            {
                "amount": 98465.335,
                "currency": "KMF"
            },
            {
                "amount": 979.2966,
                "currency": "MYR"
            },
            {
                "amount": 171.2418,
                "currency": "FKP"
            },
            {
                "amount": 130803.458,
                "currency": "XOF"
            },
            {
                "amount": 792.725,
                "currency": "GEL"
            },
            {
                "amount": 0.0042307674,
                "currency": "BTC"
            },
            {
                "amount": 10604.9486,
                "currency": "UYU"
            },
            {
                "amount": 2143.0802,
                "currency": "MAD"
            },
            {
                "amount": 22113.9356,
                "currency": "CVE"
            },
            {
                "amount": 539.7316,
                "currency": "TOP"
            },
            {
                "amount": 406.4626,
                "currency": "AZN"
            },
            {
                "amount": 91.6446,
                "currency": "OMR"
            },
            {
                "amount": 841.471,
                "currency": "PGK"
            },
            {
                "amount": 26112.5884,
                "currency": "KES"
            },
            {
                "amount": 2023.5628,
                "currency": "SEK"
            },
            {
                "amount": 17272.8974,
                "currency": "BTN"
            },
            {
                "amount": 6591.6096,
                "currency": "UAH"
            },
            {
                "amount": 2387064.8732,
                "currency": "GNF"
            },
            {
                "amount": 3570.655,
                "currency": "ERN"
            },
            {
                "amount": 17468.5558,
                "currency": "MZN"
            },
            {
                "amount": 2083.0118,
                "currency": "SVC"
            },
            {
                "amount": 21694.3694,
                "currency": "ARS"
            },
            {
                "amount": 866.7056,
                "currency": "QAR"
            },
            {
                "amount": 10022673.4154,
                "currency": "IRR"
            },
            {
                "amount": 84980.2314,
                "currency": "MRO"
            },
            {
                "amount": 1548.6654,
                "currency": "CNY"
            },
            {
                "amount": 7320.6876,
                "currency": "THB"
            },
            {
                "amount": 2507989.1628,
                "currency": "UZS"
            },
            {
                "amount": 23945.8326,
                "currency": "XPF"
            },
            {
                "amount": 20185.2682,
                "currency": "BDT"
            },
            {
                "amount": 1071.7962,
                "currency": "LYD"
            },
            {
                "amount": 238.04,
                "currency": "BMD"
            },
            {
                "amount": 71.8596,
                "currency": "KWD"
            },
            {
                "amount": 11639.559,
                "currency": "PHP"
            },
            {
                "amount": 17352.829,
                "currency": "RUB"
            },
            {
                "amount": 1576126.9296,
                "currency": "PYG"
            },
            {
                "amount": 30319.0906,
                "currency": "ISK"
            },
            {
                "amount": 34843.7064,
                "currency": "JMD"
            },
            {
                "amount": 847303.3046,
                "currency": "COP"
            },
            {
                "amount": 12323.206,
                "currency": "MKD"
            },
            {
                "amount": 238.04,
                "currency": "USD"
            },
            {
                "amount": 31752.0616,
                "currency": "DZD"
            },
            {
                "amount": 238.05,
                "currency": "PAB"
            },
            {
                "amount": 171.2418,
                "currency": "GGP"
            },
            {
                "amount": 320.2118,
                "currency": "SGD"
            },
            {
                "amount": 9581.0792,
                "currency": "ETB"
            },
            {
                "amount": 171.2418,
                "currency": "JEP"
            },
            {
                "amount": 20181.4954,
                "currency": "KGS"
            },
            {
                "amount": 139015.3758,
                "currency": "SOS"
            },
            {
                "amount": 2377.4248,
                "currency": "VEF"
            },
            {
                "amount": 25846.922,
                "currency": "VUV"
            },
            {
                "amount": 2234005.1736,
                "currency": "LAK"
            },
            {
                "amount": 320.22,
                "currency": "BND"
            },
            {
                "amount": 2142645.882,
                "currency": "ZMK"
            },
            {
                "amount": 130702.7082,
                "currency": "XAF"
            },
            {
                "amount": 41298.0574,
                "currency": "LRD"
            },
            {
                "amount": 9.1832,
                "currency": "XAG"
            },
            {
                "amount": 220.1644,
                "currency": "CHF"
            },
            {
                "amount": 1515.6946,
                "currency": "HRK"
            },
            {
                "amount": 24577.734,
                "currency": "ALL"
            },
            {
                "amount": 42304.4822,
                "currency": "DJF"
            },
            {
                "amount": 5246.0294,
                "currency": "ZMW"
            },
            {
                "amount": 552014.645,
                "currency": "TZS"
            },
            {
                "amount": 5494676.831,
                "currency": "VND"
            },
            {
                "amount": 0.1374,
                "currency": "XAU"
            },
            {
                "amount": 307.3454,
                "currency": "AUD"
            },
            {
                "amount": 784.563,
                "currency": "ILS"
            },
            {
                "amount": 1366.4582,
                "currency": "GHS"
            },
            {
                "amount": 49803.7858,
                "currency": "GYD"
            },
            {
                "amount": 214228.8472,
                "currency": "KPW"
            },
            {
                "amount": 1643.7142,
                "currency": "BOB"
            },
            {
                "amount": 965490.14,
                "currency": "KHR"
            },
            {
                "amount": 4193.0178,
                "currency": "MDL"
            },
            {
                "amount": 3435869.0542,
                "currency": "IDR"
            },
            {
                "amount": 198.3782,
                "currency": "KYD"
            },
            {
                "amount": 125611.2752,
                "currency": "AMD"
            },
            {
                "amount": 2615.9192,
                "currency": "BWP"
            },
            {
                "amount": 171.2418,
                "currency": "SHP"
            },
            {
                "amount": 1783.7048,
                "currency": "TRY"
            },
            {
                "amount": 363062.6982,
                "currency": "LBP"
            },
            {
                "amount": 2712.5806,
                "currency": "TJS"
            },
            {
                "amount": 168.7694,
                "currency": "JOD"
            },
            {
                "amount": 874.369,
                "currency": "AED"
            },
            {
                "amount": 1848.5352,
                "currency": "HKD"
            },
            {
                "amount": 233279.1792,
                "currency": "RWF"
            },
            {
                "amount": 200,
                "currency": "EUR"
            },
            {
                "amount": 3530.0794,
                "currency": "LSL"
            },
            {
                "amount": 1487.1784,
                "currency": "DKK"
            },
            {
                "amount": 296.1658,
                "currency": "CAD"
            },
            {
                "amount": 391.1342,
                "currency": "BGN"
            },
            {
                "amount": 335647.6678,
                "currency": "MMK"
            },
            {
                "amount": 9582.281,
                "currency": "MUR"
            },
            {
                "amount": 2018.2232,
                "currency": "NOK"
            },
            {
                "amount": 122061.121,
                "currency": "SYP"
            },
            {
                "amount": 171.2418,
                "currency": "IMP"
            },
            {
                "amount": 76648.952,
                "currency": "ZWL"
            },
            {
                "amount": 171.2418,
                "currency": "GIP"
            },
            {
                "amount": 977.0822,
                "currency": "RON"
            },
            {
                "amount": 47312.0424,
                "currency": "LKR"
            },
            {
                "amount": 90455.1822,
                "currency": "NGN"
            },
            {
                "amount": 145474.0788,
                "currency": "CRC"
            },
            {
                "amount": 5227.5478,
                "currency": "CZK"
            },
            {
                "amount": 37300.6332,
                "currency": "PKR"
            },
            {
                "amount": 643.315,
                "currency": "XCD"
            },
            {
                "amount": 427.3024,
                "currency": "ANG"
            },
            {
                "amount": 18541.275,
                "currency": "HTG"
            },
            {
                "amount": 89.745,
                "currency": "BHD"
            },
            {
                "amount": 99731.9446,
                "currency": "KZT"
            },
            {
                "amount": 3369.2226,
                "currency": "SRD"
            },
            {
                "amount": 3530.0628,
                "currency": "SZL"
            },
            {
                "amount": 702.8702,
                "currency": "LTL"
            },
            {
                "amount": 892.735,
                "currency": "SAR"
            },
            {
                "amount": 1617.3528,
                "currency": "TTD"
            },
            {
                "amount": 59593.2694,
                "currency": "YER"
            },
            {
                "amount": 3677.6938,
                "currency": "MVR"
            },
            {
                "amount": 18412.4328,
                "currency": "AFN"
            },
            {
                "amount": 17261.6714,
                "currency": "INR"
            },
            {
                "amount": 428.472,
                "currency": "AWG"
            },
            {
                "amount": 269168.3876,
                "currency": "KRW"
            },
            {
                "amount": 27636.6676,
                "currency": "NPR"
            },
            {
                "amount": 25953.7348,
                "currency": "JPY"
            },
            {
                "amount": 678712.7222,
                "currency": "MNT"
            },
            {
                "amount": 147661.0116,
                "currency": "AOA"
            },
            {
                "amount": 919.0426,
                "currency": "PLN"
            },
            {
                "amount": 171.2484,
                "currency": "GBP"
            },
            {
                "amount": 1886.686,
                "currency": "SBD"
            },
            {
                "amount": 616.54,
                "currency": "BYN"
            },
            {
                "amount": 73499.7302,
                "currency": "HUF"
            },
            {
                "amount": 4665583.5848,
                "currency": "BYR"
            },
            {
                "amount": 467272.4784,
                "currency": "BIF"
            },
            {
                "amount": 186861.4476,
                "currency": "MWK"
            },
            {
                "amount": 898600.964,
                "currency": "MGA"
            },
            {
                "amount": 166.637,
                "currency": "XDR"
            },
            {
                "amount": 479.83,
                "currency": "BZD"
            },
            {
                "amount": 389.7122,
                "currency": "BAM"
            },
            {
                "amount": 3735.2528,
                "currency": "EGP"
            },
            {
                "amount": 1904.2402,
                "currency": "MOP"
            },
            {
                "amount": 3530.2034,
                "currency": "NAD"
            },
            {
                "amount": 8354.3276,
                "currency": "NIO"
            },
            {
                "amount": 879.03,
                "currency": "PEN"
            },
            {
                "amount": 330.96,
                "currency": "NZD"
            },
            {
                "amount": 598.4006,
                "currency": "WST"
            },
            {
                "amount": 835.5204,
                "currency": "TMT"
            },
            {
                "amount": 6.2786,
                "currency": "CLF"
            },
            {
                "amount": 1338.904,
                "currency": "BRL"
            }
        ]
    },
    {
        "productId": 3,
        "productName": "Product3",
        "productDescription": "This is Product3",
        "price": {
            "amount": 300,
            "currency": "EUR"
        },
        "pricesInOtherCurrencies": [
            {
                "amount": 729.3129,
                "currency": "FJD"
            },
            {
                "amount": 7358.8998,
                "currency": "MXN"
            },
            {
                "amount": 7356900.8079,
                "currency": "STD"
            },
            {
                "amount": 215.982,
                "currency": "LVL"
            },
            {
                "amount": 7571.0271,
                "currency": "SCR"
            },
            {
                "amount": 710549.4546,
                "currency": "CDF"
            },
            {
                "amount": 720.9642,
                "currency": "BBD"
            },
            {
                "amount": 2758.3866,
                "currency": "GTQ"
            },
            {
                "amount": 259868.4153,
                "currency": "CLP"
            },
            {
                "amount": 8669.3529,
                "currency": "HNL"
            },
            {
                "amount": 1308667.9425,
                "currency": "UGX"
            },
            {
                "amount": 5313.4272,
                "currency": "ZAR"
            },
            {
                "amount": 984.0606,
                "currency": "TND"
            },
            {
                "amount": 357.06,
                "currency": "CUC"
            },
            {
                "amount": 357.075,
                "currency": "BSD"
            },
            {
                "amount": 3634870.4094,
                "currency": "SLL"
            },
            {
                "amount": 135682.839,
                "currency": "SDG"
            },
            {
                "amount": 522200.2035,
                "currency": "IQD"
            },
            {
                "amount": 9462.0891,
                "currency": "CUP"
            },
            {
                "amount": 18313.5723,
                "currency": "GMD"
            },
            {
                "amount": 10065.9837,
                "currency": "TWD"
            },
            {
                "amount": 35142.8976,
                "currency": "RSD"
            },
            {
                "amount": 20463.2031,
                "currency": "DOP"
            },
            {
                "amount": 147698.0025,
                "currency": "KMF"
            },
            {
                "amount": 1468.9449,
                "currency": "MYR"
            },
            {
                "amount": 256.8627,
                "currency": "FKP"
            },
            {
                "amount": 196205.187,
                "currency": "XOF"
            },
            {
                "amount": 1189.0875,
                "currency": "GEL"
            },
            {
                "amount": 0.0063461511,
                "currency": "BTC"
            },
            {
                "amount": 15907.4229,
                "currency": "UYU"
            },
            {
                "amount": 3214.6203,
                "currency": "MAD"
            },
            {
                "amount": 33170.9034,
                "currency": "CVE"
            },
            {
                "amount": 809.5974,
                "currency": "TOP"
            },
            {
                "amount": 609.6939,
                "currency": "AZN"
            },
            {
                "amount": 137.4669,
                "currency": "OMR"
            },
            {
                "amount": 1262.2065,
                "currency": "PGK"
            },
            {
                "amount": 39168.8826,
                "currency": "KES"
            },
            {
                "amount": 3035.3442,
                "currency": "SEK"
            },
            {
                "amount": 25909.3461,
                "currency": "BTN"
            },
            {
                "amount": 9887.4144,
                "currency": "UAH"
            },
            {
                "amount": 3580597.3098,
                "currency": "GNF"
            },
            {
                "amount": 5355.9825,
                "currency": "ERN"
            },
            {
                "amount": 26202.8337,
                "currency": "MZN"
            },
            {
                "amount": 3124.5177,
                "currency": "SVC"
            },
            {
                "amount": 32541.5541,
                "currency": "ARS"
            },
            {
                "amount": 1300.0584,
                "currency": "QAR"
            },
            {
                "amount": 15034010.1231,
                "currency": "IRR"
            },
            {
                "amount": 127470.3471,
                "currency": "MRO"
            },
            {
                "amount": 2322.9981,
                "currency": "CNY"
            },
            {
                "amount": 10981.0314,
                "currency": "THB"
            },
            {
                "amount": 3761983.7442,
                "currency": "UZS"
            },
            {
                "amount": 35918.7489,
                "currency": "XPF"
            },
            {
                "amount": 30277.9023,
                "currency": "BDT"
            },
            {
                "amount": 1607.6943,
                "currency": "LYD"
            },
            {
                "amount": 357.06,
                "currency": "BMD"
            },
            {
                "amount": 107.7894,
                "currency": "KWD"
            },
            {
                "amount": 17459.3385,
                "currency": "PHP"
            },
            {
                "amount": 26029.2435,
                "currency": "RUB"
            },
            {
                "amount": 2364190.3944,
                "currency": "PYG"
            },
            {
                "amount": 45478.6359,
                "currency": "ISK"
            },
            {
                "amount": 52265.5596,
                "currency": "JMD"
            },
            {
                "amount": 1270954.9569,
                "currency": "COP"
            },
            {
                "amount": 18484.809,
                "currency": "MKD"
            },
            {
                "amount": 357.06,
                "currency": "USD"
            },
            {
                "amount": 47628.0924,
                "currency": "DZD"
            },
            {
                "amount": 357.075,
                "currency": "PAB"
            },
            {
                "amount": 256.8627,
                "currency": "GGP"
            },
            {
                "amount": 480.3177,
                "currency": "SGD"
            },
            {
                "amount": 14371.6188,
                "currency": "ETB"
            },
            {
                "amount": 256.8627,
                "currency": "JEP"
            },
            {
                "amount": 30272.2431,
                "currency": "KGS"
            },
            {
                "amount": 208523.0637,
                "currency": "SOS"
            },
            {
                "amount": 3566.1372,
                "currency": "VEF"
            },
            {
                "amount": 38770.383,
                "currency": "VUV"
            },
            {
                "amount": 3351007.7604,
                "currency": "LAK"
            },
            {
                "amount": 480.33,
                "currency": "BND"
            },
            {
                "amount": 3213968.823,
                "currency": "ZMK"
            },
            {
                "amount": 196054.0623,
                "currency": "XAF"
            },
            {
                "amount": 61947.0861,
                "currency": "LRD"
            },
            {
                "amount": 13.7748,
                "currency": "XAG"
            },
            {
                "amount": 330.2466,
                "currency": "CHF"
            },
            {
                "amount": 2273.5419,
                "currency": "HRK"
            },
            {
                "amount": 36866.601,
                "currency": "ALL"
            },
            {
                "amount": 63456.7233,
                "currency": "DJF"
            },
            {
                "amount": 7869.0441,
                "currency": "ZMW"
            },
            {
                "amount": 828021.9675,
                "currency": "TZS"
            },
            {
                "amount": 8242015.2465,
                "currency": "VND"
            },
            {
                "amount": 0.2061,
                "currency": "XAU"
            },
            {
                "amount": 461.0181,
                "currency": "AUD"
            },
            {
                "amount": 1176.8445,
                "currency": "ILS"
            },
            {
                "amount": 2049.6873,
                "currency": "GHS"
            },
            {
                "amount": 74705.6787,
                "currency": "GYD"
            },
            {
                "amount": 321343.2708,
                "currency": "KPW"
            },
            {
                "amount": 2465.5713,
                "currency": "BOB"
            },
            {
                "amount": 1448235.21,
                "currency": "KHR"
            },
            {
                "amount": 6289.5267,
                "currency": "MDL"
            },
            {
                "amount": 5153803.5813,
                "currency": "IDR"
            },
            {
                "amount": 297.5673,
                "currency": "KYD"
            },
            {
                "amount": 188416.9128,
                "currency": "AMD"
            },
            {
                "amount": 3923.8788,
                "currency": "BWP"
            },
            {
                "amount": 256.8627,
                "currency": "SHP"
            },
            {
                "amount": 2675.5572,
                "currency": "TRY"
            },
            {
                "amount": 544594.0473,
                "currency": "LBP"
            },
            {
                "amount": 4068.8709,
                "currency": "TJS"
            },
            {
                "amount": 253.1541,
                "currency": "JOD"
            },
            {
                "amount": 1311.5535,
                "currency": "AED"
            },
            {
                "amount": 2772.8028,
                "currency": "HKD"
            },
            {
                "amount": 349918.7688,
                "currency": "RWF"
            },
            {
                "amount": 300,
                "currency": "EUR"
            },
            {
                "amount": 5295.1191,
                "currency": "LSL"
            },
            {
                "amount": 2230.7676,
                "currency": "DKK"
            },
            {
                "amount": 444.2487,
                "currency": "CAD"
            },
            {
                "amount": 586.7013,
                "currency": "BGN"
            },
            {
                "amount": 503471.5017,
                "currency": "MMK"
            },
            {
                "amount": 14373.4215,
                "currency": "MUR"
            },
            {
                "amount": 3027.3348,
                "currency": "NOK"
            },
            {
                "amount": 183091.6815,
                "currency": "SYP"
            },
            {
                "amount": 256.8627,
                "currency": "IMP"
            },
            {
                "amount": 114973.428,
                "currency": "ZWL"
            },
            {
                "amount": 256.8627,
                "currency": "GIP"
            },
            {
                "amount": 1465.6233,
                "currency": "RON"
            },
            {
                "amount": 70968.0636,
                "currency": "LKR"
            },
            {
                "amount": 135682.7733,
                "currency": "NGN"
            },
            {
                "amount": 218211.1182,
                "currency": "CRC"
            },
            {
                "amount": 7841.3217,
                "currency": "CZK"
            },
            {
                "amount": 55950.9498,
                "currency": "PKR"
            },
            {
                "amount": 964.9725,
                "currency": "XCD"
            },
            {
                "amount": 640.9536,
                "currency": "ANG"
            },
            {
                "amount": 27811.9125,
                "currency": "HTG"
            },
            {
                "amount": 134.6175,
                "currency": "BHD"
            },
            {
                "amount": 149597.9169,
                "currency": "KZT"
            },
            {
                "amount": 5053.8339,
                "currency": "SRD"
            },
            {
                "amount": 5295.0942,
                "currency": "SZL"
            },
            {
                "amount": 1054.3053,
                "currency": "LTL"
            },
            {
                "amount": 1339.1025,
                "currency": "SAR"
            },
            {
                "amount": 2426.0292,
                "currency": "TTD"
            },
            {
                "amount": 89389.9041,
                "currency": "YER"
            },
            {
                "amount": 5516.5407,
                "currency": "MVR"
            },
            {
                "amount": 27618.6492,
                "currency": "AFN"
            },
            {
                "amount": 25892.5071,
                "currency": "INR"
            },
            {
                "amount": 642.708,
                "currency": "AWG"
            },
            {
                "amount": 403752.5814,
                "currency": "KRW"
            },
            {
                "amount": 41455.0014,
                "currency": "NPR"
            },
            {
                "amount": 38930.6022,
                "currency": "JPY"
            },
            {
                "amount": 1018069.0833,
                "currency": "MNT"
            },
            {
                "amount": 221491.5174,
                "currency": "AOA"
            },
            {
                "amount": 1378.5639,
                "currency": "PLN"
            },
            {
                "amount": 256.8726,
                "currency": "GBP"
            },
            {
                "amount": 2830.029,
                "currency": "SBD"
            },
            {
                "amount": 924.81,
                "currency": "BYN"
            },
            {
                "amount": 110249.5953,
                "currency": "HUF"
            },
            {
                "amount": 6998375.3772,
                "currency": "BYR"
            },
            {
                "amount": 700908.7176,
                "currency": "BIF"
            },
            {
                "amount": 280292.1714,
                "currency": "MWK"
            },
            {
                "amount": 1347901.446,
                "currency": "MGA"
            },
            {
                "amount": 249.9555,
                "currency": "XDR"
            },
            {
                "amount": 719.745,
                "currency": "BZD"
            },
            {
                "amount": 584.5683,
                "currency": "BAM"
            },
            {
                "amount": 5602.8792,
                "currency": "EGP"
            },
            {
                "amount": 2856.3603,
                "currency": "MOP"
            },
            {
                "amount": 5295.3051,
                "currency": "NAD"
            },
            {
                "amount": 12531.4914,
                "currency": "NIO"
            },
            {
                "amount": 1318.545,
                "currency": "PEN"
            },
            {
                "amount": 496.44,
                "currency": "NZD"
            },
            {
                "amount": 897.6009,
                "currency": "WST"
            },
            {
                "amount": 1253.2806,
                "currency": "TMT"
            },
            {
                "amount": 9.4179,
                "currency": "CLF"
            },
            {
                "amount": 2008.356,
                "currency": "BRL"
            }
        ]
    }
]
