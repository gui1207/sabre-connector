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
    "DepartureWindow",
    "ArrivalWindow",
    "ExcludeVendorPref",
    "IncludeAlliancePref",
    "ExcludeAlliancePref",
    "NumTrips",
    "AltCitiesCombinations",
    "NumTripsWithRouting",
    "OnlineIndicator",
    "InterlineIndicator",
    "TripType",
    "MaxPrice",
    "ContentType",
    "DomesticLayoverTime",
    "LongConnectTime",
    "LongConnectPoints",
    "AirServiceOnly",
    "JetServiceOnly",
    "SameConnectionAirportOnly",
    "SameOriginAirportOnly",
    "SameTurnaroundAirportOnly",
    "AircraftTypePenalty",
    "AlternateAirportPenalty",
    "FareAmountThreshold",
    "numOfLowFareSol",
    "numOfMustPriceOnlSol",
    "numOfMustPriceInrlSol",
    "numOfMustPriceNStpOnlSol",
    "numOfMustPriceNStpInrlSol",
    "numOfMustPriceSStopOnlSol",
    "stpPenaltyInUSD",
    "durPenaltyInUSD",
    "depPenaltyInUSD",
    "maxAllowedMustPriceOveragePerCrr",
    "fltOptMustPriceReuseLimit",
    "upperBoundMustPriceFactorForNotNonStp",
    "upperBoundLFSFactor",
    "numOfMustPriceNStp1StpOnlSol",
    "numOfMustPriceNStp1StpInrlSol",
    "upperBoundMustPriceFactorForNonStp",
    "maxAllowedLFSOveragePerCrrPercent",
    "targetMinNumOfLFSOnlSolPerCrr",
    "targetMinNumOfLFSTotOnlSolPercent",
    "fltOptLFSReuseLimitForNonAVS",
    "fltOptLFSReuseLimitForAVS",
    "avsPenaltyCrrs",
    "maxNumOfNonStpOnlSol",
    "maxNumOfNonStpInrlSol",
    "maxNumOfSingleStpOnlSol",
    "maxNumOf2PlusStpSol",
    "minAllowedOveragePerCrrPercent",
    "minAllowedOveragePerCrr",
    "maxRelFareLvlOfxForNonStp",
    "maxRelFareLvlOfxForCnx",
    "numOfMustPrice2PlusStpSol",
    "ItineraryNumberThreshold",
    "XOFares",
    "ExemptAllTaxes",
    "ExemptAllTaxesAndFees",
    "Taxes",
    "ExemptTax",
    "FlightStopsAsConnections",
    "TicketingSumOfLocals",
    "MultiAirportCodes",
    "JumpCabinLogic",
    "KeepSameCabin",
    "GoverningCarrierOverride",
    "ExcludeCallDirectCarriers",
    "ValidatingCarrier",
    "ValidatingCarrierCheck",
    "SettlementMethod",
    "FlightRepeatLimit",
    "FlexibleFares",
    "DiversityParameters",
    "AdditionalFareLimit",
    "FareFocusRules",
    "SellingLevels",
    "Budget",
    "OptionsPerDatePairList",
    "CountryPref",
    "RetailerRules",
    "ForceKeywordRestrictedContent",
    "FlightRestrictions",
    "LowCostCarriersProcessing"
})
public class TPAExtensions_ {

