package com.vportalapplication.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inspection")
public class InspectionRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "시스템명")
    private String systemName;

    @Column(name = "프로젝트명")
    private String projectName;

    @Column(name = "업무영역_대분류")
    private String workAreaLarge;

    @Column(name = "업무영역_증분류")
    private String workAreaMediumn;

    @Column(name = "업무영역_소분류")
    private String workAreaSmall;

    @Column(name = "협업주관부서")
    private String cooperation;

    @Column(name = "점검요청자")
    private String inspectionRequester;

    @Column(name = "점검자")
    private String checker;

    @Column(name = "점검요청일")
    private String toDayDateState;

    @Column(name = "점검기간")
    private String inspectionPeriod;

    @Column(name = "이행점검여부")
    private String implementation;

    @Column(name = "진행단계")
    private String stepInProgress;

    @Column(name = "구축PM")
    private String builderPM;

    @Column(name = "현업PM")
    private String businessPM;

    @Column(name = "SM담당자")
    private String smManager;

    @Column(name = "오픈예정일")
    private String openDate;

    @Column(name = "개발형태")
    private String type;

    @Column(name = "변경내용")
    private String updateContent;

    @Column(name = "시스템용도및설명")
    private String systemExplanation;

    @Column(name = "서비스URL")
    private String serviceURL;

    @Column(name = "시스템중요도")
    private String systemCriticality;

    @Column(name = "연계시스템")
    private String linkSystem;

    @Column(name = "시스템네트워크위치")
    private String systemNetwork;

    @Column(name = "서비스유형")
    private String serviceType;

    @Column(name = "서비스접근유형및위치_대외")
    private String serviceInside;

    @Column(name = "서비스접근유형및위치_사내")
    private String serviceCompany;

    @Column(name = "개발환경")
    private String developEnviroment;

    @Column(name = "운영인프라_서버")
    private String operatInpraServer;

    @Column(name = "운영인프라_WAS")
    private String operatInpraWAS;

    @Column(name = "운영인프라_DB")
    private String operatInpraDB;

    @Column(name = "개발인프라_서버")
    private String developInpraServer;

    @Column(name = "개발인프라_WAS")
    private String developInpraWAS;

    @Column(name = "개발인프라_DB")
    private String developInpraDB;

    @Column(name = "SSO적용여부")
    private String ssoUse;

    @Column(name = "VPN권한여부")
    private String vpnAuth;

    @Column(name = "시큐어코딩적용여부")
    private String secureCode;

    @Column(name = "운영URL")
    private String operateURL;

    @Column(name = "운영IP")
    private String operateIP;

    @Column(name = "개발URL")
    private String developURL;

    @Column(name = "개발IP")
    private String developIP;

    @Column(name = "관리자페이지")
    private String adminPage;

    @Column(name = "점검용계정_관리자_ID")
    private String inspectionAccount;

    @Column(name = "점검용계정_관리자_Pw")
    private String inspectionAccountPw;

    @Column(name = "점검용계정_사용자01_ID")
    private String inspectionUser01;

    @Column(name = "점검용계정_사용자01_Pw")
    private String inspectionUser01Pw;

    @Column(name = "점검용계정_사용자02_ID")
    private String inspectionUser02;

    @Column(name = "점검용계정_사용자02_Pw")
    private String inspectionUser02Pw;

    @Column(name = "개인정보보유현황")
    private String personInfoData;

    @Column(name = "고유식별및민감정보취급여부")
    private String uniqueIden;

    @Column(name = "DB암호화여부")
    private String dbEncryption;

    @Column(name = "상세내용")
    private String detailContent;

    @Column(name = "SSO권한분리적용")
    private String adminPageSSO;



}
