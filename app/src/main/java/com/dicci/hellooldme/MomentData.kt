package com.dicci.hellooldme

object MomentData {
    private val momentName = arrayOf("Pantai Watulawang","Pantai Ngrumput","Puncak Mangunan","Kedung Kayang","Pantai Watukodok"
                                    ,"Bukit Bintang","Pantai Jungwok","Puncak Sosok","Pantai Widodaren","Pantai Ayah","Hutan Pinus Mangunan","Keteb Pass"
                                    ,"Puncak Paralayang","Bunker Kaliadem","Gumuk Pasir","Pantai Kuta")
    private val momentDate = arrayOf("6/8/2020","20/1/2020","27/12/2019","25/12/2019","2/12/2019","29/10/2019","6/7/2019","14/10/2018"
                                    ,"22/9/2018","1/7/2018","1/1/2018","24/12/2017","5/7/2017","18/7/2016","28/8/2015","19/8/2015")
    private val momentImages = intArrayOf(R.drawable.watulawang,R.drawable.ngrumput,R.drawable.mangunan,R.drawable.kedung_kayang,
                                        R.drawable.watukodok,R.drawable.bukitbintang,R.drawable.jungwok,R.drawable.sosok,R.drawable.widodaren
                                        ,R.drawable.ayah,R.drawable.pinus,R.drawable.keteb,R.drawable.paralayang,R.drawable.bunker
                                        ,R.drawable.pasir,R.drawable.kute)
    private val momentSource = arrayOf("https://eksotisjogja.com","https://www.yogyes.com","https://teamtouring.net","https://www.nativeindonesia.com"
    ,"https://www.alodiatour.com","https://www.alodiatour.com","https://www.nativeindonesia.com"
    ,"https://travelspromo.com","https://travel.detik.com"
    ,"https://mytrip123.com","https://garasijogja.com/","https://id.wikipedia.org"
    ,"https://garasijogja.com","https://travelingyuk.com"
    ,"https://www.goodnewsfromindonesia.id/","https://balipedia.id")
    private val momentDetail = arrayOf("Pantai Watulawang atau Pantai Goa Watu Lawang terletak di Kecamatan Tepus, Kabupaten Gunungkidul, Daerah Istimewa Yogyakarta. Pantai Watulawang menawarkan sejuta keindahan pemandangannya yang berupa bebatuan karang dengan kolaborasi pasir putihnya. Pantai ini diapit oleh dua pantai yang sudah terkenal lebih dahulu, yaitu di sebelah Barat yakni Pantai Indrayanti dan di sebelah Timur Pantai Pok Tunggal. Anda akan menemukan hamparan pantai berpasir putih di antara bukit karang yang menjulang bagai menemukan sebuah surga tersembunyi. Pantai ini menyajikan pemandangan pantai yang sepi dari pengunjung dengan nuansa yang asri, eksotis, dan alami. Di Pantai Watulawang kita bisa mendapati cekungan-cekungan batu karang yang hanya bisa dijumpai di pantai ini saja, sehingga kita saat bermain air tidak perlu sampai ketengah, cukup memandaatkan cekungan ini. Pantai ini juga bisa digunakan untuk aktivitas camping karena memiliki dataran yang bisa dimanfaatkan untuk mendirikan tenda."
        ,"Pantai Ngrumput mulai dikenal belakangan ini karena keindahan pantainya. Area pantainya yang luas dan lebar membuat pantai ini sering digunakan untuk kegiatan camping. Pasirnya yang putih dan bersih menambah keindahan pantai yang berada di balik perbukitan dan persawahan. Ombak di pantai ini sama seperti ombak-ombak di pantai lainnya, cukup besar tapi masih bisa digunakan untuk bermain air. Di sisi sebelah timur terdapat sebuah bukit bernama Bukit Kosakora yang bisa digunakan untuk melihat pemandangan pantai dan laut selatan Gunungkidul. Dari puncak Bukit Kosakora ini juga bisa digunakan untuk melihat sunset dan sunrise. Pantai Ngrumput diapit oleh dua bukit di sisi sebelah kanan dan kirinya. Di area ini, biasanya pengunjung gunakan untuk bermain air di antara bebatuan yang ada di sana. Pantai Ngrumput berada searah dengan Pantai Drini. Untuk sampai ke pantai ini aksesnya sudah mudah, tetapi kendaraan hanya bisa diparkir di area parkir dan selebihnya berjalan kaki kurang lebih 10-15 menit melewati persawahan dan perbukitan. Meskipun masih terbilang pantai baru, pantai ini sudah memiliki fasilitas yang cukup seperti toilet, tempat makan, musala, dan camping ground."
        ,"Bukit Mangunan berada di dalam kawasan Kebun Buah Mangunan, dusun Mangunan, desa Mangunan, kecamatan Dlingo, kabupaten Bantul, DI Yogyakarta.Puncak Bukit Mangunan merupakan salah satu pilihan utama menikmati matahari terbit atau sunrise dari atas bukit di sekitar wilayah Bantul dan Yogyakarta. Pemandangan yang ditawarkan tempat ini cukup indah dengan latar pemandangan aliran Sungai Oyo yang bekelok-kelok berbentuk huruf “S” dan kabut yang tebal yang membuat suasana seperti diatas awan. Tidak heran bila bukit ini dikenal sebagai negeri diatas awannya Jogja atau Bantul. Perjalanan menuju Puncak Bukit Mangunan Bantul dari pintu masuk Kebun Buah Mangunan sekitar 5 (lima) menit dengan menyusuri jalan sempit yang membelah kawasan kebun buah. Akses jalan cukup lebar dan dapat dilalui kendaraan beroda empat walaupun sedikit sulit bila berpapasan. Kendaraan pengunjung dipersilakan parkir di tempat yang telah disediakan di sekitar area puncak bukit. Hanya berjalan kaki sejauh kurang dari 50 meter, pengunjung sudah tiba di gardu pandang Puncak Bukit Mangunan."
        ,"Air Terjun Kedung Kayang memiliki tinggi sekitar 40 meter dengan volume air yang cukup besar. Objek wisata alam ini berada di ketinggian lebih kurang 1.200 meter di atas permukaan laut. Untuk bisa sampai ke lokasi air terjun pengunjung harus jalan kaki. Keindahan air terjun ini bisa dinikmati dari berbagai sisi. Baik dari atas, samping atau depan. Suasana di lokasi air terjun sendiri tidak terlalu ramai sehingga pengunjung  bisa menikmati kesegaran alam dengan lebih leluasa. Air yang jatuh dari air terjun ini mengalir ke sebuah sungai kecil berbatu. Pengunjung bisa masuk ke kolam, bermain air di bawah guyuran air terjun. Air Terjun Kedung Kayang ini tak pernah surut atau berkurang debitnya, sekalipun di puncak musim kemarau. Salah satu air terjun yang masih cukup asri dan belum terlalu ramai kunjungan ini berada di antara Gunung Merapi dan Merbabu, tepatnya di Dusun Ngagrong, Desa Ketep, Kecamatan Sawangan, Magelang, Jawa Tengah."
        ,"Pantai Watu Kodok merupakan salah satu pantai yang ada di Gunung Kidul. Pantai Watu Kodok ini memiliki pasir putih dan air laut yang masih berwarna biru yang sangat indah. Di pantai ini terdapat beberapa batu karang yang terjal, batu tersebut menjadi daya tarik para wisatawan dan keunikan bagi pantai itu sendiri. Dan suasana pantai yang masih alami juga menjadikan pantai ini menjadi daya tariknya, tetapi pantai ini masih tergolong pantai baru jadi masih belum banyak wisatawan. Pantai Watu Kodok ini sangat cocok bagi Anda yang ingin menghabiskan waktu liburan bersama keluarga. Pantai ini diberi nama dengan Pantai Watu Kodok karena terdapat dua batu karang yang bentuknya menyerupai kodok yang artinya katak. Batu karang itu terletak pada sisi barat dan timur Pantai Watu Kodok. Batu karang yang berbentuk kodok itu yang menjadi ikon dari pantai ini. Pantai ini sangat luas untuk anda bermain pasir putih di pantai dan ombak yang ada di pantai ini juga sama bahayanya dengan pantai lainnya, tetapi masih boleh untuk bermain di pantai ini. Di sepanjang pantai juga nampak banyak tumbuh tumbuhan pohon cemara udang dan pandan laut yang dapat anda gunakan untuk berteduh dan beristirahat."
        ,"Bukit Bintang Jogja ini menawarkan panorama alam yang sungguh luar biasa, karena sesuai dengan namanya ketika anda sedang berada di kawasan ini seolah-olah anda berada di angkasa dimana bisa melihat gemerlapnya bintang bintang  yang sebenarnya adalah lampu-lampu kota yang bila dilihat dari atas akan terlihat seperti bintang-bintang yang bertebaran di angkasa. Lokasi wisata ini sungguh tiada duanya di Kota Jogja, karena Bukit Bintang Jogja mempunyai lokasi yang sangat strategis dimana berada di tepi pegunungan seribu yang menghadap langsung kota Jogja yang ada di sebelah baratnya, selain itu juga kawasan ini apabila diakses dari kota relatif tidak jauh dan tidak membuat anda capek di perjalanan.Bukit yang memiliki nama asli sebagai Bukit Hargo Dumilah ini telah bertranformasi menjadi tempat wisata favorit di kalangan masyarakat selama beberapa tahun belakangan, setelah sebelumnya kurang mendapat perhatian dari masyarakat yang ingin lebih memilih menuju tempat-tempat wisata seperti pantai-pantai yang ada di Gunung Kidul, karena lokasi Bukit Bintang Jogja ini berada di jalur utama wisata di kawasan Yogyakarta. Lambat laun banyak masyarakat yang menepi untuk melihat pemandangan Yogyakarta yang luar biasa dikala sore menjelang malam hari."
    ,"Pantai Jungwok terletak di sisi timur Pantai Wediombo yang (katanya) juga angker. Pantai Jungwok indah dengan pasir putihnya dan air lautnya yang biru. Bukan hanya itu yang menarik dari pantai ini. Pantai ini selain indah juga cukup luas. Mengunjungi pantai ini, dapat menyaksikan indahnya habitat berbagai jenis ikan hias, bintang laut dan berbagai macam rumput laut ini. Pantai berbentuk agak cekung. Ombak pantai, sebagaimana pantai selatan pada umumnya, cukup besar. Sering kali tiba-tiba memecah ketika menghantam karang. Lokasi agak menjorok ke tengah laut, di pantai ini terdapat sebuah batu besar yang disebut watu topi. Watu topi ini ada juga yang menaikinya, sebagai spot memancing ikan. Pada bagian pantai, pengunjung dapat menyaksikan tanaman pandan. Pantai Jungwok cukup sepi, sehingga serasa pantai privat."
    ,"Daya tarik utama yang ditawarkan oleh Puncak Sosok adalah berburu foto. Saat yang tepat untuk mengunjungi objek wisata ini yaitu kala sore hari. Namun, jangan datang terlalu sore karena nanti wisatawan akan banyak. Datanglah sekitar pukul 4 sore, dan cari tempat yang nyaman untuk menikmati pemandangan.Dari sini, pengunjung dapat menyaksikan indahnya matahari terbenam. Mengantarkan matahari pulang ke peraduan setelah menyelesaikan tugasnya menyinari dunia di siang hari. Mega merah mulai tergantikan dengan hitamnya langit malam. Namun, pemandangan indah tidak berhenti sampai di sini. Di malam hari, suasana semakin meriah. Pengunjung akan disuguhkan pemandangan gemerlap lampu indah Kota Jogja di bawah sana. Ditambah lagi, suana malam Puncak Sosok semakin terang dengan lampu hias warna – warni. Akan sangat indah jika pengunjung mengabadikan foto dengan latar belakang lampu malam Kota Jogja."
    ,"Pantai Widodaren adalah satu dari beberapa pantai di Gunungkidul yang lokasinya belum memiliki akses kendaraan baik roda dua maupun roda empat. Sehingga, pantai ini terbilang masih sepi pengunjung dan tentunya masih sangat alami. Kelebihan dari Pantai Widodaren bukanlah pasir putih ataupun garis pantainya, namun yang membuat pantai ini begitu spesial adalah adanya tebing yang tepat berada di samping Pantai Widodaren. Tebing ini menjadikan Pantai Widodaren terlihat lebih unik tapi juga bikin panik lho. Tebing Pantai Widodaren didominasi oleh rerumputan dan karang-karang tajam, pemandangan luar biasa bisa kita saksikan dari atas bukit ini, dimana laut selatan yang membentang luas terlihat tepat di depan mata kita. Tebing Pantai Widodaren memiliki area yang cukup luas. Di beberapa titik didominasi oleh rerumputan dan di beberapa titik lainnya didominasi oleh karang-karang tajam yang terdapat genangan air dengan volume yang cukup banyak."
    ,"Pantai Ayah, sebuah objek wisata yang berada di Kebumen. Dimana, pantai ini menjadi ikon wisata yang menawarkan keindahan laut selatan jawa dari wilayah kebumen. Suasana dan nuansa alami sangat terasa bila wisatawan berkunjung ke sini. Teduhnya dan juga hembusan angin sepoi-sepoi membuat siapa pun akan enggan move on. Mungkin, wisatawan berpikir jika tulisan ini terlalu berlebihan. Oleh karena itu, teman traveller harus melihat gambar pantai ayah terlebih dahulu sebelum berkunjung ke tempat ini. Di berbagai situs internet sudah banyak menyediakan beberapa foto menarik dan sulit untuk diungkapkan dengan kata-kata. Pertama kali yang bisa diungkapkan adalah garis pantai kawasan ini yang begitu panjang. Karakteristiknya sangat mengesankan serta menggemaskan. Berada di sini memang tidak bisa sebentar. Berbicara mengenai pasir pantai ayah memang terlihat kurang begitu esoktis. Seperti halnya beberapa pantai dengan pasir putih."
    ,"Sesuai dengan namanya, hutan yang sangat eksotis dan romantis ini terletak di Desa Mangunan, Kecamatan Dlingo, Kabupaten Bantul, Yogyakarta. Hutan ini berada sekitar 24 km jauhnya dari pusat Kota Yogyakarta sendiri dengan waktu tempuh hanya sekitar 45 menit saja. Nah, hutan Pinus Mangunan yang ada di Jogja bisa menjadi destinasi hutan yang tepat. Disana banyak terdapat pepohonan yang tinggi menjulang, yang dikenal dengan nama Pinus Merkusi. Nggak heran deh kalau banyak wisatawan yang merasa kepincut dengan objek wisata ini, sebab kesejukan dan keindahan pemandangannya benar-benar mempesona mata. Selain itu, ada juga sebuah panggung yang dikelilingi oleh kursi yang terbuat dari kayu layaknya panggung teater sungguhan. Bolehlah dijadikan objek untuk berfoto ataupun hanya sekedar duduk santai sambil menikmati keasrian suasana sekitar."
    ,"Ketep Pass adalah salah nama sebuah objek wisata di Ketep, Sawangan, Magelang, Jawa Tengah. Ketep Pass ini merupakan Objek Wisata alam yang dikembangkan dengan ciri khas wisata kegunungapian, khususnya Gunung Merapi.Pada tanggal 17 Oktober 2002, Ketep Pass diresmikan sebagai kawasan wisata jalur Solo–Selo–Borobudur (SSB) oleh Presiden ke-5 Republik Indonesia Megawati Soekarnoputri. Lokasi Ketep Pass berada di puncak Bukit Sawangan (pertengahan antara Gunung Merapi dan Gunung Merbabu). Ketep Pass berada pada ketinggian 1200 meter dpl dan luas areanya kurang lebih 8000 meter persegi. Ketep pass ini berjarak 21 km dari Mungkid, 17 km dari Desa Blabak ke arah timur, 30 km dari Kota Magelang, 35 km dari Kota Boyolali, dan 30 km dari Candi Borobudur. Dari Kota Salatiga yang berjarak sekitar 32 km, Ketep Pass dapat dicapai melalui Kopeng dan Desa Kaponan. Lokasi objek wisata Ketep Pass ini mudah dijangkau baik dengan bus besar, minibus, sedan atau sejenisnya maupun sepeda motor karena medan jalannya yang tidak terlalu susah untuk dilewati."
    ,"Ada sebuah lokasi Wisata di Yogyakarta yang tak bisa lepas dari Parangtritis sebagai ikon utamanya. Bukit Paralayang yang lokasinya tak jauh dari Pantai Parangtritis. Dari puncak Bukit Paralayang inilah tempat lepas landas paralayang untuk menikmati keindahan Parangtritis dari angkasa. Seru bukan? Bukit Paralayang terletak agak jauh dari garis pantai Parangtritis. Sekitar 3 Km dan jalannya menanjak namun bisa ditempuh dengan sepeda sekalipun. Dari atas bukit ini kamu bisa menikmati keindahan seluruh sisi pantai dengan leluasa dari ketinggian. Meskipun kamu tidak minat untuk naik paralayang yang memang memerlukan keberanian, namun menikmati pemandangan dari puncak bukit juga tak kalah serunya. Ini juga bisa kamu nikmati tanpa harus terbang layang. Sunset. Ya, sebagaimana di Parangtritis kita bisa menikmati keindahan mentari senja, dari puncak bukit ini pun sunset malah lebih bagus. Banyak pengunjung yang rela naik-naik ke puncak bukit demi menikmati momen matahari tenggelam di sini. Makanya mereka datang ke sini menjelang petang atau setelah puas bermain di Pantai Parangtritis."
    ,"Dari Kota Yogyakarta, tempat ini berjarak sekitar satu jam perjalanan menggunakan roda empat. Namun kendaraan pribadi hanya diperbolehkan hingga Desa Kinahrejo. Selanjutnya perjalanan dilanjutkan dengan menyewa jeep yang dapat memuat 6 orang, menyewa trail, atau naik ojek. Secara administratif Bunker Kaliadem berada di Dusun Kaliadem, Desa Kepuharjo, Kecamatan Cangkringan, Kabupaten Sleman. Berada di lingkaran cincin api pasifik, membuat Indonesia memiliki beberapa gunung berapi yang masih aktif. Salah satunya adalah Gunung Merapi. Sepanjang sejarah, tercatat 5 kali kejadian erupsi terjadi di tempat ini. Kekuatan alam memang maha dahsyat, cari informasi bagaimana langkah untuk berlindung dari letusan gunung berapi ya. Tak heran jika saat ini Bunker Kaliadem menjadi salah satu destinasi wisata yang ada di sekitar Merapi. Tempat ini menyimpan cukup banyak jejak ganasnya Gunung Merapi. Di Bunker Kaliadem terdapat pintu utama yang terbuat dari baja setebal 15 cm, ruangan bunker yang masih memiliki sisa-sisa material Merapi, dan bagian atas yang dilapisi batu serta pasir vulkanis."
    ,"Gumuk Pasir Parangtritis yang terbentang di wilayah bagian selatan Daerah Istimewa Yogyakarta menjadi gumuk pasir yang paling terkenal di Indonesia salah satunya karena luas bentangan yang mencapai 412,8 hektar (PGSP, 2017), sementara luas gumuk pasir di Desa Tuafanu hanya berkisar 80 hektar. Proses pembentukan Gumuk Pasir Parangtritis juga terbilang cukup unik dimana material erupsi Gunung Merapi menjadi material penyusun utama yang kemudian mengalir di sungai di DIY lalu bermuara di Samudra Hindia, tertiup angin dan mengendap di pesisir.Di kalangan pecinta wisata, barangkali Gumuk Pasir Parangtritis sudah tidak awam lagi untuk didengar karena suguhan alamnya yang memang sangat menakjubkan. Atraksi wisata serupa gurun pasir yang biasanya dijumpai di Negara – negara Timur Tengah atau Afrika Utara ini telah memikat banyak wisatawan baik lokal maupun mancanegara. Pesona alam yang menakjubkan, harga tiket yang terjangkau ditambah akses yang mudah dan memadai menjadi daya dukung tersendiri bagi Gumuk Pasir Parangtritis untuk mendatangkan pengunjung."
    ,"Sejak dulu, keindahan Pantai Kuta memang sudah cukup terkenal. Bahkan sejak awal 1970-an, wisatawan mancanegara sudah ramai datang ke tempat ini. Dulunya, sebelum dikenal sebagai destinasi wisata yang populer di Bali, Pantai Kuta merupakan lokasi pelabuhan dagang bagi para pedagang lokal dan para saudagar yang datang dari Eropa. Pemandangannya yang indah dengan pasir putihnya yang halus dan terhampar luas menjadi daya tarik utama dari wisata Pantai Kuta Bali. Selain itu, Pantai Kuta juga terkenal dengan ombaknya yang bagus, tidak terlalu besar dan cocok bagi para peselancar pemula. Pemandangan sunset di Pantai Kuta juga terkenal sangat indah dan eksotis. Warna langit yang berwarna kemerahan, berpadu dengan hamparan pasir putih serta gelombang air laut yang tidak begitu liar, menyajikan lukisan alam yang begitu mempesona.")


        val listData: ArrayList<Moment>
        get() {
            val list = arrayListOf<Moment>()
            for (position in momentName.indices) {
                val moment = Moment()
                moment.name = momentName[position]
                moment.detail = momentDetail[position]
                moment.date=momentDate[position]
                moment.photo = momentImages[position]
                moment.source= momentSource[position]
                list.add(moment)
            }
            return list
        }
}