    @JsonProperty("DepartureWindow")
    private String departureWindow;
    @JsonProperty("ArrivalWindow")
    private String arrivalWindow;
    @JsonProperty("ExcludeVendorPref")
    private List<ExcludeVendorPref_> excludeVendorPref = new ArrayList<ExcludeVendorPref_>();
    @JsonProperty("IncludeAlliancePref")
    private List<IncludeAlliancePref> includeAlliancePref = new ArrayList<IncludeAlliancePref>();
    @JsonProperty("ExcludeAlliancePref")
    private List<IncludeAlliancePref> excludeAlliancePref = new ArrayList<IncludeAlliancePref>();
    @JsonProperty("NumTrips")
    private NumTrips numTrips;
    @JsonProperty("AltCitiesCombinations")
    private AltCitiesCombinations altCitiesCombinations;
    @JsonProperty("NumTripsWithRouting")
    private NumTripsWithRouting numTripsWithRouting;
    @JsonProperty("OnlineIndicator")
    private OnlineIndicator onlineIndicator;
    @JsonProperty("InterlineIndicator")
    private InterlineIndicator interlineIndicator;
    @JsonProperty("TripType")
    private TripType tripType;
    @JsonProperty("MaxPrice")
    private MaxPrice maxPrice;
    @JsonProperty("ContentType")
    private ContentType contentType;
    @JsonProperty("DomesticLayoverTime")
    private DomesticLayoverTime domesticLayoverTime;
    @JsonProperty("LongConnectTime")
    private LongConnectTime longConnectTime;
    @JsonProperty("LongConnectPoints")
    private LongConnectPoints longConnectPoints;
    @JsonProperty("AirServiceOnly")
    private AirServiceOnly airServiceOnly;
    @JsonProperty("JetServiceOnly")
    private JetServiceOnly jetServiceOnly;
    @JsonProperty("SameConnectionAirportOnly")
    private SameConnectionAirportOnly sameConnectionAirportOnly;
    @JsonProperty("SameOriginAirportOnly")
    private SameOriginAirportOnly sameOriginAirportOnly;
    @JsonProperty("SameTurnaroundAirportOnly")
    private SameTurnaroundAirportOnly sameTurnaroundAirportOnly;
    @JsonProperty("AircraftTypePenalty")
    private AircraftTypePenalty aircraftTypePenalty;
    @JsonProperty("AlternateAirportPenalty")
    private AlternateAirportPenalty alternateAirportPenalty;
    @JsonProperty("FareAmountThreshold")
    private FareAmountThreshold fareAmountThreshold;
    @JsonProperty("numOfLowFareSol")
    private NumOfLowFareSol numOfLowFareSol;
    @JsonProperty("numOfMustPriceOnlSol")
    private NumOfMustPriceOnlSol numOfMustPriceOnlSol;
    @JsonProperty("numOfMustPriceInrlSol")
    private NumOfMustPriceInrlSol numOfMustPriceInrlSol;
    @JsonProperty("numOfMustPriceNStpOnlSol")
    private NumOfMustPriceNStpOnlSol numOfMustPriceNStpOnlSol;
    @JsonProperty("numOfMustPriceNStpInrlSol")
    private NumOfMustPriceNStpInrlSol numOfMustPriceNStpInrlSol;
    @JsonProperty("numOfMustPriceSStopOnlSol")
    private NumOfMustPriceSStopOnlSol numOfMustPriceSStopOnlSol;
    @JsonProperty("stpPenaltyInUSD")
    private StpPenaltyInUSD stpPenaltyInUSD;
    @JsonProperty("durPenaltyInUSD")
    private DurPenaltyInUSD durPenaltyInUSD;
    @JsonProperty("depPenaltyInUSD")
    private DepPenaltyInUSD depPenaltyInUSD;
    @JsonProperty("maxAllowedMustPriceOveragePerCrr")
    private MaxAllowedMustPriceOveragePerCrr maxAllowedMustPriceOveragePerCrr;
    @JsonProperty("fltOptMustPriceReuseLimit")
    private FltOptMustPriceReuseLimit fltOptMustPriceReuseLimit;
    @JsonProperty("upperBoundMustPriceFactorForNotNonStp")
    private UpperBoundMustPriceFactorForNotNonStp upperBoundMustPriceFactorForNotNonStp;
    @JsonProperty("upperBoundLFSFactor")
    private UpperBoundLFSFactor upperBoundLFSFactor;
    @JsonProperty("numOfMustPriceNStp1StpOnlSol")
    private NumOfMustPriceNStp1StpOnlSol numOfMustPriceNStp1StpOnlSol;
    @JsonProperty("numOfMustPriceNStp1StpInrlSol")
    private NumOfMustPriceNStp1StpInrlSol numOfMustPriceNStp1StpInrlSol;
    @JsonProperty("upperBoundMustPriceFactorForNonStp")
    private UpperBoundMustPriceFactorForNonStp upperBoundMustPriceFactorForNonStp;
    @JsonProperty("maxAllowedLFSOveragePerCrrPercent")
    private MaxAllowedLFSOveragePerCrrPercent maxAllowedLFSOveragePerCrrPercent;
    @JsonProperty("targetMinNumOfLFSOnlSolPerCrr")
    private TargetMinNumOfLFSOnlSolPerCrr targetMinNumOfLFSOnlSolPerCrr;
    @JsonProperty("targetMinNumOfLFSTotOnlSolPercent")
    private TargetMinNumOfLFSTotOnlSolPercent targetMinNumOfLFSTotOnlSolPercent;
    @JsonProperty("fltOptLFSReuseLimitForNonAVS")
    private FltOptLFSReuseLimitForNonAVS fltOptLFSReuseLimitForNonAVS;
    @JsonProperty("fltOptLFSReuseLimitForAVS")
    private FltOptLFSReuseLimitForAVS fltOptLFSReuseLimitForAVS;
    @JsonProperty("avsPenaltyCrrs")
    private AvsPenaltyCrrs avsPenaltyCrrs;
    @JsonProperty("maxNumOfNonStpOnlSol")
    private MaxNumOfNonStpOnlSol maxNumOfNonStpOnlSol;
    @JsonProperty("maxNumOfNonStpInrlSol")
    private MaxNumOfNonStpInrlSol maxNumOfNonStpInrlSol;
    @JsonProperty("maxNumOfSingleStpOnlSol")
    private MaxNumOfSingleStpOnlSol maxNumOfSingleStpOnlSol;
    @JsonProperty("maxNumOf2PlusStpSol")
    private MaxNumOf2PlusStpSol maxNumOf2PlusStpSol;
    @JsonProperty("minAllowedOveragePerCrrPercent")
    private MinAllowedOveragePerCrrPercent minAllowedOveragePerCrrPercent;
    @JsonProperty("minAllowedOveragePerCrr")
    private MinAllowedOveragePerCrr minAllowedOveragePerCrr;
    @JsonProperty("maxRelFareLvlOfxForNonStp")
    private MaxRelFareLvlOfxForNonStp maxRelFareLvlOfxForNonStp;
    @JsonProperty("maxRelFareLvlOfxForCnx")
    private MaxRelFareLvlOfxForCnx maxRelFareLvlOfxForCnx;
    @JsonProperty("numOfMustPrice2PlusStpSol")
    private NumOfMustPrice2PlusStpSol numOfMustPrice2PlusStpSol;
    @JsonProperty("ItineraryNumberThreshold")
    private ItineraryNumberThreshold itineraryNumberThreshold;
    @JsonProperty("XOFares")
    private XOFares xOFares;
    @JsonProperty("ExemptAllTaxes")
    private ExemptAllTaxes exemptAllTaxes;
    @JsonProperty("ExemptAllTaxesAndFees")
    private ExemptAllTaxesAndFees exemptAllTaxesAndFees;
    @JsonProperty("Taxes")
    private Taxes taxes;
    @JsonProperty("ExemptTax")
    private List<IsRefundable> exemptTax = new ArrayList<IsRefundable>();
    @JsonProperty("FlightStopsAsConnections")
    private FlightStopsAsConnections flightStopsAsConnections;
    @JsonProperty("TicketingSumOfLocals")
    private TicketingSumOfLocals ticketingSumOfLocals;
    @JsonProperty("MultiAirportCodes")
    private MultiAirportCodes multiAirportCodes;
    @JsonProperty("JumpCabinLogic")
    private JumpCabinLogic jumpCabinLogic;
    @JsonProperty("KeepSameCabin")
    private KeepSameCabin keepSameCabin;
    @JsonProperty("GoverningCarrierOverride")
    private GoverningCarrierOverride governingCarrierOverride;
    @JsonProperty("ExcludeCallDirectCarriers")
    private ExcludeCallDirectCarriers excludeCallDirectCarriers;
    @JsonProperty("ValidatingCarrier")
    private ValidatingCarrier validatingCarrier;
    @JsonProperty("ValidatingCarrierCheck")
    private ValidatingCarrierCheck validatingCarrierCheck;
    @JsonProperty("SettlementMethod")
    private String settlementMethod;
    @JsonProperty("FlightRepeatLimit")
    private FlightRepeatLimit flightRepeatLimit;
    @JsonProperty("FlexibleFares")
    private FlexibleFares flexibleFares;
    @JsonProperty("DiversityParameters")
    private DiversityParameters diversityParameters;
    @JsonProperty("AdditionalFareLimit")
    private AdditionalFareLimit additionalFareLimit;
    @JsonProperty("FareFocusRules")
    private FareFocusRules fareFocusRules;
    @JsonProperty("SellingLevels")
    private SellingLevels sellingLevels;
    @JsonProperty("Budget")
    private Budget budget;
    @JsonProperty("OptionsPerDatePairList")
    private OptionsPerDatePairList optionsPerDatePairList;
    @JsonProperty("CountryPref")
    private List<CountryPref> countryPref = new ArrayList<CountryPref>();
    @JsonProperty("RetailerRules")
    private RetailerRules retailerRules;
    @JsonProperty("ForceKeywordRestrictedContent")
    private ForceKeywordRestrictedContent forceKeywordRestrictedContent;
    @JsonProperty("FlightRestrictions")
    private FlightRestrictions flightRestrictions;
    @JsonProperty("LowCostCarriersProcessing")
    private LowCostCarriersProcessing lowCostCarriersProcessing;

    @JsonProperty("DepartureWindow")
    public String getDepartureWindow() {
        return departureWindow;
    }

    @JsonProperty("DepartureWindow")
    public void setDepartureWindow(String departureWindow) {
        this.departureWindow = departureWindow;
    }

    @JsonProperty("ArrivalWindow")
    public String getArrivalWindow() {
        return arrivalWindow;
    }

    @JsonProperty("ArrivalWindow")
    public void setArrivalWindow(String arrivalWindow) {
        this.arrivalWindow = arrivalWindow;
    }

    @JsonProperty("ExcludeVendorPref")
    public List<ExcludeVendorPref_> getExcludeVendorPref() {
        return excludeVendorPref;
    }

    @JsonProperty("ExcludeVendorPref")
    public void setExcludeVendorPref(List<ExcludeVendorPref_> excludeVendorPref) {
        this.excludeVendorPref = excludeVendorPref;
    }

    @JsonProperty("IncludeAlliancePref")
    public List<IncludeAlliancePref> getIncludeAlliancePref() {
        return includeAlliancePref;
    }

    @JsonProperty("IncludeAlliancePref")
    public void setIncludeAlliancePref(List<IncludeAlliancePref> includeAlliancePref) {
        this.includeAlliancePref = includeAlliancePref;
    }

    @JsonProperty("ExcludeAlliancePref")
    public List<IncludeAlliancePref> getExcludeAlliancePref() {
        return excludeAlliancePref;
    }

    @JsonProperty("ExcludeAlliancePref")
    public void setExcludeAlliancePref(List<IncludeAlliancePref> excludeAlliancePref) {
        this.excludeAlliancePref = excludeAlliancePref;
    }

    @JsonProperty("NumTrips")
    public NumTrips getNumTrips() {
        return numTrips;
    }

