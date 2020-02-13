package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	
	public WebDriver driver;
	By editProfile = By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img");
	By aboutTab = By.xpath("//a[contains(text(),'About')]");
	By lastName = By.id("lastname");
	By saveAll = By.xpath("//input[@type='button']");
	By postMsg=By.id("publisherAttachTextPost");
	By postMsgFrameId=By.xpath("//*[@id=\\\"cke_39_contents\\\"]/iframe");
	By textBox=By.xpath("/html/body");
	By publishPostMsg=By.id("publishersharebutton");
	By attachFile=By.xpath("//*[@id=\\\"publisherAttachContentPost\\\"]");
	By fileUpload=By.xpath("//*[@id=\\\"chatterUploadFileAction\\\"]");
	By choosefIle=By.name("chatterFile");
	By uploadPhoto=By.id("displayBadge");
	//By uploadPhotoFrameId=frame("uploadPhotoContentId")
	By PhotoLocation=By.className("fileInput");
	By savePic=By.xpath("//*[@id=\\\"j_id0:j_id7:save\\\"]");

	public ProfilePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEditProfile() {
		return driver.findElement(editProfile);

	}

	public WebElement getAboutTab() {

		return driver.findElement(aboutTab);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getSaveAll() {
		return driver.findElement(saveAll);
	}
	public WebElement getPostMsg() {
		return driver.findElement(postMsg);
	}
	public WebElement getPostMsgFrameId() {
		return driver.findElement(postMsgFrameId);
	}
	public WebElement getTextBox() {
		return driver.findElement(textBox);
	}
	public WebElement getPublishPostMsg() {
		return driver.findElement(publishPostMsg);
	}
	public WebElement getAttachFile() {
		return driver.findElement(attachFile);
	}
	public WebElement getFileUpload() {
		return driver.findElement(fileUpload);
	}
	public WebElement getChoosefIle() {
		return driver.findElement(choosefIle);
	}
	public WebElement getUploadPhoto() {
		return driver.findElement(uploadPhoto);
	}
	public WebElement getPhotoLocation() {
		return driver.findElement(PhotoLocation);
	}
	public WebElement getsavePic() {
		return driver.findElement(savePic);
	}

}
