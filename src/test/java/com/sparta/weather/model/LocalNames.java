
package com.sparta.weather.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ln",
    "ur",
    "fa",
    "tt",
    "ja",
    "ne",
    "br",
    "sa",
    "os",
    "bg",
    "gl",
    "tr",
    "is",
    "sv",
    "fi",
    "mi",
    "th",
    "ro",
    "mr",
    "lv",
    "hu",
    "bo",
    "lt",
    "ps",
    "he",
    "pt",
    "eu",
    "gu",
    "kv",
    "fr",
    "cv",
    "el",
    "wo",
    "ko",
    "ka",
    "af",
    "zh",
    "my",
    "kw",
    "li",
    "ca",
    "it",
    "tl",
    "kn",
    "tg",
    "vi",
    "yo",
    "ht",
    "feature_name",
    "ar",
    "an",
    "be",
    "kk",
    "hi",
    "ta",
    "mk",
    "ku",
    "pl",
    "lo",
    "ml",
    "sc",
    "ru",
    "si",
    "zu",
    "yi",
    "de",
    "ga",
    "te",
    "co",
    "ba",
    "cu",
    "oc",
    "hy",
    "sl",
    "mn",
    "or",
    "es",
    "gv",
    "bn",
    "ascii",
    "gd",
    "en",
    "sq",
    "am",
    "uk",
    "fy",
    "mt",
    "sk",
    "ky",
    "cs",
    "sr",
    "rm",
    "no",
    "gn",
    "cy",
    "et",
    "eo",
    "nl",
    "ab"
})
@Generated("jsonschema2pojo")
public class LocalNames implements Serializable
{

    @JsonProperty("ln")
    private String ln;
    @JsonProperty("ur")
    private String ur;
    @JsonProperty("fa")
    private String fa;
    @JsonProperty("tt")
    private String tt;
    @JsonProperty("ja")
    private String ja;
    @JsonProperty("ne")
    private String ne;
    @JsonProperty("br")
    private String br;
    @JsonProperty("sa")
    private String sa;
    @JsonProperty("os")
    private String os;
    @JsonProperty("bg")
    private String bg;
    @JsonProperty("gl")
    private String gl;
    @JsonProperty("tr")
    private String tr;
    @JsonProperty("is")
    private String is;
    @JsonProperty("sv")
    private String sv;
    @JsonProperty("fi")
    private String fi;
    @JsonProperty("mi")
    private String mi;
    @JsonProperty("th")
    private String th;
    @JsonProperty("ro")
    private String ro;
    @JsonProperty("mr")
    private String mr;
    @JsonProperty("lv")
    private String lv;
    @JsonProperty("hu")
    private String hu;
    @JsonProperty("bo")
    private String bo;
    @JsonProperty("lt")
    private String lt;
    @JsonProperty("ps")
    private String ps;
    @JsonProperty("he")
    private String he;
    @JsonProperty("pt")
    private String pt;
    @JsonProperty("eu")
    private String eu;
    @JsonProperty("gu")
    private String gu;
    @JsonProperty("kv")
    private String kv;
    @JsonProperty("fr")
    private String fr;
    @JsonProperty("cv")
    private String cv;
    @JsonProperty("el")
    private String el;
    @JsonProperty("wo")
    private String wo;
    @JsonProperty("ko")
    private String ko;
    @JsonProperty("ka")
    private String ka;
    @JsonProperty("af")
    private String af;
    @JsonProperty("zh")
    private String zh;
    @JsonProperty("my")
    private String my;
    @JsonProperty("kw")
    private String kw;
    @JsonProperty("li")
    private String li;
    @JsonProperty("ca")
    private String ca;
    @JsonProperty("it")
    private String it;
    @JsonProperty("tl")
    private String tl;
    @JsonProperty("kn")
    private String kn;
    @JsonProperty("tg")
    private String tg;
    @JsonProperty("vi")
    private String vi;
    @JsonProperty("yo")
    private String yo;
    @JsonProperty("ht")
    private String ht;
    @JsonProperty("feature_name")
    private String featureName;
    @JsonProperty("ar")
    private String ar;
    @JsonProperty("an")
    private String an;
    @JsonProperty("be")
    private String be;
    @JsonProperty("kk")
    private String kk;
    @JsonProperty("hi")
    private String hi;
    @JsonProperty("ta")
    private String ta;
    @JsonProperty("mk")
    private String mk;
    @JsonProperty("ku")
    private String ku;
    @JsonProperty("pl")
    private String pl;
    @JsonProperty("lo")
    private String lo;
    @JsonProperty("ml")
    private String ml;
    @JsonProperty("sc")
    private String sc;
    @JsonProperty("ru")
    private String ru;
    @JsonProperty("si")
    private String si;
    @JsonProperty("zu")
    private String zu;
    @JsonProperty("yi")
    private String yi;
    @JsonProperty("de")
    private String de;
    @JsonProperty("ga")
    private String ga;
    @JsonProperty("te")
    private String te;
    @JsonProperty("co")
    private String co;
    @JsonProperty("ba")
    private String ba;
    @JsonProperty("cu")
    private String cu;
    @JsonProperty("oc")
    private String oc;
    @JsonProperty("hy")
    private String hy;
    @JsonProperty("sl")
    private String sl;
    @JsonProperty("mn")
    private String mn;
    @JsonProperty("or")
    private String or;
    @JsonProperty("es")
    private String es;
    @JsonProperty("gv")
    private String gv;
    @JsonProperty("bn")
    private String bn;
    @JsonProperty("ascii")
    private String ascii;
    @JsonProperty("gd")
    private String gd;
    @JsonProperty("en")
    private String en;
    @JsonProperty("sq")
    private String sq;
    @JsonProperty("am")
    private String am;
    @JsonProperty("uk")
    private String uk;
    @JsonProperty("fy")
    private String fy;
    @JsonProperty("mt")
    private String mt;
    @JsonProperty("sk")
    private String sk;
    @JsonProperty("ky")
    private String ky;
    @JsonProperty("cs")
    private String cs;
    @JsonProperty("sr")
    private String sr;
    @JsonProperty("rm")
    private String rm;
    @JsonProperty("no")
    private String no;
    @JsonProperty("gn")
    private String gn;
    @JsonProperty("cy")
    private String cy;
    @JsonProperty("et")
    private String et;
    @JsonProperty("eo")
    private String eo;
    @JsonProperty("nl")
    private String nl;
    @JsonProperty("ab")
    private String ab;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8968428316104340804L;

