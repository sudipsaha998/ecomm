#1. Run the ecomm.sql file to create the schema and the tables

#2. API details

#	Item module:
#	  get all items: /item/all [method = Get]
#	  get item based on id: /item/(id) [method = Get]
#	  add an item: /item/add [method = Post]
#	  update an item: /item/(id) [method = Put]
#	  delete an item: /item/(id) [method = Delete]

#	Order module:
#	  get all orders: /order/all [method = Get]
#	  make bulk/single order: /order/(email) [method = Post]