    @JsonProperty("NumTrips")
    public void setNumTrips(NumTrips numTrips) {
        this.numTrips = numTrips;
    }

    @JsonProperty("AltCitiesCombinations")
    public AltCitiesCombinations getAltCitiesCombinations() {
        return altCitiesCombinations;
    }

    @JsonProperty("AltCitiesCombinations")
    public void setAltCitiesCombinations(AltCitiesCombinations altCitiesCombinations) {
        this.altCitiesCombinations = altCitiesCombinations;
    }

    @JsonProperty("NumTripsWithRouting")
    public NumTripsWithRouting getNumTripsWithRouting() {
        return numTripsWithRouting;
    }

    @JsonProperty("NumTripsWithRouting")
    public void setNumTripsWithRouting(NumTripsWithRouting numTripsWithRouting) {
        this.numTripsWithRouting = numTripsWithRouting;
    }

    @JsonProperty("OnlineIndicator")
    public OnlineIndicator getOnlineIndicator() {
        return onlineIndicator;
    }

    @JsonProperty("OnlineIndicator")
    public void setOnlineIndicator(OnlineIndicator onlineIndicator) {
        this.onlineIndicator = onlineIndicator;
    }

    @JsonProperty("InterlineIndicator")
    public InterlineIndicator getInterlineIndicator() {
        return interlineIndicator;
    }

    @JsonProperty("InterlineIndicator")
    public void setInterlineIndicator(InterlineIndicator interlineIndicator) {
        this.interlineIndicator = interlineIndicator;
    }

    @JsonProperty("TripType")
    public TripType getTripType() {
        return tripType;
    }

    @JsonProperty("TripType")
    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    @JsonProperty("MaxPrice")
    public MaxPrice getMaxPrice() {
        return maxPrice;
    }

    @JsonProperty("MaxPrice")
    public void setMaxPrice(MaxPrice maxPrice) {
        this.maxPrice = maxPrice;
    }

    @JsonProperty("ContentType")
    public ContentType getContentType() {
        return contentType;
    }

    @JsonProperty("ContentType")
    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("DomesticLayoverTime")
    public DomesticLayoverTime getDomesticLayoverTime() {
        return domesticLayoverTime;
    }

    @JsonProperty("DomesticLayoverTime")
    public void setDomesticLayoverTime(DomesticLayoverTime domesticLayoverTime) {
        this.domesticLayoverTime = domesticLayoverTime;
    }

    @JsonProperty("LongConnectTime")
    public LongConnectTime getLongConnectTime() {
        return longConnectTime;
    }

    @JsonProperty("LongConnectTime")
    public void setLongConnectTime(LongConnectTime longConnectTime) {
        this.longConnectTime = longConnectTime;
    }

    @JsonProperty("LongConnectPoints")
    public LongConnectPoints getLongConnectPoints() {
        return longConnectPoints;
    }

    @JsonProperty("LongConnectPoints")
    public void setLongConnectPoints(LongConnectPoints longConnectPoints) {
        this.longConnectPoints = longConnectPoints;
    }

    @JsonProperty("AirServiceOnly")
    public AirServiceOnly getAirServiceOnly() {
        return airServiceOnly;
    }

    @JsonProperty("AirServiceOnly")
    public void setAirServiceOnly(AirServiceOnly airServiceOnly) {
        this.airServiceOnly = airServiceOnly;
    }

    @JsonProperty("JetServiceOnly")
    public JetServiceOnly getJetServiceOnly() {
        return jetServiceOnly;
    }

    @JsonProperty("JetServiceOnly")
    public void setJetServiceOnly(JetServiceOnly jetServiceOnly) {
        this.jetServiceOnly = jetServiceOnly;
    }

    @JsonProperty("SameConnectionAirportOnly")
    public SameConnectionAirportOnly getSameConnectionAirportOnly() {
        return sameConnectionAirportOnly;
    }

    @JsonProperty("SameConnectionAirportOnly")
    public void setSameConnectionAirportOnly(SameConnectionAirportOnly sameConnectionAirportOnly) {
        this.sameConnectionAirportOnly = sameConnectionAirportOnly;
    }

    @JsonProperty("SameOriginAirportOnly")
    public SameOriginAirportOnly getSameOriginAirportOnly() {
        return sameOriginAirportOnly;
    }

    @JsonProperty("SameOriginAirportOnly")
    public void setSameOriginAirportOnly(SameOriginAirportOnly sameOriginAirportOnly) {
        this.sameOriginAirportOnly = sameOriginAirportOnly;
    }

    @JsonProperty("SameTurnaroundAirportOnly")
    public SameTurnaroundAirportOnly getSameTurnaroundAirportOnly() {
        return sameTurnaroundAirportOnly;
    }

    @JsonProperty("SameTurnaroundAirportOnly")
    public void setSameTurnaroundAirportOnly(SameTurnaroundAirportOnly sameTurnaroundAirportOnly) {
        this.sameTurnaroundAirportOnly = sameTurnaroundAirportOnly;
    }

    @JsonProperty("AircraftTypePenalty")
    public AircraftTypePenalty getAircraftTypePenalty() {
        return aircraftTypePenalty;
    }

    @JsonProperty("AircraftTypePenalty")
    public void setAircraftTypePenalty(AircraftTypePenalty aircraftTypePenalty) {
        this.aircraftTypePenalty = aircraftTypePenalty;
    }

    @JsonProperty("AlternateAirportPenalty")
    public AlternateAirportPenalty getAlternateAirportPenalty() {
        return alternateAirportPenalty;
    }

    @JsonProperty("AlternateAirportPenalty")
    public void setAlternateAirportPenalty(AlternateAirportPenalty alternateAirportPenalty) {
        this.alternateAirportPenalty = alternateAirportPenalty;
    }

    @JsonProperty("FareAmountThreshold")
    public FareAmountThreshold getFareAmountThreshold() {
        return fareAmountThreshold;
    }

    @JsonProperty("FareAmountThreshold")
    public void setFareAmountThreshold(FareAmountThreshold fareAmountThreshold) {
        this.fareAmountThreshold = fareAmountThreshold;
    }

    @JsonProperty("numOfLowFareSol")
    public NumOfLowFareSol getNumOfLowFareSol() {
        return numOfLowFareSol;
    }

    @JsonProperty("numOfLowFareSol")
    public void setNumOfLowFareSol(NumOfLowFareSol numOfLowFareSol) {
        this.numOfLowFareSol = numOfLowFareSol;
    }

    @JsonProperty("numOfMustPriceOnlSol")
    public NumOfMustPriceOnlSol getNumOfMustPriceOnlSol() {
        return numOfMustPriceOnlSol;
    }

    @JsonProperty("numOfMustPriceOnlSol")
    public void setNumOfMustPriceOnlSol(NumOfMustPriceOnlSol numOfMustPriceOnlSol) {
        this.numOfMustPriceOnlSol = numOfMustPriceOnlSol;
    }

    @JsonProperty("numOfMustPriceInrlSol")
    public NumOfMustPriceInrlSol getNumOfMustPriceInrlSol() {
        return numOfMustPriceInrlSol;
    }

    @JsonProperty("numOfMustPriceInrlSol")
    public void setNumOfMustPriceInrlSol(NumOfMustPriceInrlSol numOfMustPriceInrlSol) {
        this.numOfMustPriceInrlSol = numOfMustPriceInrlSol;
    }

    @JsonProperty("numOfMustPriceNStpOnlSol")
    public NumOfMustPriceNStpOnlSol getNumOfMustPriceNStpOnlSol() {
        return numOfMustPriceNStpOnlSol;
    }

