select country.continent, floor(avg(city.population))from city join country on city.CountryCode = country.Code group by country.continent
