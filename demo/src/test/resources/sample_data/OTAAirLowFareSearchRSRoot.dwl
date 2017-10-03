%dw 1.0
%output application/java
---
{
    "OTA_AirLowFareSearchRS": {
        "PricedItinCount": 50,
        "BrandedOneWayItinCount": 0,
        "SimpleOneWayItinCount": 0,
        "DepartedItinCount": 0,
        "SoldOutItinCount": 0,
        "AvailableItinCount": 0,
        "Version": "3.2.0",
        "Success": {},
        "Warnings": {
            "Warning": [
                {
                    "Type": "MIP",
                    "ShortText": "NO FARE FOR CLASS USED",
                    "Code": "PROCESS",
                    "content": ""
                },
                {
                    "Type": "MIP",
                    "ShortText": "NO FARE FOR CLASS USED",
                    "Code": "PROCESS",
                    "content": ""
                },
                {
                    "Type": "MIP",
                    "ShortText": "NO FARE FOR CLASS USED",
                    "Code": "PROCESS",
                    "content": ""
                },
                {
                    "Type": "WORKERTHREAD",
                    "ShortText": "7098900154678960746",
                    "Code": "TRANSACTIONID",
                    "MessageClass": "I",
                    "content": ""
                },
                {
                    "Type": "SERVER",
                    "ShortText": "27038",
                    "Code": "TTFHLC703",
                    "MessageClass": "I",
                    "content": ""
                },
                {
                    "Type": "DEFAULT",
                    "ShortText": "25238",
                    "Code": "RULEID",
                    "MessageClass": "I",
                    "content": ""
                },
                {
                    "Type": "DRE",
                    "ShortText": "13291",
                    "Code": "RULEID",
                    "MessageClass": "I",
                    "content": ""
                },
                {
                    "Type": "MIP",
                    "ShortText": "NO FARE FOR CLASS USED",
                    "Code": "MIP",
                    "MessageClass": "I",
                    "content": ""
                }
            ]
        },
        "PricedItineraries": {
            "PricedItinerary": [
                {
                    "SequenceNumber": 1,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T06:05:00",
                                            "ArrivalDateTime": "2017-10-05T07:05:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3901",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3901",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 2,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T06:35:00",
                                            "ArrivalDateTime": "2017-10-05T07:35:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3903",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3903",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 3,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T08:15:00",
                                            "ArrivalDateTime": "2017-10-05T09:15:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3909",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3909",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 4,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T10:45:00",
                                            "ArrivalDateTime": "2017-10-05T11:45:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3919",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3919",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 5,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T11:45:00",
                                            "ArrivalDateTime": "2017-10-05T12:45:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3923",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3923",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 6,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T07:15:00",
                                            "ArrivalDateTime": "2017-10-05T08:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3905",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3905",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 7,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T07:45:00",
                                            "ArrivalDateTime": "2017-10-05T08:50:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3907",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3907",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 8,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T09:15:00",
                                            "ArrivalDateTime": "2017-10-05T10:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3913",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3913",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 9,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T09:45:00",
                                            "ArrivalDateTime": "2017-10-05T10:50:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3915",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3915",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 10,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T11:15:00",
                                            "ArrivalDateTime": "2017-10-05T12:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3921",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3921",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 11,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 70,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T08:45:00",
                                            "ArrivalDateTime": "2017-10-05T09:55:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3911",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 70,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3911",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 12,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 70,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T10:15:00",
                                            "ArrivalDateTime": "2017-10-05T11:25:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3917",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 70,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "LA",
                                                "FlightNumber": "3917",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "LA",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "LastTicketDate": "2017-10-05",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 601.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
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
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "LA",
                                                    "content": "NF0X0Y1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "FareConstruction": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 601.9,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - LA"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "LA",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO LA SAO601.90BRL601.90END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "LA"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "LA"
                        }
                    }
                },
                {
                    "SequenceNumber": 13,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T12:10:00",
                                            "ArrivalDateTime": "2017-10-05T13:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1023",
                                            "ResBookDesigCode": "P",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1023",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 636,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 665.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "P",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "PKOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 636,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 665.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO201.00USD201.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "P",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "P",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 14,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T14:10:00",
                                            "ArrivalDateTime": "2017-10-05T15:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1031",
                                            "ResBookDesigCode": "P",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1031",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 636,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 665.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "P",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "PKOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 636,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 665.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO201.00USD201.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "P",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "P",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 15,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T11:15:00",
                                            "ArrivalDateTime": "2017-10-05T12:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1019",
                                            "ResBookDesigCode": "P",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1019",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 636,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 665.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "P",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "PKOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 636,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 665.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO201.00USD201.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "P",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "P",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 16,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T12:40:00",
                                            "ArrivalDateTime": "2017-10-05T13:45:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1025",
                                            "ResBookDesigCode": "P",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1025",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 636,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 665.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "P",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "PKOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 636,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 665.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO201.00USD201.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "P",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "P",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 17,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T13:40:00",
                                            "ArrivalDateTime": "2017-10-05T14:45:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1029",
                                            "ResBookDesigCode": "P",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1029",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 201,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 636,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 665.9,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "P",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "PKOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 201,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 636,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 665.9,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO201.00USD201.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "P",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "P",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 18,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 175,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T10:15:00",
                                            "ArrivalDateTime": "2017-10-05T11:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2590",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2590",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 217
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T11:50:00",
                                            "ArrivalDateTime": "2017-10-05T13:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2628",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 80,
                                            "DepartureAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2628",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 312
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CNF",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CNF",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/BHZ AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 19,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 180,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T19:20:00",
                                            "ArrivalDateTime": "2017-10-05T20:30:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2557",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 70,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2557",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 217
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T21:00:00",
                                            "ArrivalDateTime": "2017-10-05T22:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2679",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 80,
                                            "DepartureAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2679",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 312
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CNF",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CNF",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/BHZ AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 20,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 220,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T15:40:00",
                                            "ArrivalDateTime": "2017-10-05T17:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6419",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 90,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "6419",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E90",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 420
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T18:20:00",
                                            "ArrivalDateTime": "2017-10-05T19:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2877",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2877",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 206
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CWB",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CWB",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/CWB AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 21,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 245,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T12:05:00",
                                            "ArrivalDateTime": "2017-10-05T13:15:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2501",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 70,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2501",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 217
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T14:50:00",
                                            "ArrivalDateTime": "2017-10-05T16:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2817",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 80,
                                            "DepartureAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2817",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 312
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CNF",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CNF",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/BHZ AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 22,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 255,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T07:25:00",
                                            "ArrivalDateTime": "2017-10-05T09:00:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "5790",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 95,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "5790",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E90",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 420
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T10:35:00",
                                            "ArrivalDateTime": "2017-10-05T11:40:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2873",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2873",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 206
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CWB",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CWB",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/CWB AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 23,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 290,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T14:05:00",
                                            "ArrivalDateTime": "2017-10-05T15:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6991",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "6991",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 217
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T17:30:00",
                                            "ArrivalDateTime": "2017-10-05T18:55:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2623",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 85,
                                            "DepartureAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2623",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 312
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CNF",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CNF",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/BHZ AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 24,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 305,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T17:15:00",
                                            "ArrivalDateTime": "2017-10-05T18:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2553",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2553",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 217
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T21:00:00",
                                            "ArrivalDateTime": "2017-10-05T22:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2679",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 80,
                                            "DepartureAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2679",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 312
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CNF",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CNF",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/BHZ AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 25,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 355,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T10:15:00",
                                            "ArrivalDateTime": "2017-10-05T11:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2590",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2590",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 217
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T14:50:00",
                                            "ArrivalDateTime": "2017-10-05T16:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2817",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 80,
                                            "DepartureAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2817",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 312
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CNF",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CNF",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/BHZ AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 26,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 370,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T11:05:00",
                                            "ArrivalDateTime": "2017-10-05T12:40:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "5050",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 95,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "5050",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E90",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 420
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T16:10:00",
                                            "ArrivalDateTime": "2017-10-05T17:15:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2705",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2705",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 206
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CWB",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CWB",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/CWB AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 27,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 410,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T06:20:00",
                                            "ArrivalDateTime": "2017-10-05T07:30:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6999",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 70,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "6999",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 217
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T11:50:00",
                                            "ArrivalDateTime": "2017-10-05T13:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2628",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 80,
                                            "DepartureAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2628",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 312
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CNF",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CNF",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/BHZ AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 28,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 410,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T12:05:00",
                                            "ArrivalDateTime": "2017-10-05T13:15:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2501",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 70,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2501",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 217
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T17:30:00",
                                            "ArrivalDateTime": "2017-10-05T18:55:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2623",
                                            "ResBookDesigCode": "N",
                                            "ElapsedTime": 85,
                                            "DepartureAirport": {
                                                "LocationCode": "CNF",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2623",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 312
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 221,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 699.28,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 729.18,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "N",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CNF",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                },
                                                {
                                                    "BookingCode": "N",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CNF",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "AD",
                                                    "content": "N002AZUL"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 221,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 699.28,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 729.18,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - AD"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD X/BHZ AD SAO221.00USD221.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "N",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "N",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "AD"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "AD"
                        }
                    }
                },
                {
                    "SequenceNumber": 29,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 55,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T20:30:00",
                                            "ArrivalDateTime": "2017-10-05T21:25:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6017",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 55,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6017",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 30,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T14:25:00",
                                            "ArrivalDateTime": "2017-10-05T15:25:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6009",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6009",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 31,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T15:55:00",
                                            "ArrivalDateTime": "2017-10-05T16:55:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6011",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6011",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 32,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 60,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T17:30:00",
                                            "ArrivalDateTime": "2017-10-05T18:30:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6013",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6013",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 33,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T06:40:00",
                                            "ArrivalDateTime": "2017-10-05T07:45:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6001",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6001",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 34,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T07:05:00",
                                            "ArrivalDateTime": "2017-10-05T08:10:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6033",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6033",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "318",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 35,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T08:15:00",
                                            "ArrivalDateTime": "2017-10-05T09:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6003",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6003",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 36,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T09:50:00",
                                            "ArrivalDateTime": "2017-10-05T10:55:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6005",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6005",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 37,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T11:20:00",
                                            "ArrivalDateTime": "2017-10-05T12:25:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6007",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6007",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 38,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T12:55:00",
                                            "ArrivalDateTime": "2017-10-05T14:00:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6035",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6035",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 39,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T19:00:00",
                                            "ArrivalDateTime": "2017-10-05T20:05:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "6015",
                                            "ResBookDesigCode": "E",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "O6",
                                                "FlightNumber": "6015",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "319",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "O6",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 246,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 778.39,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 808.29,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "E",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "O6",
                                                    "content": "EOBRO6"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 246,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 778.39,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 808.29,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "O6",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "REFUND SUBJECT TO PENALTY/NON-ENDO/REISSUE"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - O6"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "O6",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": false
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO O6 SAO246.00USD246.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "E",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "E",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "O6"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "O6"
                        }
                    }
                },
                {
                    "SequenceNumber": 40,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 55,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T09:40:00",
                                            "ArrivalDateTime": "2017-10-05T10:35:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1013",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 55,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1013",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 797.37,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 827.27,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "W",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "WJOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 797.37,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 827.27,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO252.00USD252.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 41,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T10:10:00",
                                            "ArrivalDateTime": "2017-10-05T11:15:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1015",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1015",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 797.37,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 827.27,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "W",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "WJOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 797.37,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 827.27,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO252.00USD252.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 42,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T15:40:00",
                                            "ArrivalDateTime": "2017-10-05T16:45:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1039",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1039",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 797.37,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 827.27,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "W",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "WJOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 797.37,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 827.27,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO252.00USD252.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 43,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T16:30:00",
                                            "ArrivalDateTime": "2017-10-05T17:35:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1041",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1041",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 797.37,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 827.27,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "W",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "WJOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 797.37,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 827.27,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO252.00USD252.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 44,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 70,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T09:10:00",
                                            "ArrivalDateTime": "2017-10-05T10:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1011",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 70,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1011",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 797.37,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 827.27,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "W",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "WJOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 797.37,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 827.27,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO252.00USD252.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 45,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 75,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T15:10:00",
                                            "ArrivalDateTime": "2017-10-05T16:25:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1035",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 75,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1035",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 797.37,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 827.27,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "W",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "WJOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 797.37,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 827.27,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 SAO252.00USD252.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "S"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "S"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 46,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 300,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T09:25:00",
                                            "ArrivalDateTime": "2017-10-05T10:25:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2192",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 60,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "VIX",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "2192",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 260
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T12:50:00",
                                            "ArrivalDateTime": "2017-10-05T14:25:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1389",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 95,
                                            "DepartureAirport": {
                                                "LocationCode": "VIX",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1389",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "73G",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "I",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 470
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
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 252,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 797.37,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 827.27,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "W",
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "VIX",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "WJOZDGZ"
                                                },
                                                {
                                                    "BookingCode": "W",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "VIX",
                                                    "ArrivalAirportCode": "CGH",
                                                    "GovCarrier": "G3",
                                                    "content": "WJOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 252,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 797.37,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 827.27,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - G3"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 X/VIX G3 SAO252.00USD252.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "G3"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "G3"
                        }
                    }
                },
                {
                    "SequenceNumber": 47,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T07:15:00",
                                            "ArrivalDateTime": "2017-10-05T08:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3905",
                                            "ResBookDesigCode": "H",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "CompanyShortName": "LATAM AIRLINES BRASIL",
                                                "Code": "JJ",
                                                "FlightNumber": "3905",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "321",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "JJ",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PrivateFareType": "@",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 277.41,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 277.41,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 876.48,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 906.38,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PrivateFareType": "@",
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "PrivateFareType": "@",
                                                    "BookingCode": "H",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "JJ",
                                                    "content": "HP0U0N1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 277.41,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 277.41,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 876.48,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 906.38,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "PRIVATE FARE APPLIED - CHECK RULES FOR CORRECT TICKETING"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - JJ"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "JJ",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO JJ SAO277.41USD277.41END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "H",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 7,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "L"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "H",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 7,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "L"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "JJ"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "JJ"
                        }
                    }
                },
                {
                    "SequenceNumber": 48,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 65,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T19:15:00",
                                            "ArrivalDateTime": "2017-10-05T20:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "3953",
                                            "ResBookDesigCode": "H",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "CompanyShortName": "LATAM AIRLINES BRASIL",
                                                "Code": "JJ",
                                                "FlightNumber": "3953",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "321",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "JJ",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 228
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
                            "PrivateFareType": "@",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 277.41,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 277.41,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 876.48,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 29.9,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 906.38,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PrivateFareType": "@",
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "PrivateFareType": "@",
                                                    "BookingCode": "H",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "JJ",
                                                    "content": "HP0U0N1"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 277.41,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 277.41,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 876.48,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
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
                                                "Amount": 906.38,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "PRIVATE FARE APPLIED - CHECK RULES FOR CORRECT TICKETING"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER - JJ"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "JJ",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO JJ SAO277.41USD277.41END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "H",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 7,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        },
                                                        "Meal": {
                                                            "Code": "L"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "H",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 7,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            },
                                            "Meal": {
                                                "Code": "L"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true,
                                        "Default": {
                                            "Code": "JJ"
                                        }
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": "JJ"
                        }
                    }
                },
                {
                    "SequenceNumber": 49,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 320,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T07:25:00",
                                            "ArrivalDateTime": "2017-10-05T09:00:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "5790",
                                            "ResBookDesigCode": "L",
                                            "ElapsedTime": 95,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "5790",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E90",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 420
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T11:53:00",
                                            "ArrivalDateTime": "2017-10-05T12:45:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "1139",
                                            "ResBookDesigCode": "T",
                                            "ElapsedTime": 52,
                                            "DepartureAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "1139",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "738",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 206
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 351,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 351,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 1110.63,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 67.86,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 1178.49,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "L",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CWB",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CWB",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "L104CX1A"
                                                },
                                                {
                                                    "BookingCode": "T",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CWB",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "CWB",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "TOOZDGZ"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 351,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 351,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 1110.63,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "YRI",
                                                        "Amount": 22.14,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    },
                                                    {
                                                        "TaxCode": "YRI",
                                                        "Amount": 15.82,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    },
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "YRI",
                                                        "Amount": 37.96,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    },
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TotalTax": {
                                                    "Amount": 67.86,
                                                    "CurrencyCode": "BRL",
                                                    "DecimalPlaces": 2
                                                }
                                            },
                                            "TotalFare": {
                                                "Amount": 1178.49,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER -"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "AD",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 0
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO AD CWB102.00G3 SAO249.00USD351.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "L",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "T",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "L",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "T",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": ""
                        }
                    }
                },
                {
                    "SequenceNumber": 50,
                    "AirItinerary": {
                        "DirectionInd": "OneWay",
                        "OriginDestinationOptions": {
                            "OriginDestinationOption": [
                                {
                                    "ElapsedTime": 290,
                                    "FlightSegment": [
                                        {
                                            "DepartureDateTime": "2017-10-05T06:50:00",
                                            "ArrivalDateTime": "2017-10-05T08:20:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2088",
                                            "ResBookDesigCode": "W",
                                            "ElapsedTime": 90,
                                            "DepartureAirport": {
                                                "LocationCode": "SDU",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "G3",
                                                "FlightNumber": "2088",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "73G",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "G3",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 420
                                                }
                                            }
                                        },
                                        {
                                            "DepartureDateTime": "2017-10-05T10:35:00",
                                            "ArrivalDateTime": "2017-10-05T11:40:00",
                                            "StopQuantity": 0,
                                            "FlightNumber": "2873",
                                            "ResBookDesigCode": "K",
                                            "ElapsedTime": 65,
                                            "DepartureAirport": {
                                                "LocationCode": "CWB",
                                                "content": ""
                                            },
                                            "ArrivalAirport": {
                                                "LocationCode": "CGH",
                                                "content": ""
                                            },
                                            "OperatingAirline": {
                                                "Code": "AD",
                                                "FlightNumber": "2873",
                                                "content": ""
                                            },
                                            "Equipment": [
                                                {
                                                    "AirEquipType": "E95",
                                                    "content": ""
                                                }
                                            ],
                                            "MarketingAirline": {
                                                "Code": "AD",
                                                "content": ""
                                            },
                                            "MarriageGrp": "O",
                                            "DepartureTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "ArrivalTimeZone": {
                                                "GMTOffset": -3
                                            },
                                            "TPA_Extensions": {
                                                "eTicket": {
                                                    "Ind": true
                                                },
                                                "Mileage": {
                                                    "Amount": 206
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
                            "LastTicketDate": "2017-10-04",
                            "PricingSource": "ADVJR1",
                            "PricingSubSource": "MIP",
                            "FareReturned": true,
                            "ItinTotalFare": {
                                "BaseFare": {
                                    "Amount": 374,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "FareConstruction": {
                                    "Amount": 374,
                                    "CurrencyCode": "USD",
                                    "DecimalPlaces": 2
                                },
                                "EquivFare": {
                                    "Amount": 1183.41,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                },
                                "Taxes": {
                                    "Tax": [
                                        {
                                            "TaxCode": "TOTALTAX",
                                            "Amount": 67.86,
                                            "CurrencyCode": "BRL",
                                            "DecimalPlaces": 2,
                                            "content": ""
                                        }
                                    ]
                                },
                                "TotalFare": {
                                    "Amount": 1251.27,
                                    "CurrencyCode": "BRL",
                                    "DecimalPlaces": 2
                                }
                            },
                            "PTC_FareBreakdowns": {
                                "PTC_FareBreakdown": [
                                    {
                                        "PassengerTypeQuantity": {
                                            "Code": "ADT",
                                            "Quantity": 1
                                        },
                                        "FareBasisCodes": {
                                            "FareBasisCode": [
                                                {
                                                    "BookingCode": "W",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "SDU",
                                                    "ArrivalAirportCode": "CWB",
                                                    "FareComponentBeginAirport": "SDU",
                                                    "FareComponentEndAirport": "CWB",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "G3",
                                                    "content": "WOOZDGZ"
                                                },
                                                {
                                                    "BookingCode": "K",
                                                    "AvailabilityBreak": true,
                                                    "DepartureAirportCode": "CWB",
                                                    "ArrivalAirportCode": "CGH",
                                                    "FareComponentBeginAirport": "CWB",
                                                    "FareComponentEndAirport": "CGH",
                                                    "FareComponentDirectionality": "FROM",
                                                    "FareComponentVendorCode": "ATP",
                                                    "GovCarrier": "AD",
                                                    "content": "K104CX1A"
                                                }
                                            ]
                                        },
                                        "PassengerFare": {
                                            "BaseFare": {
                                                "Amount": 374,
                                                "CurrencyCode": "USD"
                                            },
                                            "FareConstruction": {
                                                "Amount": 374,
                                                "CurrencyCode": "USD",
                                                "DecimalPlaces": 2
                                            },
                                            "EquivFare": {
                                                "Amount": 1183.41,
                                                "CurrencyCode": "BRL",
                                                "DecimalPlaces": 2
                                            },
                                            "Taxes": {
                                                "Tax": [
                                                    {
                                                        "TaxCode": "YRI",
                                                        "Amount": 15.82,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    },
                                                    {
                                                        "TaxCode": "YRI",
                                                        "Amount": 22.14,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    },
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TaxSummary": [
                                                    {
                                                        "TaxCode": "YRI",
                                                        "Amount": 37.96,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    },
                                                    {
                                                        "TaxCode": "BR3",
                                                        "CountryCode": "BR",
                                                        "Amount": 29.9,
                                                        "CurrencyCode": "BRL",
                                                        "DecimalPlaces": 2,
                                                        "content": ""
                                                    }
                                                ],
                                                "TotalTax": {
                                                    "Amount": 67.86,
                                                    "CurrencyCode": "BRL",
                                                    "DecimalPlaces": 2
                                                }
                                            },
                                            "TotalFare": {
                                                "Amount": 1251.27,
                                                "CurrencyCode": "BRL"
                                            },
                                            "TPA_Extensions": {
                                                "Messages": {
                                                    "Message": [
                                                        {
                                                            "AirlineCode": "AD",
                                                            "Type": "N",
                                                            "FailCode": 0,
                                                            "Info": "NON ENDO/AD FLIGHTS ONLY"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "VALIDATING CARRIER -"
                                                        },
                                                        {
                                                            "Type": "W",
                                                            "FailCode": 0,
                                                            "Info": "CAT 15 SALES RESTRICTIONS FREE TEXT FOUND - VERIFY RULES"
                                                        }
                                                    ]
                                                },
                                                "BaggageInformationList": {
                                                    "BaggageInformation": [
                                                        {
                                                            "ProvisionType": "A",
                                                            "AirlineCode": "G3",
                                                            "Segment": [
                                                                {
                                                                    "Id": 0
                                                                },
                                                                {
                                                                    "Id": 1
                                                                }
                                                            ],
                                                            "Allowance": [
                                                                {
                                                                    "Pieces": 1
                                                                }
                                                            ]
                                                        }
                                                    ]
                                                }
                                            }
                                        },
                                        "Endorsements": {
                                            "NonRefundableIndicator": true
                                        },
                                        "TPA_Extensions": {
                                            "FareCalcLine": {
                                                "Info": "RIO G3 CWB159.00AD SAO215.00USD374.00END"
                                            }
                                        },
                                        "FareInfos": {
                                            "FareInfo": [
                                                {
                                                    "FareReference": "W",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 4,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                },
                                                {
                                                    "FareReference": "K",
                                                    "TPA_Extensions": {
                                                        "SeatsRemaining": {
                                                            "Number": 9,
                                                            "BelowMin": false
                                                        },
                                                        "Cabin": {
                                                            "Cabin": "Y"
                                                        }
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ]
                            },
                            "FareInfos": {
                                "FareInfo": [
                                    {
                                        "FareReference": "W",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 4,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    },
                                    {
                                        "FareReference": "K",
                                        "TPA_Extensions": {
                                            "SeatsRemaining": {
                                                "Number": 9,
                                                "BelowMin": false
                                            },
                                            "Cabin": {
                                                "Cabin": "Y"
                                            }
                                        }
                                    }
                                ]
                            },
                            "TPA_Extensions": {
                                "DivideInParty": {
                                    "Indicator": false
                                },
                                "ValidatingCarrier": [
                                    {
                                        "SettlementMethod": "ARC",
                                        "NewVcxProcess": true
                                    }
                                ]
                            }
                        }
                    ],
                    "TicketingInfo": {
                        "TicketType": "eTicket",
                        "ValidInterline": "Yes"
                    },
                    "TPA_Extensions": {
                        "ValidatingCarrier": {
                            "Code": ""
                        }
                    }
                }
            ]
        },
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
        }
    }
}