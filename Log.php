<?php

class Log
{

  public function Authentification( $ip, $user, $auth, $client )
  {
    $file = fopen('XXX.log','a') ;
    $date = date('Y-m-d H:i:s') ;

    fwrite( $file, "\nAuthentification[$ip][$date]['$user'][$auth][$client]" ) ;
    fclose( $file ) ;
  }

}

?>
