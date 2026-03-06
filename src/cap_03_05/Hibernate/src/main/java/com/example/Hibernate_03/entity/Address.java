package com.example.Hibernate_03.entity;

public class Address {
        private int addressId;
        private String street;
        private String city;
        private String state;
        private String zipCode;

        public Address() {
            super();
        }

        public Address(int addressId, String street, String city, String state, String zipCode) {
            this.addressId = addressId;
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        public int getAddressId() {
            return addressId;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getZipCode() {
            return zipCode;
        }
}
