//program must be ran in terminal, as VScode does not support console cursor being moved
const EventEmitter = require('events');
class DayEmitter extends EventEmitter {
    constructor(update_time = 300) {
        super();
        this.day = new Date();
        this.update_time = update_time;        // 300 ms represents one day
    }
    start(){
        this.day.setDate(this.day.getDate() + 1);                   // increments day by 1
        let mm = `${(this.day.getMonth() + 1 + "").padStart(2, "0")}`;    // 0 = January
        let dd = `${(this.day.getDate() + "").padStart(2, "0")}`;
        this.emit('newday', {mm_dd:`${mm}/${dd}`});       // Returns {mm_dd:"mm/dd"}
        this.sleep();
    }
    sleep(){
        setTimeout(() => this.start(), this.update_time);
    }
}
module.exports = DayEmitter;
