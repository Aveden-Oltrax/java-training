<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Welcome</title>
    </head>

    <body>
        <nav class="navbar navbar-light bg-light">
            <h2>Welcome to &#127378; Movies Ticket Booking</h2>
        </nav>
        <form action="checkAvailability" method="post">
            <label for="phone">Mobile Number: </label> 
            <input type="tel" id="phone" name="phone" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" placeholder="Enter your Mobile Number" style="width: 200px">
            <br>
            
            <small>Format: 123-456-7890</small>
            <br> <br> 
            <label for="moviename">Movie Name: </label> 
            <select id="moviename" name="moviename" required>
                <option value="screen1">Screen 1 - Vash</option>
                <option value="screen2">Screen 2 - Pathaan</option>
                <option value="screen3">Screen 3 - Ant-Man and the Wasp:Quantumania</option>
                <option value="screen4">Screen 4 - Tu Jhoothi Main Makkaar</option>
            </select>

            <br> <br> 

            <label for="date-input">Show Date:</label> <input type="date" id="date-input" name="date-input">

            <script>
                var today = new Date();
                var maxDate = new Date(today.getTime() + 5 * 24 * 60 * 60 * 1000);
                var formattedDate = maxDate.toISOString().substring(0, 10);
                document.getElementById("date-input").setAttribute("min", today.toISOString().substring(0, 10));
                document.getElementById("date-input").setAttribute("max", formattedDate);
            </script>

            <br><br>

            <label for="showtime">Show Time: </label> <select id="showtime" name="showtime" required>
                <option value="Morning">Morning - 10:00 am</option>
                <option value="Noon">Noon - 02:30 pm</option>
                <option value="Evening">Evening - 06:00 pm</option>
                <option value="Night">Night - 10:00 pm</option>
            </select> <br> <br>

            <p>Ticket Type:</p>
            <input type="radio" id="Economy" name="ttype" value="Economy">
            <label for="Economy">Economy (Rs. 150)</label>
            <br> 
            <input type="radio" id="Platinum" name="ttype" value="Platinum"> <label for="Platinum">Platinum (Rs. 250)</label><br> <br>
            <br> 
            <label for="integer">Number of Ticket(s)</label> 
            <input type="number" id="integer" name="integer" min="1" required>
            <br><br>

			<input type="submit" value="Check Availability">

            <script>
                const option1 = document.querySelector('#Economy');
                const option2 = document.querySelector('#Platinum');
                const integerInput = document.querySelector('#integer');

                option1.addEventListener('click', () => {
                    integerInput.max = 300;
                });

                option2.addEventListener('click', () => {
                    integerInput.max = 100;
                });
            </script>
            
            <br><br>
            
			<label for="payment">Payment method:</label>
			<select id="payment" onchange="updateInput()">
			  <option value="cash">Cash</option>
			  <option value="card-upi">Card/UPI</option>
			</select>
			
			<br><br>
			
			<label for="id">ID:</label>
			<input type="text" id="id" maxlength="12" readonly>
			
			<script>
			  function updateInput() {
			    var payment = document.getElementById("payment").value;
			    var id = document.getElementById("id");
			
			    if (payment === "cash") {
			      id.disabled = true;
			      id.value = "";
			    } else {
			      id.disabled = false;
			      id.value = generateID();
			    }
			  }
			
			  function generateID() {
			    var chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			    var id = "";
			    for (var i = 0; i < 12; i++) {
			      id += chars.charAt(Math.floor(Math.random() * chars.length));
			    }
			    return id;
			  }
			</script>

			<br><br>
			
			<input type="submit" value="Book">
			


        </form>


    </body>

    </html>