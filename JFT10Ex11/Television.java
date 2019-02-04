public class Television {

    private int channel = 1;
    private int volume = 1;
    private boolean on_off = false;

    public void setChannel(int newChannel) {

        if(on_off == true && (newChannel >= 1 && newChannel <= 120)) {

            this.channel = newChannel;
        }
    }

    public int getChannel() {

        return channel;
    }

    public void setVolume(int newVolumeLevel) {

        if(on_off == true && (newVolumeLevel >= 1 && newVolumeLevel <= 7)) {

            this.volume = newVolumeLevel;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setOn_Off(boolean on_off) {

        if(on_off == true) {

            this.on_off = true;

        } else {

            this.on_off = false;
        }
    }

    public boolean getOn_Off() {

        return on_off;
    }

    public void channelUp() {

        if(on_off == true && channel < 120) {

            channel++;
        }
    }

    public void channelDown() {

        if(on_off == true && channel > 1) {

            channel--;
        }
    }

    public void volumeUp() {

        if(on_off == true && volume < 7) {

            volume++;
        }
    }

    public void volumeDown() {

        if(on_off == true && volume > 1) {

            volume--;
        }
    }

    public String toString() {

        return "Channel = " + channel + ", VolumeLevel = " + volume + ", On = " + on_off;

    }
}