    @JsonProperty("ln")
    public String getLn() {
        return ln;
    }

    @JsonProperty("ln")
    public void setLn(String ln) {
        this.ln = ln;
    }

    @JsonProperty("ur")
    public String getUr() {
        return ur;
    }

    @JsonProperty("ur")
    public void setUr(String ur) {
        this.ur = ur;
    }

    @JsonProperty("fa")
    public String getFa() {
        return fa;
    }

    @JsonProperty("fa")
    public void setFa(String fa) {
        this.fa = fa;
    }

    @JsonProperty("tt")
    public String getTt() {
        return tt;
    }

    @JsonProperty("tt")
    public void setTt(String tt) {
        this.tt = tt;
    }

    @JsonProperty("ja")
    public String getJa() {
        return ja;
    }

    @JsonProperty("ja")
    public void setJa(String ja) {
        this.ja = ja;
    }

    @JsonProperty("ne")
    public String getNe() {
        return ne;
    }

    @JsonProperty("ne")
    public void setNe(String ne) {
        this.ne = ne;
    }

    @JsonProperty("br")
    public String getBr() {
        return br;
    }

    @JsonProperty("br")
    public void setBr(String br) {
        this.br = br;
    }

    @JsonProperty("sa")
    public String getSa() {
        return sa;
    }

    @JsonProperty("sa")
    public void setSa(String sa) {
        this.sa = sa;
    }

    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    @JsonProperty("os")
    public void setOs(String os) {
        this.os = os;
    }

    @JsonProperty("bg")
    public String getBg() {
        return bg;
    }

    @JsonProperty("bg")
    public void setBg(String bg) {
        this.bg = bg;
    }

    @JsonProperty("gl")
    public String getGl() {
        return gl;
    }

    @JsonProperty("gl")
    public void setGl(String gl) {
        this.gl = gl;
    }

    @JsonProperty("tr")
    public String getTr() {
        return tr;
    }

    @JsonProperty("tr")
    public void setTr(String tr) {
        this.tr = tr;
    }

    @JsonProperty("is")
    public String getIs() {
        return is;
    }

    @JsonProperty("is")
    public void setIs(String is) {
        this.is = is;
    }

    @JsonProperty("sv")
    public String getSv() {
        return sv;
    }

    @JsonProperty("sv")
    public void setSv(String sv) {
        this.sv = sv;
    }

    @JsonProperty("fi")
    public String getFi() {
        return fi;
    }

