/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    let last = this[this.length - 1]
    return last === undefined ? -1 : last;
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */