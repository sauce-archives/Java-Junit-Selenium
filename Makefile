windows_10_edge:
	mvn test -Dplatform="windows_10_edge"

mac_sierra_chrome:
	mvn test -Dplatform="mac_sierra_chrome"

windows_8_ff:
	mvn test -Dplatform="windows_8_ff"

windows_8_1_ie:
	mvn test -Dplatform="windows_8_1_ie"

sauce_demo:
	make -j windows_10_edge mac_sierra_chrome windows_8_ff windows_8_1_ie