    @JsonProperty("fi")
    public void setFi(String fi) {
        this.fi = fi;
    }

    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    @JsonProperty("th")
    public String getTh() {
        return th;
    }

    @JsonProperty("th")
    public void setTh(String th) {
        this.th = th;
    }

    @JsonProperty("ro")
    public String getRo() {
        return ro;
    }

    @JsonProperty("ro")
    public void setRo(String ro) {
        this.ro = ro;
    }

    @JsonProperty("mr")
    public String getMr() {
        return mr;
    }

    @JsonProperty("mr")
    public void setMr(String mr) {
        this.mr = mr;
    }

    @JsonProperty("lv")
    public String getLv() {
        return lv;
    }

    @JsonProperty("lv")
    public void setLv(String lv) {
        this.lv = lv;
    }

    @JsonProperty("hu")
    public String getHu() {
        return hu;
    }

    @JsonProperty("hu")
    public void setHu(String hu) {
        this.hu = hu;
    }

    @JsonProperty("bo")
    public String getBo() {
        return bo;
    }

    @JsonProperty("bo")
    public void setBo(String bo) {
        this.bo = bo;
    }

    @JsonProperty("lt")
    public String getLt() {
        return lt;
    }

    @JsonProperty("lt")
    public void setLt(String lt) {
        this.lt = lt;
    }

    @JsonProperty("ps")
    public String getPs() {
        return ps;
    }

    @JsonProperty("ps")
    public void setPs(String ps) {
        this.ps = ps;
    }

    @JsonProperty("he")
    public String getHe() {
        return he;
    }

    @JsonProperty("he")
    public void setHe(String he) {
        this.he = he;
    }

    @JsonProperty("pt")
    public String getPt() {
        return pt;
    }

    @JsonProperty("pt")
    public void setPt(String pt) {
        this.pt = pt;
    }

    @JsonProperty("eu")
    public String getEu() {
        return eu;
    }

    @JsonProperty("eu")
    public void setEu(String eu) {
        this.eu = eu;
    }

    @JsonProperty("gu")
    public String getGu() {
        return gu;
    }

    @JsonProperty("gu")
    public void setGu(String gu) {
        this.gu = gu;
    }

    @JsonProperty("kv")
    public String getKv() {
        return kv;
    }

    @JsonProperty("kv")
    public void setKv(String kv) {
        this.kv = kv;
    }

    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    @JsonProperty("cv")
    public String getCv() {
        return cv;
    }

    @JsonProperty("cv")
    public void setCv(String cv) {
        this.cv = cv;
    }

    @JsonProperty("el")
    public String getEl() {
        return el;
    }

    @JsonProperty("el")
    public void setEl(String el) {
        this.el = el;
    }

    @JsonProperty("wo")
    public String getWo() {
        return wo;
    }

    @JsonProperty("wo")
    public void setWo(String wo) {
        this.wo = wo;
    }

    @JsonProperty("ko")
    public String getKo() {
        return ko;
    }

    @JsonProperty("ko")
    public void setKo(String ko) {
        this.ko = ko;
    }

    @JsonProperty("ka")
    public String getKa() {
        return ka;
    }

    @JsonProperty("ka")
    public void setKa(String ka) {
        this.ka = ka;
    }

    @JsonProperty("af")
    public String getAf() {
        return af;
    }

    @JsonProperty("af")
    public void setAf(String af) {
        this.af = af;
    }

    @JsonProperty("zh")
    public String getZh() {
        return zh;
    }

    @JsonProperty("zh")
    public void setZh(String zh) {
        this.zh = zh;
    }

    @JsonProperty("my")
    public String getMy() {
        return my;
    }

    @JsonProperty("my")
    public void setMy(String my) {
        this.my = my;
    }

    @JsonProperty("kw")
    public String getKw() {
        return kw;
    }

    @JsonProperty("kw")
    public void setKw(String kw) {
        this.kw = kw;
    }

    @JsonProperty("li")
    public String getLi() {
        return li;
    }

    @JsonProperty("li")
    public void setLi(String li) {
        this.li = li;
    }

    @JsonProperty("ca")
    public String getCa() {
        return ca;
    }

    @JsonProperty("ca")
    public void setCa(String ca) {
        this.ca = ca;
    }

    @JsonProperty("it")
    public String getIt() {
        return it;
    }

    @JsonProperty("it")
    public void setIt(String it) {
        this.it = it;
    }

    @JsonProperty("tl")
    public String getTl() {
        return tl;
    }

    @JsonProperty("tl")
    public void setTl(String tl) {
        this.tl = tl;
    }