    @JsonProperty("numOfMustPriceNStpOnlSol")
    public void setNumOfMustPriceNStpOnlSol(NumOfMustPriceNStpOnlSol numOfMustPriceNStpOnlSol) {
        this.numOfMustPriceNStpOnlSol = numOfMustPriceNStpOnlSol;
    }

    @JsonProperty("numOfMustPriceNStpInrlSol")
    public NumOfMustPriceNStpInrlSol getNumOfMustPriceNStpInrlSol() {
        return numOfMustPriceNStpInrlSol;
    }

    @JsonProperty("numOfMustPriceNStpInrlSol")
    public void setNumOfMustPriceNStpInrlSol(NumOfMustPriceNStpInrlSol numOfMustPriceNStpInrlSol) {
        this.numOfMustPriceNStpInrlSol = numOfMustPriceNStpInrlSol;
    }

    @JsonProperty("numOfMustPriceSStopOnlSol")
    public NumOfMustPriceSStopOnlSol getNumOfMustPriceSStopOnlSol() {
        return numOfMustPriceSStopOnlSol;
    }

    @JsonProperty("numOfMustPriceSStopOnlSol")
    public void setNumOfMustPriceSStopOnlSol(NumOfMustPriceSStopOnlSol numOfMustPriceSStopOnlSol) {
        this.numOfMustPriceSStopOnlSol = numOfMustPriceSStopOnlSol;
    }

    @JsonProperty("stpPenaltyInUSD")
    public StpPenaltyInUSD getStpPenaltyInUSD() {
        return stpPenaltyInUSD;
    }

    @JsonProperty("stpPenaltyInUSD")
    public void setStpPenaltyInUSD(StpPenaltyInUSD stpPenaltyInUSD) {
        this.stpPenaltyInUSD = stpPenaltyInUSD;
    }

    @JsonProperty("durPenaltyInUSD")
    public DurPenaltyInUSD getDurPenaltyInUSD() {
        return durPenaltyInUSD;
    }

    @JsonProperty("durPenaltyInUSD")
    public void setDurPenaltyInUSD(DurPenaltyInUSD durPenaltyInUSD) {
        this.durPenaltyInUSD = durPenaltyInUSD;
    }

    @JsonProperty("depPenaltyInUSD")
    public DepPenaltyInUSD getDepPenaltyInUSD() {
        return depPenaltyInUSD;
    }

    @JsonProperty("depPenaltyInUSD")
    public void setDepPenaltyInUSD(DepPenaltyInUSD depPenaltyInUSD) {
        this.depPenaltyInUSD = depPenaltyInUSD;
    }

    @JsonProperty("maxAllowedMustPriceOveragePerCrr")
    public MaxAllowedMustPriceOveragePerCrr getMaxAllowedMustPriceOveragePerCrr() {
        return maxAllowedMustPriceOveragePerCrr;
    }

    @JsonProperty("maxAllowedMustPriceOveragePerCrr")
    public void setMaxAllowedMustPriceOveragePerCrr(MaxAllowedMustPriceOveragePerCrr maxAllowedMustPriceOveragePerCrr) {
        this.maxAllowedMustPriceOveragePerCrr = maxAllowedMustPriceOveragePerCrr;
    }

    @JsonProperty("fltOptMustPriceReuseLimit")
    public FltOptMustPriceReuseLimit getFltOptMustPriceReuseLimit() {
        return fltOptMustPriceReuseLimit;
    }

    @JsonProperty("fltOptMustPriceReuseLimit")
    public void setFltOptMustPriceReuseLimit(FltOptMustPriceReuseLimit fltOptMustPriceReuseLimit) {
        this.fltOptMustPriceReuseLimit = fltOptMustPriceReuseLimit;
    }

    @JsonProperty("upperBoundMustPriceFactorForNotNonStp")
    public UpperBoundMustPriceFactorForNotNonStp getUpperBoundMustPriceFactorForNotNonStp() {
        return upperBoundMustPriceFactorForNotNonStp;
    }

    @JsonProperty("upperBoundMustPriceFactorForNotNonStp")
    public void setUpperBoundMustPriceFactorForNotNonStp(UpperBoundMustPriceFactorForNotNonStp upperBoundMustPriceFactorForNotNonStp) {
        this.upperBoundMustPriceFactorForNotNonStp = upperBoundMustPriceFactorForNotNonStp;
    }

    @JsonProperty("upperBoundLFSFactor")
    public UpperBoundLFSFactor getUpperBoundLFSFactor() {
        return upperBoundLFSFactor;
    }

    @JsonProperty("upperBoundLFSFactor")
    public void setUpperBoundLFSFactor(UpperBoundLFSFactor upperBoundLFSFactor) {
        this.upperBoundLFSFactor = upperBoundLFSFactor;
    }

    @JsonProperty("numOfMustPriceNStp1StpOnlSol")
    public NumOfMustPriceNStp1StpOnlSol getNumOfMustPriceNStp1StpOnlSol() {
        return numOfMustPriceNStp1StpOnlSol;
    }

    @JsonProperty("numOfMustPriceNStp1StpOnlSol")
    public void setNumOfMustPriceNStp1StpOnlSol(NumOfMustPriceNStp1StpOnlSol numOfMustPriceNStp1StpOnlSol) {
        this.numOfMustPriceNStp1StpOnlSol = numOfMustPriceNStp1StpOnlSol;
    }

    @JsonProperty("numOfMustPriceNStp1StpInrlSol")
    public NumOfMustPriceNStp1StpInrlSol getNumOfMustPriceNStp1StpInrlSol() {
        return numOfMustPriceNStp1StpInrlSol;
    }

    @JsonProperty("numOfMustPriceNStp1StpInrlSol")
    public void setNumOfMustPriceNStp1StpInrlSol(NumOfMustPriceNStp1StpInrlSol numOfMustPriceNStp1StpInrlSol) {
        this.numOfMustPriceNStp1StpInrlSol = numOfMustPriceNStp1StpInrlSol;
    }

    @JsonProperty("upperBoundMustPriceFactorForNonStp")
    public UpperBoundMustPriceFactorForNonStp getUpperBoundMustPriceFactorForNonStp() {
        return upperBoundMustPriceFactorForNonStp;
    }

    @JsonProperty("upperBoundMustPriceFactorForNonStp")
    public void setUpperBoundMustPriceFactorForNonStp(UpperBoundMustPriceFactorForNonStp upperBoundMustPriceFactorForNonStp) {
        this.upperBoundMustPriceFactorForNonStp = upperBoundMustPriceFactorForNonStp;
    }

    @JsonProperty("maxAllowedLFSOveragePerCrrPercent")
    public MaxAllowedLFSOveragePerCrrPercent getMaxAllowedLFSOveragePerCrrPercent() {
        return maxAllowedLFSOveragePerCrrPercent;
    }

    @JsonProperty("maxAllowedLFSOveragePerCrrPercent")
    public void setMaxAllowedLFSOveragePerCrrPercent(MaxAllowedLFSOveragePerCrrPercent maxAllowedLFSOveragePerCrrPercent) {
        this.maxAllowedLFSOveragePerCrrPercent = maxAllowedLFSOveragePerCrrPercent;
    }

    @JsonProperty("targetMinNumOfLFSOnlSolPerCrr")
    public TargetMinNumOfLFSOnlSolPerCrr getTargetMinNumOfLFSOnlSolPerCrr() {
        return targetMinNumOfLFSOnlSolPerCrr;
    }

    @JsonProperty("targetMinNumOfLFSOnlSolPerCrr")
    public void setTargetMinNumOfLFSOnlSolPerCrr(TargetMinNumOfLFSOnlSolPerCrr targetMinNumOfLFSOnlSolPerCrr) {
        this.targetMinNumOfLFSOnlSolPerCrr = targetMinNumOfLFSOnlSolPerCrr;
    }

