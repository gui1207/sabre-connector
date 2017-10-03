/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ProfileRef",
    "PersonName",
    "Telephone",
    "Email",
    "Address",
    "CustLoyalty",
    "Document",
    "PassengerTypeQuantity",
    "TravelerRefNumber",
    "FlightSegmentRPHs",
    "BirthDate",
    "CurrencyCode",
    "PassengerTypeCode",
    "AccompaniedByInfant",
    "ShareSynchInd",
    "ShareMarketInd",
    "Gender"
})
public class AirTraveler {

    @JsonProperty("ProfileRef")
    private ProfileRef profileRef;
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("Telephone")
    private List<Telephone> telephone = new ArrayList<Telephone>();
    @JsonProperty("Email")
    private List<Email> email = new ArrayList<Email>();
    @JsonProperty("Address")
    private List<Address> address = new ArrayList<Address>();
    @JsonProperty("CustLoyalty")
    private List<CustLoyalty> custLoyalty = new ArrayList<CustLoyalty>();
    @JsonProperty("Document")
    private List<Document> document = new ArrayList<Document>();
    @JsonProperty("PassengerTypeQuantity")
    private PassengerTypeQuantity passengerTypeQuantity;
    @JsonProperty("TravelerRefNumber")
    private TravelerRefNumber travelerRefNumber;
    @JsonProperty("FlightSegmentRPHs")
    private FlightSegmentRPHs flightSegmentRPHs;
    @JsonProperty("BirthDate")
    private String birthDate;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("PassengerTypeCode")
    private String passengerTypeCode;
    @JsonProperty("AccompaniedByInfant")
    private Boolean accompaniedByInfant;
    @JsonProperty("ShareSynchInd")
    private String shareSynchInd;
    @JsonProperty("ShareMarketInd")
    private String shareMarketInd;
    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("ProfileRef")
    public ProfileRef getProfileRef() {
        return profileRef;
    }

    @JsonProperty("ProfileRef")
    public void setProfileRef(ProfileRef profileRef) {
        this.profileRef = profileRef;
    }

    @JsonProperty("PersonName")
    public PersonName getPersonName() {
        return personName;
    }

    @JsonProperty("PersonName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    @JsonProperty("Telephone")
    public List<Telephone> getTelephone() {
        return telephone;
    }

    @JsonProperty("Telephone")
    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    @JsonProperty("Email")
    public List<Email> getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(List<Email> email) {
        this.email = email;
    }

    @JsonProperty("Address")
    public List<Address> getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @JsonProperty("CustLoyalty")
    public List<CustLoyalty> getCustLoyalty() {
        return custLoyalty;
    }

    @JsonProperty("CustLoyalty")
    public void setCustLoyalty(List<CustLoyalty> custLoyalty) {
        this.custLoyalty = custLoyalty;
    }

    @JsonProperty("Document")
    public List<Document> getDocument() {
        return document;
    }

    @JsonProperty("Document")
    public void setDocument(List<Document> document) {
        this.document = document;
    }

    @JsonProperty("PassengerTypeQuantity")
    public PassengerTypeQuantity getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    @JsonProperty("PassengerTypeQuantity")
    public void setPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    @JsonProperty("TravelerRefNumber")
    public TravelerRefNumber getTravelerRefNumber() {
        return travelerRefNumber;
    }

    @JsonProperty("TravelerRefNumber")
    public void setTravelerRefNumber(TravelerRefNumber travelerRefNumber) {
        this.travelerRefNumber = travelerRefNumber;
    }

    @JsonProperty("FlightSegmentRPHs")
    public FlightSegmentRPHs getFlightSegmentRPHs() {
        return flightSegmentRPHs;
    }

    @JsonProperty("FlightSegmentRPHs")
    public void setFlightSegmentRPHs(FlightSegmentRPHs flightSegmentRPHs) {
        this.flightSegmentRPHs = flightSegmentRPHs;
    }

    @JsonProperty("BirthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("BirthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("PassengerTypeCode")
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    @JsonProperty("PassengerTypeCode")
    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    @JsonProperty("AccompaniedByInfant")
    public Boolean getAccompaniedByInfant() {
        return accompaniedByInfant;
    }

    @JsonProperty("AccompaniedByInfant")
    public void setAccompaniedByInfant(Boolean accompaniedByInfant) {
        this.accompaniedByInfant = accompaniedByInfant;
    }

    @JsonProperty("ShareSynchInd")
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    @JsonProperty("ShareSynchInd")
    public void setShareSynchInd(String shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }

    @JsonProperty("ShareMarketInd")
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    @JsonProperty("ShareMarketInd")
    public void setShareMarketInd(String shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }

    @JsonProperty("Gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("Gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("profileRef", profileRef).append("personName", personName).append("telephone", telephone).append("email", email).append("address", address).append("custLoyalty", custLoyalty).append("document", document).append("passengerTypeQuantity", passengerTypeQuantity).append("travelerRefNumber", travelerRefNumber).append("flightSegmentRPHs", flightSegmentRPHs).append("birthDate", birthDate).append("currencyCode", currencyCode).append("passengerTypeCode", passengerTypeCode).append("accompaniedByInfant", accompaniedByInfant).append("shareSynchInd", shareSynchInd).append("shareMarketInd", shareMarketInd).append("gender", gender).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(shareMarketInd).append(address).append(flightSegmentRPHs).append(gender).append(document).append(passengerTypeCode).append(telephone).append(profileRef).append(travelerRefNumber).append(birthDate).append(accompaniedByInfant).append(personName).append(custLoyalty).append(passengerTypeQuantity).append(currencyCode).append(email).append(shareSynchInd).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirTraveler) == false) {
            return false;
        }
        AirTraveler rhs = ((AirTraveler) other);
        return new EqualsBuilder().append(shareMarketInd, rhs.shareMarketInd).append(address, rhs.address).append(flightSegmentRPHs, rhs.flightSegmentRPHs).append(gender, rhs.gender).append(document, rhs.document).append(passengerTypeCode, rhs.passengerTypeCode).append(telephone, rhs.telephone).append(profileRef, rhs.profileRef).append(travelerRefNumber, rhs.travelerRefNumber).append(birthDate, rhs.birthDate).append(accompaniedByInfant, rhs.accompaniedByInfant).append(personName, rhs.personName).append(custLoyalty, rhs.custLoyalty).append(passengerTypeQuantity, rhs.passengerTypeQuantity).append(currencyCode, rhs.currencyCode).append(email, rhs.email).append(shareSynchInd, rhs.shareSynchInd).isEquals();
    }

}