    @JsonProperty("kn")
    public String getKn() {
        return kn;
    }

    @JsonProperty("kn")
    public void setKn(String kn) {
        this.kn = kn;
    }

    @JsonProperty("tg")
    public String getTg() {
        return tg;
    }

    @JsonProperty("tg")
    public void setTg(String tg) {
        this.tg = tg;
    }

    @JsonProperty("vi")
    public String getVi() {
        return vi;
    }

    @JsonProperty("vi")
    public void setVi(String vi) {
        this.vi = vi;
    }

    @JsonProperty("yo")
    public String getYo() {
        return yo;
    }

    @JsonProperty("yo")
    public void setYo(String yo) {
        this.yo = yo;
    }

    @JsonProperty("ht")
    public String getHt() {
        return ht;
    }

    @JsonProperty("ht")
    public void setHt(String ht) {
        this.ht = ht;
    }

    @JsonProperty("feature_name")
    public String getFeatureName() {
        return featureName;
    }

    @JsonProperty("feature_name")
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    @JsonProperty("ar")
    public String getAr() {
        return ar;
    }

    @JsonProperty("ar")
    public void setAr(String ar) {
        this.ar = ar;
    }

    @JsonProperty("an")
    public String getAn() {
        return an;
    }

    @JsonProperty("an")
    public void setAn(String an) {
        this.an = an;
    }

    @JsonProperty("be")
    public String getBe() {
        return be;
    }

    @JsonProperty("be")
    public void setBe(String be) {
        this.be = be;
    }

    @JsonProperty("kk")
    public String getKk() {
        return kk;
    }

    @JsonProperty("kk")
    public void setKk(String kk) {
        this.kk = kk;
    }

    @JsonProperty("hi")
    public String getHi() {
        return hi;
    }

    @JsonProperty("hi")
    public void setHi(String hi) {
        this.hi = hi;
    }

    @JsonProperty("ta")
    public String getTa() {
        return ta;
    }

    @JsonProperty("ta")
    public void setTa(String ta) {
        this.ta = ta;
    }

    @JsonProperty("mk")
    public String getMk() {
        return mk;
    }

    @JsonProperty("mk")
    public void setMk(String mk) {
        this.mk = mk;
    }

    @JsonProperty("ku")
    public String getKu() {
        return ku;
    }

    @JsonProperty("ku")
    public void setKu(String ku) {
        this.ku = ku;
    }

    @JsonProperty("pl")
    public String getPl() {
        return pl;
    }

    @JsonProperty("pl")
    public void setPl(String pl) {
        this.pl = pl;
    }

    @JsonProperty("lo")
    public String getLo() {
        return lo;
    }

    @JsonProperty("lo")
    public void setLo(String lo) {
        this.lo = lo;
    }

    @JsonProperty("ml")
    public String getMl() {
        return ml;
    }

    @JsonProperty("ml")
    public void setMl(String ml) {
        this.ml = ml;
    }

    @JsonProperty("sc")
    public String getSc() {
        return sc;
    }

    @JsonProperty("sc")
    public void setSc(String sc) {
        this.sc = sc;
    }

    @JsonProperty("ru")
    public String getRu() {
        return ru;
    }

    @JsonProperty("ru")
    public void setRu(String ru) {
        this.ru = ru;
    }

    @JsonProperty("si")
    public String getSi() {
        return si;
    }

    @JsonProperty("si")
    public void setSi(String si) {
        this.si = si;
    }

    @JsonProperty("zu")
    public String getZu() {
        return zu;
    }

    @JsonProperty("zu")
    public void setZu(String zu) {
        this.zu = zu;
    }

    @JsonProperty("yi")
    public String getYi() {
        return yi;
    }

    @JsonProperty("yi")
    public void setYi(String yi) {
        this.yi = yi;
    }

    @JsonProperty("de")
    public String getDe() {
        return de;
    }

    @JsonProperty("de")
    public void setDe(String de) {
        this.de = de;
    }

    @JsonProperty("ga")
    public String getGa() {
        return ga;
    }

    @JsonProperty("ga")
    public void setGa(String ga) {
        this.ga = ga;
    }

    @JsonProperty("te")
    public String getTe() {
        return te;
    }

    @JsonProperty("te")
    public void setTe(String te) {
        this.te = te;
    }

    @JsonProperty("co")
    public String getCo() {
        return co;
    }

    @JsonProperty("co")
    public void setCo(String co) {
        this.co = co;
    }

    @JsonProperty("ba")
    public String getBa() {
        return ba;
    }