    @JsonProperty("targetMinNumOfLFSTotOnlSolPercent")
    public TargetMinNumOfLFSTotOnlSolPercent getTargetMinNumOfLFSTotOnlSolPercent() {
        return targetMinNumOfLFSTotOnlSolPercent;
    }

    @JsonProperty("targetMinNumOfLFSTotOnlSolPercent")
    public void setTargetMinNumOfLFSTotOnlSolPercent(TargetMinNumOfLFSTotOnlSolPercent targetMinNumOfLFSTotOnlSolPercent) {
        this.targetMinNumOfLFSTotOnlSolPercent = targetMinNumOfLFSTotOnlSolPercent;
    }

    @JsonProperty("fltOptLFSReuseLimitForNonAVS")
    public FltOptLFSReuseLimitForNonAVS getFltOptLFSReuseLimitForNonAVS() {
        return fltOptLFSReuseLimitForNonAVS;
    }

    @JsonProperty("fltOptLFSReuseLimitForNonAVS")
    public void setFltOptLFSReuseLimitForNonAVS(FltOptLFSReuseLimitForNonAVS fltOptLFSReuseLimitForNonAVS) {
        this.fltOptLFSReuseLimitForNonAVS = fltOptLFSReuseLimitForNonAVS;
    }

    @JsonProperty("fltOptLFSReuseLimitForAVS")
    public FltOptLFSReuseLimitForAVS getFltOptLFSReuseLimitForAVS() {
        return fltOptLFSReuseLimitForAVS;
    }

    @JsonProperty("fltOptLFSReuseLimitForAVS")
    public void setFltOptLFSReuseLimitForAVS(FltOptLFSReuseLimitForAVS fltOptLFSReuseLimitForAVS) {
        this.fltOptLFSReuseLimitForAVS = fltOptLFSReuseLimitForAVS;
    }

    @JsonProperty("avsPenaltyCrrs")
    public AvsPenaltyCrrs getAvsPenaltyCrrs() {
        return avsPenaltyCrrs;
    }

    @JsonProperty("avsPenaltyCrrs")
    public void setAvsPenaltyCrrs(AvsPenaltyCrrs avsPenaltyCrrs) {
        this.avsPenaltyCrrs = avsPenaltyCrrs;
    }

    @JsonProperty("maxNumOfNonStpOnlSol")
    public MaxNumOfNonStpOnlSol getMaxNumOfNonStpOnlSol() {
        return maxNumOfNonStpOnlSol;
    }

    @JsonProperty("maxNumOfNonStpOnlSol")
    public void setMaxNumOfNonStpOnlSol(MaxNumOfNonStpOnlSol maxNumOfNonStpOnlSol) {
        this.maxNumOfNonStpOnlSol = maxNumOfNonStpOnlSol;
    }

    @JsonProperty("maxNumOfNonStpInrlSol")
    public MaxNumOfNonStpInrlSol getMaxNumOfNonStpInrlSol() {
        return maxNumOfNonStpInrlSol;
    }

    @JsonProperty("maxNumOfNonStpInrlSol")
    public void setMaxNumOfNonStpInrlSol(MaxNumOfNonStpInrlSol maxNumOfNonStpInrlSol) {
        this.maxNumOfNonStpInrlSol = maxNumOfNonStpInrlSol;
    }

    @JsonProperty("maxNumOfSingleStpOnlSol")
    public MaxNumOfSingleStpOnlSol getMaxNumOfSingleStpOnlSol() {
        return maxNumOfSingleStpOnlSol;
    }

    @JsonProperty("maxNumOfSingleStpOnlSol")
    public void setMaxNumOfSingleStpOnlSol(MaxNumOfSingleStpOnlSol maxNumOfSingleStpOnlSol) {
        this.maxNumOfSingleStpOnlSol = maxNumOfSingleStpOnlSol;
    }

    @JsonProperty("maxNumOf2PlusStpSol")
    public MaxNumOf2PlusStpSol getMaxNumOf2PlusStpSol() {
        return maxNumOf2PlusStpSol;
    }

    @JsonProperty("maxNumOf2PlusStpSol")
    public void setMaxNumOf2PlusStpSol(MaxNumOf2PlusStpSol maxNumOf2PlusStpSol) {
        this.maxNumOf2PlusStpSol = maxNumOf2PlusStpSol;
    }

    @JsonProperty("minAllowedOveragePerCrrPercent")
    public MinAllowedOveragePerCrrPercent getMinAllowedOveragePerCrrPercent() {
        return minAllowedOveragePerCrrPercent;
    }

    @JsonProperty("minAllowedOveragePerCrrPercent")
    public void setMinAllowedOveragePerCrrPercent(MinAllowedOveragePerCrrPercent minAllowedOveragePerCrrPercent) {
        this.minAllowedOveragePerCrrPercent = minAllowedOveragePerCrrPercent;
    }

    @JsonProperty("minAllowedOveragePerCrr")
    public MinAllowedOveragePerCrr getMinAllowedOveragePerCrr() {
        return minAllowedOveragePerCrr;
    }

    @JsonProperty("minAllowedOveragePerCrr")
    public void setMinAllowedOveragePerCrr(MinAllowedOveragePerCrr minAllowedOveragePerCrr) {
        this.minAllowedOveragePerCrr = minAllowedOveragePerCrr;
    }

    @JsonProperty("maxRelFareLvlOfxForNonStp")
    public MaxRelFareLvlOfxForNonStp getMaxRelFareLvlOfxForNonStp() {
        return maxRelFareLvlOfxForNonStp;
    }

    @JsonProperty("maxRelFareLvlOfxForNonStp")
    public void setMaxRelFareLvlOfxForNonStp(MaxRelFareLvlOfxForNonStp maxRelFareLvlOfxForNonStp) {
        this.maxRelFareLvlOfxForNonStp = maxRelFareLvlOfxForNonStp;
    }

    @JsonProperty("maxRelFareLvlOfxForCnx")
    public MaxRelFareLvlOfxForCnx getMaxRelFareLvlOfxForCnx() {
        return maxRelFareLvlOfxForCnx;
    }

    @JsonProperty("maxRelFareLvlOfxForCnx")
    public void setMaxRelFareLvlOfxForCnx(MaxRelFareLvlOfxForCnx maxRelFareLvlOfxForCnx) {
        this.maxRelFareLvlOfxForCnx = maxRelFareLvlOfxForCnx;
    }

    @JsonProperty("numOfMustPrice2PlusStpSol")
    public NumOfMustPrice2PlusStpSol getNumOfMustPrice2PlusStpSol() {
        return numOfMustPrice2PlusStpSol;
    }

    @JsonProperty("numOfMustPrice2PlusStpSol")
    public void setNumOfMustPrice2PlusStpSol(NumOfMustPrice2PlusStpSol numOfMustPrice2PlusStpSol) {
        this.numOfMustPrice2PlusStpSol = numOfMustPrice2PlusStpSol;
    }

    @JsonProperty("ItineraryNumberThreshold")
    public ItineraryNumberThreshold getItineraryNumberThreshold() {
        return itineraryNumberThreshold;
    }

    @JsonProperty("ItineraryNumberThreshold")
    public void setItineraryNumberThreshold(ItineraryNumberThreshold itineraryNumberThreshold) {
        this.itineraryNumberThreshold = itineraryNumberThreshold;
    }

    @JsonProperty("XOFares")
    public XOFares getXOFares() {
        return xOFares;
    }

    @JsonProperty("XOFares")
    public void setXOFares(XOFares xOFares) {
        this.xOFares = xOFares;
    }

    @JsonProperty("ExemptAllTaxes")
    public ExemptAllTaxes getExemptAllTaxes() {
        return exemptAllTaxes;
    }

