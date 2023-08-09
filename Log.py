class Log:
    def authentication(self, ip, user, auth, client):
        filename = "XXX.log"
        date_format = "%Y-%m-%d %H:%M:%S"
        import datetime

        current_date = datetime.datetime.now().strftime(date_format)

        log_entry = f"\nAuthentication[{ip}][{current_date}]['{user}'][{auth}][{client}]"

        try:
            with open(filename, "a") as file:
                file.write(log_entry)
        except Exception as e:
            print("Error:", e)
