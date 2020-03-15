package com.billingpro.model;

import java.time.LocalDateTime;

public class User {

    private static final int CUSTOMER_LOYALTY_THRESHOLD_IN_YRS = 2;

    private String userID;

    private String userName;

    private UserType userType;

    private LocalDateTime createdDate;

    public User(String userID, String userName, UserType userType, LocalDateTime createdDate) {
        super();
        this.userID = userID;
        this.userName = userName;
        this.userType = userType;
        this.createdDate = createdDate;
    }

    private boolean isLoyaltyDiscountApplicable() {
        LocalDateTime dateToCompare = LocalDateTime.now().minusYears(CUSTOMER_LOYALTY_THRESHOLD_IN_YRS);
        return (UserType.CUSTOMER == userType) && createdDate.isBefore(dateToCompare) ;
    }

    public double getDiscountPercentage(){

        if(this.userType == UserType.AFFILIATE || this.userType == UserType.EMPLOYEE || this.isLoyaltyDiscountApplicable()) {
            return userType.getDiscountPercent();
        }else
            return 0;
    }


    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public UserType getUserType() {
        return userType;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
}