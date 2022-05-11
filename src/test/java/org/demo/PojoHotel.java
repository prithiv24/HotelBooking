package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoHotel extends BaseClassHotelBooking {

	public PojoHotel()  {

		PageFactory.initElements(driver, this);
	}

	@FindAll({

		@FindBy(id="location"),
		@FindBy(name="location")
	})

	private WebElement location;

	@FindAll({

		@FindBy(id="hotels"),
		@FindBy(name="hotels")
	})
	private WebElement hotels;

	@FindAll({

		@FindBy(id="room_type"),
		@FindBy(name="room_type")
	})

	private WebElement roomType;

	@FindAll({

		@FindBy(id="room_nos"),
		@FindBy(name="room_nos")
	})
	private WebElement roomNos;

	@FindAll({

		@FindBy(id="datepick_in"),
		@FindBy(name="datepick_in")
	})
	private WebElement checkInDate;

	@FindAll({

		@FindBy(id="datepick_out"),
		@FindBy(name="datepick_out")
	})

	private WebElement checkOut;

	@FindAll({

		@FindBy(id="adult_room"),
		@FindBy(name="adult_room")
	})
	private WebElement adultsPerRoom;

	@FindAll({

		@FindBy(id="child_room"),
		@FindBy(name="child_room")
	})
	private WebElement childPerRevision;

	public WebElement getLocation() {
		return location;


	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRevision() {
		return childPerRevision;
	}
	@FindAll({

		@FindBy(id="username"),
		@FindBy(name="username")
	})
	private WebElement useNmae;
	@FindAll({

		@FindBy(id="password"),
		@FindBy(name="password")
	})
	private WebElement password;

	public WebElement getUseNmae() {
		return useNmae;
	}

	public WebElement getPassword() {
		return password;
	}
	@FindAll({

		@FindBy(id="login"),
		@FindBy(name="login")
	})
	private WebElement logIn;

	@FindAll({

		@FindBy(id="Submit"),
		@FindBy(name="Submit")
	})
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	@FindAll({

		@FindBy(id="radiobutton_0"),
		@FindBy(name="radiobutton_0")
	})
	private WebElement selectButton;
	@FindAll({

		@FindBy(id="continue"),
		@FindBy(name="continue")
	})
	private WebElement contin;

	public WebElement getSelectButton() {
		return selectButton;
	}

	public WebElement getContin() {
		return contin;
	}
	@FindAll({

		@FindBy(id="first_name"),
		@FindBy(name="first_name")
	})
	private WebElement firstName;
	@FindAll({

		@FindBy(id="last_name"),
		@FindBy(name="last_name")
	})
	private WebElement lastName;
	@FindAll({

		@FindBy(id="address"),
		@FindBy(name="address")
	})
	private WebElement address;
	@FindAll({

		@FindBy(id="cc_num"),
		@FindBy(name="cc_num")
	})
	private WebElement creditCardNum;
	@FindAll({

		@FindBy(id="cc_type"),
		@FindBy(name="cc_type")
	})
	private WebElement creditCardType;
	@FindAll({

		@FindBy(id="cc_exp_month"),
		@FindBy(name="cc_exp_month")
	})
	private WebElement ccExpireMonth;
	@FindAll({

		@FindBy(id="cc_exp_year"),
		@FindBy(name="cc_exp_year")
	})
	private WebElement ccExpireYear;
	@FindAll({

		@FindBy(id="cc_cvv"),
		@FindBy(name="cc_cvv")
	})
	private WebElement CCV;
	@FindAll({

		@FindBy(id="book_now"),
		@FindBy(name="book_now")
	})
	private WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNum() {
		return creditCardNum;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getCcExpireMonth() {
		return ccExpireMonth;
	}

	public WebElement getCcExpireYear() {
		return ccExpireYear;
	}

	public WebElement getCCV() {
		return CCV;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	@FindAll({

		@FindBy(id="order_no"),
		@FindBy(name="order_no")
	})
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}
}