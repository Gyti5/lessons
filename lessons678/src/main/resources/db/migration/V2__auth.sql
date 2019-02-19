create table carts
(
  id bigint not null auto_increment primary key

);

create table items
(
  id bigint not null auto_increment primary key,
  cart_id bigint not null,
  name varchar(255) null,
  description text null,
  price float(6,2) null,
  constraint FK_items_cart
  foreign key (cart_id) references carts (id)

);