### EC2 (Elastic Compute) === 인스턴스

    AWS의 대표상품! 원하는 컴퓨팅 성능을 구매할 수 있음.
    기본 결제방식은 시간당 요금을 측정.

### AMI (Amazon Machine Image)

    AWS에서 제공하는 OS(운영체제)를 AMI라고 한다.
    이 중에 Ubuntu를 많이 사용함.

### 키 페어

    EC2에 접속하는 방법 중 하나.
    .pem으로 SSH 접속한다.

### 보안 그룹(방화벽)

    인바운드 규칙과 아웃바운드 규칙에 사용하고 싶은 포트를 명시 해야함.

### Public IP

    AWS에서 제공하는 Public IP는 DHCP로 컴퓨터를 재부팅 하면 IP 주소가 변경됨.
    고정 IP를 사용하고 싶으면 EIP를 구매해야 한다.

### EC2 ubuntu 세팅

    필요한 프로그램은 명령어로 다운받아야 한다.
    Ubuntu는 apt 명령어를 이용해서 프로그램을 다운받을 수 있다.

1. 자바 JDK 설치

   - sudo apt update
   - sudo apt install openjdk-11-jdk
   - javac -version

2. ROOT 계정 만들기

   - sudo passwd root
   - su - (ROOT 로그인)

3. Tomcat 설치

   - wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.64/bin/apache-tomcat-9.0.64.tar.gz (다운로드 명령어)
   - tar xf apache-tomcat-9.0.64.tar.gz (압축풀기 명령어)
   - mv apache-tomcat-9.0.64 tomcat (폴더이름을 apache-tomcat-9.0.64에서 tomcat으로 변경)
   - cd /tomcat/bin
   - sh startup.sh (톰캣 실행 명령어)

4. 포트 확인
   - netstat -tnlp
