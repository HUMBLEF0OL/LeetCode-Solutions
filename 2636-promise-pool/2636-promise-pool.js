/**
 * @param {Function[]} functions
 * @param {number} n
 * @return {Function}
 */
var promisePool = async function(functions, n) {
    return new Promise((resolve) => {
        let inPrgressCounter = 0;
        let functionIndex = 0;
        function helper(){
            // when we have traversed all the elements in array
            if(functionIndex >= functions.length){
                // when all the ongoing promises are resolved
                if(inPrgressCounter === 0)resolve();
                return;
            }
            
            while(inPrgressCounter < n && functionIndex < functions.length){
                inPrgressCounter++;
                const promise = functions[functionIndex]();
                functionIndex++;
                promise.then(()=>{
                    inPrgressCounter--;
                    helper();
                })
            }
        }
        helper();
    })
};

/**
 * const sleep = (t) => new Promise(res => setTimeout(res, t));
 * promisePool([() => sleep(500), () => sleep(400)], 1)
 *   .then(console.log) // After 900ms
 */