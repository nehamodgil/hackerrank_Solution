select sum(city.Population)from city join country on city.CountryCode = country.Code where continent= "Asia";
