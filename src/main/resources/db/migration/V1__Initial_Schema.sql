-- Creating table
create table price_list
(
    price_list_id bigint not null,
    brand_id      varchar(255),
    product_id    varchar(255),
    start_date    timestamp,
    end_date      timestamp,
    priority      int    not null,
    price         double,
    currency      varchar(255),
    constraint pk_price_list primary key (price_list_id)
);

-- Inserting data
insert into price_list (price_list_id, brand_id, product_id, start_date, end_date, priority, price, currency)
values (1, '1', '35455', '2020-06-14 00:00:00', '2020-12-31 23:59:59', 0, 35.5, 'EUR');

insert into price_list (price_list_id, brand_id, product_id, start_date, end_date, priority, price, currency)
values (2, '1', '35455', '2020-06-14 15:00:00', '2020-06-14 18:30:00', 1, 25.45, 'EUR');

insert into price_list (price_list_id, brand_id, product_id, start_date, end_date, priority, price, currency)
values (3, '1', '35455', '2020-06-15 00:00:00', '2020-06-15 11:00:00', 1, 30.50, 'EUR');

insert into price_list (price_list_id, brand_id, product_id, start_date, end_date, priority, price, currency)
values (4, '1', '35455', '2020-06-15 16:00:00', '2020-12-31 23:59:59', 1, 38.95, 'EUR');
