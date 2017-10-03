%dw 1.0
%output application/java
---
{
    "OTA_AirLowFareSearchRS": {
        "AvailableItinCount": 0,
        "BrandedOneWayItinCount": 0,
        "DepartedItinCount": 0,
        "PricedItinCount": 50,
        "PricedItineraries": {
            "PricedItinerary": [
                {
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "ArrivalDateTime": "2017-10-05T07:05:00",
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "DepartureDateTime": "2017-10-05T06:05:00",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ElapsedTime": 60,
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "FlightNumber": "3901",
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3901",
                                                "content": ""
                                            },
                                            "ResBookDesigCode": "N",
                                            "StopQuantity": 0,
                                            "TPA_Extensions": {
                                                "Mileage": {
                                                    "Amount": 228
                                                },
                                                "eTicket": {
                                                    "Ind": true
                                                }
                                            }
                                        }
                                    ]
                                }
                            ]
                        }
                    },
                    "AirItineraryPricingInfo": [
                        {
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            },
                                            "SeatsRemaining": {
                                                "BelowMin": false,
                                                "Number": 9
                                            }
                                        }
                                    }
                                ]
                            },
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "TaxCode": "TOTALTAX",
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 631.8,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "LastTicketDate": "2017-10-05",
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "ArrivalAirportCode": "CGH",
                                                    "AvailabilityBreak": true,
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        },
                                                        "SeatsRemaining": {
                                                            "BelowMin": false,
                                                            "Number": 9
                                                        }
                                                    }
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "TPA_Extensions": {
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "AirlineCode": "LA",
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ],
                                                            "ProvisionType": "A",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                },
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA",
                                                            "Type": "W"
                                                        }
                                                    ]
                                                }
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "Amount": 29.9,
                                                        "CountryCode": "BR",
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "TaxCode": "BR3",
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "Amount": 29.9,
                                                        "CountryCode": "BR",
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "TaxCode": "BR3",
                                                        "content": ""
                                                    }
                                                ],
                                                "TotalTax": {
                                                    "Amount": 29.9,
                                                    "CurrencyCode": "BRL",
                                                    "DecimalPlaces": 2
                                                }
                                            },
                                            "TotalFare": {
                                                "Amount": 631.8,
                                                "CurrencyCode": "BRL"
                                            }
                                        },
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        }
                                    }
                                ]
                            },
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "Default": {
                                            "Code": "LA"
                                        },
                                        "NewVcxProcess": true,
                                        "SettlementMethod": "ARC"
                                    }
                                ]
                            }
                        }
                    ],
                    "SequenceNumber": 1,
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    },
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    }
                }
            ]
        },
        "SimpleOneWayItinCount": 0,
        "SoldOutItinCount": 0,
        "Success": {},
        "TPA_Extensions": {
            "AirlineOrderList": {
                "AirlineOrder": [
                    {
                        "Code": "LA",
                        "SequenceNumber": 1,
                        "content": ""
                    },
                    {
                        "Code": "G3",
                        "SequenceNumber": 2,
                        "content": ""
                    },
                    {
                        "Code": "O6",
                        "SequenceNumber": 3,
                        "content": ""
                    },
                    {
                        "Code": "JJ",
                        "SequenceNumber": 4,
                        "content": ""
                    },
                    {
                        "Code": "AD",
                        "SequenceNumber": 5,
                        "content": ""
                    }
                ]
            }
        },
        "Version": "3.2.0"
    }
} as :object {
	class : "org.mule.modules.sabre.model.bargainfindermax.rs.OTAAirLowFareSearchResponse"
}