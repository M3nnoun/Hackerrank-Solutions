
counter=1
while (($counter < 100))
do
    if [ $((counter % 2)) -ne 0 ]; then
        echo $counter
    fi
    ((counter++))
done
