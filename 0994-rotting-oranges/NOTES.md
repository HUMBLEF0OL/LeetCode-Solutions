- count fresh oranges
- and a queue of rotten
- iterate over the queue
- covert all the fresh that are adjacent to the rotten
- if there is no adjacent to the rotten then(no time will be incremented as no conversion happened)
- if a fresh is converted then push the fresh in the rotten queue
- in the end check if any fresh added to the list i.e q.size >0 then increment time
- finally check if the start value of fresh is 0 then return time otherwise -1