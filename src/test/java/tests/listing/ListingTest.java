package tests.listing;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ListingTest extends BaseTest {

    @Test
    public void checkHeadline() {
        basePage.open("https://shop.nag.ru/catalog/00001.kommutatory/40213.fiksirovannye-kommutatory");
        listingPage.checkHeadline();
    }

    @Test
    public void checkListingItemCount() {
        basePage.open("https://shop.nag.ru/catalog/00001.kommutatory/40213.fiksirovannye-kommutatory");
        listingPage.checkListingItemCount();
    }

    @Test
    public void checkPageItemCount() {
        basePage.open("https://shop.nag.ru/catalog/00001.kommutatory/40213.fiksirovannye-kommutatory");
        listingPage.checkPageItemCount();
    }


}
