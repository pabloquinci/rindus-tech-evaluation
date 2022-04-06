# rindus-tech-evaluation

 - Used Language: Java

 - Framework: Spring Boot 2.6.5, Junit 5

 - I tested the API request with Postman, and curl comand under Linux Ubuntu environment

 - Database Redis 5.0.7, configuring Beans of type JedisConnectionFactory and RedisTemplate classes in Java for connections and redis hashes managing

 - Service Layer added

 - Redis Hash Model creation: HMSET model bannerExtSize=0x0 1.616892819 bannerExtSize=flexible 1.578777976 deviceLanguage=es 1.134030757 deviceLanguage=en 1.111139494 deviceLanguage=it 1.06355885 deviceExtType=tablet 0.7294739471 deviceLanguage=ar 0.6317743188 deviceLanguage=fr 0.4418820908 deviceLanguage=ro 0.3260918906 deviceExtBrowser=Chrome 0.2102317412 bannerExtSize=800x250 0.1692596709 bannerExtSize=300x600 0.1628927345 deviceLanguage=ru -0.0310927102 deviceExtBrowser=Safari -0.0360865458 deviceExtType=mobile -0.0372569973 deviceExtBrowser=IE -0.0406608564 deviceExtType=desktop -0.1037572241 deviceExtBrowser=Firefox -0.1131013246 deviceLanguage=de -0.1935418172 deviceLanguage=hu -0.4186695043 deviceLanguage=tr -0.4304739397 bannerExtSize=320x50 -0.4556144288 bannerExtSize=120x600 -0.5110433495 bannerExtSize=160x600 -0.5334565661 deviceLanguage=hr -0.5559580767 bannerExtSize=728x90 -0.6115154594 bannerExtSize=300x250 -0.6282185905 deviceLanguage=sk -1.266130497 deviceLanguage=pl -1.266865912 deviceLanguage=cs -1.640872261 bias -6.21176449

 - Curl Command used in Linux for API Request: curl http://localhost:8080/calculateRegresion -H "Accept: application/json" -H "Content-Type: application/json" -XPOST -d '{"deviceExtBrowser":"Firefox","bannerExtSize":"300x250","deviceLanguage":"de","deviceExtType":"tablet"}'

