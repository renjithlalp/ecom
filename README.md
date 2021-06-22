# ecom
ecom web site with microservices

http://localhost:8890/rest/addProduct
{"productId":"1001","productName":"Hand Sanitizer","pricePerUnit":256.0,"basicUnit":"number","tax":0.01,"active":true}

Through the API Gaeway , the API call hould be like follow.

http://localhost:8887/productService/rest/allProducts

==>

[
    {
        "productId": "1000",
        "productName": "N95 Mask",
        "pricePerUnit": 76.0,
        "basicUnit": "number",
        "tax": 0.01,
        "active": true
    },
    {
        "productId": "1001",
        "productName": "Hand Sanitizer",
        "pricePerUnit": 256.0,
        "basicUnit": "number",
        "tax": 0.01,
        "active": true
    }
]
