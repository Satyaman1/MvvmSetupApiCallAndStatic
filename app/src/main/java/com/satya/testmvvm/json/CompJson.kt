package com.satya.testmvvm.json

import com.google.gson.Gson

class CompJson() {
    companion object {
        var jsonData = """{
  "_id": "621da725abb8a52242c181cc",
  "name": [
    "Make your own Package"
  ],
  "price": 0,
  "item_taxes": [
    5,
    12
  ],
  "specifications": [
    {
      "_id": "621da754abb8a52242c181d8",
      "name": [
        "Apartment Size"
      ],
      "sequence_number": 0,
      "unique_id": 1613,
      "list": [
        {
          "_id": "621da764abb8a52242c181e5",
          "name": [
            "1 BHK"
          ],
          "price": 999,
          "sequence_number": 0,
          "is_default_selected": true,
          "specification_group_id": "621da754abb8a52242c181d8",
          "unique_id": 6749
        },
        {
          "_id": "621da770abb8a52242c181ed",
          "name": [
            "2 BHK"
          ],
          "price": 1999,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da754abb8a52242c181d8",
          "unique_id": 6750
        },
        {
          "_id": "621da77eabb8a52242c181f6",
          "name": [
            "3 BHK"
          ],
          "price": 2999,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da754abb8a52242c181d8",
          "unique_id": 6751
        },
        {
          "_id": "621da787abb8a52242c181fe",
          "name": [
            "4 BHK"
          ],
          "price": 3999,
          "sequence_number": 3,
          "is_default_selected": false,
          "specification_group_id": "621da754abb8a52242c181d8",
          "unique_id": 6752
        },
        {
          "_id": "621da7b1abb8a52242c18207",
          "name": [
            ">4 BHK"
          ],
          "price": 4999,
          "sequence_number": 4,
          "is_default_selected": false,
          "specification_group_id": "621da754abb8a52242c181d8",
          "unique_id": 6753
        }
      ],
      "max_range": 0,
      "range": 1,
      "type": 1,
      "is_required": true,
      "isParentAssociate": true
    },
    {
      "_id": "621da898abb8a52242c1830f",
      "name": [
        "Bedroom Cleaning "
      ],
      "sequence_number": 0,
      "unique_id": 1617,
      "list": [
        {
          "_id": "621daa58abb8a52242c1838d",
          "name": [
            "I don’t want any bedroom cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6762
        },
        {
          "_id": "621daa7cabb8a52242c183a0",
          "name": [
            "With Mattress Dry Vacuuming  (No. of Bedrooms)"
          ],
          "price": 149,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6763
        },
        {
          "_id": "621daa8babb8a52242c183a9",
          "name": [
            "With Mattress Wet Shampooing  (No. of Bedrooms)"
          ],
          "price": 249,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6764
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da764abb8a52242c181e5",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "1 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da898abb8a52242c1830f",
      "name": [
        "Bedroom Cleaning "
      ],
      "sequence_number": 0,
      "unique_id": 1617,
      "list": [
        {
          "_id": "621daa58abb8a52242c1838d",
          "name": [
            "I don’t want any bedroom cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6762
        },
        {
          "_id": "621daa7cabb8a52242c183a0",
          "name": [
            "With Mattress Dry Vacuuming  (No. of Bedrooms)"
          ],
          "price": 159,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6763
        },
        {
          "_id": "621daa8babb8a52242c183a9",
          "name": [
            "With Mattress Wet Shampooing  (No. of Bedrooms)"
          ],
          "price": 259,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6764
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da770abb8a52242c181ed",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "2 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da898abb8a52242c1830f",
      "name": [
        "Bedroom Cleaning "
      ],
      "sequence_number": 0,
      "unique_id": 1617,
      "list": [
        {
          "_id": "621daa58abb8a52242c1838d",
          "name": [
            "I don’t want any bedroom cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6762
        },
        {
          "_id": "621daa7cabb8a52242c183a0",
          "name": [
            "With Mattress Dry Vacuuming  (No. of Bedrooms)"
          ],
          "price": 169,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6763
        },
        {
          "_id": "621daa8babb8a52242c183a9",
          "name": [
            "With Mattress Wet Shampooing  (No. of Bedrooms)"
          ],
          "price": 269,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6764
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da77eabb8a52242c181f6",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "3 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da898abb8a52242c1830f",
      "name": [
        "Bedroom Cleaning "
      ],
      "sequence_number": 0,
      "unique_id": 1617,
      "list": [
        {
          "_id": "621daa58abb8a52242c1838d",
          "name": [
            "I don’t want any bedroom cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6762
        },
        {
          "_id": "621daa7cabb8a52242c183a0",
          "name": [
            "With Mattress Dry Vacuuming  (No. of Bedrooms)"
          ],
          "price": 179,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6763
        },
        {
          "_id": "621daa8babb8a52242c183a9",
          "name": [
            "With Mattress Wet Shampooing  (No. of Bedrooms)"
          ],
          "price": 279,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6764
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da787abb8a52242c181fe",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "4 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da898abb8a52242c1830f",
      "name": [
        "Bedroom Cleaning "
      ],
      "sequence_number": 0,
      "unique_id": 1617,
      "list": [
        {
          "_id": "621daa58abb8a52242c1838d",
          "name": [
            "I don’t want any bedroom cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6762
        },
        {
          "_id": "621daa7cabb8a52242c183a0",
          "name": [
            "With Mattress Dry Vacuuming  (No. of Bedrooms)"
          ],
          "price": 199,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6763
        },
        {
          "_id": "621daa8babb8a52242c183a9",
          "name": [
            "With Mattress Wet Shampooing  (No. of Bedrooms)"
          ],
          "price": 299,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da898abb8a52242c1830f",
          "unique_id": 6764
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da7b1abb8a52242c18207",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": ">4 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da831abb8a52242c18254",
      "name": [
        "Bathroom Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1614,
      "list": [
        {
          "_id": "621daa19abb8a52242c18373",
          "name": [
            "I don’t want any bathroom cleaning"
          ],
          "price": 0,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da831abb8a52242c18254",
          "unique_id": 6761
        },
        {
          "_id": "621daa0babb8a52242c1836a",
          "name": [
            "No. of Bathrooms"
          ],
          "price": 99,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da831abb8a52242c18254",
          "unique_id": 6760
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da764abb8a52242c181e5",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "1 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da831abb8a52242c18254",
      "name": [
        "Bathroom Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1614,
      "list": [
        {
          "_id": "621daa19abb8a52242c18373",
          "name": [
            "I don’t want any bathroom cleaning"
          ],
          "price": 0,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da831abb8a52242c18254",
          "unique_id": 6761
        },
        {
          "_id": "621daa0babb8a52242c1836a",
          "name": [
            "No. of Bathrooms"
          ],
          "price": 109,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da831abb8a52242c18254",
          "unique_id": 6760
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da770abb8a52242c181ed",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "2 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da831abb8a52242c18254",
      "name": [
        "Bathroom Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1614,
      "list": [
        {
          "_id": "621daa19abb8a52242c18373",
          "name": [
            "I don’t want any bathroom cleaning"
          ],
          "price": 0,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da831abb8a52242c18254",
          "unique_id": 6761
        },
        {
          "_id": "621daa0babb8a52242c1836a",
          "name": [
            "No. of Bathrooms"
          ],
          "price": 119,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da831abb8a52242c18254",
          "unique_id": 6760
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da77eabb8a52242c181f6",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "3 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da88cabb8a52242c18308",
      "name": [
        "Living Room/Dining Room Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1616,
      "list": [
        {
          "_id": "621daabfabb8a52242c183c8",
          "name": [
            "With Sofa & Carpet Wet Shampooing"
          ],
          "price": 279,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6767
        },
        {
          "_id": "621daab4abb8a52242c183c0",
          "name": [
            "With Sofa & Carpet Dry Vacuuming"
          ],
          "price": 179,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6766
        },
        {
          "_id": "621daaaaabb8a52242c183b8",
          "name": [
            "I don’t want any living room/dining room cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6765
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da764abb8a52242c181e5",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "1 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da88cabb8a52242c18308",
      "name": [
        "Living Room/Dining Room Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1616,
      "list": [
        {
          "_id": "621daabfabb8a52242c183c8",
          "name": [
            "With Sofa & Carpet Wet Shampooing"
          ],
          "price": 289,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6767
        },
        {
          "_id": "621daab4abb8a52242c183c0",
          "name": [
            "With Sofa & Carpet Dry Vacuuming"
          ],
          "price": 189,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6766
        },
        {
          "_id": "621daaaaabb8a52242c183b8",
          "name": [
            "I don’t want any living room/dining room cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6765
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da770abb8a52242c181ed",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "2 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da88cabb8a52242c18308",
      "name": [
        "Living Room/Dining Room Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1616,
      "list": [
        {
          "_id": "621daabfabb8a52242c183c8",
          "name": [
            "With Sofa & Carpet Wet Shampooing"
          ],
          "price": 299,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6767
        },
        {
          "_id": "621daab4abb8a52242c183c0",
          "name": [
            "With Sofa & Carpet Dry Vacuuming"
          ],
          "price": 199,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6766
        },
        {
          "_id": "621daaaaabb8a52242c183b8",
          "name": [
            "I don’t want any living room/dining room cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6765
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da77eabb8a52242c181f6",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "3 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da88cabb8a52242c18308",
      "name": [
        "Living Room/Dining Room Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1616,
      "list": [
        {
          "_id": "621daabfabb8a52242c183c8",
          "name": [
            "With Sofa & Carpet Wet Shampooing"
          ],
          "price": 309,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6767
        },
        {
          "_id": "621daab4abb8a52242c183c0",
          "name": [
            "With Sofa & Carpet Dry Vacuuming"
          ],
          "price": 209,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6766
        },
        {
          "_id": "621daaaaabb8a52242c183b8",
          "name": [
            "I don’t want any living room/dining room cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6765
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da787abb8a52242c181fe",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "4 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da88cabb8a52242c18308",
      "name": [
        "Living Room/Dining Room Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1616,
      "list": [
        {
          "_id": "621daabfabb8a52242c183c8",
          "name": [
            "With Sofa & Carpet Wet Shampooing"
          ],
          "price": 319,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6767
        },
        {
          "_id": "621daab4abb8a52242c183c0",
          "name": [
            "With Sofa & Carpet Dry Vacuuming"
          ],
          "price": 219,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6766
        },
        {
          "_id": "621daaaaabb8a52242c183b8",
          "name": [
            "I don’t want any living room/dining room cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da88cabb8a52242c18308",
          "unique_id": 6765
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da7b1abb8a52242c18207",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": ">4 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da87dabb8a52242c182dc",
      "name": [
        "Kitchen Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1615,
      "list": [
        {
          "_id": "621da9c4abb8a52242c18342",
          "name": [
            "I don’t want any kitchen cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6756
        },
        {
          "_id": "621da9dcabb8a52242c18353",
          "name": [
            "With Chimney Deep Cleaning "
          ],
          "price": 199,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6758
        },
        {
          "_id": "621da9d3abb8a52242c1834a",
          "name": [
            "With Chimney, Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 299,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6757
        },
        {
          "_id": "621da9e4abb8a52242c1835b",
          "name": [
            "With Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 249,
          "sequence_number": 3,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6759
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da764abb8a52242c181e5",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "1 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da87dabb8a52242c182dc",
      "name": [
        "Kitchen Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1615,
      "list": [
        {
          "_id": "621da9c4abb8a52242c18342",
          "name": [
            "I don’t want any kitchen cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6756
        },
        {
          "_id": "621da9dcabb8a52242c18353",
          "name": [
            "With Chimney Deep Cleaning "
          ],
          "price": 219,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6758
        },
        {
          "_id": "621da9d3abb8a52242c1834a",
          "name": [
            "With Chimney, Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 319,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6757
        },
        {
          "_id": "621da9e4abb8a52242c1835b",
          "name": [
            "With Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 259,
          "sequence_number": 3,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6759
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da770abb8a52242c181ed",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "2 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da87dabb8a52242c182dc",
      "name": [
        "Kitchen Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1615,
      "list": [
        {
          "_id": "621da9c4abb8a52242c18342",
          "name": [
            "I don’t want any kitchen cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6756
        },
        {
          "_id": "621da9dcabb8a52242c18353",
          "name": [
            "With Chimney Deep Cleaning "
          ],
          "price": 239,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6758
        },
        {
          "_id": "621da9d3abb8a52242c1834a",
          "name": [
            "With Chimney, Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 339,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6757
        },
        {
          "_id": "621da9e4abb8a52242c1835b",
          "name": [
            "With Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 289,
          "sequence_number": 3,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6759
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da77eabb8a52242c181f6",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "3 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da87dabb8a52242c182dc",
      "name": [
        "Kitchen Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1615,
      "list": [
        {
          "_id": "621da9c4abb8a52242c18342",
          "name": [
            "I don’t want any kitchen cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6756
        },
        {
          "_id": "621da9dcabb8a52242c18353",
          "name": [
            "With Chimney Deep Cleaning "
          ],
          "price": 259,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6758
        },
        {
          "_id": "621da9d3abb8a52242c1834a",
          "name": [
            "With Chimney, Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 359,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6757
        },
        {
          "_id": "621da9e4abb8a52242c1835b",
          "name": [
            "With Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 299,
          "sequence_number": 3,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6759
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da787abb8a52242c181fe",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": "4 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da87dabb8a52242c182dc",
      "name": [
        "Kitchen Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1615,
      "list": [
        {
          "_id": "621da9c4abb8a52242c18342",
          "name": [
            "I don’t want any kitchen cleaning"
          ],
          "price": 0,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6756
        },
        {
          "_id": "621da9dcabb8a52242c18353",
          "name": [
            "With Chimney Deep Cleaning "
          ],
          "price": 279,
          "sequence_number": 2,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6758
        },
        {
          "_id": "621da9d3abb8a52242c1834a",
          "name": [
            "With Chimney, Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 379,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6757
        },
        {
          "_id": "621da9e4abb8a52242c1835b",
          "name": [
            "With Fridge &amp; Microwave Deep Cleaning"
          ],
          "price": 329,
          "sequence_number": 3,
          "is_default_selected": false,
          "specification_group_id": "621da87dabb8a52242c182dc",
          "unique_id": 6759
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da7b1abb8a52242c18207",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": ">4 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    },
    {
      "_id": "621da831abb8a52242c18254",
      "name": [
        "Bathroom Cleaning"
      ],
      "sequence_number": 0,
      "unique_id": 1614,
      "list": [
        {
          "_id": "621daa0babb8a52242c1836a",
          "name": [
            "No. of Bathrooms"
          ],
          "price": 199,
          "sequence_number": 0,
          "is_default_selected": false,
          "specification_group_id": "621da831abb8a52242c18254",
          "unique_id": 6760
        },
        {
          "_id": "621daa19abb8a52242c18373",
          "name": [
            "I don’t want any bathroom cleaning"
          ],
          "price": 0,
          "sequence_number": 1,
          "is_default_selected": false,
          "specification_group_id": "621da831abb8a52242c18254",
          "unique_id": 6761
        }
      ],
      "max_range": 1,
      "range": 0,
      "type": 2,
      "is_required": false,
      "modifierId": "621da7b1abb8a52242c18207",
      "modifierGroupId": "621da754abb8a52242c181d8",
      "modifierGroupName": "Apartment Size",
      "modifierName": ">4 BHK",
      "isAssociated": true,
      "user_can_add_specification_quantity": true
    }
  ]
}"""
        private val gson = Gson()
        var myGsonData = gson.fromJson(jsonData, ApartmentSizeResponse::class.java)
    }
}