    @JsonProperty("ba")
    public void setBa(String ba) {
        this.ba = ba;
    }

    @JsonProperty("cu")
    public String getCu() {
        return cu;
    }

    @JsonProperty("cu")
    public void setCu(String cu) {
        this.cu = cu;
    }

    @JsonProperty("oc")
    public String getOc() {
        return oc;
    }

    @JsonProperty("oc")
    public void setOc(String oc) {
        this.oc = oc;
    }

    @JsonProperty("hy")
    public String getHy() {
        return hy;
    }

    @JsonProperty("hy")
    public void setHy(String hy) {
        this.hy = hy;
    }

    @JsonProperty("sl")
    public String getSl() {
        return sl;
    }

    @JsonProperty("sl")
    public void setSl(String sl) {
        this.sl = sl;
    }

    @JsonProperty("mn")
    public String getMn() {
        return mn;
    }

    @JsonProperty("mn")
    public void setMn(String mn) {
        this.mn = mn;
    }

    @JsonProperty("or")
    public String getOr() {
        return or;
    }

    @JsonProperty("or")
    public void setOr(String or) {
        this.or = or;
    }

    @JsonProperty("es")
    public String getEs() {
        return es;
    }

    @JsonProperty("es")
    public void setEs(String es) {
        this.es = es;
    }

    @JsonProperty("gv")
    public String getGv() {
        return gv;
    }

    @JsonProperty("gv")
    public void setGv(String gv) {
        this.gv = gv;
    }

    @JsonProperty("bn")
    public String getBn() {
        return bn;
    }

    @JsonProperty("bn")
    public void setBn(String bn) {
        this.bn = bn;
    }

    @JsonProperty("ascii")
    public String getAscii() {
        return ascii;
    }

    @JsonProperty("ascii")
    public void setAscii(String ascii) {
        this.ascii = ascii;
    }

    @JsonProperty("gd")
    public String getGd() {
        return gd;
    }

