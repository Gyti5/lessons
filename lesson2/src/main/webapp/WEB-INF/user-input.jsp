<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User input</title>
    <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css"
          integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w" crossorigin="anonymous">
</head>
<body>
<div style="width: 80%;margin: 20px auto 0 auto">
    <h2>Car Input Form</h2>
    <form method="post" action="user-input" class="pure-form pure-form-stacked">
        <fieldset>
            <legend>Car Info</legend>

            <div>

                <div style="margin: 0 0 10px 0">
                    <label for="type">
                        Kebulo tipas:
                        <select name="type" id="type">
                            <option value="Hecbekas">&lt; Hecbekas</option>
                            <option value="Sedanas">&lt; Sedanas</option>
                            <option value="Universalas">&lt; Universalas</option>
                            <option value="Coupe">&lt; Coupe</option>
                            <option value="Dzipas">&lt; Dzipas</option>

                        </select>
                    </label>
                </div>

                <label for="year">
                    Metai: <input type="text" name="year" id="year"/>
                </label>

            </div>

            <div style="margin: 0 0 10px 0">
                <label for="engine">
                    Variklis:
                    <select name="engine" id="engine">
                <option value="Bendzinas">&lt; Bendzinas</option>
                <option value="Dyzelis">&lt; Dyzelis</option>
                <option value="Hibridas">&lt; Hibridas</option>
                <option value="Elektrinis">&lt; Elektrinis</option>
                    </select>
                </label>
            </div>
            <div style="margin: 0 0 10px 0">
                <label for="make">
                     Gamintojas:
                    <select name="make" id="make">
                        <option value="BWM">&lt; BMW</option>
                        <option value="Mercedes Benz">&lt; Mercedes Benz</option>
                        <option value="Audi">&lt; Audi</option>
                        <option value="Volkswagen">&lt; Volkswagen</option>
                        <option value="Volvo">&lt; Volvo</option>
                        <option value="Mazda">&lt; Mazda</option>
                        <option value="Subaru">&lt; Subaru</option>
                        <option value="Mitsubishi">&lt; Mitsubishi</option>
                        <option value="Ford">&lt; Ford</option>
                        <option value="Peugeot">&lt; Peugeot</option>
                        <option value="Renault">&lt; Renault</option>


                    </select>
                </label>
            </div>
            <label for="power">
                Galia(kW): <input type="text" name="power" id="power"/>
            </label>
        </fieldset>


        <input type="submit" value="submit" class="pure-button pure-button-primary"/>
    </form>
</div>
</body>
</html>
