package Builder;

import Pages.Coupons.CampaignPage;
import Pages.Days.DayPage;
import Pages.Discounts.DiscountsPage;
import Pages.FoodCoins.FoodCoinsPage;
import Pages.Halls.HallPage;
import Pages.Login.LoginPage;
import Pages.Menus.MenuPage;
import Pages.Products.ProductPage;
import Pages.Promotions.PromotionPage;
import Pages.StoreBrands.StoresAndBrandsPage;
import org.openqa.selenium.WebDriver;

public class PageBuilder {

    private static LoginPage loginPage;
    private static MenuPage menuPage;
    private static HallPage hallPage;
    private static StoresAndBrandsPage storesAndBrandsPage;
    private static CampaignPage campaignPage;
    private static ProductPage productPage;
    private static DayPage dayPage;
    private static FoodCoinsPage foodCoinsPage;
    private static DiscountsPage discountsPage;
    private static PromotionPage promotionPage;

    public static void setupPage(WebDriver driver){
        loginPage = new LoginPage(driver);
        menuPage = new MenuPage(driver);
        hallPage = new HallPage(driver);
        productPage = new ProductPage(driver);
        dayPage = new DayPage(driver);
        storesAndBrandsPage = new StoresAndBrandsPage(driver);
        campaignPage = new CampaignPage(driver);
        foodCoinsPage = new FoodCoinsPage(driver);
        discountsPage = new DiscountsPage(driver);
        promotionPage = new PromotionPage(driver);
    }

    public static StoresAndBrandsPage getStoresAndBrandsPage() {
        return storesAndBrandsPage;

    }

    public static LoginPage getLoginPage() {
        return loginPage;
    }

    public static MenuPage getMenuPage() {
        return menuPage;
    }

    public static CampaignPage getCampaignPage() {
        return campaignPage;
    }

    public static HallPage getHallPage() {
        return hallPage;
    }

    public static ProductPage getProductPage() {
        return productPage;
    }

    public static DayPage getDayPage() {
        return dayPage;
    }

    public static FoodCoinsPage getFoodCoinsPage() {
        return foodCoinsPage;
    }

    public static DiscountsPage getDiscountsPage() {
        return discountsPage;
    }

    public static PromotionPage getPromotionPage() {
        return promotionPage;
    }
}