package com.solvd.laba.carina.demo.gui.web.services;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.laba.carina.demo.gui.web.pages.FooterPage;
import com.solvd.laba.carina.demo.gui.web.pages.footer.*;

public class FooterOpener extends AbstractTest {

    public void testFooterPages() {
        FooterPage footerPage = new FooterPage(getDriver());
        footerPage.open();
        AboutCompanyPage aboutCompanyPage = footerPage.clickAboutCompanyLink();
        footerPage.open();
        AdvertisePage advertisePage = footerPage.clickAdvertiseLink();
        footerPage.open();
        ConfidentialPolicyPage confidentialPolicyPage = footerPage.clickConfidentialPolicyLink();
        footerPage.open();
        ManifestPage manifestPage = footerPage.clickManifestLink();
        footerPage.open();
        PublicContractPage publicContractPage = footerPage.clickPublicContractLink();
        footerPage.open();
        RedactionContactsPage redactionContactsPage = footerPage.clickRedactionContactLink();
        footerPage.open();
        RulesOfReturnPage rulesOfReturnPage = footerPage.clickRulesOfReturnLink();
        footerPage.open();
        TariffsPage tariffsPage = footerPage.clickTariffsLink();
        footerPage.open();
        UserAgreementPage userAgreementPage = footerPage.clickUserAgreementLink();
        footerPage.open();
        UserSupportPage userSupportPage = footerPage.clickUserSupportLink();
        footerPage.open();
        VacanciesPage vacanciesPage = footerPage.clickVacanciesLink();
    }
}
