package eTicaret.models;
      public class Product {
        private int productId;
        private String productName;
        public Product () {
        }
        public int productId() {
            return productId;
        }
        public String ProductName() {
            return productName;
        }
        public Product(int productId, String productName) {
            this.productId = productId;
            this.productName = productName;

        }
    }
