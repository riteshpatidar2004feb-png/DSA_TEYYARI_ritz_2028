class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if(y2 > yCenter && x2 > xCenter && y1 < yCenter && x1 < xCenter) return true;
        
        int y = y1;
        while(y <= y2){
            long a1 = Math.abs(x1 - xCenter); // a^2 + b^2 = r^2 where a = x-h, b = y-k, (h,k) is center and r is radius
            long a2 = Math.abs(x2 - xCenter);
            long b = Math.abs(y - yCenter);
            a1 = a1 * a1;
            a2 = a2 * a2;
            b = b * b;
            long r = radius * radius;
            if(a1+b <= r || a2+b <= r) return true;
            y++;
        }
        int x = x1;
        while(x <= x2){
            long a = Math.abs(x - xCenter); // a^2 + b^2 = r^2 where a = x-h, b = y-k, (h,k) is center and r is radius
            long b1 = Math.abs(y2 - yCenter);
            long b2 = Math.abs(y1 - yCenter);
            a = a * a;
            b1 = b1 * b1;
            b2 = b2 * b2;
            long r = radius * radius;
            if(a+b1 <= r || a+b2 <= r) return true;
            x++;
        }
        
        return false;
    }
}