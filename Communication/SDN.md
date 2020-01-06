## SDN
> https://www.netmanias.com/ko/post/blog/13359/sdn-nfv-sk-telecom/sdn-nfv-in-the-5g-era-1-how-will-sdn-change-the-world

- SDN의 목적은 각 장비별로 흩어져 있는 제어부를 하나로 합치는것, 하나의 client로 (odl)로 모든 회사의 장비를 제어하자. 
- 지금은 moshell 프로그램을 비싸게 팔고 있음, 사실상 웹으로도 구현 가능 한 부분 
- 고객사들의 입장에서는 하나의 프로그램, 게다가 무료 프로그램으로 장비를 전부 제어 가능하다면 큰 이익
- 점점 이렇게 바뀌어 갈것 
- rest conf, net conf 현재 우리는 net conf, yang 만 지원함, odl에서 이거를 번역해줌 

netconf는 네트워크 상에서 장비를 configuration 하고 monitoring 하기 위한 xml 베이스의 프로토콜! 
netcounf의 southbound plugin은 원거리의 netconf 기기에 연결이 가능하다. 

- SDN tutorial : http://sdntutorials.com/opendaylight-netconf-restconf-and-yang/
