package com.sda.practicalproject1.controller.menu;

public enum MenuItem {

    ADD_VET(1, "Add vet"),
    UPDATE_VET(2, "Update vet"),
    DELETE_VET(3, "Delete vet"),
    VIEW_VET_LIST(4, "View vet list"),
    VIEW_VET_BY_ID(5, "View vet by id"),
    ADD_PET(6, "Add pet"),
    VIEW_ALL_PETS(7, "View all pets"),
    VIEW_PETS_BY_ID(8,"View pet by id"),
    DELTE_PETS(9,"Delete pet"),
    UPDATE_PET(10,"Update pet"),
    EXIT(100, "Exit"),
    UNKNOWN(999, "Unknown option");


    private final int option;
    private final String displayName;

    MenuItem(int option, String displayName) {
        this.option = option;
        this.displayName = displayName;
    }

    public static void printMeniuItems() {
        for (MenuItem value : values()) {
            if (value != UNKNOWN) {
                System.out.println(value.option + " " + value.displayName);
            }
        }
    }

    public static MenuItem searchByOption(int inputOption) {
        for (MenuItem value : values()) {
            if (value.option == inputOption) {
                return value;
            }
        }
        return UNKNOWN;

    }


}
