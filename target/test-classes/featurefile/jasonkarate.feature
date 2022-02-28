Feature: Json parsing
Scenario: Parsing the sampel jason file

	* def Jasonobject = 
	"""
	[
	{
	"name"  :  "Nadhi",
	"place" :  "Atlanta",
	"age"		: 30
	},
	{
	"name"  :  "Aju",
	"place" :  "Chicago",
	"age"		: 30
	},
	{
	"name"  :  "Ayush",
	"place" :  "LA",
	"age"		: 9
	},
	{
	"name"  :  "Arush",
	"place" :  "Newyork",
	"age"		: 5
	}
	]
	"""
	* print Jasonobject
	* print Jasonobject[2]
	* print Jasonobject[3].name + " " + Jasonobject[3].age
	
Scenario: complex jason reader

	* def Jasonreader = 
"""
{
	"id": "0001",
	"type": "donut",
	"name": "Cake",
	"ppu": 0.55,
	"batters":
		{
			"batter":
				[
					{ "id": "1001", "type": "Regular" },
					{ "id": "1002", "type": "Chocolate" },
					{ "id": "1003", "type": "Blueberry" },
					{ "id": "1004", "type": "Devil's Food" }
				]
		},
	"topping":
		[
			{ "id": "5001", "type": "None" },
			{ "id": "5002", "type": "Glazed" },
			{ "id": "5005", "type": "Sugar" },
			{ "id": "5007", "type": "Powdered Sugar" },
			{ "id": "5006", "type": "Chocolate with Sprinkles" },
			{ "id": "5003", "type": "Chocolate" },
			{ "id": "5004", "type": "Maple" }
		]
}

"""

	* print Jasonreader
	* print Jasonreader.ppu
	* print Jasonreader.batters
	* print Jasonreader.batters.batter[0]
	* print Jasonreader.batters.batter[2]
	* print Jasonreader.topping[2].id + " " + Jasonreader.topping[2].type
	