    @JsonProperty("gd")
    public void setGd(String gd) {
        this.gd = gd;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonProperty("sq")
    public String getSq() {
        return sq;
    }

    @JsonProperty("sq")
    public void setSq(String sq) {
        this.sq = sq;
    }

    @JsonProperty("am")
    public String getAm() {
        return am;
    }

    @JsonProperty("am")
    public void setAm(String am) {
        this.am = am;
    }

    @JsonProperty("uk")
    public String getUk() {
        return uk;
    }

    @JsonProperty("uk")
    public void setUk(String uk) {
        this.uk = uk;
    }

    @JsonProperty("fy")
    public String getFy() {
        return fy;
    }

    @JsonProperty("fy")
    public void setFy(String fy) {
        this.fy = fy;
    }

    @JsonProperty("mt")
    public String getMt() {
        return mt;
    }

    @JsonProperty("mt")
    public void setMt(String mt) {
        this.mt = mt;
    }

    @JsonProperty("sk")
    public String getSk() {
        return sk;
    }

    @JsonProperty("sk")
    public void setSk(String sk) {
        this.sk = sk;
    }

    @JsonProperty("ky")
    public String getKy() {
        return ky;
    }

    @JsonProperty("ky")
    public void setKy(String ky) {
        this.ky = ky;
    }

    @JsonProperty("cs")
    public String getCs() {
        return cs;
    }

    @JsonProperty("cs")
    public void setCs(String cs) {
        this.cs = cs;
    }

    @JsonProperty("sr")
    public String getSr() {
        return sr;
    }

    @JsonProperty("sr")
    public void setSr(String sr) {
        this.sr = sr;
    }

    @JsonProperty("rm")
    public String getRm() {
        return rm;
    }

    @JsonProperty("rm")
    public void setRm(String rm) {
        this.rm = rm;
    }

    @JsonProperty("no")
    public String getNo() {
        return no;
    }

    @JsonProperty("no")
    public void setNo(String no) {
        this.no = no;
    }

    @JsonProperty("gn")
    public String getGn() {
        return gn;
    }

    @JsonProperty("gn")
    public void setGn(String gn) {
        this.gn = gn;
    }

    @JsonProperty("cy")
    public String getCy() {
        return cy;
    }

    @JsonProperty("cy")
    public void setCy(String cy) {
        this.cy = cy;
    }

    @JsonProperty("et")
    public String getEt() {
        return et;
    }

    @JsonProperty("et")
    public void setEt(String et) {
        this.et = et;
    }

    @JsonProperty("eo")
    public String getEo() {
        return eo;
    }

    @JsonProperty("eo")
    public void setEo(String eo) {
        this.eo = eo;
    }

    @JsonProperty("nl")
    public String getNl() {
        return nl;
    }

    @JsonProperty("nl")
    public void setNl(String nl) {
        this.nl = nl;
    }

    @JsonProperty("ab")
    public String getAb() {
        return ab;
    }

    @JsonProperty("ab")
    public void setAb(String ab) {
        this.ab = ab;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocalNames.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ln");
        sb.append('=');
        sb.append(((this.ln == null)?"<null>":this.ln));
        sb.append(',');
        sb.append("ur");
        sb.append('=');
        sb.append(((this.ur == null)?"<null>":this.ur));
        sb.append(',');
        sb.append("fa");
        sb.append('=');
        sb.append(((this.fa == null)?"<null>":this.fa));
        sb.append(',');
        sb.append("tt");
        sb.append('=');
        sb.append(((this.tt == null)?"<null>":this.tt));
        sb.append(',');
        sb.append("ja");
        sb.append('=');
        sb.append(((this.ja == null)?"<null>":this.ja));
        sb.append(',');
        sb.append("ne");
        sb.append('=');
        sb.append(((this.ne == null)?"<null>":this.ne));
        sb.append(',');
        sb.append("br");
        sb.append('=');
        sb.append(((this.br == null)?"<null>":this.br));
        sb.append(',');
        sb.append("sa");
        sb.append('=');
        sb.append(((this.sa == null)?"<null>":this.sa));
        sb.append(',');
        sb.append("os");
        sb.append('=');
        sb.append(((this.os == null)?"<null>":this.os));
        sb.append(',');
        sb.append("bg");
        sb.append('=');
        sb.append(((this.bg == null)?"<null>":this.bg));
        sb.append(',');
        sb.append("gl");
        sb.append('=');
        sb.append(((this.gl == null)?"<null>":this.gl));
        sb.append(',');
        sb.append("tr");
        sb.append('=');
        sb.append(((this.tr == null)?"<null>":this.tr));
        sb.append(',');
        sb.append("is");
        sb.append('=');
        sb.append(((this.is == null)?"<null>":this.is));
        sb.append(',');
        sb.append("sv");
        sb.append('=');
        sb.append(((this.sv == null)?"<null>":this.sv));
        sb.append(',');
        sb.append("fi");
        sb.append('=');
        sb.append(((this.fi == null)?"<null>":this.fi));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("th");
        sb.append('=');
        sb.append(((this.th == null)?"<null>":this.th));
        sb.append(',');
        sb.append("ro");
        sb.append('=');
        sb.append(((this.ro == null)?"<null>":this.ro));
        sb.append(',');
        sb.append("mr");
        sb.append('=');
        sb.append(((this.mr == null)?"<null>":this.mr));
        sb.append(',');
        sb.append("lv");
        sb.append('=');
        sb.append(((this.lv == null)?"<null>":this.lv));
        sb.append(',');
        sb.append("hu");
        sb.append('=');
        sb.append(((this.hu == null)?"<null>":this.hu));
        sb.append(',');
        sb.append("bo");
        sb.append('=');
        sb.append(((this.bo == null)?"<null>":this.bo));
        sb.append(',');
        sb.append("lt");
        sb.append('=');
        sb.append(((this.lt == null)?"<null>":this.lt));
        sb.append(',');
        sb.append("ps");
        sb.append('=');
        sb.append(((this.ps == null)?"<null>":this.ps));
        sb.append(',');
        sb.append("he");
        sb.append('=');
        sb.append(((this.he == null)?"<null>":this.he));
        sb.append(',');
        sb.append("pt");
        sb.append('=');
        sb.append(((this.pt == null)?"<null>":this.pt));
        sb.append(',');
        sb.append("eu");
        sb.append('=');
        sb.append(((this.eu == null)?"<null>":this.eu));
        sb.append(',');
        sb.append("gu");
        sb.append('=');
        sb.append(((this.gu == null)?"<null>":this.gu));
        sb.append(',');
        sb.append("kv");
        sb.append('=');
        sb.append(((this.kv == null)?"<null>":this.kv));
        sb.append(',');
        sb.append("fr");
        sb.append('=');
        sb.append(((this.fr == null)?"<null>":this.fr));
        sb.append(',');
        sb.append("cv");
        sb.append('=');
        sb.append(((this.cv == null)?"<null>":this.cv));
        sb.append(',');
        sb.append("el");
        sb.append('=');
        sb.append(((this.el == null)?"<null>":this.el));
        sb.append(',');
        sb.append("wo");
        sb.append('=');
        sb.append(((this.wo == null)?"<null>":this.wo));
        sb.append(',');
        sb.append("ko");
        sb.append('=');
        sb.append(((this.ko == null)?"<null>":this.ko));
        sb.append(',');
        sb.append("ka");
        sb.append('=');
        sb.append(((this.ka == null)?"<null>":this.ka));
        sb.append(',');
        sb.append("af");
        sb.append('=');
        sb.append(((this.af == null)?"<null>":this.af));
        sb.append(',');
        sb.append("zh");
        sb.append('=');
        sb.append(((this.zh == null)?"<null>":this.zh));
        sb.append(',');
        sb.append("my");
        sb.append('=');
        sb.append(((this.my == null)?"<null>":this.my));
        sb.append(',');
        sb.append("kw");
        sb.append('=');
        sb.append(((this.kw == null)?"<null>":this.kw));
        sb.append(',');
        sb.append("li");
        sb.append('=');
        sb.append(((this.li == null)?"<null>":this.li));
        sb.append(',');
        sb.append("ca");
        sb.append('=');
        sb.append(((this.ca == null)?"<null>":this.ca));
        sb.append(',');
        sb.append("it");
        sb.append('=');
        sb.append(((this.it == null)?"<null>":this.it));
        sb.append(',');
        sb.append("tl");
        sb.append('=');
        sb.append(((this.tl == null)?"<null>":this.tl));
        sb.append(',');
        sb.append("kn");
        sb.append('=');
        sb.append(((this.kn == null)?"<null>":this.kn));
        sb.append(',');
        sb.append("tg");
        sb.append('=');
        sb.append(((this.tg == null)?"<null>":this.tg));
        sb.append(',');
        sb.append("vi");
        sb.append('=');
        sb.append(((this.vi == null)?"<null>":this.vi));
        sb.append(',');
        sb.append("yo");
        sb.append('=');
        sb.append(((this.yo == null)?"<null>":this.yo));
        sb.append(',');
        sb.append("ht");
        sb.append('=');
        sb.append(((this.ht == null)?"<null>":this.ht));
        sb.append(',');
        sb.append("featureName");
        sb.append('=');
        sb.append(((this.featureName == null)?"<null>":this.featureName));
        sb.append(',');
        sb.append("ar");
        sb.append('=');
        sb.append(((this.ar == null)?"<null>":this.ar));
        sb.append(',');
        sb.append("an");
        sb.append('=');
        sb.append(((this.an == null)?"<null>":this.an));
        sb.append(',');
        sb.append("be");
        sb.append('=');
        sb.append(((this.be == null)?"<null>":this.be));
        sb.append(',');
        sb.append("kk");
        sb.append('=');
        sb.append(((this.kk == null)?"<null>":this.kk));
        sb.append(',');
        sb.append("hi");
        sb.append('=');
        sb.append(((this.hi == null)?"<null>":this.hi));
        sb.append(',');
        sb.append("ta");
        sb.append('=');
        sb.append(((this.ta == null)?"<null>":this.ta));
        sb.append(',');
        sb.append("mk");
        sb.append('=');
        sb.append(((this.mk == null)?"<null>":this.mk));
        sb.append(',');
        sb.append("ku");
        sb.append('=');
        sb.append(((this.ku == null)?"<null>":this.ku));
        sb.append(',');
        sb.append("pl");
        sb.append('=');
        sb.append(((this.pl == null)?"<null>":this.pl));
        sb.append(',');
        sb.append("lo");
        sb.append('=');
        sb.append(((this.lo == null)?"<null>":this.lo));
        sb.append(',');
        sb.append("ml");
        sb.append('=');
        sb.append(((this.ml == null)?"<null>":this.ml));
        sb.append(',');
        sb.append("sc");
        sb.append('=');
        sb.append(((this.sc == null)?"<null>":this.sc));
        sb.append(',');
        sb.append("ru");
        sb.append('=');
        sb.append(((this.ru == null)?"<null>":this.ru));
        sb.append(',');
        sb.append("si");
        sb.append('=');
        sb.append(((this.si == null)?"<null>":this.si));
        sb.append(',');
        sb.append("zu");
        sb.append('=');
        sb.append(((this.zu == null)?"<null>":this.zu));
        sb.append(',');
        sb.append("yi");
        sb.append('=');
        sb.append(((this.yi == null)?"<null>":this.yi));
        sb.append(',');
        sb.append("de");
        sb.append('=');
        sb.append(((this.de == null)?"<null>":this.de));
        sb.append(',');
        sb.append("ga");
        sb.append('=');
        sb.append(((this.ga == null)?"<null>":this.ga));
        sb.append(',');
        sb.append("te");
        sb.append('=');
        sb.append(((this.te == null)?"<null>":this.te));
        sb.append(',');
        sb.append("co");
        sb.append('=');
        sb.append(((this.co == null)?"<null>":this.co));
        sb.append(',');
        sb.append("ba");
        sb.append('=');
        sb.append(((this.ba == null)?"<null>":this.ba));
        sb.append(',');
        sb.append("cu");
        sb.append('=');
        sb.append(((this.cu == null)?"<null>":this.cu));
        sb.append(',');
        sb.append("oc");
        sb.append('=');
        sb.append(((this.oc == null)?"<null>":this.oc));
        sb.append(',');
        sb.append("hy");
        sb.append('=');
        sb.append(((this.hy == null)?"<null>":this.hy));
        sb.append(',');
        sb.append("sl");
        sb.append('=');
        sb.append(((this.sl == null)?"<null>":this.sl));
        sb.append(',');
        sb.append("mn");
        sb.append('=');
        sb.append(((this.mn == null)?"<null>":this.mn));
        sb.append(',');
        sb.append("or");
        sb.append('=');
        sb.append(((this.or == null)?"<null>":this.or));
        sb.append(',');
        sb.append("es");
        sb.append('=');
        sb.append(((this.es == null)?"<null>":this.es));
        sb.append(',');
        sb.append("gv");
        sb.append('=');
        sb.append(((this.gv == null)?"<null>":this.gv));
        sb.append(',');
        sb.append("bn");
        sb.append('=');
        sb.append(((this.bn == null)?"<null>":this.bn));
        sb.append(',');
        sb.append("ascii");
        sb.append('=');
        sb.append(((this.ascii == null)?"<null>":this.ascii));
        sb.append(',');
        sb.append("gd");
        sb.append('=');
        sb.append(((this.gd == null)?"<null>":this.gd));
        sb.append(',');
        sb.append("en");
        sb.append('=');
        sb.append(((this.en == null)?"<null>":this.en));
        sb.append(',');
        sb.append("sq");
        sb.append('=');
        sb.append(((this.sq == null)?"<null>":this.sq));
        sb.append(',');
        sb.append("am");
        sb.append('=');
        sb.append(((this.am == null)?"<null>":this.am));
        sb.append(',');
        sb.append("uk");
        sb.append('=');
        sb.append(((this.uk == null)?"<null>":this.uk));
        sb.append(',');
        sb.append("fy");
        sb.append('=');
        sb.append(((this.fy == null)?"<null>":this.fy));
        sb.append(',');
        sb.append("mt");
        sb.append('=');
        sb.append(((this.mt == null)?"<null>":this.mt));
        sb.append(',');
        sb.append("sk");
        sb.append('=');
        sb.append(((this.sk == null)?"<null>":this.sk));
        sb.append(',');
        sb.append("ky");
        sb.append('=');
        sb.append(((this.ky == null)?"<null>":this.ky));
        sb.append(',');
        sb.append("cs");
        sb.append('=');
        sb.append(((this.cs == null)?"<null>":this.cs));
        sb.append(',');
        sb.append("sr");
        sb.append('=');
        sb.append(((this.sr == null)?"<null>":this.sr));
        sb.append(',');
        sb.append("rm");
        sb.append('=');
        sb.append(((this.rm == null)?"<null>":this.rm));
        sb.append(',');
        sb.append("no");
        sb.append('=');
        sb.append(((this.no == null)?"<null>":this.no));
        sb.append(',');
        sb.append("gn");
        sb.append('=');
        sb.append(((this.gn == null)?"<null>":this.gn));
        sb.append(',');
        sb.append("cy");
        sb.append('=');
        sb.append(((this.cy == null)?"<null>":this.cy));
        sb.append(',');
        sb.append("et");
        sb.append('=');
        sb.append(((this.et == null)?"<null>":this.et));
        sb.append(',');
        sb.append("eo");
        sb.append('=');
        sb.append(((this.eo == null)?"<null>":this.eo));
        sb.append(',');
        sb.append("nl");
        sb.append('=');
        sb.append(((this.nl == null)?"<null>":this.nl));
        sb.append(',');
        sb.append("ab");
        sb.append('=');
        sb.append(((this.ab == null)?"<null>":this.ab));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
