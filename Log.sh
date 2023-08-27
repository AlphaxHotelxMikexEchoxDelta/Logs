ip="$1"
user="$2"
auth="$3"
client="$4"
date=$(date '+%Y-%m-%d %H:%M:%S')

echo -e "\nAuthentication[$ip][$date]['$user'][$auth][$client]" >> XXX.log