    @JsonProperty("ExemptAllTaxes")
    public void setExemptAllTaxes(ExemptAllTaxes exemptAllTaxes) {
        this.exemptAllTaxes = exemptAllTaxes;
    }

    @JsonProperty("ExemptAllTaxesAndFees")
    public ExemptAllTaxesAndFees getExemptAllTaxesAndFees() {
        return exemptAllTaxesAndFees;
    }

    @JsonProperty("ExemptAllTaxesAndFees")
    public void setExemptAllTaxesAndFees(ExemptAllTaxesAndFees exemptAllTaxesAndFees) {
        this.exemptAllTaxesAndFees = exemptAllTaxesAndFees;
    }

    @JsonProperty("Taxes")
    public Taxes getTaxes() {
        return taxes;
    }

    @JsonProperty("Taxes")
    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("ExemptTax")
    public List<IsRefundable> getExemptTax() {
        return exemptTax;
    }

    @JsonProperty("ExemptTax")
    public void setExemptTax(List<IsRefundable> exemptTax) {
        this.exemptTax = exemptTax;
    }

    @JsonProperty("FlightStopsAsConnections")
    public FlightStopsAsConnections getFlightStopsAsConnections() {
        return flightStopsAsConnections;
    }

    @JsonProperty("FlightStopsAsConnections")
    public void setFlightStopsAsConnections(FlightStopsAsConnections flightStopsAsConnections) {
        this.flightStopsAsConnections = flightStopsAsConnections;
    }

    @JsonProperty("TicketingSumOfLocals")
    public TicketingSumOfLocals getTicketingSumOfLocals() {
        return ticketingSumOfLocals;
    }

    @JsonProperty("TicketingSumOfLocals")
    public void setTicketingSumOfLocals(TicketingSumOfLocals ticketingSumOfLocals) {
        this.ticketingSumOfLocals = ticketingSumOfLocals;
    }

    @JsonProperty("MultiAirportCodes")
    public MultiAirportCodes getMultiAirportCodes() {
        return multiAirportCodes;
    }

    @JsonProperty("MultiAirportCodes")
    public void setMultiAirportCodes(MultiAirportCodes multiAirportCodes) {
        this.multiAirportCodes = multiAirportCodes;
    }

    @JsonProperty("JumpCabinLogic")
    public JumpCabinLogic getJumpCabinLogic() {
        return jumpCabinLogic;
    }

    @JsonProperty("JumpCabinLogic")
    public void setJumpCabinLogic(JumpCabinLogic jumpCabinLogic) {
        this.jumpCabinLogic = jumpCabinLogic;
    }

    @JsonProperty("KeepSameCabin")
    public KeepSameCabin getKeepSameCabin() {
        return keepSameCabin;
    }

    @JsonProperty("KeepSameCabin")
    public void setKeepSameCabin(KeepSameCabin keepSameCabin) {
        this.keepSameCabin = keepSameCabin;
    }

    @JsonProperty("GoverningCarrierOverride")
    public GoverningCarrierOverride getGoverningCarrierOverride() {
        return governingCarrierOverride;
    }

    @JsonProperty("GoverningCarrierOverride")
    public void setGoverningCarrierOverride(GoverningCarrierOverride governingCarrierOverride) {
        this.governingCarrierOverride = governingCarrierOverride;
    }

    @JsonProperty("ExcludeCallDirectCarriers")
    public ExcludeCallDirectCarriers getExcludeCallDirectCarriers() {
        return excludeCallDirectCarriers;
    }

    @JsonProperty("ExcludeCallDirectCarriers")
    public void setExcludeCallDirectCarriers(ExcludeCallDirectCarriers excludeCallDirectCarriers) {
        this.excludeCallDirectCarriers = excludeCallDirectCarriers;
    }

    @JsonProperty("ValidatingCarrier")
    public ValidatingCarrier getValidatingCarrier() {
        return validatingCarrier;
    }

