<?php 

function centuryFromYear($year) {
    $result = $year/100;
    return is_int($result) ? $result : floor($result) + 1;
}

