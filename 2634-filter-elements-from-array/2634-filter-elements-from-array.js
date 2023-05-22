/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let result = [];
    let j =0;
    for(let i =0;i<arr.length;i++){
        if(fn(arr[i],i)) result[j++] = arr[i];
    }
    return result;
};