    @JsonProperty("ValidatingCarrier")
    public void setValidatingCarrier(ValidatingCarrier validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    @JsonProperty("ValidatingCarrierCheck")
    public ValidatingCarrierCheck getValidatingCarrierCheck() {
        return validatingCarrierCheck;
    }

    @JsonProperty("ValidatingCarrierCheck")
    public void setValidatingCarrierCheck(ValidatingCarrierCheck validatingCarrierCheck) {
        this.validatingCarrierCheck = validatingCarrierCheck;
    }

    @JsonProperty("SettlementMethod")
    public String getSettlementMethod() {
        return settlementMethod;
    }

    @JsonProperty("SettlementMethod")
    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    @JsonProperty("FlightRepeatLimit")
    public FlightRepeatLimit getFlightRepeatLimit() {
        return flightRepeatLimit;
    }

    @JsonProperty("FlightRepeatLimit")
    public void setFlightRepeatLimit(FlightRepeatLimit flightRepeatLimit) {
        this.flightRepeatLimit = flightRepeatLimit;
    }

    @JsonProperty("FlexibleFares")
    public FlexibleFares getFlexibleFares() {
        return flexibleFares;
    }

    @JsonProperty("FlexibleFares")
    public void setFlexibleFares(FlexibleFares flexibleFares) {
        this.flexibleFares = flexibleFares;
    }

    @JsonProperty("DiversityParameters")
    public DiversityParameters getDiversityParameters() {
        return diversityParameters;
    }

    @JsonProperty("DiversityParameters")
    public void setDiversityParameters(DiversityParameters diversityParameters) {
        this.diversityParameters = diversityParameters;
    }

    @JsonProperty("AdditionalFareLimit")
    public AdditionalFareLimit getAdditionalFareLimit() {
        return additionalFareLimit;
    }

    @JsonProperty("AdditionalFareLimit")
    public void setAdditionalFareLimit(AdditionalFareLimit additionalFareLimit) {
        this.additionalFareLimit = additionalFareLimit;
    }

    @JsonProperty("FareFocusRules")
    public FareFocusRules getFareFocusRules() {
        return fareFocusRules;
    }

    @JsonProperty("FareFocusRules")
    public void setFareFocusRules(FareFocusRules fareFocusRules) {
        this.fareFocusRules = fareFocusRules;
    }

    @JsonProperty("SellingLevels")
    public SellingLevels getSellingLevels() {
        return sellingLevels;
    }

    @JsonProperty("SellingLevels")
    public void setSellingLevels(SellingLevels sellingLevels) {
        this.sellingLevels = sellingLevels;
    }

    @JsonProperty("Budget")
    public Budget getBudget() {
        return budget;
    }

    @JsonProperty("Budget")
    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    @JsonProperty("OptionsPerDatePairList")
    public OptionsPerDatePairList getOptionsPerDatePairList() {
        return optionsPerDatePairList;
    }

    @JsonProperty("OptionsPerDatePairList")
    public void setOptionsPerDatePairList(OptionsPerDatePairList optionsPerDatePairList) {
        this.optionsPerDatePairList = optionsPerDatePairList;
    }

    @JsonProperty("CountryPref")
    public List<CountryPref> getCountryPref() {
        return countryPref;
    }

    @JsonProperty("CountryPref")
    public void setCountryPref(List<CountryPref> countryPref) {
        this.countryPref = countryPref;
    }

    @JsonProperty("RetailerRules")
    public RetailerRules getRetailerRules() {
        return retailerRules;
    }

    @JsonProperty("RetailerRules")
    public void setRetailerRules(RetailerRules retailerRules) {
        this.retailerRules = retailerRules;
    }

    @JsonProperty("ForceKeywordRestrictedContent")
    public ForceKeywordRestrictedContent getForceKeywordRestrictedContent() {
        return forceKeywordRestrictedContent;
    }

    @JsonProperty("ForceKeywordRestrictedContent")
    public void setForceKeywordRestrictedContent(ForceKeywordRestrictedContent forceKeywordRestrictedContent) {
        this.forceKeywordRestrictedContent = forceKeywordRestrictedContent;
    }

    @JsonProperty("FlightRestrictions")
    public FlightRestrictions getFlightRestrictions() {
        return flightRestrictions;
    }

    @JsonProperty("FlightRestrictions")
    public void setFlightRestrictions(FlightRestrictions flightRestrictions) {
        this.flightRestrictions = flightRestrictions;
    }

    @JsonProperty("LowCostCarriersProcessing")
    public LowCostCarriersProcessing getLowCostCarriersProcessing() {
        return lowCostCarriersProcessing;
    }

    @JsonProperty("LowCostCarriersProcessing")
    public void setLowCostCarriersProcessing(LowCostCarriersProcessing lowCostCarriersProcessing) {
        this.lowCostCarriersProcessing = lowCostCarriersProcessing;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("departureWindow", departureWindow).append("arrivalWindow", arrivalWindow).append("excludeVendorPref", excludeVendorPref).append("includeAlliancePref", includeAlliancePref).append("excludeAlliancePref", excludeAlliancePref).append("numTrips", numTrips).append("altCitiesCombinations", altCitiesCombinations).append("numTripsWithRouting", numTripsWithRouting).append("onlineIndicator", onlineIndicator).append("interlineIndicator", interlineIndicator).append("tripType", tripType).append("maxPrice", maxPrice).append("contentType", contentType).append("domesticLayoverTime", domesticLayoverTime).append("longConnectTime", longConnectTime).append("longConnectPoints", longConnectPoints).append("airServiceOnly", airServiceOnly).append("jetServiceOnly", jetServiceOnly).append("sameConnectionAirportOnly", sameConnectionAirportOnly).append("sameOriginAirportOnly", sameOriginAirportOnly).append("sameTurnaroundAirportOnly", sameTurnaroundAirportOnly).append("aircraftTypePenalty", aircraftTypePenalty).append("alternateAirportPenalty", alternateAirportPenalty).append("fareAmountThreshold", fareAmountThreshold).append("numOfLowFareSol", numOfLowFareSol).append("numOfMustPriceOnlSol", numOfMustPriceOnlSol).append("numOfMustPriceInrlSol", numOfMustPriceInrlSol).append("numOfMustPriceNStpOnlSol", numOfMustPriceNStpOnlSol).append("numOfMustPriceNStpInrlSol", numOfMustPriceNStpInrlSol).append("numOfMustPriceSStopOnlSol", numOfMustPriceSStopOnlSol).append("stpPenaltyInUSD", stpPenaltyInUSD).append("durPenaltyInUSD", durPenaltyInUSD).append("depPenaltyInUSD", depPenaltyInUSD).append("maxAllowedMustPriceOveragePerCrr", maxAllowedMustPriceOveragePerCrr).append("fltOptMustPriceReuseLimit", fltOptMustPriceReuseLimit).append("upperBoundMustPriceFactorForNotNonStp", upperBoundMustPriceFactorForNotNonStp).append("upperBoundLFSFactor", upperBoundLFSFactor).append("numOfMustPriceNStp1StpOnlSol", numOfMustPriceNStp1StpOnlSol).append("numOfMustPriceNStp1StpInrlSol", numOfMustPriceNStp1StpInrlSol).append("upperBoundMustPriceFactorForNonStp", upperBoundMustPriceFactorForNonStp).append("maxAllowedLFSOveragePerCrrPercent", maxAllowedLFSOveragePerCrrPercent).append("targetMinNumOfLFSOnlSolPerCrr", targetMinNumOfLFSOnlSolPerCrr).append("targetMinNumOfLFSTotOnlSolPercent", targetMinNumOfLFSTotOnlSolPercent).append("fltOptLFSReuseLimitForNonAVS", fltOptLFSReuseLimitForNonAVS).append("fltOptLFSReuseLimitForAVS", fltOptLFSReuseLimitForAVS).append("avsPenaltyCrrs", avsPenaltyCrrs).append("maxNumOfNonStpOnlSol", maxNumOfNonStpOnlSol).append("maxNumOfNonStpInrlSol", maxNumOfNonStpInrlSol).append("maxNumOfSingleStpOnlSol", maxNumOfSingleStpOnlSol).append("maxNumOf2PlusStpSol", maxNumOf2PlusStpSol).append("minAllowedOveragePerCrrPercent", minAllowedOveragePerCrrPercent).append("minAllowedOveragePerCrr", minAllowedOveragePerCrr).append("maxRelFareLvlOfxForNonStp", maxRelFareLvlOfxForNonStp).append("maxRelFareLvlOfxForCnx", maxRelFareLvlOfxForCnx).append("numOfMustPrice2PlusStpSol", numOfMustPrice2PlusStpSol).append("itineraryNumberThreshold", itineraryNumberThreshold).append("xOFares", xOFares).append("exemptAllTaxes", exemptAllTaxes).append("exemptAllTaxesAndFees", exemptAllTaxesAndFees).append("taxes", taxes).append("exemptTax", exemptTax).append("flightStopsAsConnections", flightStopsAsConnections).append("ticketingSumOfLocals", ticketingSumOfLocals).append("multiAirportCodes", multiAirportCodes).append("jumpCabinLogic", jumpCabinLogic).append("keepSameCabin", keepSameCabin).append("governingCarrierOverride", governingCarrierOverride).append("excludeCallDirectCarriers", excludeCallDirectCarriers).append("validatingCarrier", validatingCarrier).append("validatingCarrierCheck", validatingCarrierCheck).append("settlementMethod", settlementMethod).append("flightRepeatLimit", flightRepeatLimit).append("flexibleFares", flexibleFares).append("diversityParameters", diversityParameters).append("additionalFareLimit", additionalFareLimit).append("fareFocusRules", fareFocusRules).append("sellingLevels", sellingLevels).append("budget", budget).append("optionsPerDatePairList", optionsPerDatePairList).append("countryPref", countryPref).append("retailerRules", retailerRules).append("forceKeywordRestrictedContent", forceKeywordRestrictedContent).append("flightRestrictions", flightRestrictions).append("lowCostCarriersProcessing", lowCostCarriersProcessing).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(depPenaltyInUSD).append(maxNumOfNonStpInrlSol).append(fareAmountThreshold).append(excludeVendorPref).append(lowCostCarriersProcessing).append(maxNumOf2PlusStpSol).append(taxes).append(numOfMustPriceNStp1StpInrlSol).append(jumpCabinLogic).append(sellingLevels).append(excludeAlliancePref).append(aircraftTypePenalty).append(numOfMustPriceNStp1StpOnlSol).append(airServiceOnly).append(maxAllowedLFSOveragePerCrrPercent).append(exemptTax).append(excludeCallDirectCarriers).append(maxNumOfNonStpOnlSol).append(flightRestrictions).append(sameTurnaroundAirportOnly).append(durPenaltyInUSD).append(longConnectTime).append(longConnectPoints).append(avsPenaltyCrrs).append(numOfMustPriceInrlSol).append(itineraryNumberThreshold).append(exemptAllTaxes).append(contentType).append(numOfLowFareSol).append(maxRelFareLvlOfxForNonStp).append(targetMinNumOfLFSOnlSolPerCrr).append(budget).append(forceKeywordRestrictedContent).append(countryPref).append(numOfMustPrice2PlusStpSol).append(upperBoundLFSFactor).append(sameOriginAirportOnly).append(fltOptLFSReuseLimitForNonAVS).append(maxAllowedMustPriceOveragePerCrr).append(fltOptMustPriceReuseLimit).append(xOFares).append(multiAirportCodes).append(includeAlliancePref).append(domesticLayoverTime).append(fareFocusRules).append(onlineIndicator).append(ticketingSumOfLocals).append(diversityParameters).append(fltOptLFSReuseLimitForAVS).append(altCitiesCombinations).append(upperBoundMustPriceFactorForNotNonStp).append(validatingCarrier).append(interlineIndicator).append(maxPrice).append(numOfMustPriceNStpInrlSol).append(optionsPerDatePairList).append(targetMinNumOfLFSTotOnlSolPercent).append(stpPenaltyInUSD).append(numTrips).append(validatingCarrierCheck).append(settlementMethod).append(departureWindow).append(upperBoundMustPriceFactorForNonStp).append(jetServiceOnly).append(numOfMustPriceSStopOnlSol).append(alternateAirportPenalty).append(minAllowedOveragePerCrrPercent).append(sameConnectionAirportOnly).append(keepSameCabin).append(additionalFareLimit).append(retailerRules).append(numOfMustPriceNStpOnlSol).append(flightStopsAsConnections).append(flightRepeatLimit).append(arrivalWindow).append(flexibleFares).append(tripType).append(governingCarrierOverride).append(maxRelFareLvlOfxForCnx).append(exemptAllTaxesAndFees).append(minAllowedOveragePerCrr).append(numOfMustPriceOnlSol).append(maxNumOfSingleStpOnlSol).append(numTripsWithRouting).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions_) == false) {
            return false;
        }
        TPAExtensions_ rhs = ((TPAExtensions_) other);
        return new EqualsBuilder().append(depPenaltyInUSD, rhs.depPenaltyInUSD).append(maxNumOfNonStpInrlSol, rhs.maxNumOfNonStpInrlSol).append(fareAmountThreshold, rhs.fareAmountThreshold).append(excludeVendorPref, rhs.excludeVendorPref).append(lowCostCarriersProcessing, rhs.lowCostCarriersProcessing).append(maxNumOf2PlusStpSol, rhs.maxNumOf2PlusStpSol).append(taxes, rhs.taxes).append(numOfMustPriceNStp1StpInrlSol, rhs.numOfMustPriceNStp1StpInrlSol).append(jumpCabinLogic, rhs.jumpCabinLogic).append(sellingLevels, rhs.sellingLevels).append(excludeAlliancePref, rhs.excludeAlliancePref).append(aircraftTypePenalty, rhs.aircraftTypePenalty).append(numOfMustPriceNStp1StpOnlSol, rhs.numOfMustPriceNStp1StpOnlSol).append(airServiceOnly, rhs.airServiceOnly).append(maxAllowedLFSOveragePerCrrPercent, rhs.maxAllowedLFSOveragePerCrrPercent).append(exemptTax, rhs.exemptTax).append(excludeCallDirectCarriers, rhs.excludeCallDirectCarriers).append(maxNumOfNonStpOnlSol, rhs.maxNumOfNonStpOnlSol).append(flightRestrictions, rhs.flightRestrictions).append(sameTurnaroundAirportOnly, rhs.sameTurnaroundAirportOnly).append(durPenaltyInUSD, rhs.durPenaltyInUSD).append(longConnectTime, rhs.longConnectTime).append(longConnectPoints, rhs.longConnectPoints).append(avsPenaltyCrrs, rhs.avsPenaltyCrrs).append(numOfMustPriceInrlSol, rhs.numOfMustPriceInrlSol).append(itineraryNumberThreshold, rhs.itineraryNumberThreshold).append(exemptAllTaxes, rhs.exemptAllTaxes).append(contentType, rhs.contentType).append(numOfLowFareSol, rhs.numOfLowFareSol).append(maxRelFareLvlOfxForNonStp, rhs.maxRelFareLvlOfxForNonStp).append(targetMinNumOfLFSOnlSolPerCrr, rhs.targetMinNumOfLFSOnlSolPerCrr).append(budget, rhs.budget).append(forceKeywordRestrictedContent, rhs.forceKeywordRestrictedContent).append(countryPref, rhs.countryPref).append(numOfMustPrice2PlusStpSol, rhs.numOfMustPrice2PlusStpSol).append(upperBoundLFSFactor, rhs.upperBoundLFSFactor).append(sameOriginAirportOnly, rhs.sameOriginAirportOnly).append(fltOptLFSReuseLimitForNonAVS, rhs.fltOptLFSReuseLimitForNonAVS).append(maxAllowedMustPriceOveragePerCrr, rhs.maxAllowedMustPriceOveragePerCrr).append(fltOptMustPriceReuseLimit, rhs.fltOptMustPriceReuseLimit).append(xOFares, rhs.xOFares).append(multiAirportCodes, rhs.multiAirportCodes).append(includeAlliancePref, rhs.includeAlliancePref).append(domesticLayoverTime, rhs.domesticLayoverTime).append(fareFocusRules, rhs.fareFocusRules).append(onlineIndicator, rhs.onlineIndicator).append(ticketingSumOfLocals, rhs.ticketingSumOfLocals).append(diversityParameters, rhs.diversityParameters).append(fltOptLFSReuseLimitForAVS, rhs.fltOptLFSReuseLimitForAVS).append(altCitiesCombinations, rhs.altCitiesCombinations).append(upperBoundMustPriceFactorForNotNonStp, rhs.upperBoundMustPriceFactorForNotNonStp).append(validatingCarrier, rhs.validatingCarrier).append(interlineIndicator, rhs.interlineIndicator).append(maxPrice, rhs.maxPrice).append(numOfMustPriceNStpInrlSol, rhs.numOfMustPriceNStpInrlSol).append(optionsPerDatePairList, rhs.optionsPerDatePairList).append(targetMinNumOfLFSTotOnlSolPercent, rhs.targetMinNumOfLFSTotOnlSolPercent).append(stpPenaltyInUSD, rhs.stpPenaltyInUSD).append(numTrips, rhs.numTrips).append(validatingCarrierCheck, rhs.validatingCarrierCheck).append(settlementMethod, rhs.settlementMethod).append(departureWindow, rhs.departureWindow).append(upperBoundMustPriceFactorForNonStp, rhs.upperBoundMustPriceFactorForNonStp).append(jetServiceOnly, rhs.jetServiceOnly).append(numOfMustPriceSStopOnlSol, rhs.numOfMustPriceSStopOnlSol).append(alternateAirportPenalty, rhs.alternateAirportPenalty).append(minAllowedOveragePerCrrPercent, rhs.minAllowedOveragePerCrrPercent).append(sameConnectionAirportOnly, rhs.sameConnectionAirportOnly).append(keepSameCabin, rhs.keepSameCabin).append(additionalFareLimit, rhs.additionalFareLimit).append(retailerRules, rhs.retailerRules).append(numOfMustPriceNStpOnlSol, rhs.numOfMustPriceNStpOnlSol).append(flightStopsAsConnections, rhs.flightStopsAsConnections).append(flightRepeatLimit, rhs.flightRepeatLimit).append(arrivalWindow, rhs.arrivalWindow).append(flexibleFares, rhs.flexibleFares).append(tripType, rhs.tripType).append(governingCarrierOverride, rhs.governingCarrierOverride).append(maxRelFareLvlOfxForCnx, rhs.maxRelFareLvlOfxForCnx).append(exemptAllTaxesAndFees, rhs.exemptAllTaxesAndFees).append(minAllowedOveragePerCrr, rhs.minAllowedOveragePerCrr).append(numOfMustPriceOnlSol, rhs.numOfMustPriceOnlSol).append(maxNumOfSingleStpOnlSol, rhs.maxNumOfSingleStpOnlSol).append(numTripsWithRouting, rhs.numTripsWithRouting).isEquals();
    }

}
